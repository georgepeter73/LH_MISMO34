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
 * <p>Java class for PRINCIPAL_AND_INTEREST_ADJUSTMENT_LIMITED_PAYMENT_OPTION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRINCIPAL_AND_INTEREST_ADJUSTMENT_LIMITED_PAYMENT_OPTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentActivationAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentActivationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentActivationPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentOptionDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentPeriodEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LimitedPrincipalAndInterestPaymentPullTheNoteIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PRINCIPAL_AND_INTEREST_ADJUSTMENT_LIMITED_PAYMENT_OPTION_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRINCIPAL_AND_INTEREST_ADJUSTMENT_LIMITED_PAYMENT_OPTION", propOrder = {
    "limitedPrincipalAndInterestPaymentActivationAmount",
    "limitedPrincipalAndInterestPaymentActivationIndicator",
    "limitedPrincipalAndInterestPaymentActivationPercent",
    "limitedPrincipalAndInterestPaymentEffectiveDate",
    "limitedPrincipalAndInterestPaymentOptionDescription",
    "limitedPrincipalAndInterestPaymentPeriodEndDate",
    "limitedPrincipalAndInterestPaymentPullTheNoteIndicator",
    "extension"
})
public class PRINCIPALANDINTERESTADJUSTMENTLIMITEDPAYMENTOPTION {

    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentActivationAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> limitedPrincipalAndInterestPaymentActivationAmount;
    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentActivationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> limitedPrincipalAndInterestPaymentActivationIndicator;
    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentActivationPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> limitedPrincipalAndInterestPaymentActivationPercent;
    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> limitedPrincipalAndInterestPaymentEffectiveDate;
    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentOptionDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> limitedPrincipalAndInterestPaymentOptionDescription;
    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentPeriodEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> limitedPrincipalAndInterestPaymentPeriodEndDate;
    @XmlElementRef(name = "LimitedPrincipalAndInterestPaymentPullTheNoteIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> limitedPrincipalAndInterestPaymentPullTheNoteIndicator;
    @XmlElement(name = "EXTENSION")
    protected PRINCIPALANDINTERESTADJUSTMENTLIMITEDPAYMENTOPTIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentActivationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLimitedPrincipalAndInterestPaymentActivationAmount() {
        return limitedPrincipalAndInterestPaymentActivationAmount;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentActivationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentActivationAmount(JAXBElement<MISMOAmount> value) {
        this.limitedPrincipalAndInterestPaymentActivationAmount = value;
    }

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentActivationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getLimitedPrincipalAndInterestPaymentActivationIndicator() {
        return limitedPrincipalAndInterestPaymentActivationIndicator;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentActivationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentActivationIndicator(JAXBElement<MISMOIndicator> value) {
        this.limitedPrincipalAndInterestPaymentActivationIndicator = value;
    }

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentActivationPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getLimitedPrincipalAndInterestPaymentActivationPercent() {
        return limitedPrincipalAndInterestPaymentActivationPercent;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentActivationPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentActivationPercent(JAXBElement<MISMOPercent> value) {
        this.limitedPrincipalAndInterestPaymentActivationPercent = value;
    }

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLimitedPrincipalAndInterestPaymentEffectiveDate() {
        return limitedPrincipalAndInterestPaymentEffectiveDate;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentEffectiveDate(JAXBElement<MISMODate> value) {
        this.limitedPrincipalAndInterestPaymentEffectiveDate = value;
    }

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentOptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLimitedPrincipalAndInterestPaymentOptionDescription() {
        return limitedPrincipalAndInterestPaymentOptionDescription;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentOptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentOptionDescription(JAXBElement<MISMOString> value) {
        this.limitedPrincipalAndInterestPaymentOptionDescription = value;
    }

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLimitedPrincipalAndInterestPaymentPeriodEndDate() {
        return limitedPrincipalAndInterestPaymentPeriodEndDate;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentPeriodEndDate(JAXBElement<MISMODate> value) {
        this.limitedPrincipalAndInterestPaymentPeriodEndDate = value;
    }

    /**
     * Gets the value of the limitedPrincipalAndInterestPaymentPullTheNoteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getLimitedPrincipalAndInterestPaymentPullTheNoteIndicator() {
        return limitedPrincipalAndInterestPaymentPullTheNoteIndicator;
    }

    /**
     * Sets the value of the limitedPrincipalAndInterestPaymentPullTheNoteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setLimitedPrincipalAndInterestPaymentPullTheNoteIndicator(JAXBElement<MISMOIndicator> value) {
        this.limitedPrincipalAndInterestPaymentPullTheNoteIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PRINCIPALANDINTERESTADJUSTMENTLIMITEDPAYMENTOPTIONEXTENSION }
     *     
     */
    public PRINCIPALANDINTERESTADJUSTMENTLIMITEDPAYMENTOPTIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRINCIPALANDINTERESTADJUSTMENTLIMITEDPAYMENTOPTIONEXTENSION }
     *     
     */
    public void setEXTENSION(PRINCIPALANDINTERESTADJUSTMENTLIMITEDPAYMENTOPTIONEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
