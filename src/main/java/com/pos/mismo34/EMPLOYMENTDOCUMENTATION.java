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
 * <p>Java class for EMPLOYMENT_DOCUMENTATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMPLOYMENT_DOCUMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentationStateType" type="{http://www.mismo.org/residential/2009/schemas}DocumentationStateEnum" minOccurs="0"/>
 *         &lt;element name="DocumentationStateTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EmploymentDocumentType" type="{http://www.mismo.org/residential/2009/schemas}EmploymentDocumentEnum" minOccurs="0"/>
 *         &lt;element name="EmploymentDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EmploymentVerificationRangeCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EmploymentVerificationRangeType" type="{http://www.mismo.org/residential/2009/schemas}EmploymentVerificationRangeEnum" minOccurs="0"/>
 *         &lt;element name="EmploymentVerificationRangeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EMPLOYMENT_DOCUMENTATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "EMPLOYMENT_DOCUMENTATION", propOrder = {
    "documentationStateType",
    "documentationStateTypeOtherDescription",
    "employmentDocumentType",
    "employmentDocumentTypeOtherDescription",
    "employmentVerificationRangeCount",
    "employmentVerificationRangeType",
    "employmentVerificationRangeTypeOtherDescription",
    "extension"
})
public class EMPLOYMENTDOCUMENTATION {

    @XmlElementRef(name = "DocumentationStateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentationStateEnum> documentationStateType;
    @XmlElementRef(name = "DocumentationStateTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> documentationStateTypeOtherDescription;
    @XmlElementRef(name = "EmploymentDocumentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EmploymentDocumentEnum> employmentDocumentType;
    @XmlElementRef(name = "EmploymentDocumentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> employmentDocumentTypeOtherDescription;
    @XmlElementRef(name = "EmploymentVerificationRangeCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> employmentVerificationRangeCount;
    @XmlElementRef(name = "EmploymentVerificationRangeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EmploymentVerificationRangeEnum> employmentVerificationRangeType;
    @XmlElementRef(name = "EmploymentVerificationRangeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> employmentVerificationRangeTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected EMPLOYMENTDOCUMENTATIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the documentationStateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentationStateEnum }{@code >}
     *     
     */
    public JAXBElement<DocumentationStateEnum> getDocumentationStateType() {
        return documentationStateType;
    }

    /**
     * Sets the value of the documentationStateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentationStateEnum }{@code >}
     *     
     */
    public void setDocumentationStateType(JAXBElement<DocumentationStateEnum> value) {
        this.documentationStateType = value;
    }

    /**
     * Gets the value of the documentationStateTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDocumentationStateTypeOtherDescription() {
        return documentationStateTypeOtherDescription;
    }

    /**
     * Sets the value of the documentationStateTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDocumentationStateTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.documentationStateTypeOtherDescription = value;
    }

    /**
     * Gets the value of the employmentDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmploymentDocumentEnum }{@code >}
     *     
     */
    public JAXBElement<EmploymentDocumentEnum> getEmploymentDocumentType() {
        return employmentDocumentType;
    }

    /**
     * Sets the value of the employmentDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmploymentDocumentEnum }{@code >}
     *     
     */
    public void setEmploymentDocumentType(JAXBElement<EmploymentDocumentEnum> value) {
        this.employmentDocumentType = value;
    }

    /**
     * Gets the value of the employmentDocumentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEmploymentDocumentTypeOtherDescription() {
        return employmentDocumentTypeOtherDescription;
    }

    /**
     * Sets the value of the employmentDocumentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEmploymentDocumentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.employmentDocumentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the employmentVerificationRangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEmploymentVerificationRangeCount() {
        return employmentVerificationRangeCount;
    }

    /**
     * Sets the value of the employmentVerificationRangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEmploymentVerificationRangeCount(JAXBElement<MISMOCount> value) {
        this.employmentVerificationRangeCount = value;
    }

    /**
     * Gets the value of the employmentVerificationRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmploymentVerificationRangeEnum }{@code >}
     *     
     */
    public JAXBElement<EmploymentVerificationRangeEnum> getEmploymentVerificationRangeType() {
        return employmentVerificationRangeType;
    }

    /**
     * Sets the value of the employmentVerificationRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmploymentVerificationRangeEnum }{@code >}
     *     
     */
    public void setEmploymentVerificationRangeType(JAXBElement<EmploymentVerificationRangeEnum> value) {
        this.employmentVerificationRangeType = value;
    }

    /**
     * Gets the value of the employmentVerificationRangeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEmploymentVerificationRangeTypeOtherDescription() {
        return employmentVerificationRangeTypeOtherDescription;
    }

    /**
     * Sets the value of the employmentVerificationRangeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEmploymentVerificationRangeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.employmentVerificationRangeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EMPLOYMENTDOCUMENTATIONEXTENSION }
     *     
     */
    public EMPLOYMENTDOCUMENTATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLOYMENTDOCUMENTATIONEXTENSION }
     *     
     */
    public void setEXTENSION(EMPLOYMENTDOCUMENTATIONEXTENSION value) {
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
