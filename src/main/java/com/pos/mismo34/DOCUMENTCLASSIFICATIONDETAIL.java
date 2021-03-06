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
 * Contains non-repeatable information about a type of document.
 * 
 * <p>Java class for DOCUMENT_CLASSIFICATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENT_CLASSIFICATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptableSigningMethodType" type="{http://www.mismo.org/residential/2009/schemas}AcceptableSigningMethodEnum" minOccurs="0"/>
 *         &lt;element name="DocumentFormIssuingEntityNameType" type="{http://www.mismo.org/residential/2009/schemas}DocumentFormIssuingEntityNameEnum" minOccurs="0"/>
 *         &lt;element name="DocumentFormIssuingEntityNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DocumentFormIssuingEntityNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="DocumentFormIssuingEntityVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="DocumentFormPublisherEntityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DocumentFormPublisherNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="DocumentFormPublisherVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="DocumentName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DocumentNegotiableInstrumentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="DocumentPeriodEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DocumentPeriodStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DocumentRecordationProcessingType" type="{http://www.mismo.org/residential/2009/schemas}DocumentRecordationProcessingEnum" minOccurs="0"/>
 *         &lt;element name="DocumentSignatureRequiredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DOCUMENT_CLASSIFICATION_DETAIL_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENT_CLASSIFICATION_DETAIL", propOrder = {
    "acceptableSigningMethodType",
    "documentFormIssuingEntityNameType",
    "documentFormIssuingEntityNameTypeOtherDescription",
    "documentFormIssuingEntityNumberIdentifier",
    "documentFormIssuingEntityVersionIdentifier",
    "documentFormPublisherEntityName",
    "documentFormPublisherNumberIdentifier",
    "documentFormPublisherVersionIdentifier",
    "documentName",
    "documentNegotiableInstrumentIndicator",
    "documentPeriodEndDate",
    "documentPeriodStartDate",
    "documentRecordationProcessingType",
    "documentSignatureRequiredIndicator",
    "extension"
})
public class DOCUMENTCLASSIFICATIONDETAIL {

    @XmlElementRef(name = "AcceptableSigningMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AcceptableSigningMethodEnum> acceptableSigningMethodType;
    @XmlElementRef(name = "DocumentFormIssuingEntityNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentFormIssuingEntityNameEnum> documentFormIssuingEntityNameType;
    @XmlElementRef(name = "DocumentFormIssuingEntityNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> documentFormIssuingEntityNameTypeOtherDescription;
    @XmlElementRef(name = "DocumentFormIssuingEntityNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> documentFormIssuingEntityNumberIdentifier;
    @XmlElementRef(name = "DocumentFormIssuingEntityVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> documentFormIssuingEntityVersionIdentifier;
    @XmlElementRef(name = "DocumentFormPublisherEntityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> documentFormPublisherEntityName;
    @XmlElementRef(name = "DocumentFormPublisherNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> documentFormPublisherNumberIdentifier;
    @XmlElementRef(name = "DocumentFormPublisherVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> documentFormPublisherVersionIdentifier;
    @XmlElementRef(name = "DocumentName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> documentName;
    @XmlElementRef(name = "DocumentNegotiableInstrumentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> documentNegotiableInstrumentIndicator;
    @XmlElementRef(name = "DocumentPeriodEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> documentPeriodEndDate;
    @XmlElementRef(name = "DocumentPeriodStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> documentPeriodStartDate;
    @XmlElementRef(name = "DocumentRecordationProcessingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentRecordationProcessingEnum> documentRecordationProcessingType;
    @XmlElementRef(name = "DocumentSignatureRequiredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> documentSignatureRequiredIndicator;
    @XmlElement(name = "EXTENSION")
    protected DOCUMENTCLASSIFICATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the acceptableSigningMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcceptableSigningMethodEnum }{@code >}
     *     
     */
    public JAXBElement<AcceptableSigningMethodEnum> getAcceptableSigningMethodType() {
        return acceptableSigningMethodType;
    }

    /**
     * Sets the value of the acceptableSigningMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcceptableSigningMethodEnum }{@code >}
     *     
     */
    public void setAcceptableSigningMethodType(JAXBElement<AcceptableSigningMethodEnum> value) {
        this.acceptableSigningMethodType = value;
    }

    /**
     * Gets the value of the documentFormIssuingEntityNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentFormIssuingEntityNameEnum }{@code >}
     *     
     */
    public JAXBElement<DocumentFormIssuingEntityNameEnum> getDocumentFormIssuingEntityNameType() {
        return documentFormIssuingEntityNameType;
    }

    /**
     * Sets the value of the documentFormIssuingEntityNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentFormIssuingEntityNameEnum }{@code >}
     *     
     */
    public void setDocumentFormIssuingEntityNameType(JAXBElement<DocumentFormIssuingEntityNameEnum> value) {
        this.documentFormIssuingEntityNameType = value;
    }

    /**
     * Gets the value of the documentFormIssuingEntityNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDocumentFormIssuingEntityNameTypeOtherDescription() {
        return documentFormIssuingEntityNameTypeOtherDescription;
    }

    /**
     * Sets the value of the documentFormIssuingEntityNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDocumentFormIssuingEntityNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.documentFormIssuingEntityNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the documentFormIssuingEntityNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getDocumentFormIssuingEntityNumberIdentifier() {
        return documentFormIssuingEntityNumberIdentifier;
    }

    /**
     * Sets the value of the documentFormIssuingEntityNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setDocumentFormIssuingEntityNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.documentFormIssuingEntityNumberIdentifier = value;
    }

    /**
     * Gets the value of the documentFormIssuingEntityVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getDocumentFormIssuingEntityVersionIdentifier() {
        return documentFormIssuingEntityVersionIdentifier;
    }

    /**
     * Sets the value of the documentFormIssuingEntityVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setDocumentFormIssuingEntityVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.documentFormIssuingEntityVersionIdentifier = value;
    }

    /**
     * Gets the value of the documentFormPublisherEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDocumentFormPublisherEntityName() {
        return documentFormPublisherEntityName;
    }

    /**
     * Sets the value of the documentFormPublisherEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDocumentFormPublisherEntityName(JAXBElement<MISMOString> value) {
        this.documentFormPublisherEntityName = value;
    }

    /**
     * Gets the value of the documentFormPublisherNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getDocumentFormPublisherNumberIdentifier() {
        return documentFormPublisherNumberIdentifier;
    }

    /**
     * Sets the value of the documentFormPublisherNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setDocumentFormPublisherNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.documentFormPublisherNumberIdentifier = value;
    }

    /**
     * Gets the value of the documentFormPublisherVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getDocumentFormPublisherVersionIdentifier() {
        return documentFormPublisherVersionIdentifier;
    }

    /**
     * Sets the value of the documentFormPublisherVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setDocumentFormPublisherVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.documentFormPublisherVersionIdentifier = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDocumentName(JAXBElement<MISMOString> value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the documentNegotiableInstrumentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getDocumentNegotiableInstrumentIndicator() {
        return documentNegotiableInstrumentIndicator;
    }

    /**
     * Sets the value of the documentNegotiableInstrumentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setDocumentNegotiableInstrumentIndicator(JAXBElement<MISMOIndicator> value) {
        this.documentNegotiableInstrumentIndicator = value;
    }

    /**
     * Gets the value of the documentPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getDocumentPeriodEndDate() {
        return documentPeriodEndDate;
    }

    /**
     * Sets the value of the documentPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setDocumentPeriodEndDate(JAXBElement<MISMODate> value) {
        this.documentPeriodEndDate = value;
    }

    /**
     * Gets the value of the documentPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getDocumentPeriodStartDate() {
        return documentPeriodStartDate;
    }

    /**
     * Sets the value of the documentPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setDocumentPeriodStartDate(JAXBElement<MISMODate> value) {
        this.documentPeriodStartDate = value;
    }

    /**
     * Gets the value of the documentRecordationProcessingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentRecordationProcessingEnum }{@code >}
     *     
     */
    public JAXBElement<DocumentRecordationProcessingEnum> getDocumentRecordationProcessingType() {
        return documentRecordationProcessingType;
    }

    /**
     * Sets the value of the documentRecordationProcessingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentRecordationProcessingEnum }{@code >}
     *     
     */
    public void setDocumentRecordationProcessingType(JAXBElement<DocumentRecordationProcessingEnum> value) {
        this.documentRecordationProcessingType = value;
    }

    /**
     * Gets the value of the documentSignatureRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getDocumentSignatureRequiredIndicator() {
        return documentSignatureRequiredIndicator;
    }

    /**
     * Sets the value of the documentSignatureRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setDocumentSignatureRequiredIndicator(JAXBElement<MISMOIndicator> value) {
        this.documentSignatureRequiredIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTCLASSIFICATIONDETAILEXTENSION }
     *     
     */
    public DOCUMENTCLASSIFICATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTCLASSIFICATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(DOCUMENTCLASSIFICATIONDETAILEXTENSION value) {
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
