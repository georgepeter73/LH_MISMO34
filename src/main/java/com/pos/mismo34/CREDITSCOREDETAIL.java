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
 * Additional information about the credit score.
 * 
 * <p>Java class for CREDIT_SCORE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_SCORE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditReportIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="CreditReportType" type="{http://www.mismo.org/residential/2009/schemas}CreditReportEnum" minOccurs="0"/>
 *         &lt;element name="CreditReportTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditRepositorySingleSourceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CreditRepositorySourceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CreditRepositorySourceType" type="{http://www.mismo.org/residential/2009/schemas}CreditRepositorySourceEnum" minOccurs="0"/>
 *         &lt;element name="CreditRepositorySourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreCategoryEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryVersionType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreCategoryVersionEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryVersionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditScoreExclusionReasonType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreExclusionReasonEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreFACTAInquiriesIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CreditScoreImpairmentType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreImpairmentEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreImpairmentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelNameType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreModelNameEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreRankPercentileDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreRankPercentileValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="CreditScoreValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_SCORE_DETAIL", propOrder = {
    "creditReportIdentifier",
    "creditReportType",
    "creditReportTypeOtherDescription",
    "creditRepositorySingleSourceIndicator",
    "creditRepositorySourceIndicator",
    "creditRepositorySourceType",
    "creditRepositorySourceTypeOtherDescription",
    "creditScoreCategoryType",
    "creditScoreCategoryTypeOtherDescription",
    "creditScoreCategoryVersionType",
    "creditScoreCategoryVersionTypeOtherDescription",
    "creditScoreDate",
    "creditScoreExclusionReasonType",
    "creditScoreFACTAInquiriesIndicator",
    "creditScoreImpairmentType",
    "creditScoreImpairmentTypeOtherDescription",
    "creditScoreModelNameType",
    "creditScoreModelNameTypeOtherDescription",
    "creditScoreRankPercentileDescription",
    "creditScoreRankPercentileValue",
    "creditScoreValue",
    "extension"
})
public class CREDITSCOREDETAIL {

    @XmlElementRef(name = "CreditReportIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> creditReportIdentifier;
    @XmlElementRef(name = "CreditReportType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditReportEnum> creditReportType;
    @XmlElementRef(name = "CreditReportTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditReportTypeOtherDescription;
    @XmlElementRef(name = "CreditRepositorySingleSourceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> creditRepositorySingleSourceIndicator;
    @XmlElementRef(name = "CreditRepositorySourceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> creditRepositorySourceIndicator;
    @XmlElementRef(name = "CreditRepositorySourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditRepositorySourceEnum> creditRepositorySourceType;
    @XmlElementRef(name = "CreditRepositorySourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditRepositorySourceTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreCategoryType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreCategoryEnum> creditScoreCategoryType;
    @XmlElementRef(name = "CreditScoreCategoryTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreCategoryTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreCategoryVersionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreCategoryVersionEnum> creditScoreCategoryVersionType;
    @XmlElementRef(name = "CreditScoreCategoryVersionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreCategoryVersionTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditScoreDate;
    @XmlElementRef(name = "CreditScoreExclusionReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreExclusionReasonEnum> creditScoreExclusionReasonType;
    @XmlElementRef(name = "CreditScoreFACTAInquiriesIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> creditScoreFACTAInquiriesIndicator;
    @XmlElementRef(name = "CreditScoreImpairmentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreImpairmentEnum> creditScoreImpairmentType;
    @XmlElementRef(name = "CreditScoreImpairmentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreImpairmentTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreModelNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreModelNameEnum> creditScoreModelNameType;
    @XmlElementRef(name = "CreditScoreModelNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreModelNameTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreRankPercentileDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreRankPercentileDescription;
    @XmlElementRef(name = "CreditScoreRankPercentileValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> creditScoreRankPercentileValue;
    @XmlElementRef(name = "CreditScoreValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> creditScoreValue;
    @XmlElement(name = "EXTENSION")
    protected CREDITSCOREDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditReportIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getCreditReportIdentifier() {
        return creditReportIdentifier;
    }

    /**
     * Sets the value of the creditReportIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setCreditReportIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.creditReportIdentifier = value;
    }

    /**
     * Gets the value of the creditReportType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditReportEnum }{@code >}
     *     
     */
    public JAXBElement<CreditReportEnum> getCreditReportType() {
        return creditReportType;
    }

    /**
     * Sets the value of the creditReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditReportEnum }{@code >}
     *     
     */
    public void setCreditReportType(JAXBElement<CreditReportEnum> value) {
        this.creditReportType = value;
    }

    /**
     * Gets the value of the creditReportTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditReportTypeOtherDescription() {
        return creditReportTypeOtherDescription;
    }

    /**
     * Sets the value of the creditReportTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditReportTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditReportTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditRepositorySingleSourceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCreditRepositorySingleSourceIndicator() {
        return creditRepositorySingleSourceIndicator;
    }

    /**
     * Sets the value of the creditRepositorySingleSourceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCreditRepositorySingleSourceIndicator(JAXBElement<MISMOIndicator> value) {
        this.creditRepositorySingleSourceIndicator = value;
    }

    /**
     * Gets the value of the creditRepositorySourceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCreditRepositorySourceIndicator() {
        return creditRepositorySourceIndicator;
    }

    /**
     * Sets the value of the creditRepositorySourceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCreditRepositorySourceIndicator(JAXBElement<MISMOIndicator> value) {
        this.creditRepositorySourceIndicator = value;
    }

    /**
     * Gets the value of the creditRepositorySourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditRepositorySourceEnum }{@code >}
     *     
     */
    public JAXBElement<CreditRepositorySourceEnum> getCreditRepositorySourceType() {
        return creditRepositorySourceType;
    }

    /**
     * Sets the value of the creditRepositorySourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditRepositorySourceEnum }{@code >}
     *     
     */
    public void setCreditRepositorySourceType(JAXBElement<CreditRepositorySourceEnum> value) {
        this.creditRepositorySourceType = value;
    }

    /**
     * Gets the value of the creditRepositorySourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditRepositorySourceTypeOtherDescription() {
        return creditRepositorySourceTypeOtherDescription;
    }

    /**
     * Sets the value of the creditRepositorySourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditRepositorySourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditRepositorySourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreCategoryEnum> getCreditScoreCategoryType() {
        return creditScoreCategoryType;
    }

    /**
     * Sets the value of the creditScoreCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryEnum }{@code >}
     *     
     */
    public void setCreditScoreCategoryType(JAXBElement<CreditScoreCategoryEnum> value) {
        this.creditScoreCategoryType = value;
    }

    /**
     * Gets the value of the creditScoreCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreCategoryTypeOtherDescription() {
        return creditScoreCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreCategoryTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreCategoryVersionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryVersionEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreCategoryVersionEnum> getCreditScoreCategoryVersionType() {
        return creditScoreCategoryVersionType;
    }

    /**
     * Sets the value of the creditScoreCategoryVersionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryVersionEnum }{@code >}
     *     
     */
    public void setCreditScoreCategoryVersionType(JAXBElement<CreditScoreCategoryVersionEnum> value) {
        this.creditScoreCategoryVersionType = value;
    }

    /**
     * Gets the value of the creditScoreCategoryVersionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreCategoryVersionTypeOtherDescription() {
        return creditScoreCategoryVersionTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreCategoryVersionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreCategoryVersionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreCategoryVersionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCreditScoreDate() {
        return creditScoreDate;
    }

    /**
     * Sets the value of the creditScoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCreditScoreDate(JAXBElement<MISMODate> value) {
        this.creditScoreDate = value;
    }

    /**
     * Gets the value of the creditScoreExclusionReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreExclusionReasonEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreExclusionReasonEnum> getCreditScoreExclusionReasonType() {
        return creditScoreExclusionReasonType;
    }

    /**
     * Sets the value of the creditScoreExclusionReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreExclusionReasonEnum }{@code >}
     *     
     */
    public void setCreditScoreExclusionReasonType(JAXBElement<CreditScoreExclusionReasonEnum> value) {
        this.creditScoreExclusionReasonType = value;
    }

    /**
     * Gets the value of the creditScoreFACTAInquiriesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCreditScoreFACTAInquiriesIndicator() {
        return creditScoreFACTAInquiriesIndicator;
    }

    /**
     * Sets the value of the creditScoreFACTAInquiriesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCreditScoreFACTAInquiriesIndicator(JAXBElement<MISMOIndicator> value) {
        this.creditScoreFACTAInquiriesIndicator = value;
    }

    /**
     * Gets the value of the creditScoreImpairmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreImpairmentEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreImpairmentEnum> getCreditScoreImpairmentType() {
        return creditScoreImpairmentType;
    }

    /**
     * Sets the value of the creditScoreImpairmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreImpairmentEnum }{@code >}
     *     
     */
    public void setCreditScoreImpairmentType(JAXBElement<CreditScoreImpairmentEnum> value) {
        this.creditScoreImpairmentType = value;
    }

    /**
     * Gets the value of the creditScoreImpairmentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreImpairmentTypeOtherDescription() {
        return creditScoreImpairmentTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreImpairmentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreImpairmentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreImpairmentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreModelNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreModelNameEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreModelNameEnum> getCreditScoreModelNameType() {
        return creditScoreModelNameType;
    }

    /**
     * Sets the value of the creditScoreModelNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreModelNameEnum }{@code >}
     *     
     */
    public void setCreditScoreModelNameType(JAXBElement<CreditScoreModelNameEnum> value) {
        this.creditScoreModelNameType = value;
    }

    /**
     * Gets the value of the creditScoreModelNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreModelNameTypeOtherDescription() {
        return creditScoreModelNameTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreModelNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreModelNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreModelNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreRankPercentileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreRankPercentileDescription() {
        return creditScoreRankPercentileDescription;
    }

    /**
     * Sets the value of the creditScoreRankPercentileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreRankPercentileDescription(JAXBElement<MISMOString> value) {
        this.creditScoreRankPercentileDescription = value;
    }

    /**
     * Gets the value of the creditScoreRankPercentileValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getCreditScoreRankPercentileValue() {
        return creditScoreRankPercentileValue;
    }

    /**
     * Sets the value of the creditScoreRankPercentileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setCreditScoreRankPercentileValue(JAXBElement<MISMOValue> value) {
        this.creditScoreRankPercentileValue = value;
    }

    /**
     * Gets the value of the creditScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getCreditScoreValue() {
        return creditScoreValue;
    }

    /**
     * Sets the value of the creditScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setCreditScoreValue(JAXBElement<MISMOValue> value) {
        this.creditScoreValue = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREDETAILEXTENSION }
     *     
     */
    public CREDITSCOREDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITSCOREDETAILEXTENSION value) {
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
