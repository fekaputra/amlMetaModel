/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.RoleRequirements#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CAEX.RoleRequirements#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link CAEX.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getRoleRequirements()
 * @model extendedMetaData="name='RoleRequirements_._type' kind='elementOnly'"
 * @generated
 */
public interface RoleRequirements extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the RoleRequirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getRoleRequirements_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getRoleRequirements_ExternalInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Ref Base Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Role Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #setRefBaseRoleClassPath(String)
	 * @see CAEX.CAEXPackage#getRoleRequirements_RefBaseRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RefBaseRoleClassPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefBaseRoleClassPath();

	/**
	 * Sets the value of the '{@link CAEX.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 */
	void setRefBaseRoleClassPath(String value);

} // RoleRequirements
