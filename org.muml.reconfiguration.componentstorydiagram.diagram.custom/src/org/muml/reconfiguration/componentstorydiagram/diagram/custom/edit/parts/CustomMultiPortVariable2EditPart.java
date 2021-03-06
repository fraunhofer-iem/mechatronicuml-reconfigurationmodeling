package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;

public class CustomMultiPortVariable2EditPart extends
		MultiPortVariable2EditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomMultiPortVariable2EditPart(View view) {
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
	
	private void updateSinglePortVariableTypes(){
		MultiPortVariable multiPortVariable = (MultiPortVariable) getNotationView()
				.getElement();
		if (multiPortVariable != null)
			for (SinglePortVariable singlePortVariable : multiPortVariable
					.getSubPortVariables()) {
				singlePortVariable.setDataType(multiPortVariable.getPortType());
			}
	}
}
