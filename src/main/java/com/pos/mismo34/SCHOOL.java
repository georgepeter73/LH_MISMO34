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
 * <p>Java class for SCHOOL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHOOL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SchoolDistrictName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SchoolDistrictURL" type="{http://www.mismo.org/residential/2009/schemas}MISMOURL" minOccurs="0"/>
 *         &lt;element name="SchoolMaximumGradeType" type="{http://www.mismo.org/residential/2009/schemas}SchoolMaximumGradeEnum" minOccurs="0"/>
 *         &lt;element name="SchoolMinimumGradeType" type="{http://www.mismo.org/residential/2009/schemas}SchoolMinimumGradeEnum" minOccurs="0"/>
 *         &lt;element name="SchoolName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SchoolType" type="{http://www.mismo.org/residential/2009/schemas}SchoolEnum" minOccurs="0"/>
 *         &lt;element name="SchoolTypeGradeCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="SchoolTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SchoolURL" type="{http://www.mismo.org/residential/2009/schemas}MISMOURL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SCHOOL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SCHOOL", propOrder = {
    "schoolDescription",
    "schoolDistrictName",
    "schoolDistrictURL",
    "schoolMaximumGradeType",
    "schoolMinimumGradeType",
    "schoolName",
    "schoolType",
    "schoolTypeGradeCount",
    "schoolTypeOtherDescription",
    "schoolURL",
    "extension"
})
public class SCHOOL {

    @XmlElementRef(name = "SchoolDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> schoolDescription;
    @XmlElementRef(name = "SchoolDistrictName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> schoolDistrictName;
    @XmlElementRef(name = "SchoolDistrictURL", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOURL> schoolDistrictURL;
    @XmlElementRef(name = "SchoolMaximumGradeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SchoolMaximumGradeEnum> schoolMaximumGradeType;
    @XmlElementRef(name = "SchoolMinimumGradeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SchoolMinimumGradeEnum> schoolMinimumGradeType;
    @XmlElementRef(name = "SchoolName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> schoolName;
    @XmlElementRef(name = "SchoolType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SchoolEnum> schoolType;
    @XmlElementRef(name = "SchoolTypeGradeCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> schoolTypeGradeCount;
    @XmlElementRef(name = "SchoolTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> schoolTypeOtherDescription;
    @XmlElementRef(name = "SchoolURL", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOURL> schoolURL;
    @XmlElement(name = "EXTENSION")
    protected SCHOOLEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the schoolDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSchoolDescription() {
        return schoolDescription;
    }

    /**
     * Sets the value of the schoolDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSchoolDescription(JAXBElement<MISMOString> value) {
        this.schoolDescription = value;
    }

    /**
     * Gets the value of the schoolDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSchoolDistrictName() {
        return schoolDistrictName;
    }

    /**
     * Sets the value of the schoolDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSchoolDistrictName(JAXBElement<MISMOString> value) {
        this.schoolDistrictName = value;
    }

    /**
     * Gets the value of the schoolDistrictURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public JAXBElement<MISMOURL> getSchoolDistrictURL() {
        return schoolDistrictURL;
    }

    /**
     * Sets the value of the schoolDistrictURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public void setSchoolDistrictURL(JAXBElement<MISMOURL> value) {
        this.schoolDistrictURL = value;
    }

    /**
     * Gets the value of the schoolMaximumGradeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchoolMaximumGradeEnum }{@code >}
     *     
     */
    public JAXBElement<SchoolMaximumGradeEnum> getSchoolMaximumGradeType() {
        return schoolMaximumGradeType;
    }

    /**
     * Sets the value of the schoolMaximumGradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchoolMaximumGradeEnum }{@code >}
     *     
     */
    public void setSchoolMaximumGradeType(JAXBElement<SchoolMaximumGradeEnum> value) {
        this.schoolMaximumGradeType = value;
    }

    /**
     * Gets the value of the schoolMinimumGradeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchoolMinimumGradeEnum }{@code >}
     *     
     */
    public JAXBElement<SchoolMinimumGradeEnum> getSchoolMinimumGradeType() {
        return schoolMinimumGradeType;
    }

    /**
     * Sets the value of the schoolMinimumGradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchoolMinimumGradeEnum }{@code >}
     *     
     */
    public void setSchoolMinimumGradeType(JAXBElement<SchoolMinimumGradeEnum> value) {
        this.schoolMinimumGradeType = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSchoolName(JAXBElement<MISMOString> value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the schoolType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchoolEnum }{@code >}
     *     
     */
    public JAXBElement<SchoolEnum> getSchoolType() {
        return schoolType;
    }

    /**
     * Sets the value of the schoolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchoolEnum }{@code >}
     *     
     */
    public void setSchoolType(JAXBElement<SchoolEnum> value) {
        this.schoolType = value;
    }

    /**
     * Gets the value of the schoolTypeGradeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getSchoolTypeGradeCount() {
        return schoolTypeGradeCount;
    }

    /**
     * Sets the value of the schoolTypeGradeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setSchoolTypeGradeCount(JAXBElement<MISMOCount> value) {
        this.schoolTypeGradeCount = value;
    }

    /**
     * Gets the value of the schoolTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSchoolTypeOtherDescription() {
        return schoolTypeOtherDescription;
    }

    /**
     * Sets the value of the schoolTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSchoolTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.schoolTypeOtherDescription = value;
    }

    /**
     * Gets the value of the schoolURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public JAXBElement<MISMOURL> getSchoolURL() {
        return schoolURL;
    }

    /**
     * Sets the value of the schoolURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOURL }{@code >}
     *     
     */
    public void setSchoolURL(JAXBElement<MISMOURL> value) {
        this.schoolURL = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SCHOOLEXTENSION }
     *     
     */
    public SCHOOLEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHOOLEXTENSION }
     *     
     */
    public void setEXTENSION(SCHOOLEXTENSION value) {
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
