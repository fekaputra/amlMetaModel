/**
 */
package CAEX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for definition of value requirements of an attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}</li>
 *   <li>{@link CAEX.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}</li>
 *   <li>{@link CAEX.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}</li>
 *   <li>{@link CAEX.AttributeValueRequirement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getAttributeValueRequirement()
 * @model extendedMetaData="name='AttributeValueRequirementType' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueRequirement extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Ordinal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element of to define constraints of ordinal scaled attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordinal Scaled Type</em>' containment reference.
	 * @see #setOrdinalScaledType(OrdinalScaled)
	 * @see CAEX.CAEXPackage#getAttributeValueRequirement_OrdinalScaledType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrdinalScaledType' namespace='##targetNamespace'"
	 * @generated
	 */
	OrdinalScaled getOrdinalScaledType();

	/**
	 * Sets the value of the '{@link CAEX.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal Scaled Type</em>' containment reference.
	 * @see #getOrdinalScaledType()
	 * @generated
	 */
	void setOrdinalScaledType(OrdinalScaled value);

	/**
	 * Returns the value of the '<em><b>Nominal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element of to define constraints of nominal scaled attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Scaled Type</em>' containment reference.
	 * @see #setNominalScaledType(NominalScaled)
	 * @see CAEX.CAEXPackage#getAttributeValueRequirement_NominalScaledType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NominalScaledType' namespace='##targetNamespace'"
	 * @generated
	 */
	NominalScaled getNominalScaledType();

	/**
	 * Sets the value of the '{@link CAEX.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Scaled Type</em>' containment reference.
	 * @see #getNominalScaledType()
	 * @generated
	 */
	void setNominalScaledType(NominalScaled value);

	/**
	 * Returns the value of the '<em><b>Unknown Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define constraints for attribute values of an unknown scale type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unknown Type</em>' containment reference.
	 * @see #setUnknownType(UnknownType)
	 * @see CAEX.CAEXPackage#getAttributeValueRequirement_UnknownType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnknownType' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownType getUnknownType();

	/**
	 * Sets the value of the '{@link CAEX.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Type</em>' containment reference.
	 * @see #getUnknownType()
	 * @generated
	 */
	void setUnknownType(UnknownType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the name of the contraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CAEX.CAEXPackage#getAttributeValueRequirement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CAEX.AttributeValueRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AttributeValueRequirement
