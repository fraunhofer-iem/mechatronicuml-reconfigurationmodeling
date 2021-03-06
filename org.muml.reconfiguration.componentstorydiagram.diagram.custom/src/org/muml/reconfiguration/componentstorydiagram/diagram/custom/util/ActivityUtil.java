package org.muml.reconfiguration.componentstorydiagram.diagram.custom.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.OperationExtension;

public final class ActivityUtil {
	private ActivityUtil() {
		// hide constructor
	}

	public static int compare(ActivityNode a, ActivityNode b) {
		int test = check(a, b);

		if (test != 0) {
			return test;
		}

		int sizeA = 0;
		sizeA += a.getIncomings().size();
		sizeA += a.getOutgoings().size();

		int sizeB = 0;
		sizeB += b.getIncomings().size();
		sizeB += b.getOutgoings().size();

		return sizeA - sizeB;
	}

	private static int check(ActivityNode a, ActivityNode b) {
		// go forward from a
		for (ActivityEdge out : a.getOutgoings()) {
			if (b.equals(out.getTarget())) {
				// a is after b
				return -1;
			}
		}

		// go forward from b
		for (ActivityEdge out : b.getOutgoings()) {
			if (a.equals(out.getSource())) {
				// b is after a
				return 1;
			}
		}

		return 0;
	}

	public static InitialNode getInitialNode(Activity activity) {
		for (ActivityNode node : activity.getOwnedActivityNodes()) {
			if (node instanceof InitialNode) {
				return (InitialNode) node;
			}
		}
		return null;
	}

	public static EOperation getEOperation(Activity activity) {
		if (activity != null) {
			OperationExtension operationExtension = activity.getOwningOperation();
			if (operationExtension != null) {
				return operationExtension.getOperation();
			}
		}
		return null;
	}

	public static Activity getActivity(Object element) {
		if (element instanceof Activity) {
			return (Activity) element;
		}

		if (element instanceof EObject) {
			EObject parent = ((EObject) element).eContainer();
			while (parent != null) {
				Activity result = getActivity(parent);
				if (result != null) {
					return result;
				}
				parent = parent.eContainer();
			}
		}

		return null;
	}

	public static boolean isIndependent(Activity element) {
		return element.eContainer() == null;
	}
}
