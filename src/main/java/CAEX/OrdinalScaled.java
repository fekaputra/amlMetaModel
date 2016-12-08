/**
 */
package CAEX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scaled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}</li>
 *   <li>{@link CAEX.OrdinalScaled#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link CAEX.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getOrdinalScaled()
 * @model extendedMetaData="name='OrdinalScaledType_._type' kind='elementOnly'"
 * @generated
 */
public interface OrdinalScaled extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a maximum value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Max Value</em>' attribute.
	 * @see #setRequiredMaxValue(String)
	 * @see CAEX.CAEXPackage#getOrdinalScaled_RequiredMaxValue()
	 * @model extendedMetaData="kind='element' name='RequiredMaxValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequiredMaxValue();

	/**
	 * Sets the value of the '{@link CAEX.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Max Value</em>' attribute.
	 * @see #getRequiredMaxValue()
	 * @generated
	 */
	void setRequiredMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute.
	 * @see #setRequiredValue(String)
	 * @see CAEX.CAEXPackage#getOrdinalScaled_RequiredValue()
	 * @model extendedMetaData="kind='element' name='RequiredValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequiredValue();

	/**
	 * Sets the value of the '{@link CAEX.OrdinalScaled#getRequiredValue <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value</em>' attribute.
	 * @see #getRequiredValue()
	 * @generated
	 */
	void setRequiredValue(String value);

	/**
	 * Returns the value of the '<em><b>Required Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a minimum value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Min Value</em>' attribute.
	 * @see #setRequiredMinValue(String)
	 * @see CAEX.CAEXPackage#getOrdinalScaled_RequiredMinValue()
	 * @model extendedMetaData="kind='element' name='RequiredMinValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequiredMinValue();

	/**
	 * Sets the value of the '{@link CAEX.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Min Value</em>' attribute.
	 * @see #getRequiredMinValue()
	 * @generated
	 */
	void setRequiredMinValue(String value);

} // OrdinalScaled
