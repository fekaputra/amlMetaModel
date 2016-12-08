/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base element for AttributeNameMapping and InterfaceNameMapping.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link CAEX.Mapping#getInterfaceNameMapping <em>Interface Name Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getMapping()
 * @model extendedMetaData="name='MappingType' kind='elementOnly'"
 * @generated
 */
public interface Mapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.AttributeNameMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the definition of the mapping between attribute names of corresponding RoleClasses and SystemUnitClasses. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Name Mapping</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getMapping_AttributeNameMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeNameMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeNameMapping> getAttributeNameMapping();

	/**
	 * Returns the value of the '<em><b>Interface Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InterfaceNameMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping of interface names of corresponding RoleClasses and SystemUnitClasses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Name Mapping</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getMapping_InterfaceNameMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceNameMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceNameMapping> getInterfaceNameMapping();

} // Mapping
