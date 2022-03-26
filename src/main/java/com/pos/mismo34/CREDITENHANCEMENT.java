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
 * An instrument or agreement used to mitigate the credit risk of the loan to the investor.
 * 
 * <p>Java class for CREDIT_ENHANCEMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_ENHANCEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditEnhancementEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementEffectivePeriodType" type="{http://www.mismo.org/residential/2009/schemas}CreditEnhancementEffectivePeriodEnum" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementPartyRoleType" type="{http://www.mismo.org/residential/2009/schemas}CreditEnhancementPartyRoleEnum" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementPartyRoleTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementPeriodBasedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementType" type="{http://www.mismo.org/residential/2009/schemas}CreditEnhancementEnum" minOccurs="0"/>
 *         &lt;element name="CreditEnhancementTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_ENHANCEMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_ENHANCEMENT", propOrder = {
    "creditEnhancementEffectiveDate",
    "creditEnhancementEffectivePeriodType",
    "creditEnhancementExpirationDate",
    "creditEnhancementPartyRoleType",
    "creditEnhancementPartyRoleTypeOtherDescription",
    "creditEnhancementPeriodBasedIndicator",
    "creditEnhancementType",
    "creditEnhancementTypeOtherDescription",
    "extension"
})
public class CREDITENHANCEMENT {

    @XmlElementRef(name = "CreditEnhancementEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditEnhancementEffectiveDate;
    @XmlElementRef(name = "CreditEnhancementEffectivePeriodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditEnhancementEffectivePeriodEnum> creditEnhancementEffectivePeriodType;
    @XmlElementRef(name = "CreditEnhancementExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditEnhancementExpirationDate;
    @XmlElementRef(name = "CreditEnhancementPartyRoleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditEnhancementPartyRoleEnum> creditEnhancementPartyRoleType;
    @XmlElementRef(name = "CreditEnhancementPartyRoleTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditEnhancementPartyRoleTypeOtherDescription;
    @XmlElementRef(name = "CreditEnhancementPeriodBasedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> creditEnhancementPeriodBasedIndicator;
    @XmlElementRef(name = "CreditEnhancementType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditEnhancementEnum> creditEnhancementType;
    @XmlElementRef(name = "CreditEnhancementTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditEnhancementTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CREDITENHANCEMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditEnhancementEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCreditEnhancementEffectiveDate() {
        return creditEnhancementEffectiveDate;
    }

    /**
     * Sets the value of the creditEnhancementEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCreditEnhancementEffectiveDate(JAXBElement<MISMODate> value) {
        this.creditEnhancementEffectiveDate = value;
    }

    /**
     * Gets the value of the creditEnhancementEffectivePeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditEnhancementEffectivePeriodEnum }{@code >}
     *     
     */
    public JAXBElement<CreditEnhancementEffectivePeriodEnum> getCreditEnhancementEffectivePeriodType() {
        return creditEnhancementEffectivePeriodType;
    }

    /**
     * Sets the value of the creditEnhancementEffectivePeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditEnhancementEffectivePeriodEnum }{@code >}
     *     
     */
    public void setCreditEnhancementEffectivePeriodType(JAXBElement<CreditEnhancementEffectivePeriodEnum> value) {
        this.creditEnhancementEffectivePeriodType = value;
    }

    /**
     * Gets the value of the creditEnhancementExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCreditEnhancementExpirationDate() {
        return creditEnhancementExpirationDate;
    }

    /**
     * Sets the value of the creditEnhancementExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCreditEnhancementExpirationDate(JAXBElement<MISMODate> value) {
        this.creditEnhancementExpirationDate = value;
    }

    /**
     * Gets the value of the creditEnhancementPartyRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditEnhancementPartyRoleEnum }{@code >}
     *     
     */
    public JAXBElement<CreditEnhancementPartyRoleEnum> getCreditEnhancementPartyRoleType() {
        return creditEnhancementPartyRoleType;
    }

    /**
     * Sets the value of the creditEnhancementPartyRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditEnhancementPartyRoleEnum }{@code >}
     *     
     */
    public void setCreditEnhancementPartyRoleType(JAXBElement<CreditEnhancementPartyRoleEnum> value) {
        this.creditEnhancementPartyRoleType = value;
    }

    /**
     * Gets the value of the creditEnhancementPartyRoleTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditEnhancementPartyRoleTypeOtherDescription() {
        return creditEnhancementPartyRoleTypeOtherDescription;
    }

    /**
     * Sets the value of the creditEnhancementPartyRoleTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditEnhancementPartyRoleTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditEnhancementPartyRoleTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditEnhancementPeriodBasedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCreditEnhancementPeriodBasedIndicator() {
        return creditEnhancementPeriodBasedIndicator;
    }

    /**
     * Sets the value of the creditEnhancementPeriodBasedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCreditEnhancementPeriodBasedIndicator(JAXBElement<MISMOIndicator> value) {
        this.creditEnhancementPeriodBasedIndicator = value;
    }

    /**
     * Gets the value of the creditEnhancementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditEnhancementEnum }{@code >}
     *     
     */
    public JAXBElement<CreditEnhancementEnum> getCreditEnhancementType() {
        return creditEnhancementType;
    }

    /**
     * Sets the value of the creditEnhancementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditEnhancementEnum }{@code >}
     *     
     */
    public void setCreditEnhancementType(JAXBElement<CreditEnhancementEnum> value) {
        this.creditEnhancementType = value;
    }

    /**
     * Gets the value of the creditEnhancementTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditEnhancementTypeOtherDescription() {
        return creditEnhancementTypeOtherDescription;
    }

    /**
     * Sets the value of the creditEnhancementTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditEnhancementTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditEnhancementTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITENHANCEMENTEXTENSION }
     *     
     */
    public CREDITENHANCEMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITENHANCEMENTEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITENHANCEMENTEXTENSION value) {
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
