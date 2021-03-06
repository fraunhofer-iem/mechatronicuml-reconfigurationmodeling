package org.muml.reconfiguration.componentstorydiagram.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;

public class CustomComponentStoryDiagramEditPolicyProvider extends
		AbstractProvider implements IEditPolicyProvider {

	public void createEditPolicies(EditPart ep) {
		if (ep instanceof IGraphicalEditPart) {
			EObject element = ((IGraphicalEditPart) ep)
					.resolveSemanticElement();

			if (element instanceof ComponentStoryNode) {
				ep.installEditPolicy(
						"ComponentStoryNodeFigureRole",
						new org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.policies.ComponentStoryNodeFigureEditPolicy());
			}

		}
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			EditPart ep = ((CreateEditPoliciesOperation) operation)
					.getEditPart();

			if (ep instanceof ComponentStoryNodeEditPart) {
				EObject element = ((IGraphicalEditPart) ep)
						.resolveSemanticElement();
				return element instanceof ComponentStoryNode;
			}

		}
		return false;
	}

}
