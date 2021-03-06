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
 * Information regarding the details of the rooms, a summary of rooms and other facts about the interior of the structure for a property.
 * 
 * <p>Java class for INTERIOR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTERIOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATTIC" type="{http://www.mismo.org/residential/2009/schemas}ATTIC" minOccurs="0"/>
 *         &lt;element name="BASEMENT" type="{http://www.mismo.org/residential/2009/schemas}BASEMENT" minOccurs="0"/>
 *         &lt;element name="INTERIOR_ROOM_SUMMARIES" type="{http://www.mismo.org/residential/2009/schemas}INTERIOR_ROOM_SUMMARIES" minOccurs="0"/>
 *         &lt;element name="ROOMS" type="{http://www.mismo.org/residential/2009/schemas}ROOMS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INTERIOR_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INTERIOR", propOrder = {
    "attic",
    "basement",
    "interiorroomsummaries",
    "rooms",
    "extension"
})
public class INTERIOR {

    @XmlElement(name = "ATTIC")
    protected ATTIC attic;
    @XmlElement(name = "BASEMENT")
    protected BASEMENT basement;
    @XmlElement(name = "INTERIOR_ROOM_SUMMARIES")
    protected INTERIORROOMSUMMARIES interiorroomsummaries;
    @XmlElement(name = "ROOMS")
    protected ROOMS rooms;
    @XmlElement(name = "EXTENSION")
    protected INTERIOREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the attic property.
     * 
     * @return
     *     possible object is
     *     {@link ATTIC }
     *     
     */
    public ATTIC getATTIC() {
        return attic;
    }

    /**
     * Sets the value of the attic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATTIC }
     *     
     */
    public void setATTIC(ATTIC value) {
        this.attic = value;
    }

    /**
     * Gets the value of the basement property.
     * 
     * @return
     *     possible object is
     *     {@link BASEMENT }
     *     
     */
    public BASEMENT getBASEMENT() {
        return basement;
    }

    /**
     * Sets the value of the basement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BASEMENT }
     *     
     */
    public void setBASEMENT(BASEMENT value) {
        this.basement = value;
    }

    /**
     * Gets the value of the interiorroomsummaries property.
     * 
     * @return
     *     possible object is
     *     {@link INTERIORROOMSUMMARIES }
     *     
     */
    public INTERIORROOMSUMMARIES getINTERIORROOMSUMMARIES() {
        return interiorroomsummaries;
    }

    /**
     * Sets the value of the interiorroomsummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERIORROOMSUMMARIES }
     *     
     */
    public void setINTERIORROOMSUMMARIES(INTERIORROOMSUMMARIES value) {
        this.interiorroomsummaries = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMS }
     *     
     */
    public ROOMS getROOMS() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMS }
     *     
     */
    public void setROOMS(ROOMS value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INTERIOREXTENSION }
     *     
     */
    public INTERIOREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERIOREXTENSION }
     *     
     */
    public void setEXTENSION(INTERIOREXTENSION value) {
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
