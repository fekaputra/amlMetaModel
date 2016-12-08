/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a SystemUnit class definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.SystemUnitClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CAEX.SystemUnitClass#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link CAEX.SystemUnitClass#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link CAEX.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link CAEX.SystemUnitClass#getInternalLink <em>Internal Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getSystemUnitClass()
 * @model extendedMetaData="name='SystemUnitClassType' kind='elementOnly'"
 * @generated
 */
public interface SystemUnitClass extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the SystemUnitClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClass_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of an external interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClass_ExternalInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InternalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used in order to define nested objects inside of a SystemUnitClass or another InternalElement. Allows description of the internal structure of an CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClass_InternalElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternalElement> getInternalElement();

	/**
	 * Returns the value of the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.SupportedRoleClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the association to a RoleClass which this SystemUnitClass can play. A SystemUnitClass may reference multiple roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Role Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClass_SupportedRoleClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupportedRoleClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedRoleClass> getSupportedRoleClass();

	/**
	 * Returns the value of the '<em><b>Internal Link</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used in order to define the relationships between internal interfaces of InternalElements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Link</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClass_InternalLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternalLink> getInternalLink();

} // SystemUnitClass
