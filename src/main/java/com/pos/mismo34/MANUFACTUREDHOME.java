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
 * Information regarding the type, identification, section breakout and other facts about the manufactured home. A manufactured home is a type of factory-built or prefabricated housing.
 * 
 * <p>Java class for MANUFACTURED_HOME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MANUFACTURED_HOME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MANUFACTURED_HOME_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}MANUFACTURED_HOME_DETAIL" minOccurs="0"/>
 *         &lt;element name="MANUFACTURED_HOME_IDENTIFICATION" type="{http://www.mismo.org/residential/2009/schemas}MANUFACTURED_HOME_IDENTIFICATION" minOccurs="0"/>
 *         &lt;element name="MANUFACTURED_HOME_SECTIONS" type="{http://www.mismo.org/residential/2009/schemas}MANUFACTURED_HOME_SECTIONS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MANUFACTURED_HOME_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MANUFACTURED_HOME", propOrder = {
    "manufacturedhomedetail",
    "manufacturedhomeidentification",
    "manufacturedhomesections",
    "extension"
})
public class MANUFACTUREDHOME {

    @XmlElement(name = "MANUFACTURED_HOME_DETAIL")
    protected MANUFACTUREDHOMEDETAIL manufacturedhomedetail;
    @XmlElement(name = "MANUFACTURED_HOME_IDENTIFICATION")
    protected MANUFACTUREDHOMEIDENTIFICATION manufacturedhomeidentification;
    @XmlElement(name = "MANUFACTURED_HOME_SECTIONS")
    protected MANUFACTUREDHOMESECTIONS manufacturedhomesections;
    @XmlElement(name = "EXTENSION")
    protected MANUFACTUREDHOMEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the manufacturedhomedetail property.
     * 
     * @return
     *     possible object is
     *     {@link MANUFACTUREDHOMEDETAIL }
     *     
     */
    public MANUFACTUREDHOMEDETAIL getMANUFACTUREDHOMEDETAIL() {
        return manufacturedhomedetail;
    }

    /**
     * Sets the value of the manufacturedhomedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANUFACTUREDHOMEDETAIL }
     *     
     */
    public void setMANUFACTUREDHOMEDETAIL(MANUFACTUREDHOMEDETAIL value) {
        this.manufacturedhomedetail = value;
    }

    /**
     * Gets the value of the manufacturedhomeidentification property.
     * 
     * @return
     *     possible object is
     *     {@link MANUFACTUREDHOMEIDENTIFICATION }
     *     
     */
    public MANUFACTUREDHOMEIDENTIFICATION getMANUFACTUREDHOMEIDENTIFICATION() {
        return manufacturedhomeidentification;
    }

    /**
     * Sets the value of the manufacturedhomeidentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANUFACTUREDHOMEIDENTIFICATION }
     *     
     */
    public void setMANUFACTUREDHOMEIDENTIFICATION(MANUFACTUREDHOMEIDENTIFICATION value) {
        this.manufacturedhomeidentification = value;
    }

    /**
     * Gets the value of the manufacturedhomesections property.
     * 
     * @return
     *     possible object is
     *     {@link MANUFACTUREDHOMESECTIONS }
     *     
     */
    public MANUFACTUREDHOMESECTIONS getMANUFACTUREDHOMESECTIONS() {
        return manufacturedhomesections;
    }

    /**
     * Sets the value of the manufacturedhomesections property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANUFACTUREDHOMESECTIONS }
     *     
     */
    public void setMANUFACTUREDHOMESECTIONS(MANUFACTUREDHOMESECTIONS value) {
        this.manufacturedhomesections = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MANUFACTUREDHOMEEXTENSION }
     *     
     */
    public MANUFACTUREDHOMEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MANUFACTUREDHOMEEXTENSION }
     *     
     */
    public void setEXTENSION(MANUFACTUREDHOMEEXTENSION value) {
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
