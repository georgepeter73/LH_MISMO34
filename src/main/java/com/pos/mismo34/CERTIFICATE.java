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
 * Information regarding the type, purpose, issuer, status and details specific to the legal permissions or restrictions granted for the use or occupancy for the property.
 * 
 * <p>Java class for CERTIFICATE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CERTIFICATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificateApplicationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CertificateAuthorityType" type="{http://www.mismo.org/residential/2009/schemas}CertificateAuthorityEnum" minOccurs="0"/>
 *         &lt;element name="CertificateAuthorityTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CertificateExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CertificateIssuedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CertificateStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CertificateStatusType" type="{http://www.mismo.org/residential/2009/schemas}CertificateStatusEnum" minOccurs="0"/>
 *         &lt;element name="CertificateStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CertificateType" type="{http://www.mismo.org/residential/2009/schemas}CertificateEnum" minOccurs="0"/>
 *         &lt;element name="CertificateTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CERTIFICATE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CERTIFICATE", propOrder = {
    "certificateApplicationDate",
    "certificateAuthorityType",
    "certificateAuthorityTypeOtherDescription",
    "certificateExpirationDate",
    "certificateIssuedDate",
    "certificateStatusDate",
    "certificateStatusType",
    "certificateStatusTypeOtherDescription",
    "certificateType",
    "certificateTypeOtherDescription",
    "extension"
})
public class CERTIFICATE {

    @XmlElementRef(name = "CertificateApplicationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> certificateApplicationDate;
    @XmlElementRef(name = "CertificateAuthorityType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CertificateAuthorityEnum> certificateAuthorityType;
    @XmlElementRef(name = "CertificateAuthorityTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> certificateAuthorityTypeOtherDescription;
    @XmlElementRef(name = "CertificateExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> certificateExpirationDate;
    @XmlElementRef(name = "CertificateIssuedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> certificateIssuedDate;
    @XmlElementRef(name = "CertificateStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> certificateStatusDate;
    @XmlElementRef(name = "CertificateStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CertificateStatusEnum> certificateStatusType;
    @XmlElementRef(name = "CertificateStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> certificateStatusTypeOtherDescription;
    @XmlElementRef(name = "CertificateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CertificateEnum> certificateType;
    @XmlElementRef(name = "CertificateTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> certificateTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CERTIFICATEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the certificateApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCertificateApplicationDate() {
        return certificateApplicationDate;
    }

    /**
     * Sets the value of the certificateApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCertificateApplicationDate(JAXBElement<MISMODate> value) {
        this.certificateApplicationDate = value;
    }

    /**
     * Gets the value of the certificateAuthorityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertificateAuthorityEnum }{@code >}
     *     
     */
    public JAXBElement<CertificateAuthorityEnum> getCertificateAuthorityType() {
        return certificateAuthorityType;
    }

    /**
     * Sets the value of the certificateAuthorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertificateAuthorityEnum }{@code >}
     *     
     */
    public void setCertificateAuthorityType(JAXBElement<CertificateAuthorityEnum> value) {
        this.certificateAuthorityType = value;
    }

    /**
     * Gets the value of the certificateAuthorityTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCertificateAuthorityTypeOtherDescription() {
        return certificateAuthorityTypeOtherDescription;
    }

    /**
     * Sets the value of the certificateAuthorityTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCertificateAuthorityTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.certificateAuthorityTypeOtherDescription = value;
    }

    /**
     * Gets the value of the certificateExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    /**
     * Sets the value of the certificateExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCertificateExpirationDate(JAXBElement<MISMODate> value) {
        this.certificateExpirationDate = value;
    }

    /**
     * Gets the value of the certificateIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCertificateIssuedDate() {
        return certificateIssuedDate;
    }

    /**
     * Sets the value of the certificateIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCertificateIssuedDate(JAXBElement<MISMODate> value) {
        this.certificateIssuedDate = value;
    }

    /**
     * Gets the value of the certificateStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCertificateStatusDate() {
        return certificateStatusDate;
    }

    /**
     * Sets the value of the certificateStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCertificateStatusDate(JAXBElement<MISMODate> value) {
        this.certificateStatusDate = value;
    }

    /**
     * Gets the value of the certificateStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertificateStatusEnum }{@code >}
     *     
     */
    public JAXBElement<CertificateStatusEnum> getCertificateStatusType() {
        return certificateStatusType;
    }

    /**
     * Sets the value of the certificateStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertificateStatusEnum }{@code >}
     *     
     */
    public void setCertificateStatusType(JAXBElement<CertificateStatusEnum> value) {
        this.certificateStatusType = value;
    }

    /**
     * Gets the value of the certificateStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCertificateStatusTypeOtherDescription() {
        return certificateStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the certificateStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCertificateStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.certificateStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the certificateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertificateEnum }{@code >}
     *     
     */
    public JAXBElement<CertificateEnum> getCertificateType() {
        return certificateType;
    }

    /**
     * Sets the value of the certificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertificateEnum }{@code >}
     *     
     */
    public void setCertificateType(JAXBElement<CertificateEnum> value) {
        this.certificateType = value;
    }

    /**
     * Gets the value of the certificateTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCertificateTypeOtherDescription() {
        return certificateTypeOtherDescription;
    }

    /**
     * Sets the value of the certificateTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCertificateTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.certificateTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATEEXTENSION }
     *     
     */
    public CERTIFICATEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATEEXTENSION }
     *     
     */
    public void setEXTENSION(CERTIFICATEEXTENSION value) {
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
