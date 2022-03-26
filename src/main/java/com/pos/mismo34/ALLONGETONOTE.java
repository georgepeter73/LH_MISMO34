//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ALLONGE_TO_NOTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALLONGE_TO_NOTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllongeToNoteDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AllongeToNoteExecutedByDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AllongeToNoteInFavorOfDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AllongeToNotePayToTheOrderOfDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AllongeToNoteWithoutRecourseDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ALLONGE_TO_NOTE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ALLONGE_TO_NOTE", propOrder = {
    "allongeToNoteDate",
    "allongeToNoteExecutedByDescription",
    "allongeToNoteInFavorOfDescription",
    "allongeToNotePayToTheOrderOfDescription",
    "allongeToNoteWithoutRecourseDescription",
    "extension"
})
public class ALLONGETONOTE {

    @XmlElementRef(name = "AllongeToNoteDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> allongeToNoteDate;
    @XmlElementRef(name = "AllongeToNoteExecutedByDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> allongeToNoteExecutedByDescription;
    @XmlElementRef(name = "AllongeToNoteInFavorOfDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> allongeToNoteInFavorOfDescription;
    @XmlElementRef(name = "AllongeToNotePayToTheOrderOfDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> allongeToNotePayToTheOrderOfDescription;
    @XmlElementRef(name = "AllongeToNoteWithoutRecourseDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> allongeToNoteWithoutRecourseDescription;
    @XmlElement(name = "EXTENSION")
    protected ALLONGETONOTEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the allongeToNoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAllongeToNoteDate() {
        return allongeToNoteDate;
    }

    /**
     * Sets the value of the allongeToNoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAllongeToNoteDate(JAXBElement<MISMODate> value) {
        this.allongeToNoteDate = value;
    }

    /**
     * Gets the value of the allongeToNoteExecutedByDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAllongeToNoteExecutedByDescription() {
        return allongeToNoteExecutedByDescription;
    }

    /**
     * Sets the value of the allongeToNoteExecutedByDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAllongeToNoteExecutedByDescription(JAXBElement<MISMOString> value) {
        this.allongeToNoteExecutedByDescription = value;
    }

    /**
     * Gets the value of the allongeToNoteInFavorOfDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAllongeToNoteInFavorOfDescription() {
        return allongeToNoteInFavorOfDescription;
    }

    /**
     * Sets the value of the allongeToNoteInFavorOfDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAllongeToNoteInFavorOfDescription(JAXBElement<MISMOString> value) {
        this.allongeToNoteInFavorOfDescription = value;
    }

    /**
     * Gets the value of the allongeToNotePayToTheOrderOfDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAllongeToNotePayToTheOrderOfDescription() {
        return allongeToNotePayToTheOrderOfDescription;
    }

    /**
     * Sets the value of the allongeToNotePayToTheOrderOfDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAllongeToNotePayToTheOrderOfDescription(JAXBElement<MISMOString> value) {
        this.allongeToNotePayToTheOrderOfDescription = value;
    }

    /**
     * Gets the value of the allongeToNoteWithoutRecourseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAllongeToNoteWithoutRecourseDescription() {
        return allongeToNoteWithoutRecourseDescription;
    }

    /**
     * Sets the value of the allongeToNoteWithoutRecourseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAllongeToNoteWithoutRecourseDescription(JAXBElement<MISMOString> value) {
        this.allongeToNoteWithoutRecourseDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ALLONGETONOTEEXTENSION }
     *     
     */
    public ALLONGETONOTEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALLONGETONOTEEXTENSION }
     *     
     */
    public void setEXTENSION(ALLONGETONOTEEXTENSION value) {
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
