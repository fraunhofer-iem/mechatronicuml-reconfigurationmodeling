/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.muml.pim.component.DelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.DelegationVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getDelegationVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ExistingDelegationConnectorBetweenPortVariableTypes='if not self.type.oclIsUndefined() then\r\n\tlet selfPorts : OrderedSet(pim::component::Port) = self.portVariables.portType.oclAsType(pim::component::Port)->asOrderedSet(),\r\n\ttypePorts: OrderedSet(pim::component::Port) = self.type.connectorEndpoints->collect( cE |\r\n\t  if cE.oclIsTypeOf(pim::component::PortPart)\t\r\n      then cE.oclAsType(pim::component::PortPart).portType\r\n\t  else \r\n\t  \tif cE.oclIsKindOf(pim::component::Port)\r\n\t  \tthen cE.oclAsType(pim::component::Port)\r\n\t  \telse  null\r\n\t  \tendif\r\n\t  endif)->asOrderedSet()\r\n\tin \r\n\tselfPorts->intersection(typePorts)->size() = 2\t\t\r\nelse\r\n\t\tfalse\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExistingDelegationConnectorBetweenPortVariableTypes'"
 * @generated
 */
public interface DelegationVariable extends ConnectorVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DelegationConnector)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getDelegationVariable_Type()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter choices='let outerPort : pim::component::Port = self.portVariables->select(oclAsType(ecore::EObject).eContainer().oclIsTypeOf(ComponentVariable))->at(1).portType,\r\n\tinnerPort : pim::component::Port = self.portVariables.portType->excluding(outerPort)->at(1),\r\n\tdelegationConnectorsOuter : OrderedSet(pim::connector::Connector) = outerPort.connectors->select(oclIsTypeOf(pim::component::DelegationConnector))\r\nin\r\n\tdelegationConnectorsOuter->select(dC | dC.oclAsType(pim::component::DelegationConnector).portPart.portType = innerPort)'"
	 * @generated
	 */
	DelegationConnector getType();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.DelegationVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DelegationConnector value);

} // DelegationVariable
