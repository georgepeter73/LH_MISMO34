//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * The contents of this structure is meant to act as a template, from a servicing perspective,  for the breakdown of the mortgage payment into specific component pieces that makeup the total regularly scheduled payment. The structure supports 3 specific periods in time associated with the states of previous, current and pending showing how the payment should breakdown in the individual component pieces.
 * 
 * <p>Java class for PAYMENT_COMPONENT_BREAKOUT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_COMPONENT_BREAKOUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDITIONAL_CHARGES" type="{http://www.mismo.org/residential/2009/schemas}ADDITIONAL_CHARGES" minOccurs="0"/>
 *         &lt;element name="PAYMENT_COMPONENT_BREAKOUT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_COMPONENT_BREAKOUT_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PAYMENT_COMPONENT_BREAKOUT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PAYMENT_COMPONENT_BREAKOUT", propOrder = {
    "additionalcharges",
    "paymentcomponentbreakoutdetail",
    "extension"
})
public class PAYMENTCOMPONENTBREAKOUT {

    @XmlElement(name = "ADDITIONAL_CHARGES")
    protected ADDITIONALCHARGES additionalcharges;
    @XmlElement(name = "PAYMENT_COMPONENT_BREAKOUT_DETAIL")
    protected PAYMENTCOMPONENTBREAKOUTDETAIL paymentcomponentbreakoutdetail;
    @XmlElement(name = "EXTENSION")
    protected PAYMENTCOMPONENTBREAKOUTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the additionalcharges property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALCHARGES }
     *     
     */
    public ADDITIONALCHARGES getADDITIONALCHARGES() {
        return additionalcharges;
    }

    /**
     * Sets the value of the additionalcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALCHARGES }
     *     
     */
    public void setADDITIONALCHARGES(ADDITIONALCHARGES value) {
        this.additionalcharges = value;
    }

    /**
     * Gets the value of the paymentcomponentbreakoutdetail property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTCOMPONENTBREAKOUTDETAIL }
     *     
     */
    public PAYMENTCOMPONENTBREAKOUTDETAIL getPAYMENTCOMPONENTBREAKOUTDETAIL() {
        return paymentcomponentbreakoutdetail;
    }

    /**
     * Sets the value of the paymentcomponentbreakoutdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTCOMPONENTBREAKOUTDETAIL }
     *     
     */
    public void setPAYMENTCOMPONENTBREAKOUTDETAIL(PAYMENTCOMPONENTBREAKOUTDETAIL value) {
        this.paymentcomponentbreakoutdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTCOMPONENTBREAKOUTEXTENSION }
     *     
     */
    public PAYMENTCOMPONENTBREAKOUTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTCOMPONENTBREAKOUTEXTENSION }
     *     
     */
    public void setEXTENSION(PAYMENTCOMPONENTBREAKOUTEXTENSION value) {
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
