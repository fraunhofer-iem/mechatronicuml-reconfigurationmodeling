/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.muml.reconfiguration.FadingFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fading Component Part Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FadingComponentVariable refers to a FadingComponent and enables to 
 * specify a FadingFunction that needs to be carried out as part of the reconfiguration.
 * FadingComponentVariables may only be contained in ControllerExchangeNodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getFadingComponentPartVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AppliedFadingFunctionIsContainedInType=' let fadingFunction : reconfiguration::FadingFunction = self.appliedFadingFunction.oclAsType(reconfiguration::FadingFunction) in\r\n \tif fadingFunction.oclIsUndefined()\r\n \tthen true\r\n \telse\r\n\t\tself.dataType.oclAsType(pim::component::ComponentPart).componentType.oclAsType(reconfiguration::FadingComponent).fadingFunction\r\n\t\t->select(curFadingFunction : reconfiguration::FadingFunction| curFadingFunction = fadingFunction)->size()=1\r\n\tendif' NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode='if not self.oclAsType(ecore::EObject).eContainer().oclAsType(ecore::EObject).eContainer().oclAsType(ecore::EObject).eContainer().oclIsTypeOf(componentstorydiagram::ControllerExchangeNode)\r\n\tthen self.appliedFadingFunction.oclIsUndefined()\r\nelse true\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AppliedFadingFunctionIsContainedInType NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode'"
 *        annotation="http://www.muml.org/emf/OCLFilter choices='let \r\n\tcomponent : component::StructuredComponent = self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentVariable).type.oclAsType(component::StructuredComponent)\r\nin\r\n\tcomponent.embeddedComponentParts->select(p | p.componentType.oclIsTypeOf(reconfiguration::FadingComponent))' feature='dataType'"
 * @generated
 */
public interface FadingComponentPartVariable extends PartVariable {
	/**
	 * Returns the value of the '<em><b>Applied Fading Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Fading Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Fading Function</em>' reference.
	 * @see #setAppliedFadingFunction(FadingFunction)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getFadingComponentPartVariable_AppliedFadingFunction()
	 * @model annotation="http://www.muml.org/emf/OCLFilter choices='self.componentPartType.componentType.oclAsType(reconfiguration::FadingComponent).fadingFunction'"
	 * @generated
	 */
	FadingFunction getAppliedFadingFunction();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.FadingComponentPartVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Fading Function</em>' reference.
	 * @see #getAppliedFadingFunction()
	 * @generated
	 */
	void setAppliedFadingFunction(FadingFunction value);

} // FadingComponentPartVariable
