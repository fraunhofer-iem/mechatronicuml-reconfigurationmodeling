package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart;

public class CustomMultiPortVariableEditPart extends MultiPortVariableEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomMultiPortVariableEditPart(View view) {
		super(view);

	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		super.handleNotificationEvent(notification);
		if (BehaviorPackage.Literals.TYPED_NAMED_ELEMENT__DATA_TYPE
				.equals(notification.getFeature())) {
			updateSinglePortVariableTypes();
		}
	}

	private void updateSinglePortVariableTypes() {
		MultiPortVariable multiPortVariable = (MultiPortVariable) getNotationView()
				.getElement();
		if (multiPortVariable != null)
			for (SinglePortVariable singlePortVariable : multiPortVariable
					.getSubPortVariables()) {
				singlePortVariable.setDataType(multiPortVariable.getPortType());
			}
	}

}
