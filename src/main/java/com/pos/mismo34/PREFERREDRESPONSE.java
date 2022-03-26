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
 * <p>Java class for PREFERRED_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREFERRED_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MIMETypeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PreferredResponseDestinationDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PreferredResponseFormatType" type="{http://www.mismo.org/residential/2009/schemas}PreferredResponseFormatEnum" minOccurs="0"/>
 *         &lt;element name="PreferredResponseFormatTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PreferredResponseMethodType" type="{http://www.mismo.org/residential/2009/schemas}PreferredResponseMethodEnum" minOccurs="0"/>
 *         &lt;element name="PreferredResponseMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PreferredResponseUseEmbeddedFileIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PreferredResponseVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PREFERRED_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PREFERRED_RESPONSE", propOrder = {
    "mimeTypeIdentifier",
    "preferredResponseDestinationDescription",
    "preferredResponseFormatType",
    "preferredResponseFormatTypeOtherDescription",
    "preferredResponseMethodType",
    "preferredResponseMethodTypeOtherDescription",
    "preferredResponseUseEmbeddedFileIndicator",
    "preferredResponseVersionIdentifier",
    "extension"
})
public class PREFERREDRESPONSE {

    @XmlElementRef(name = "MIMETypeIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mimeTypeIdentifier;
    @XmlElementRef(name = "PreferredResponseDestinationDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> preferredResponseDestinationDescription;
    @XmlElementRef(name = "PreferredResponseFormatType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PreferredResponseFormatEnum> preferredResponseFormatType;
    @XmlElementRef(name = "PreferredResponseFormatTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> preferredResponseFormatTypeOtherDescription;
    @XmlElementRef(name = "PreferredResponseMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PreferredResponseMethodEnum> preferredResponseMethodType;
    @XmlElementRef(name = "PreferredResponseMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> preferredResponseMethodTypeOtherDescription;
    @XmlElementRef(name = "PreferredResponseUseEmbeddedFileIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> preferredResponseUseEmbeddedFileIndicator;
    @XmlElementRef(name = "PreferredResponseVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> preferredResponseVersionIdentifier;
    @XmlElement(name = "EXTENSION")
    protected PREFERREDRESPONSEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mimeTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMIMETypeIdentifier() {
        return mimeTypeIdentifier;
    }

    /**
     * Sets the value of the mimeTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMIMETypeIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mimeTypeIdentifier = value;
    }

    /**
     * Gets the value of the preferredResponseDestinationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPreferredResponseDestinationDescription() {
        return preferredResponseDestinationDescription;
    }

    /**
     * Sets the value of the preferredResponseDestinationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPreferredResponseDestinationDescription(JAXBElement<MISMOString> value) {
        this.preferredResponseDestinationDescription = value;
    }

    /**
     * Gets the value of the preferredResponseFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PreferredResponseFormatEnum }{@code >}
     *     
     */
    public JAXBElement<PreferredResponseFormatEnum> getPreferredResponseFormatType() {
        return preferredResponseFormatType;
    }

    /**
     * Sets the value of the preferredResponseFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PreferredResponseFormatEnum }{@code >}
     *     
     */
    public void setPreferredResponseFormatType(JAXBElement<PreferredResponseFormatEnum> value) {
        this.preferredResponseFormatType = value;
    }

    /**
     * Gets the value of the preferredResponseFormatTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPreferredResponseFormatTypeOtherDescription() {
        return preferredResponseFormatTypeOtherDescription;
    }

    /**
     * Sets the value of the preferredResponseFormatTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPreferredResponseFormatTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.preferredResponseFormatTypeOtherDescription = value;
    }

    /**
     * Gets the value of the preferredResponseMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PreferredResponseMethodEnum }{@code >}
     *     
     */
    public JAXBElement<PreferredResponseMethodEnum> getPreferredResponseMethodType() {
        return preferredResponseMethodType;
    }

    /**
     * Sets the value of the preferredResponseMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PreferredResponseMethodEnum }{@code >}
     *     
     */
    public void setPreferredResponseMethodType(JAXBElement<PreferredResponseMethodEnum> value) {
        this.preferredResponseMethodType = value;
    }

    /**
     * Gets the value of the preferredResponseMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPreferredResponseMethodTypeOtherDescription() {
        return preferredResponseMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the preferredResponseMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPreferredResponseMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.preferredResponseMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the preferredResponseUseEmbeddedFileIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPreferredResponseUseEmbeddedFileIndicator() {
        return preferredResponseUseEmbeddedFileIndicator;
    }

    /**
     * Sets the value of the preferredResponseUseEmbeddedFileIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPreferredResponseUseEmbeddedFileIndicator(JAXBElement<MISMOIndicator> value) {
        this.preferredResponseUseEmbeddedFileIndicator = value;
    }

    /**
     * Gets the value of the preferredResponseVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getPreferredResponseVersionIdentifier() {
        return preferredResponseVersionIdentifier;
    }

    /**
     * Sets the value of the preferredResponseVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setPreferredResponseVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.preferredResponseVersionIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PREFERREDRESPONSEEXTENSION }
     *     
     */
    public PREFERREDRESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFERREDRESPONSEEXTENSION }
     *     
     */
    public void setEXTENSION(PREFERREDRESPONSEEXTENSION value) {
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