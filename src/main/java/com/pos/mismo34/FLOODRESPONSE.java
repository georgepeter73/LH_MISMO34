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
 * <p>Java class for FLOOD_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLOOD_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLOOD_DETERMINATION" type="{http://www.mismo.org/residential/2009/schemas}FLOOD_DETERMINATION" minOccurs="0"/>
 *         &lt;element name="FLOOD_RESPONSE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}FLOOD_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="LOANS" type="{http://www.mismo.org/residential/2009/schemas}LOANS" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="PROPERTY" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FLOOD_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FLOOD_RESPONSE", propOrder = {
    "flooddetermination",
    "floodresponsedetail",
    "loans",
    "parties",
    "property",
    "extension"
})
public class FLOODRESPONSE {

    @XmlElement(name = "FLOOD_DETERMINATION")
    protected FLOODDETERMINATION flooddetermination;
    @XmlElement(name = "FLOOD_RESPONSE_DETAIL")
    protected FLOODRESPONSEDETAIL floodresponsedetail;
    @XmlElement(name = "LOANS")
    protected LOANS loans;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "PROPERTY")
    protected PROPERTY property;
    @XmlElement(name = "EXTENSION")
    protected FLOODRESPONSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the flooddetermination property.
     * 
     * @return
     *     possible object is
     *     {@link FLOODDETERMINATION }
     *     
     */
    public FLOODDETERMINATION getFLOODDETERMINATION() {
        return flooddetermination;
    }

    /**
     * Sets the value of the flooddetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOODDETERMINATION }
     *     
     */
    public void setFLOODDETERMINATION(FLOODDETERMINATION value) {
        this.flooddetermination = value;
    }

    /**
     * Gets the value of the floodresponsedetail property.
     * 
     * @return
     *     possible object is
     *     {@link FLOODRESPONSEDETAIL }
     *     
     */
    public FLOODRESPONSEDETAIL getFLOODRESPONSEDETAIL() {
        return floodresponsedetail;
    }

    /**
     * Sets the value of the floodresponsedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOODRESPONSEDETAIL }
     *     
     */
    public void setFLOODRESPONSEDETAIL(FLOODRESPONSEDETAIL value) {
        this.floodresponsedetail = value;
    }

    /**
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link LOANS }
     *     
     */
    public LOANS getLOANS() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANS }
     *     
     */
    public void setLOANS(LOANS value) {
        this.loans = value;
    }

    /**
     * Gets the value of the parties property.
     * 
     * @return
     *     possible object is
     *     {@link PARTIES }
     *     
     */
    public PARTIES getPARTIES() {
        return parties;
    }

    /**
     * Sets the value of the parties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTIES }
     *     
     */
    public void setPARTIES(PARTIES value) {
        this.parties = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTY }
     *     
     */
    public PROPERTY getPROPERTY() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTY }
     *     
     */
    public void setPROPERTY(PROPERTY value) {
        this.property = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FLOODRESPONSEEXTENSION }
     *     
     */
    public FLOODRESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOODRESPONSEEXTENSION }
     *     
     */
    public void setEXTENSION(FLOODRESPONSEEXTENSION value) {
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
