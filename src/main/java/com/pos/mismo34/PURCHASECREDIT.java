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
 * Specifies the general types of credit on the transaction exclusive of financing.
 * 
 * <p>Java class for PURCHASE_CREDIT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PURCHASE_CREDIT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseCreditAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PurchaseCreditSourceType" type="{http://www.mismo.org/residential/2009/schemas}PurchaseCreditSourceEnum" minOccurs="0"/>
 *         &lt;element name="PurchaseCreditSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PurchaseCreditType" type="{http://www.mismo.org/residential/2009/schemas}PurchaseCreditEnum" minOccurs="0"/>
 *         &lt;element name="PurchaseCreditTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PURCHASE_CREDIT_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
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
@XmlType(name = "PURCHASE_CREDIT", propOrder = {
    "purchaseCreditAmount",
    "purchaseCreditSourceType",
    "purchaseCreditSourceTypeOtherDescription",
    "purchaseCreditType",
    "purchaseCreditTypeOtherDescription",
    "extension"
})
public class PURCHASECREDIT {

    @XmlElementRef(name = "PurchaseCreditAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> purchaseCreditAmount;
    @XmlElementRef(name = "PurchaseCreditSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PurchaseCreditSourceEnum> purchaseCreditSourceType;
    @XmlElementRef(name = "PurchaseCreditSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> purchaseCreditSourceTypeOtherDescription;
    @XmlElementRef(name = "PurchaseCreditType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PurchaseCreditEnum> purchaseCreditType;
    @XmlElementRef(name = "PurchaseCreditTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> purchaseCreditTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected PURCHASECREDITEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the purchaseCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPurchaseCreditAmount() {
        return purchaseCreditAmount;
    }

    /**
     * Sets the value of the purchaseCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPurchaseCreditAmount(JAXBElement<MISMOAmount> value) {
        this.purchaseCreditAmount = value;
    }

    /**
     * Gets the value of the purchaseCreditSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurchaseCreditSourceEnum }{@code >}
     *     
     */
    public JAXBElement<PurchaseCreditSourceEnum> getPurchaseCreditSourceType() {
        return purchaseCreditSourceType;
    }

    /**
     * Sets the value of the purchaseCreditSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurchaseCreditSourceEnum }{@code >}
     *     
     */
    public void setPurchaseCreditSourceType(JAXBElement<PurchaseCreditSourceEnum> value) {
        this.purchaseCreditSourceType = value;
    }

    /**
     * Gets the value of the purchaseCreditSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPurchaseCreditSourceTypeOtherDescription() {
        return purchaseCreditSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the purchaseCreditSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPurchaseCreditSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.purchaseCreditSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the purchaseCreditType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurchaseCreditEnum }{@code >}
     *     
     */
    public JAXBElement<PurchaseCreditEnum> getPurchaseCreditType() {
        return purchaseCreditType;
    }

    /**
     * Sets the value of the purchaseCreditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurchaseCreditEnum }{@code >}
     *     
     */
    public void setPurchaseCreditType(JAXBElement<PurchaseCreditEnum> value) {
        this.purchaseCreditType = value;
    }

    /**
     * Gets the value of the purchaseCreditTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPurchaseCreditTypeOtherDescription() {
        return purchaseCreditTypeOtherDescription;
    }

    /**
     * Sets the value of the purchaseCreditTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPurchaseCreditTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.purchaseCreditTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PURCHASECREDITEXTENSION }
     *     
     */
    public PURCHASECREDITEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PURCHASECREDITEXTENSION }
     *     
     */
    public void setEXTENSION(PURCHASECREDITEXTENSION value) {
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
