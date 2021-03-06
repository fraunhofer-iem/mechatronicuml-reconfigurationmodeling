package org.muml.reconfiguration.ui.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.component.diagram.edit.policies.ModelElementCategoryItemSemanticEditPolicy;

public class CustomModelElementCategoryItemSemanticEditPolicy extends ModelElementCategoryItemSemanticEditPolicy{
	
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurableAtomicComponent_2078== req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.ui.edit.commands.ReconfigurableAtomicComponentCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurableStructuredComponent_2076== req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.ui.edit.commands.ReconfigurableStructuredComponentCreateCommand(
					req));
		}
		
		if (org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.FadingComponent_2079== req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.ui.edit.commands.FadingComponentCreateCommand(
					req));
		}

		return super.getCreateCommand(req);
	}

}
