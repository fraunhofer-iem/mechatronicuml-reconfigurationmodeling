package org.muml.reconfiguration.ui.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ReconfigurationPortDelegationConnectorItemSemanticEditPolicy
		extends
		org.muml.pim.component.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ReconfigurationPortDelegationConnectorItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurationPortDelegationConnector_4076);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
