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
 * Information specific to tax bills on the property or properties that secure the loan.
 * 
 * <p>Java class for PROPERTY_TAX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY_TAX">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROPERTY_TAX_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_TAX_DETAIL" minOccurs="0"/>
 *         &lt;element name="PROPERTY_TAX_EXEMPTIONS" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_TAX_EXEMPTIONS" minOccurs="0"/>
 *         &lt;element name="PROPERTY_TAX_SPECIALS" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_TAX_SPECIALS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_TAX_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROPERTY_TAX", propOrder = {
    "propertytaxdetail",
    "propertytaxexemptions",
    "propertytaxspecials",
    "extension"
})
public class PROPERTYTAX {

    @XmlElement(name = "PROPERTY_TAX_DETAIL")
    protected PROPERTYTAXDETAIL propertytaxdetail;
    @XmlElement(name = "PROPERTY_TAX_EXEMPTIONS")
    protected PROPERTYTAXEXEMPTIONS propertytaxexemptions;
    @XmlElement(name = "PROPERTY_TAX_SPECIALS")
    protected PROPERTYTAXSPECIALS propertytaxspecials;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYTAXEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the propertytaxdetail property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYTAXDETAIL }
     *     
     */
    public PROPERTYTAXDETAIL getPROPERTYTAXDETAIL() {
        return propertytaxdetail;
    }

    /**
     * Sets the value of the propertytaxdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYTAXDETAIL }
     *     
     */
    public void setPROPERTYTAXDETAIL(PROPERTYTAXDETAIL value) {
        this.propertytaxdetail = value;
    }

    /**
     * Gets the value of the propertytaxexemptions property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYTAXEXEMPTIONS }
     *     
     */
    public PROPERTYTAXEXEMPTIONS getPROPERTYTAXEXEMPTIONS() {
        return propertytaxexemptions;
    }

    /**
     * Sets the value of the propertytaxexemptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYTAXEXEMPTIONS }
     *     
     */
    public void setPROPERTYTAXEXEMPTIONS(PROPERTYTAXEXEMPTIONS value) {
        this.propertytaxexemptions = value;
    }

    /**
     * Gets the value of the propertytaxspecials property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYTAXSPECIALS }
     *     
     */
    public PROPERTYTAXSPECIALS getPROPERTYTAXSPECIALS() {
        return propertytaxspecials;
    }

    /**
     * Sets the value of the propertytaxspecials property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYTAXSPECIALS }
     *     
     */
    public void setPROPERTYTAXSPECIALS(PROPERTYTAXSPECIALS value) {
        this.propertytaxspecials = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYTAXEXTENSION }
     *     
     */
    public PROPERTYTAXEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYTAXEXTENSION }
     *     
     */
    public void setEXTENSION(PROPERTYTAXEXTENSION value) {
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
