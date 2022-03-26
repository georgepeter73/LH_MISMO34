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
 * The INTERACTIVE_FIELD element points to and describes an area of the view to be filled out with formatted textual data by an end user, usually a signer of the document and usually at signing time.
 * 
 * <p>Java class for INTERACTIVE_FIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTERACTIVE_FIELD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTERACTIVE_FIELD_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}INTERACTIVE_FIELD_DETAIL" minOccurs="0"/>
 *         &lt;element name="INTERACTIVE_FIELD_REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INTERACTIVE_FIELD_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INTERACTIVE_FIELD", propOrder = {
    "interactivefielddetail",
    "interactivefieldreference",
    "extension"
})
public class INTERACTIVEFIELD {

    @XmlElement(name = "INTERACTIVE_FIELD_DETAIL")
    protected INTERACTIVEFIELDDETAIL interactivefielddetail;
    @XmlElement(name = "INTERACTIVE_FIELD_REFERENCE")
    protected FIELDREFERENCE interactivefieldreference;
    @XmlElement(name = "EXTENSION")
    protected INTERACTIVEFIELDEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the interactivefielddetail property.
     * 
     * @return
     *     possible object is
     *     {@link INTERACTIVEFIELDDETAIL }
     *     
     */
    public INTERACTIVEFIELDDETAIL getINTERACTIVEFIELDDETAIL() {
        return interactivefielddetail;
    }

    /**
     * Sets the value of the interactivefielddetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERACTIVEFIELDDETAIL }
     *     
     */
    public void setINTERACTIVEFIELDDETAIL(INTERACTIVEFIELDDETAIL value) {
        this.interactivefielddetail = value;
    }

    /**
     * Gets the value of the interactivefieldreference property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public FIELDREFERENCE getINTERACTIVEFIELDREFERENCE() {
        return interactivefieldreference;
    }

    /**
     * Sets the value of the interactivefieldreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public void setINTERACTIVEFIELDREFERENCE(FIELDREFERENCE value) {
        this.interactivefieldreference = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INTERACTIVEFIELDEXTENSION }
     *     
     */
    public INTERACTIVEFIELDEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERACTIVEFIELDEXTENSION }
     *     
     */
    public void setEXTENSION(INTERACTIVEFIELDEXTENSION value) {
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
