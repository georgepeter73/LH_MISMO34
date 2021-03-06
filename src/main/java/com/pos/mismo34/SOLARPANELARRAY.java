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
 * Contains information about each solar panel array.
 * 
 * <p>Java class for SOLAR_PANEL_ARRAY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOLAR_PANEL_ARRAY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVERTERS" type="{http://www.mismo.org/residential/2009/schemas}INVERTERS" minOccurs="0"/>
 *         &lt;element name="SOLAR_PANEL_ARRAY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}SOLAR_PANEL_ARRAY_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SOLAR_PANEL_ARRAY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SOLAR_PANEL_ARRAY", propOrder = {
    "inverters",
    "solarpanelarraydetail",
    "extension"
})
public class SOLARPANELARRAY {

    @XmlElement(name = "INVERTERS")
    protected INVERTERS inverters;
    @XmlElement(name = "SOLAR_PANEL_ARRAY_DETAIL")
    protected SOLARPANELARRAYDETAIL solarpanelarraydetail;
    @XmlElement(name = "EXTENSION")
    protected SOLARPANELARRAYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the inverters property.
     * 
     * @return
     *     possible object is
     *     {@link INVERTERS }
     *     
     */
    public INVERTERS getINVERTERS() {
        return inverters;
    }

    /**
     * Sets the value of the inverters property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVERTERS }
     *     
     */
    public void setINVERTERS(INVERTERS value) {
        this.inverters = value;
    }

    /**
     * Gets the value of the solarpanelarraydetail property.
     * 
     * @return
     *     possible object is
     *     {@link SOLARPANELARRAYDETAIL }
     *     
     */
    public SOLARPANELARRAYDETAIL getSOLARPANELARRAYDETAIL() {
        return solarpanelarraydetail;
    }

    /**
     * Sets the value of the solarpanelarraydetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOLARPANELARRAYDETAIL }
     *     
     */
    public void setSOLARPANELARRAYDETAIL(SOLARPANELARRAYDETAIL value) {
        this.solarpanelarraydetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SOLARPANELARRAYEXTENSION }
     *     
     */
    public SOLARPANELARRAYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOLARPANELARRAYEXTENSION }
     *     
     */
    public void setEXTENSION(SOLARPANELARRAYEXTENSION value) {
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
