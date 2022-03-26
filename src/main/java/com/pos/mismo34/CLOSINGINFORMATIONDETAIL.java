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
 * <p>Java class for CLOSING_INFORMATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLOSING_INFORMATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashFromBorrowerAtClosingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CashFromSellerAtClosingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CashToBorrowerAtClosingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CashToSellerAtClosingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ClosingAgentOrderNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ClosingDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ClosingDocumentReceivedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ClosingDocumentsExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ClosingDocumentsExpirationTime" type="{http://www.mismo.org/residential/2009/schemas}MISMOTime" minOccurs="0"/>
 *         &lt;element name="CurrentRateSetDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DisbursementDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DocumentOrderClassificationType" type="{http://www.mismo.org/residential/2009/schemas}DocumentOrderClassificationEnum" minOccurs="0"/>
 *         &lt;element name="DocumentPreparationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EstimatedPrepaidDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EstimatedPrepaidDaysPaidByType" type="{http://www.mismo.org/residential/2009/schemas}EstimatedPrepaidDaysPaidByEnum" minOccurs="0"/>
 *         &lt;element name="EstimatedPrepaidDaysPaidByTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FundByDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanEstimatedClosingDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanScheduledClosingDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RescissionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_INFORMATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CLOSING_INFORMATION_DETAIL", propOrder = {
    "cashFromBorrowerAtClosingAmount",
    "cashFromSellerAtClosingAmount",
    "cashToBorrowerAtClosingAmount",
    "cashToSellerAtClosingAmount",
    "closingAgentOrderNumberIdentifier",
    "closingDate",
    "closingDocumentReceivedDate",
    "closingDocumentsExpirationDate",
    "closingDocumentsExpirationTime",
    "currentRateSetDate",
    "disbursementDate",
    "documentOrderClassificationType",
    "documentPreparationDate",
    "estimatedPrepaidDaysCount",
    "estimatedPrepaidDaysPaidByType",
    "estimatedPrepaidDaysPaidByTypeOtherDescription",
    "fundByDate",
    "loanEstimatedClosingDate",
    "loanScheduledClosingDate",
    "rescissionDate",
    "extension"
})
public class CLOSINGINFORMATIONDETAIL {

    @XmlElementRef(name = "CashFromBorrowerAtClosingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> cashFromBorrowerAtClosingAmount;
    @XmlElementRef(name = "CashFromSellerAtClosingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> cashFromSellerAtClosingAmount;
    @XmlElementRef(name = "CashToBorrowerAtClosingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> cashToBorrowerAtClosingAmount;
    @XmlElementRef(name = "CashToSellerAtClosingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> cashToSellerAtClosingAmount;
    @XmlElementRef(name = "ClosingAgentOrderNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> closingAgentOrderNumberIdentifier;
    @XmlElementRef(name = "ClosingDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> closingDate;
    @XmlElementRef(name = "ClosingDocumentReceivedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> closingDocumentReceivedDate;
    @XmlElementRef(name = "ClosingDocumentsExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> closingDocumentsExpirationDate;
    @XmlElementRef(name = "ClosingDocumentsExpirationTime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOTime> closingDocumentsExpirationTime;
    @XmlElementRef(name = "CurrentRateSetDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> currentRateSetDate;
    @XmlElementRef(name = "DisbursementDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> disbursementDate;
    @XmlElementRef(name = "DocumentOrderClassificationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentOrderClassificationEnum> documentOrderClassificationType;
    @XmlElementRef(name = "DocumentPreparationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> documentPreparationDate;
    @XmlElementRef(name = "EstimatedPrepaidDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> estimatedPrepaidDaysCount;
    @XmlElementRef(name = "EstimatedPrepaidDaysPaidByType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EstimatedPrepaidDaysPaidByEnum> estimatedPrepaidDaysPaidByType;
    @XmlElementRef(name = "EstimatedPrepaidDaysPaidByTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> estimatedPrepaidDaysPaidByTypeOtherDescription;
    @XmlElementRef(name = "FundByDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> fundByDate;
    @XmlElementRef(name = "LoanEstimatedClosingDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanEstimatedClosingDate;
    @XmlElementRef(name = "LoanScheduledClosingDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanScheduledClosingDate;
    @XmlElementRef(name = "RescissionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> rescissionDate;
    @XmlElement(name = "EXTENSION")
    protected CLOSINGINFORMATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the cashFromBorrowerAtClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCashFromBorrowerAtClosingAmount() {
        return cashFromBorrowerAtClosingAmount;
    }

    /**
     * Sets the value of the cashFromBorrowerAtClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCashFromBorrowerAtClosingAmount(JAXBElement<MISMOAmount> value) {
        this.cashFromBorrowerAtClosingAmount = value;
    }

    /**
     * Gets the value of the cashFromSellerAtClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCashFromSellerAtClosingAmount() {
        return cashFromSellerAtClosingAmount;
    }

    /**
     * Sets the value of the cashFromSellerAtClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCashFromSellerAtClosingAmount(JAXBElement<MISMOAmount> value) {
        this.cashFromSellerAtClosingAmount = value;
    }

    /**
     * Gets the value of the cashToBorrowerAtClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCashToBorrowerAtClosingAmount() {
        return cashToBorrowerAtClosingAmount;
    }

    /**
     * Sets the value of the cashToBorrowerAtClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCashToBorrowerAtClosingAmount(JAXBElement<MISMOAmount> value) {
        this.cashToBorrowerAtClosingAmount = value;
    }

    /**
     * Gets the value of the cashToSellerAtClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCashToSellerAtClosingAmount() {
        return cashToSellerAtClosingAmount;
    }

    /**
     * Sets the value of the cashToSellerAtClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCashToSellerAtClosingAmount(JAXBElement<MISMOAmount> value) {
        this.cashToSellerAtClosingAmount = value;
    }

    /**
     * Gets the value of the closingAgentOrderNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getClosingAgentOrderNumberIdentifier() {
        return closingAgentOrderNumberIdentifier;
    }

    /**
     * Sets the value of the closingAgentOrderNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setClosingAgentOrderNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.closingAgentOrderNumberIdentifier = value;
    }

    /**
     * Gets the value of the closingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setClosingDate(JAXBElement<MISMODate> value) {
        this.closingDate = value;
    }

    /**
     * Gets the value of the closingDocumentReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getClosingDocumentReceivedDate() {
        return closingDocumentReceivedDate;
    }

    /**
     * Sets the value of the closingDocumentReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setClosingDocumentReceivedDate(JAXBElement<MISMODate> value) {
        this.closingDocumentReceivedDate = value;
    }

    /**
     * Gets the value of the closingDocumentsExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getClosingDocumentsExpirationDate() {
        return closingDocumentsExpirationDate;
    }

    /**
     * Sets the value of the closingDocumentsExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setClosingDocumentsExpirationDate(JAXBElement<MISMODate> value) {
        this.closingDocumentsExpirationDate = value;
    }

    /**
     * Gets the value of the closingDocumentsExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOTime }{@code >}
     *     
     */
    public JAXBElement<MISMOTime> getClosingDocumentsExpirationTime() {
        return closingDocumentsExpirationTime;
    }

    /**
     * Sets the value of the closingDocumentsExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOTime }{@code >}
     *     
     */
    public void setClosingDocumentsExpirationTime(JAXBElement<MISMOTime> value) {
        this.closingDocumentsExpirationTime = value;
    }

    /**
     * Gets the value of the currentRateSetDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCurrentRateSetDate() {
        return currentRateSetDate;
    }

    /**
     * Sets the value of the currentRateSetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCurrentRateSetDate(JAXBElement<MISMODate> value) {
        this.currentRateSetDate = value;
    }

    /**
     * Gets the value of the disbursementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getDisbursementDate() {
        return disbursementDate;
    }

    /**
     * Sets the value of the disbursementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setDisbursementDate(JAXBElement<MISMODate> value) {
        this.disbursementDate = value;
    }

    /**
     * Gets the value of the documentOrderClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentOrderClassificationEnum }{@code >}
     *     
     */
    public JAXBElement<DocumentOrderClassificationEnum> getDocumentOrderClassificationType() {
        return documentOrderClassificationType;
    }

    /**
     * Sets the value of the documentOrderClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentOrderClassificationEnum }{@code >}
     *     
     */
    public void setDocumentOrderClassificationType(JAXBElement<DocumentOrderClassificationEnum> value) {
        this.documentOrderClassificationType = value;
    }

    /**
     * Gets the value of the documentPreparationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getDocumentPreparationDate() {
        return documentPreparationDate;
    }

    /**
     * Sets the value of the documentPreparationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setDocumentPreparationDate(JAXBElement<MISMODate> value) {
        this.documentPreparationDate = value;
    }

    /**
     * Gets the value of the estimatedPrepaidDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getEstimatedPrepaidDaysCount() {
        return estimatedPrepaidDaysCount;
    }

    /**
     * Sets the value of the estimatedPrepaidDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setEstimatedPrepaidDaysCount(JAXBElement<MISMOCount> value) {
        this.estimatedPrepaidDaysCount = value;
    }

    /**
     * Gets the value of the estimatedPrepaidDaysPaidByType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EstimatedPrepaidDaysPaidByEnum }{@code >}
     *     
     */
    public JAXBElement<EstimatedPrepaidDaysPaidByEnum> getEstimatedPrepaidDaysPaidByType() {
        return estimatedPrepaidDaysPaidByType;
    }

    /**
     * Sets the value of the estimatedPrepaidDaysPaidByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EstimatedPrepaidDaysPaidByEnum }{@code >}
     *     
     */
    public void setEstimatedPrepaidDaysPaidByType(JAXBElement<EstimatedPrepaidDaysPaidByEnum> value) {
        this.estimatedPrepaidDaysPaidByType = value;
    }

    /**
     * Gets the value of the estimatedPrepaidDaysPaidByTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEstimatedPrepaidDaysPaidByTypeOtherDescription() {
        return estimatedPrepaidDaysPaidByTypeOtherDescription;
    }

    /**
     * Sets the value of the estimatedPrepaidDaysPaidByTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEstimatedPrepaidDaysPaidByTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.estimatedPrepaidDaysPaidByTypeOtherDescription = value;
    }

    /**
     * Gets the value of the fundByDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getFundByDate() {
        return fundByDate;
    }

    /**
     * Sets the value of the fundByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setFundByDate(JAXBElement<MISMODate> value) {
        this.fundByDate = value;
    }

    /**
     * Gets the value of the loanEstimatedClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanEstimatedClosingDate() {
        return loanEstimatedClosingDate;
    }

    /**
     * Sets the value of the loanEstimatedClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanEstimatedClosingDate(JAXBElement<MISMODate> value) {
        this.loanEstimatedClosingDate = value;
    }

    /**
     * Gets the value of the loanScheduledClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanScheduledClosingDate() {
        return loanScheduledClosingDate;
    }

    /**
     * Sets the value of the loanScheduledClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanScheduledClosingDate(JAXBElement<MISMODate> value) {
        this.loanScheduledClosingDate = value;
    }

    /**
     * Gets the value of the rescissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getRescissionDate() {
        return rescissionDate;
    }

    /**
     * Sets the value of the rescissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setRescissionDate(JAXBElement<MISMODate> value) {
        this.rescissionDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGINFORMATIONDETAILEXTENSION }
     *     
     */
    public CLOSINGINFORMATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGINFORMATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(CLOSINGINFORMATIONDETAILEXTENSION value) {
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
