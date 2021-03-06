package org.muml.reconfiguration.ui.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ManagerCanonicalEditPolicy extends
		CanonicalEditPolicy {
	private boolean canonicalNodes = true;
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	public ManagerCanonicalEditPolicy() {
	}

	public ManagerCanonicalEditPolicy(
			boolean canonicalNodes) {
		this.canonicalNodes = canonicalNodes;
	}

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical
		// refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}


	@Override
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize
					.add(org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE.getManager_Ports());
			//TODO add Specification Entries
		}

		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<EObject> result = new LinkedList<EObject>();
		for (org.muml.pim.component.diagram.part.MumlNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */

	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenViewDescriptors() {
		// Begin added to switch off toplevel canonical behavior:
		if (!canonicalNodes) {
			View containerView = (View) getHost().getModel();
			List<View> childViews = containerView.getChildren();
			List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> result = new LinkedList<org.muml.pim.component.diagram.part.MumlNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView);
				List<Integer> visualIDs = Arrays
						.asList(new Integer[] {
								org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID,
								org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID});
				if (childElement.eContainer() == containerView.getElement()
						&& visualIDs.contains(visualID)) {
					result.add(new org.muml.pim.component.diagram.part.MumlNodeDescriptor(
							childElement, visualID));
					continue;
				}
			}
			return result;
		}
		// End added

		View viewObject = (View) getHost().getModel();
		return org.muml.reconfiguration.ui.part.ReconfigurationDiagramUpdater
				.getManager_2075SemanticChildren(viewObject);

	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren,
			final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
				.getVisualID(view);
		return visualID == org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID
				|| visualID == org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<org.muml.pim.component.diagram.part.MumlNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(),
		// semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to
		// find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information -
		// i.e. if there are few views to reference same EObject, only last one
		// to answer isOrphaned == true will be used for the domain element
		// representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<org.muml.pim.component.diagram.part.MumlNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			org.muml.pim.component.diagram.part.MumlNodeDescriptor next = descriptorsIterator
					.next();
			String hint = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both
																	// semanticElement
																	// and hint
																	// match
																	// that of
																	// NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here,
						// but
						// may want to use not the first view but last one as a
						// 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside
						// #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to
												// create anything for the
												// NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for
				// further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our
		// diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated,
		// preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (org.muml.pim.component.diagram.part.MumlNodeDescriptor next : childDescriptors) {
			String hint = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(
					new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
