//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Information on the dates, identification, categorization and other facts about the expense claim item.
 * 
 * <p>Java class for EXPENSE_CLAIM_ITEM_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXPENSE_CLAIM_ITEM_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpenseClaimCategoryIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimClassificationIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemCancellationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemEscrowedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemFromDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemInsurancePlacedType" type="{http://www.mismo.org/residential/2009/schemas}ExpenseClaimItemInsurancePlacedEnum" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemInsurancePlacedTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ExpenseClaimItemToDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EXPENSE_CLAIM_ITEM_DETAIL_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXPENSE_CLAIM_ITEM_DETAIL", propOrder = {
    "expenseClaimCategoryIdentifier",
    "expenseClaimClassificationIdentifier",
    "expenseClaimItemCancellationDate",
    "expenseClaimItemCount",
    "expenseClaimItemEscrowedIndicator",
    "expenseClaimItemFromDate",
    "expenseClaimItemIdentifier",
    "expenseClaimItemInsurancePlacedType",
    "expenseClaimItemInsurancePlacedTypeOtherDescription",
    "expenseClaimItemToDate",
    "extension"
})
public class EXPENSECLAIMITEMDETAIL {

    @XmlElementRef(name = "ExpenseClaimCategoryIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> expenseClaimCategoryIdentifier;
    @XmlElementRef(name = "ExpenseClaimClassificationIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> expenseClaimClassificationIdentifier;
    @XmlElementRef(name = "ExpenseClaimItemCancellationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> expenseClaimItemCancellationDate;
    @XmlElementRef(name = "ExpenseClaimItemCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> expenseClaimItemCount;
    @XmlElementRef(name = "ExpenseClaimItemEscrowedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> expenseClaimItemEscrowedIndicator;
    @XmlElementRef(name = "ExpenseClaimItemFromDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> expenseClaimItemFromDate;
    @XmlElementRef(name = "ExpenseClaimItemIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> expenseClaimItemIdentifier;
    @XmlElementRef(name = "ExpenseClaimItemInsurancePlacedType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpenseClaimItemInsurancePlacedEnum> expenseClaimItemInsurancePlacedType;
    @XmlElementRef(name = "ExpenseClaimItemInsurancePlacedTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> expenseClaimItemInsurancePlacedTypeOtherDescription;
    @XmlElementRef(name = "ExpenseClaimItemToDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> expenseClaimItemToDate;
    @XmlElement(name = "EXTENSION")
    protected EXPENSECLAIMITEMDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the expenseClaimCategoryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getExpenseClaimCategoryIdentifier() {
        return expenseClaimCategoryIdentifier;
    }

    /**
     * Sets the value of the expenseClaimCategoryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setExpenseClaimCategoryIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.expenseClaimCategoryIdentifier = value;
    }

    /**
     * Gets the value of the expenseClaimClassificationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getExpenseClaimClassificationIdentifier() {
        return expenseClaimClassificationIdentifier;
    }

    /**
     * Sets the value of the expenseClaimClassificationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setExpenseClaimClassificationIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.expenseClaimClassificationIdentifier = value;
    }

    /**
     * Gets the value of the expenseClaimItemCancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getExpenseClaimItemCancellationDate() {
        return expenseClaimItemCancellationDate;
    }

    /**
     * Sets the value of the expenseClaimItemCancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setExpenseClaimItemCancellationDate(JAXBElement<MISMODate> value) {
        this.expenseClaimItemCancellationDate = value;
    }

    /**
     * Gets the value of the expenseClaimItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getExpenseClaimItemCount() {
        return expenseClaimItemCount;
    }

    /**
     * Sets the value of the expenseClaimItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setExpenseClaimItemCount(JAXBElement<MISMOCount> value) {
        this.expenseClaimItemCount = value;
    }

    /**
     * Gets the value of the expenseClaimItemEscrowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getExpenseClaimItemEscrowedIndicator() {
        return expenseClaimItemEscrowedIndicator;
    }

    /**
     * Sets the value of the expenseClaimItemEscrowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setExpenseClaimItemEscrowedIndicator(JAXBElement<MISMOIndicator> value) {
        this.expenseClaimItemEscrowedIndicator = value;
    }

    /**
     * Gets the value of the expenseClaimItemFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getExpenseClaimItemFromDate() {
        return expenseClaimItemFromDate;
    }

    /**
     * Sets the value of the expenseClaimItemFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setExpenseClaimItemFromDate(JAXBElement<MISMODate> value) {
        this.expenseClaimItemFromDate = value;
    }

    /**
     * Gets the value of the expenseClaimItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getExpenseClaimItemIdentifier() {
        return expenseClaimItemIdentifier;
    }

    /**
     * Sets the value of the expenseClaimItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setExpenseClaimItemIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.expenseClaimItemIdentifier = value;
    }

    /**
     * Gets the value of the expenseClaimItemInsurancePlacedType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpenseClaimItemInsurancePlacedEnum }{@code >}
     *     
     */
    public JAXBElement<ExpenseClaimItemInsurancePlacedEnum> getExpenseClaimItemInsurancePlacedType() {
        return expenseClaimItemInsurancePlacedType;
    }

    /**
     * Sets the value of the expenseClaimItemInsurancePlacedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpenseClaimItemInsurancePlacedEnum }{@code >}
     *     
     */
    public void setExpenseClaimItemInsurancePlacedType(JAXBElement<ExpenseClaimItemInsurancePlacedEnum> value) {
        this.expenseClaimItemInsurancePlacedType = value;
    }

    /**
     * Gets the value of the expenseClaimItemInsurancePlacedTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getExpenseClaimItemInsurancePlacedTypeOtherDescription() {
        return expenseClaimItemInsurancePlacedTypeOtherDescription;
    }

    /**
     * Sets the value of the expenseClaimItemInsurancePlacedTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setExpenseClaimItemInsurancePlacedTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.expenseClaimItemInsurancePlacedTypeOtherDescription = value;
    }

    /**
     * Gets the value of the expenseClaimItemToDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getExpenseClaimItemToDate() {
        return expenseClaimItemToDate;
    }

    /**
     * Sets the value of the expenseClaimItemToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setExpenseClaimItemToDate(JAXBElement<MISMODate> value) {
        this.expenseClaimItemToDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EXPENSECLAIMITEMDETAILEXTENSION }
     *     
     */
    public EXPENSECLAIMITEMDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPENSECLAIMITEMDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(EXPENSECLAIMITEMDETAILEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
