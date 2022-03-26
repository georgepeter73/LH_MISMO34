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
 * A field used to hold a system signature inside of the VIEW in its own internal format. The purpose is to allow a document provider to create a placeholder for the closing platform to sign. One example would be a PDF certification signature.
 * 
 * <p>Java class for FOREIGN_SYSTEM_SIGNATURE_FIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOREIGN_SYSTEM_SIGNATURE_FIELD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FOREIGN_SYSTEM_SIGNATURE_FIELD_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}FOREIGN_SYSTEM_SIGNATURE_FIELD_DETAIL" minOccurs="0"/>
 *         &lt;element name="SIGNATURE_FIELD_REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FOREIGN_SYSTEM_SIGNATURE_FIELD_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FOREIGN_SYSTEM_SIGNATURE_FIELD", propOrder = {
    "foreignsystemsignaturefielddetail",
    "signaturefieldreference",
    "extension"
})
public class FOREIGNSYSTEMSIGNATUREFIELD {

    @XmlElement(name = "FOREIGN_SYSTEM_SIGNATURE_FIELD_DETAIL")
    protected FOREIGNSYSTEMSIGNATUREFIELDDETAIL foreignsystemsignaturefielddetail;
    @XmlElement(name = "SIGNATURE_FIELD_REFERENCE")
    protected FIELDREFERENCE signaturefieldreference;
    @XmlElement(name = "EXTENSION")
    protected FOREIGNSYSTEMSIGNATUREFIELDEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the foreignsystemsignaturefielddetail property.
     * 
     * @return
     *     possible object is
     *     {@link FOREIGNSYSTEMSIGNATUREFIELDDETAIL }
     *     
     */
    public FOREIGNSYSTEMSIGNATUREFIELDDETAIL getFOREIGNSYSTEMSIGNATUREFIELDDETAIL() {
        return foreignsystemsignaturefielddetail;
    }

    /**
     * Sets the value of the foreignsystemsignaturefielddetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOREIGNSYSTEMSIGNATUREFIELDDETAIL }
     *     
     */
    public void setFOREIGNSYSTEMSIGNATUREFIELDDETAIL(FOREIGNSYSTEMSIGNATUREFIELDDETAIL value) {
        this.foreignsystemsignaturefielddetail = value;
    }

    /**
     * Gets the value of the signaturefieldreference property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public FIELDREFERENCE getSIGNATUREFIELDREFERENCE() {
        return signaturefieldreference;
    }

    /**
     * Sets the value of the signaturefieldreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public void setSIGNATUREFIELDREFERENCE(FIELDREFERENCE value) {
        this.signaturefieldreference = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FOREIGNSYSTEMSIGNATUREFIELDEXTENSION }
     *     
     */
    public FOREIGNSYSTEMSIGNATUREFIELDEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOREIGNSYSTEMSIGNATUREFIELDEXTENSION }
     *     
     */
    public void setEXTENSION(FOREIGNSYSTEMSIGNATUREFIELDEXTENSION value) {
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
