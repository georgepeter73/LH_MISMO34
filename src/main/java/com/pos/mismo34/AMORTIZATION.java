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
 * <p>Java class for AMORTIZATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMORTIZATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMORTIZATION_RULE" type="{http://www.mismo.org/residential/2009/schemas}AMORTIZATION_RULE" minOccurs="0"/>
 *         &lt;element name="AMORTIZATION_SCHEDULE_ITEMS" type="{http://www.mismo.org/residential/2009/schemas}AMORTIZATION_SCHEDULE_ITEMS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AMORTIZATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "AMORTIZATION", propOrder = {
    "amortizationrule",
    "amortizationscheduleitems",
    "extension"
})
public class AMORTIZATION {

    @XmlElement(name = "AMORTIZATION_RULE")
    protected AMORTIZATIONRULE amortizationrule;
    @XmlElement(name = "AMORTIZATION_SCHEDULE_ITEMS")
    protected AMORTIZATIONSCHEDULEITEMS amortizationscheduleitems;
    @XmlElement(name = "EXTENSION")
    protected AMORTIZATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the amortizationrule property.
     * 
     * @return
     *     possible object is
     *     {@link AMORTIZATIONRULE }
     *     
     */
    public AMORTIZATIONRULE getAMORTIZATIONRULE() {
        return amortizationrule;
    }

    /**
     * Sets the value of the amortizationrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMORTIZATIONRULE }
     *     
     */
    public void setAMORTIZATIONRULE(AMORTIZATIONRULE value) {
        this.amortizationrule = value;
    }

    /**
     * Gets the value of the amortizationscheduleitems property.
     * 
     * @return
     *     possible object is
     *     {@link AMORTIZATIONSCHEDULEITEMS }
     *     
     */
    public AMORTIZATIONSCHEDULEITEMS getAMORTIZATIONSCHEDULEITEMS() {
        return amortizationscheduleitems;
    }

    /**
     * Sets the value of the amortizationscheduleitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMORTIZATIONSCHEDULEITEMS }
     *     
     */
    public void setAMORTIZATIONSCHEDULEITEMS(AMORTIZATIONSCHEDULEITEMS value) {
        this.amortizationscheduleitems = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AMORTIZATIONEXTENSION }
     *     
     */
    public AMORTIZATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMORTIZATIONEXTENSION }
     *     
     */
    public void setEXTENSION(AMORTIZATIONEXTENSION value) {
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
