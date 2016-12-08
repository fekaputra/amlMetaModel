/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getSystemUnitClassLib()
 * @model extendedMetaData="name='SystemUnitClassLib_._type' kind='elementOnly'"
 * @generated
 */
public interface SystemUnitClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.SystemUnitFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used for SystemUnitClass definition, provides definition of a class of a SystemUnitClass type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClassLib_SystemUnitClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SystemUnitClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SystemUnitFamily> getSystemUnitClass();

} // SystemUnitClassLib
