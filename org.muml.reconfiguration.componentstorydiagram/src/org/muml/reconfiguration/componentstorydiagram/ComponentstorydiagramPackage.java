/**
 */
package org.muml.reconfiguration.componentstorydiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.storydiagram.activities.ActivitiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ComponentstorydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentstorydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfiguration/componentstorydiagram/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentstorydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentstorydiagramPackage eINSTANCE = org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryRuleImpl <em>Component Story Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryRuleImpl
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getComponentStoryRule()
	 * @generated
	 */
	int COMPONENT_STORY_RULE = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__EXTENSIONS = ReconfigurationPackage.RECONFIGURATION_RULE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__COMMENT = ReconfigurationPackage.RECONFIGURATION_RULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reconfigured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__RECONFIGURED_COMPONENT = ReconfigurationPackage.RECONFIGURATION_RULE__RECONFIGURED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__SIGNATURE = ReconfigurationPackage.RECONFIGURATION_RULE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__NAME = ReconfigurationPackage.RECONFIGURATION_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__ACTIVITY = ReconfigurationPackage.RECONFIGURATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE__CONSTRUCTOR = ReconfigurationPackage.RECONFIGURATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Story Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE_FEATURE_COUNT = ReconfigurationPackage.RECONFIGURATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE___GET_EXTENSION__ECLASS = ReconfigurationPackage.RECONFIGURATION_RULE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Component Story Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_RULE_OPERATION_COUNT = ReconfigurationPackage.RECONFIGURATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryNodeImpl <em>Component Story Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryNodeImpl
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getComponentStoryNode()
	 * @generated
	 */
	int COMPONENT_STORY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__EXTENSIONS = ActivitiesPackage.ACTIVITY_NODE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OUTGOINGS = ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__INCOMINGS = ActivitiesPackage.ACTIVITY_NODE__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Component Story Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE__FOR_EACH = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE___GET_EXTENSION__ECLASS = ActivitiesPackage.ACTIVITY_NODE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Component Story Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STORY_NODE_OPERATION_COUNT = ActivitiesPackage.ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.ControllerExchangeNodeImpl <em>Controller Exchange Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ControllerExchangeNodeImpl
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getControllerExchangeNode()
	 * @generated
	 */
	int CONTROLLER_EXCHANGE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__EXTENSIONS = ActivitiesPackage.ACTIVITY_NODE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__NAME = ActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__COMMENT = ActivitiesPackage.ACTIVITY_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__OUTGOINGS = ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__OWNING_ACTIVITY = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__OWNING_ACTIVITY_NODE = ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__INCOMINGS = ActivitiesPackage.ACTIVITY_NODE__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__DEADLINE = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Story Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller Exchange Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE_FEATURE_COUNT = ActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 2;


	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE___GET_EXTENSION__ECLASS = ActivitiesPackage.ACTIVITY_NODE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Controller Exchange Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EXCHANGE_NODE_OPERATION_COUNT = ActivitiesPackage.ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.SendReconfigurationMessageExpressionImpl <em>Send Reconfiguration Message Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.SendReconfigurationMessageExpressionImpl
	 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getSendReconfigurationMessageExpression()
	 * @generated
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION__EXTENSIONS = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION__COMMENT = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Reconfiguration Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Reconfiguration Message Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION_FEATURE_COUNT = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION___GET_EXTENSION__ECLASS = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Send Reconfiguration Message Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_RECONFIGURATION_MESSAGE_EXPRESSION_OPERATION_COUNT = ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule <em>Component Story Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Rule</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule
	 * @generated
	 */
	EClass getComponentStoryRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#getActivity()
	 * @see #getComponentStoryRule()
	 * @generated
	 */
	EReference getComponentStoryRule_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#isConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#isConstructor()
	 * @see #getComponentStoryRule()
	 * @generated
	 */
	EAttribute getComponentStoryRule_Constructor();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode <em>Component Story Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Story Node</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode
	 * @generated
	 */
	EClass getComponentStoryNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Story Pattern</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#getComponentStoryPattern()
	 * @see #getComponentStoryNode()
	 * @generated
	 */
	EReference getComponentStoryNode_ComponentStoryPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#isForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Each</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#isForEach()
	 * @see #getComponentStoryNode()
	 * @generated
	 */
	EAttribute getComponentStoryNode_ForEach();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode <em>Controller Exchange Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Exchange Node</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode
	 * @generated
	 */
	EClass getControllerExchangeNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode#getDeadline()
	 * @see #getControllerExchangeNode()
	 * @generated
	 */
	EReference getControllerExchangeNode_Deadline();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode#getComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Story Pattern</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode#getComponentStoryPattern()
	 * @see #getControllerExchangeNode()
	 * @generated
	 */
	EReference getControllerExchangeNode_ComponentStoryPattern();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression <em>Send Reconfiguration Message Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Reconfiguration Message Expression</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression
	 * @generated
	 */
	EClass getSendReconfigurationMessageExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Message Type</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getReconfigurationMessageType()
	 * @see #getSendReconfigurationMessageExpression()
	 * @generated
	 */
	EReference getSendReconfigurationMessageExpression_ReconfigurationMessageType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getParameterBindings()
	 * @see #getSendReconfigurationMessageExpression()
	 * @generated
	 */
	EReference getSendReconfigurationMessageExpression_ParameterBindings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentstorydiagramFactory getComponentstorydiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryRuleImpl <em>Component Story Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryRuleImpl
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getComponentStoryRule()
		 * @generated
		 */
		EClass COMPONENT_STORY_RULE = eINSTANCE.getComponentStoryRule();
		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_RULE__ACTIVITY = eINSTANCE.getComponentStoryRule_Activity();
		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STORY_RULE__CONSTRUCTOR = eINSTANCE.getComponentStoryRule_Constructor();
		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryNodeImpl <em>Component Story Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentStoryNodeImpl
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getComponentStoryNode()
		 * @generated
		 */
		EClass COMPONENT_STORY_NODE = eINSTANCE.getComponentStoryNode();
		/**
		 * The meta object literal for the '<em><b>Component Story Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN = eINSTANCE.getComponentStoryNode_ComponentStoryPattern();
		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STORY_NODE__FOR_EACH = eINSTANCE.getComponentStoryNode_ForEach();
		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.ControllerExchangeNodeImpl <em>Controller Exchange Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ControllerExchangeNodeImpl
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getControllerExchangeNode()
		 * @generated
		 */
		EClass CONTROLLER_EXCHANGE_NODE = eINSTANCE.getControllerExchangeNode();
		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_EXCHANGE_NODE__DEADLINE = eINSTANCE.getControllerExchangeNode_Deadline();
		/**
		 * The meta object literal for the '<em><b>Component Story Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN = eINSTANCE.getControllerExchangeNode_ComponentStoryPattern();
		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.componentstorydiagram.impl.SendReconfigurationMessageExpressionImpl <em>Send Reconfiguration Message Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.SendReconfigurationMessageExpressionImpl
		 * @see org.muml.reconfiguration.componentstorydiagram.impl.ComponentstorydiagramPackageImpl#getSendReconfigurationMessageExpression()
		 * @generated
		 */
		EClass SEND_RECONFIGURATION_MESSAGE_EXPRESSION = eINSTANCE.getSendReconfigurationMessageExpression();
		/**
		 * The meta object literal for the '<em><b>Reconfiguration Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE = eINSTANCE.getSendReconfigurationMessageExpression_ReconfigurationMessageType();
		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS = eINSTANCE.getSendReconfigurationMessageExpression_ParameterBindings();

	}

} //ComponentstorydiagramPackage
