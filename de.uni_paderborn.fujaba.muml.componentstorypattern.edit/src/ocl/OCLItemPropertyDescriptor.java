package ocl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * This item property descriptor allows generating and filtering choices using an OCL annotation in the metamodel.
 * 
 * To use this:
 * <ol>
 * <li> Create an annotation with source <code>http://www.muml.org/emf/OCLFilter</code> in your .ecore file under your property.</li>
 * 
 * <li> Add a details entry with key <code>choices</code>.</li>
 *     <ul>
 * 	   <li>The value will be parsed as OCL.</li>
 *     <li><code>self</code> refers to the object that values should be generated for.</li>
 *     <li>It should return a single or multiple possible feature values for this object and this feature.</li>
 *     <li>Make sure that values you return conform to the feature type!</li>
 *     </ul>
 * 
 * <li> Add a details entry with key <code>filter</code>.</li>
 *     <ul>
 *     <li>The value will be parsed as OCL and evaluated once for every possible choice generated before.</li>
 *     <li><code>self</code> refers to the value being filtered.</li>
 *     <li>It should return <code>true</code>, in order to mark the value as valid for this feature. Every other return value,
 *       including OclInvalid, marks the value as invalid and it will not appear in the list of choices.</li>
 *     </ul>
 * </ol>
 * 
 * <p>Of course you can use either <code>choices</code> or <code>filter</code> independently.</p>
 * 
 * <p>If you don't use choices, but <code>filter</code> then a collection of all values conforming to the feature type will be
 * generated and filtered using <code>filter</code>.</p>
 * 
 * <p>If you don't use filter, but <code>choices</code>, all generated choices are directly used.</p>
 * 
 * <p>If you don't use any, a collection of all values conforming to the feature type will be generated.</p>
 * 
 * @author Ingo Budde
 *
 */
public class OCLItemPropertyDescriptor extends ItemPropertyDescriptor {

	/**
	 * The source value for the annotation to use.
	 */
	public static String OCL_ANNOTATION = "http://www.muml.org/emf/OCLFilter";

	/**
	 * The key for the details entry to use for choices.
	 */
	public static String CHOICES_KEY = "choices";

	/**
	 * The key for the details entry to use for filters.
	 */
	public static String FILTER_KEY = "filter";

	/**
	 * OCL Environment to use; is created once, statically.
	 */
	public static org.eclipse.ocl.ecore.OCL OCL_ECORE = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

	/**
	 * Default constructor, calls super constructor.
	 */
	public OCLItemPropertyDescriptor(AdapterFactory adapterFactory,ResourceLocator resourceLocator,String displayName,String description,EStructuralFeature feature,boolean isSettable,Object staticImage,String category,String[] filterFlags) {
		super(adapterFactory,resourceLocator,displayName,description,feature,isSettable,false,false,staticImage,category,filterFlags);
	}
	
	/**
	 * Default constructor, calls super constructor.
	 */
	public OCLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage,String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName,description,feature,isSettable,multiLine,sortChoices, staticImage, category,filterFlags);
	}

	/**
	 * Return the choice of values for the given <code>object</code>.
	 * 
	 * @param object
	 *            The object to generate choices for.
	 *            
	 * @return The choices generated.
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if (object instanceof EObject && feature != null) {
			EObject element = (EObject) object;
			EAnnotation oclAnnotation = ((EStructuralFeature) feature).getEAnnotation(OCL_ANNOTATION);

			// (1) Generate choices using the "choices" key:
			Collection<?> choices = null;
			if (oclAnnotation != null && oclAnnotation.getDetails().containsKey(CHOICES_KEY)) {
				String ocl = oclAnnotation.getDetails().get(CHOICES_KEY);
				Object result = null;
				try {
					Query<org.eclipse.emf.ecore.EClassifier, ?, ?> choicesQuery = createQuery(element.eClass(), ocl);
					result = choicesQuery.evaluate(object);
				} catch (ParserException e) {
					e.printStackTrace();
				}
				
				if (result instanceof Collection) {
					choices = (Collection<?>) result;
				} else {
					choices = Collections.singletonList(result);		
				}
				
				try {
					checkResult(choices);
				} catch (RuntimeException e) {
					e.printStackTrace();
					choices = Collections.emptyList();
				}

			} else {
				choices = super.getChoiceOfValues(object);
			}

			// (2) Filter generated choices using the "filter" key:
			if (oclAnnotation != null && oclAnnotation.getDetails().containsKey(FILTER_KEY)) {
				String ocl = oclAnnotation.getDetails().get(FILTER_KEY);
				try {
					Query<org.eclipse.emf.ecore.EClassifier, ?, ?> filterQuery = createQuery(element.eClass(), ocl);
					for (Object choice : new ArrayList<Object>(choices)) {
						if (!Boolean.TRUE.equals(filterQuery.evaluate(choice))) {
							choices.remove(choice);
						}
					}
				} catch (ParserException e) {
					e.printStackTrace();
				}
			}

			return choices;
		}
	
		return super.getChoiceOfValues(object);
	}
	
	/**
	 * Parse OCL expression and create Query.
	 * 
	 * @param context
	 *            Context classifier for <code>self</code>.
	 * @param ocl
	 *            OCL expression that will be parsed.
	 * @return Query that can be evaluated.
	 * 
	 * @throws ParserException
	 *             If the OCL expression contains errors.
	 */
	protected Query<org.eclipse.emf.ecore.EClassifier, ?, ?> createQuery(EClassifier context, String ocl) throws ParserException {
		Helper helper = OCL_ECORE.createOCLHelper();
		helper.setAttributeContext(context, feature);
		ParsingOptions.setOption(helper.getEnvironment(),
			    ParsingOptions.implicitRootClass(helper.getEnvironment()),
			    EcorePackage.Literals.EOBJECT);
		OCLExpression oclExpression = helper.createQuery(ocl);
		if (oclExpression != null) {
			return OCL_ECORE.createQuery(oclExpression);
		}
		return null;
	}

	/**
	 * Checks the results of the <code>choices</code> expression; makes sure it conforms with feature type.
	 * 
	 * @param choices Choices to check
	 */
	protected void checkResult(Collection<?> choices) {
		for (Object object : choices) {
			if (!feature.getEType().isInstance(object)) {
				throw new RuntimeException("[OCL Choices] Invalid choice returned for " + feature.getEContainingClass().getName() + "." + feature.getName() + " : " + feature.getEType().getName() + ". Element was: " + object.toString());
			}
		}
	}
	
}