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
 * A piece of documentation about borrower Asset, Income or employment.
 * 
 * <p>Java class for DOCUMENTATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetDocumentationLevelIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AssetDocumentType" type="{http://www.mismo.org/residential/2009/schemas}AssetDocumentEnum" minOccurs="0"/>
 *         &lt;element name="AssetDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AssetVerificationRangeCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AssetVerificationRangeType" type="{http://www.mismo.org/residential/2009/schemas}AssetVerificationRangeEnum" minOccurs="0"/>
 *         &lt;element name="AssetVerificationRangeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DocumentationStateType" type="{http://www.mismo.org/residential/2009/schemas}DocumentationStateEnum" minOccurs="0"/>
 *         &lt;element name="DocumentationStateTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EmploymentDocumentationLevelIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EmploymentDocumentType" type="{http://www.mismo.org/residential/2009/schemas}EmploymentDocumentEnum" minOccurs="0"/>
 *         &lt;element name="EmploymentDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EmploymentVerificationRangeCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EmploymentVerificationRangeType" type="{http://www.mismo.org/residential/2009/schemas}EmploymentVerificationRangeEnum" minOccurs="0"/>
 *         &lt;element name="EmploymentVerificationRangeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IncomeDocumentationLevelIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="IncomeDocumentType" type="{http://www.mismo.org/residential/2009/schemas}IncomeDocumentEnum" minOccurs="0"/>
 *         &lt;element name="IncomeDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IncomeVerificationRangeCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="IncomeVerificationRangeType" type="{http://www.mismo.org/residential/2009/schemas}IncomeVerificationRangeEnum" minOccurs="0"/>
 *         &lt;element name="IncomeVerificationRangeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DOCUMENTATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DOCUMENTATION", propOrder = {
    "assetDocumentationLevelIdentifier",
    "assetDocumentType",
    "assetDocumentTypeOtherDescription",
    "assetVerificationRangeCount",
    "assetVerificationRangeType",
    "assetVerificationRangeTypeOtherDescription",
    "documentationStateType",
    "documentationStateTypeOtherDescription",
    "employmentDocumentationLevelIdentifier",
    "employmentDocumentType",
    "employmentDocumentTypeOtherDescription",
    "employmentVerificationRangeCount",
    "employmentVerificationRangeType",
    "employmentVerificationRangeTypeOtherDescription",
    "incomeDocumentationLevelIdentifier",
    "incomeDocumentType",
    "incomeDocumentTypeOtherDescription",
    "incomeVerificationRangeCount",
    "incomeVerificationRangeType",
    "incomeVerificationRangeTypeOtherDescription",
    "extension"
})
public class DOCUMENTATION {

    @XmlElementRef(name = "AssetDocumentationLevelIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> assetDocumentationLevelIdentifier;
    @XmlElementRef(name = "AssetDocumentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetDocumentEnum> assetDocumentType;
    @XmlElementRef(name = "AssetDocumentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> assetDocumentTypeOtherDescription;
    @XmlElementRef(name = "AssetVerificationRangeCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> assetVerificationRangeCount;
    @XmlElementRef(name = "AssetVerificationRangeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetVerificationRangeEnum> assetVerificationRangeType;
    @XmlElementRef(name = "AssetVerificationRangeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> assetVerificationRangeTypeOtherDescription;
    @XmlElementRef(name = "DocumentationStateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentationStateEnum> documentationStateType;
    @XmlElementRef(name = "DocumentationStateTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> documentationStateTypeOtherDescription;
    @XmlElementRef(name = "EmploymentDocumentationLevelIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> employmentDocumentationLevelIdentifier;
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
    @XmlElementRef(name = "IncomeDocumentationLevelIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> incomeDocumentationLevelIdentifier;
    @XmlElementRef(name = "IncomeDocumentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IncomeDocumentEnum> incomeDocumentType;
    @XmlElementRef(name = "IncomeDocumentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> incomeDocumentTypeOtherDescription;
    @XmlElementRef(name = "IncomeVerificationRangeCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> incomeVerificationRangeCount;
    @XmlElementRef(name = "IncomeVerificationRangeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IncomeVerificationRangeEnum> incomeVerificationRangeType;
    @XmlElementRef(name = "IncomeVerificationRangeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> incomeVerificationRangeTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected DOCUMENTATIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the assetDocumentationLevelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAssetDocumentationLevelIdentifier() {
        return assetDocumentationLevelIdentifier;
    }

    /**
     * Sets the value of the assetDocumentationLevelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAssetDocumentationLevelIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.assetDocumentationLevelIdentifier = value;
    }

    /**
     * Gets the value of the assetDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetDocumentEnum }{@code >}
     *     
     */
    public JAXBElement<AssetDocumentEnum> getAssetDocumentType() {
        return assetDocumentType;
    }

    /**
     * Sets the value of the assetDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetDocumentEnum }{@code >}
     *     
     */
    public void setAssetDocumentType(JAXBElement<AssetDocumentEnum> value) {
        this.assetDocumentType = value;
    }

    /**
     * Gets the value of the assetDocumentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAssetDocumentTypeOtherDescription() {
        return assetDocumentTypeOtherDescription;
    }

    /**
     * Sets the value of the assetDocumentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAssetDocumentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.assetDocumentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the assetVerificationRangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getAssetVerificationRangeCount() {
        return assetVerificationRangeCount;
    }

    /**
     * Sets the value of the assetVerificationRangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setAssetVerificationRangeCount(JAXBElement<MISMOCount> value) {
        this.assetVerificationRangeCount = value;
    }

    /**
     * Gets the value of the assetVerificationRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetVerificationRangeEnum }{@code >}
     *     
     */
    public JAXBElement<AssetVerificationRangeEnum> getAssetVerificationRangeType() {
        return assetVerificationRangeType;
    }

    /**
     * Sets the value of the assetVerificationRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetVerificationRangeEnum }{@code >}
     *     
     */
    public void setAssetVerificationRangeType(JAXBElement<AssetVerificationRangeEnum> value) {
        this.assetVerificationRangeType = value;
    }

    /**
     * Gets the value of the assetVerificationRangeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAssetVerificationRangeTypeOtherDescription() {
        return assetVerificationRangeTypeOtherDescription;
    }

    /**
     * Sets the value of the assetVerificationRangeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAssetVerificationRangeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.assetVerificationRangeTypeOtherDescription = value;
    }

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
     * Gets the value of the employmentDocumentationLevelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getEmploymentDocumentationLevelIdentifier() {
        return employmentDocumentationLevelIdentifier;
    }

    /**
     * Sets the value of the employmentDocumentationLevelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setEmploymentDocumentationLevelIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.employmentDocumentationLevelIdentifier = value;
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
     * Gets the value of the incomeDocumentationLevelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getIncomeDocumentationLevelIdentifier() {
        return incomeDocumentationLevelIdentifier;
    }

    /**
     * Sets the value of the incomeDocumentationLevelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setIncomeDocumentationLevelIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.incomeDocumentationLevelIdentifier = value;
    }

    /**
     * Gets the value of the incomeDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncomeDocumentEnum }{@code >}
     *     
     */
    public JAXBElement<IncomeDocumentEnum> getIncomeDocumentType() {
        return incomeDocumentType;
    }

    /**
     * Sets the value of the incomeDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncomeDocumentEnum }{@code >}
     *     
     */
    public void setIncomeDocumentType(JAXBElement<IncomeDocumentEnum> value) {
        this.incomeDocumentType = value;
    }

    /**
     * Gets the value of the incomeDocumentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIncomeDocumentTypeOtherDescription() {
        return incomeDocumentTypeOtherDescription;
    }

    /**
     * Sets the value of the incomeDocumentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIncomeDocumentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.incomeDocumentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the incomeVerificationRangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getIncomeVerificationRangeCount() {
        return incomeVerificationRangeCount;
    }

    /**
     * Sets the value of the incomeVerificationRangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setIncomeVerificationRangeCount(JAXBElement<MISMOCount> value) {
        this.incomeVerificationRangeCount = value;
    }

    /**
     * Gets the value of the incomeVerificationRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncomeVerificationRangeEnum }{@code >}
     *     
     */
    public JAXBElement<IncomeVerificationRangeEnum> getIncomeVerificationRangeType() {
        return incomeVerificationRangeType;
    }

    /**
     * Sets the value of the incomeVerificationRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncomeVerificationRangeEnum }{@code >}
     *     
     */
    public void setIncomeVerificationRangeType(JAXBElement<IncomeVerificationRangeEnum> value) {
        this.incomeVerificationRangeType = value;
    }

    /**
     * Gets the value of the incomeVerificationRangeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIncomeVerificationRangeTypeOtherDescription() {
        return incomeVerificationRangeTypeOtherDescription;
    }

    /**
     * Sets the value of the incomeVerificationRangeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIncomeVerificationRangeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.incomeVerificationRangeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONEXTENSION }
     *     
     */
    public DOCUMENTATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONEXTENSION }
     *     
     */
    public void setEXTENSION(DOCUMENTATIONEXTENSION value) {
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
