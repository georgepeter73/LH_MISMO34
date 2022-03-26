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
 * Information regarding the type of encumbrance. An encumbrance is any impediment to a clear title of ownership, such as a lien, lease, or a right of access that supersedes ownership such as an easement.
 * 
 * <p>Java class for ENCUMBRANCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENCUMBRANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEED_RESTRICTIONS" type="{http://www.mismo.org/residential/2009/schemas}DEED_RESTRICTIONS" minOccurs="0"/>
 *         &lt;element name="ENCUMBRANCE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}ENCUMBRANCE_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ENCUMBRANCE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "ENCUMBRANCE", propOrder = {
    "deedrestrictions",
    "encumbrancedetail",
    "extension"
})
public class ENCUMBRANCE {

    @XmlElement(name = "DEED_RESTRICTIONS")
    protected DEEDRESTRICTIONS deedrestrictions;
    @XmlElement(name = "ENCUMBRANCE_DETAIL")
    protected ENCUMBRANCEDETAIL encumbrancedetail;
    @XmlElement(name = "EXTENSION")
    protected ENCUMBRANCEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the deedrestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link DEEDRESTRICTIONS }
     *     
     */
    public DEEDRESTRICTIONS getDEEDRESTRICTIONS() {
        return deedrestrictions;
    }

    /**
     * Sets the value of the deedrestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEEDRESTRICTIONS }
     *     
     */
    public void setDEEDRESTRICTIONS(DEEDRESTRICTIONS value) {
        this.deedrestrictions = value;
    }

    /**
     * Gets the value of the encumbrancedetail property.
     * 
     * @return
     *     possible object is
     *     {@link ENCUMBRANCEDETAIL }
     *     
     */
    public ENCUMBRANCEDETAIL getENCUMBRANCEDETAIL() {
        return encumbrancedetail;
    }

    /**
     * Sets the value of the encumbrancedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENCUMBRANCEDETAIL }
     *     
     */
    public void setENCUMBRANCEDETAIL(ENCUMBRANCEDETAIL value) {
        this.encumbrancedetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ENCUMBRANCEEXTENSION }
     *     
     */
    public ENCUMBRANCEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENCUMBRANCEEXTENSION }
     *     
     */
    public void setEXTENSION(ENCUMBRANCEEXTENSION value) {
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