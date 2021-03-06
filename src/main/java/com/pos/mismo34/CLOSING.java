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
 * Information specific to a closing service to be executed.
 * 
 * <p>Java class for CLOSING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLOSING_LOCATIONS" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_LOCATIONS" minOccurs="0"/>
 *         &lt;element name="CLOSING_REQUEST" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_REQUEST" minOccurs="0"/>
 *         &lt;element name="CLOSING_RESPONSE" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_RESPONSE" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CLOSING", propOrder = {
    "closinglocations",
    "closingrequest",
    "closingresponse",
    "extension"
})
public class CLOSING {

    @XmlElement(name = "CLOSING_LOCATIONS")
    protected CLOSINGLOCATIONS closinglocations;
    @XmlElement(name = "CLOSING_REQUEST")
    protected CLOSINGREQUEST closingrequest;
    @XmlElement(name = "CLOSING_RESPONSE")
    protected CLOSINGRESPONSE closingresponse;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the closinglocations property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGLOCATIONS }
     *     
     */
    public CLOSINGLOCATIONS getCLOSINGLOCATIONS() {
        return closinglocations;
    }

    /**
     * Sets the value of the closinglocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGLOCATIONS }
     *     
     */
    public void setCLOSINGLOCATIONS(CLOSINGLOCATIONS value) {
        this.closinglocations = value;
    }

    /**
     * Gets the value of the closingrequest property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGREQUEST }
     *     
     */
    public CLOSINGREQUEST getCLOSINGREQUEST() {
        return closingrequest;
    }

    /**
     * Sets the value of the closingrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGREQUEST }
     *     
     */
    public void setCLOSINGREQUEST(CLOSINGREQUEST value) {
        this.closingrequest = value;
    }

    /**
     * Gets the value of the closingresponse property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGRESPONSE }
     *     
     */
    public CLOSINGRESPONSE getCLOSINGRESPONSE() {
        return closingresponse;
    }

    /**
     * Sets the value of the closingresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGRESPONSE }
     *     
     */
    public void setCLOSINGRESPONSE(CLOSINGRESPONSE value) {
        this.closingresponse = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGEXTENSION }
     *     
     */
    public CLOSINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGEXTENSION value) {
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
