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
 * Information regarding the type of closing adjustment and the associated per diem amounts.
 * 
 * <p>Java class for CLOSING_ADJUSTMENT_ITEM_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING_ADJUSTMENT_ITEM_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosingAdjustmentItemAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ClosingAdjustmentItemPaidByType" type="{http://www.mismo.org/residential/2009/schemas}ClosingAdjustmentItemPaidByEnum" minOccurs="0"/>
 *         &lt;element name="ClosingAdjustmentItemPaidOutsideOfClosingIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ClosingAdjustmentItemType" type="{http://www.mismo.org/residential/2009/schemas}ClosingAdjustmentItemEnum" minOccurs="0"/>
 *         &lt;element name="ClosingAdjustmentItemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ClosingAdjustmentPaidFromDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ClosingAdjustmentPaidThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureLineNumberValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSubsectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_ADJUSTMENT_ITEM_DETAIL_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLOSING_ADJUSTMENT_ITEM_DETAIL", propOrder = {
    "closingAdjustmentItemAmount",
    "closingAdjustmentItemPaidByType",
    "closingAdjustmentItemPaidOutsideOfClosingIndicator",
    "closingAdjustmentItemType",
    "closingAdjustmentItemTypeOtherDescription",
    "closingAdjustmentPaidFromDate",
    "closingAdjustmentPaidThroughDate",
    "integratedDisclosureLineNumberValue",
    "integratedDisclosureSectionType",
    "integratedDisclosureSectionTypeOtherDescription",
    "integratedDisclosureSubsectionType",
    "integratedDisclosureSubsectionTypeOtherDescription",
    "extension"
})
public class CLOSINGADJUSTMENTITEMDETAIL {

    @XmlElementRef(name = "ClosingAdjustmentItemAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> closingAdjustmentItemAmount;
    @XmlElementRef(name = "ClosingAdjustmentItemPaidByType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ClosingAdjustmentItemPaidByEnum> closingAdjustmentItemPaidByType;
    @XmlElementRef(name = "ClosingAdjustmentItemPaidOutsideOfClosingIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> closingAdjustmentItemPaidOutsideOfClosingIndicator;
    @XmlElementRef(name = "ClosingAdjustmentItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ClosingAdjustmentItemEnum> closingAdjustmentItemType;
    @XmlElementRef(name = "ClosingAdjustmentItemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> closingAdjustmentItemTypeOtherDescription;
    @XmlElementRef(name = "ClosingAdjustmentPaidFromDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> closingAdjustmentPaidFromDate;
    @XmlElementRef(name = "ClosingAdjustmentPaidThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> closingAdjustmentPaidThroughDate;
    @XmlElementRef(name = "IntegratedDisclosureLineNumberValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> integratedDisclosureLineNumberValue;
    @XmlElementRef(name = "IntegratedDisclosureSectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSectionEnum> integratedDisclosureSectionType;
    @XmlElementRef(name = "IntegratedDisclosureSectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSectionTypeOtherDescription;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSubsectionEnum> integratedDisclosureSubsectionType;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSubsectionTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGADJUSTMENTITEMDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closingAdjustmentItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getClosingAdjustmentItemAmount() {
        return closingAdjustmentItemAmount;
    }

    /**
     * Sets the value of the closingAdjustmentItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setClosingAdjustmentItemAmount(JAXBElement<MISMOAmount> value) {
        this.closingAdjustmentItemAmount = value;
    }

    /**
     * Gets the value of the closingAdjustmentItemPaidByType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClosingAdjustmentItemPaidByEnum }{@code >}
     *     
     */
    public JAXBElement<ClosingAdjustmentItemPaidByEnum> getClosingAdjustmentItemPaidByType() {
        return closingAdjustmentItemPaidByType;
    }

    /**
     * Sets the value of the closingAdjustmentItemPaidByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClosingAdjustmentItemPaidByEnum }{@code >}
     *     
     */
    public void setClosingAdjustmentItemPaidByType(JAXBElement<ClosingAdjustmentItemPaidByEnum> value) {
        this.closingAdjustmentItemPaidByType = value;
    }

    /**
     * Gets the value of the closingAdjustmentItemPaidOutsideOfClosingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getClosingAdjustmentItemPaidOutsideOfClosingIndicator() {
        return closingAdjustmentItemPaidOutsideOfClosingIndicator;
    }

    /**
     * Sets the value of the closingAdjustmentItemPaidOutsideOfClosingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setClosingAdjustmentItemPaidOutsideOfClosingIndicator(JAXBElement<MISMOIndicator> value) {
        this.closingAdjustmentItemPaidOutsideOfClosingIndicator = value;
    }

    /**
     * Gets the value of the closingAdjustmentItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClosingAdjustmentItemEnum }{@code >}
     *     
     */
    public JAXBElement<ClosingAdjustmentItemEnum> getClosingAdjustmentItemType() {
        return closingAdjustmentItemType;
    }

    /**
     * Sets the value of the closingAdjustmentItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClosingAdjustmentItemEnum }{@code >}
     *     
     */
    public void setClosingAdjustmentItemType(JAXBElement<ClosingAdjustmentItemEnum> value) {
        this.closingAdjustmentItemType = value;
    }

    /**
     * Gets the value of the closingAdjustmentItemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getClosingAdjustmentItemTypeOtherDescription() {
        return closingAdjustmentItemTypeOtherDescription;
    }

    /**
     * Sets the value of the closingAdjustmentItemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setClosingAdjustmentItemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.closingAdjustmentItemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the closingAdjustmentPaidFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getClosingAdjustmentPaidFromDate() {
        return closingAdjustmentPaidFromDate;
    }

    /**
     * Sets the value of the closingAdjustmentPaidFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setClosingAdjustmentPaidFromDate(JAXBElement<MISMODate> value) {
        this.closingAdjustmentPaidFromDate = value;
    }

    /**
     * Gets the value of the closingAdjustmentPaidThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getClosingAdjustmentPaidThroughDate() {
        return closingAdjustmentPaidThroughDate;
    }

    /**
     * Sets the value of the closingAdjustmentPaidThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setClosingAdjustmentPaidThroughDate(JAXBElement<MISMODate> value) {
        this.closingAdjustmentPaidThroughDate = value;
    }

    /**
     * Gets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getIntegratedDisclosureLineNumberValue() {
        return integratedDisclosureLineNumberValue;
    }

    /**
     * Sets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setIntegratedDisclosureLineNumberValue(JAXBElement<MISMOValue> value) {
        this.integratedDisclosureLineNumberValue = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSectionEnum> getIntegratedDisclosureSectionType() {
        return integratedDisclosureSectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionType(JAXBElement<IntegratedDisclosureSectionEnum> value) {
        this.integratedDisclosureSectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSectionTypeOtherDescription() {
        return integratedDisclosureSectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSubsectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSubsectionEnum> getIntegratedDisclosureSubsectionType() {
        return integratedDisclosureSubsectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSubsectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionType(JAXBElement<IntegratedDisclosureSubsectionEnum> value) {
        this.integratedDisclosureSubsectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSubsectionTypeOtherDescription() {
        return integratedDisclosureSubsectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSubsectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGADJUSTMENTITEMDETAILEXTENSION }
     *     
     */
    public CLOSINGADJUSTMENTITEMDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGADJUSTMENTITEMDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGADJUSTMENTITEMDETAILEXTENSION value) {
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
