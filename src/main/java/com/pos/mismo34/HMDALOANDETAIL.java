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
 * Additional information for reporting on a HMDA specific loan.
 * 
 * <p>Java class for HMDA_LOAN_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HMDA_LOAN_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HMDA_HOEPALoanStatusIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HMDA_HOEPALoanStatusReasonType" type="{http://www.mismo.org/residential/2009/schemas}HMDA_HOEPALoanStatusReasonEnum" minOccurs="0"/>
 *         &lt;element name="HMDA_HOEPALoanStatusReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HMDAApplicationSubmissionType" type="{http://www.mismo.org/residential/2009/schemas}HMDAApplicationSubmissionEnum" minOccurs="0"/>
 *         &lt;element name="HMDABusinessPurposeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusType" type="{http://www.mismo.org/residential/2009/schemas}HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusEnum" minOccurs="0"/>
 *         &lt;element name="HMDADispositionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HMDADispositionType" type="{http://www.mismo.org/residential/2009/schemas}HMDADispositionEnum" minOccurs="0"/>
 *         &lt;element name="HMDAManufacturedHomeLegalClassificationType" type="{http://www.mismo.org/residential/2009/schemas}HMDAManufacturedHomeLegalClassificationEnum" minOccurs="0"/>
 *         &lt;element name="HMDAMultipleCreditScoresUsedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HMDAOtherNonAmortizingFeaturesIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HMDAPostalAddressUnknownType" type="{http://www.mismo.org/residential/2009/schemas}HMDAPostalAddressUnknownEnum" minOccurs="0"/>
 *         &lt;element name="HMDAPreapprovalType" type="{http://www.mismo.org/residential/2009/schemas}HMDAPreapprovalEnum" minOccurs="0"/>
 *         &lt;element name="HMDAPurchaserType" type="{http://www.mismo.org/residential/2009/schemas}HMDAPurchaserEnum" minOccurs="0"/>
 *         &lt;element name="HMDAPurchaserTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HMDAPurposeOfLoanType" type="{http://www.mismo.org/residential/2009/schemas}HMDAPurposeOfLoanEnum" minOccurs="0"/>
 *         &lt;element name="HMDAPurposeOfLoanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HMDARateSpreadPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="HMDAReportingCRAExemptionIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HMDAReportingSmallPopulationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HMDA_LOAN_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HMDA_LOAN_DETAIL", propOrder = {
    "hmdahoepaLoanStatusIndicator",
    "hmdahoepaLoanStatusReasonType",
    "hmdahoepaLoanStatusReasonTypeOtherDescription",
    "hmdaApplicationSubmissionType",
    "hmdaBusinessPurposeIndicator",
    "hmdaCoveredLoanInitiallyPayableToReportingInstitutionStatusType",
    "hmdaDispositionDate",
    "hmdaDispositionType",
    "hmdaManufacturedHomeLegalClassificationType",
    "hmdaMultipleCreditScoresUsedIndicator",
    "hmdaOtherNonAmortizingFeaturesIndicator",
    "hmdaPostalAddressUnknownType",
    "hmdaPreapprovalType",
    "hmdaPurchaserType",
    "hmdaPurchaserTypeOtherDescription",
    "hmdaPurposeOfLoanType",
    "hmdaPurposeOfLoanTypeOtherDescription",
    "hmdaRateSpreadPercent",
    "hmdaReportingCRAExemptionIndicator",
    "hmdaReportingSmallPopulationIndicator",
    "extension"
})
public class HMDALOANDETAIL {

    @XmlElementRef(name = "HMDA_HOEPALoanStatusIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hmdahoepaLoanStatusIndicator;
    @XmlElementRef(name = "HMDA_HOEPALoanStatusReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAHOEPALoanStatusReasonEnum> hmdahoepaLoanStatusReasonType;
    @XmlElementRef(name = "HMDA_HOEPALoanStatusReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hmdahoepaLoanStatusReasonTypeOtherDescription;
    @XmlElementRef(name = "HMDAApplicationSubmissionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAApplicationSubmissionEnum> hmdaApplicationSubmissionType;
    @XmlElementRef(name = "HMDABusinessPurposeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hmdaBusinessPurposeIndicator;
    @XmlElementRef(name = "HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusEnum> hmdaCoveredLoanInitiallyPayableToReportingInstitutionStatusType;
    @XmlElementRef(name = "HMDADispositionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hmdaDispositionDate;
    @XmlElementRef(name = "HMDADispositionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDADispositionEnum> hmdaDispositionType;
    @XmlElementRef(name = "HMDAManufacturedHomeLegalClassificationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAManufacturedHomeLegalClassificationEnum> hmdaManufacturedHomeLegalClassificationType;
    @XmlElementRef(name = "HMDAMultipleCreditScoresUsedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hmdaMultipleCreditScoresUsedIndicator;
    @XmlElementRef(name = "HMDAOtherNonAmortizingFeaturesIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hmdaOtherNonAmortizingFeaturesIndicator;
    @XmlElementRef(name = "HMDAPostalAddressUnknownType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAPostalAddressUnknownEnum> hmdaPostalAddressUnknownType;
    @XmlElementRef(name = "HMDAPreapprovalType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAPreapprovalEnum> hmdaPreapprovalType;
    @XmlElementRef(name = "HMDAPurchaserType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAPurchaserEnum> hmdaPurchaserType;
    @XmlElementRef(name = "HMDAPurchaserTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hmdaPurchaserTypeOtherDescription;
    @XmlElementRef(name = "HMDAPurposeOfLoanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDAPurposeOfLoanEnum> hmdaPurposeOfLoanType;
    @XmlElementRef(name = "HMDAPurposeOfLoanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> hmdaPurposeOfLoanTypeOtherDescription;
    @XmlElementRef(name = "HMDARateSpreadPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> hmdaRateSpreadPercent;
    @XmlElementRef(name = "HMDAReportingCRAExemptionIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hmdaReportingCRAExemptionIndicator;
    @XmlElementRef(name = "HMDAReportingSmallPopulationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hmdaReportingSmallPopulationIndicator;
    @XmlElement(name = "EXTENSION")
    protected HMDALOANDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the hmdahoepaLoanStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHMDAHOEPALoanStatusIndicator() {
        return hmdahoepaLoanStatusIndicator;
    }

    /**
     * Sets the value of the hmdahoepaLoanStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHMDAHOEPALoanStatusIndicator(JAXBElement<MISMOIndicator> value) {
        this.hmdahoepaLoanStatusIndicator = value;
    }

    /**
     * Gets the value of the hmdahoepaLoanStatusReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAHOEPALoanStatusReasonEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAHOEPALoanStatusReasonEnum> getHMDAHOEPALoanStatusReasonType() {
        return hmdahoepaLoanStatusReasonType;
    }

    /**
     * Sets the value of the hmdahoepaLoanStatusReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAHOEPALoanStatusReasonEnum }{@code >}
     *     
     */
    public void setHMDAHOEPALoanStatusReasonType(JAXBElement<HMDAHOEPALoanStatusReasonEnum> value) {
        this.hmdahoepaLoanStatusReasonType = value;
    }

    /**
     * Gets the value of the hmdahoepaLoanStatusReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHMDAHOEPALoanStatusReasonTypeOtherDescription() {
        return hmdahoepaLoanStatusReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the hmdahoepaLoanStatusReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHMDAHOEPALoanStatusReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.hmdahoepaLoanStatusReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hmdaApplicationSubmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAApplicationSubmissionEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAApplicationSubmissionEnum> getHMDAApplicationSubmissionType() {
        return hmdaApplicationSubmissionType;
    }

    /**
     * Sets the value of the hmdaApplicationSubmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAApplicationSubmissionEnum }{@code >}
     *     
     */
    public void setHMDAApplicationSubmissionType(JAXBElement<HMDAApplicationSubmissionEnum> value) {
        this.hmdaApplicationSubmissionType = value;
    }

    /**
     * Gets the value of the hmdaBusinessPurposeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHMDABusinessPurposeIndicator() {
        return hmdaBusinessPurposeIndicator;
    }

    /**
     * Sets the value of the hmdaBusinessPurposeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHMDABusinessPurposeIndicator(JAXBElement<MISMOIndicator> value) {
        this.hmdaBusinessPurposeIndicator = value;
    }

    /**
     * Gets the value of the hmdaCoveredLoanInitiallyPayableToReportingInstitutionStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusEnum }{@code >}
     *     
     */
    public JAXBElement<HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusEnum> getHMDACoveredLoanInitiallyPayableToReportingInstitutionStatusType() {
        return hmdaCoveredLoanInitiallyPayableToReportingInstitutionStatusType;
    }

    /**
     * Sets the value of the hmdaCoveredLoanInitiallyPayableToReportingInstitutionStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusEnum }{@code >}
     *     
     */
    public void setHMDACoveredLoanInitiallyPayableToReportingInstitutionStatusType(JAXBElement<HMDACoveredLoanInitiallyPayableToReportingInstitutionStatusEnum> value) {
        this.hmdaCoveredLoanInitiallyPayableToReportingInstitutionStatusType = value;
    }

    /**
     * Gets the value of the hmdaDispositionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHMDADispositionDate() {
        return hmdaDispositionDate;
    }

    /**
     * Sets the value of the hmdaDispositionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHMDADispositionDate(JAXBElement<MISMODate> value) {
        this.hmdaDispositionDate = value;
    }

    /**
     * Gets the value of the hmdaDispositionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDADispositionEnum }{@code >}
     *     
     */
    public JAXBElement<HMDADispositionEnum> getHMDADispositionType() {
        return hmdaDispositionType;
    }

    /**
     * Sets the value of the hmdaDispositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDADispositionEnum }{@code >}
     *     
     */
    public void setHMDADispositionType(JAXBElement<HMDADispositionEnum> value) {
        this.hmdaDispositionType = value;
    }

    /**
     * Gets the value of the hmdaManufacturedHomeLegalClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAManufacturedHomeLegalClassificationEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAManufacturedHomeLegalClassificationEnum> getHMDAManufacturedHomeLegalClassificationType() {
        return hmdaManufacturedHomeLegalClassificationType;
    }

    /**
     * Sets the value of the hmdaManufacturedHomeLegalClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAManufacturedHomeLegalClassificationEnum }{@code >}
     *     
     */
    public void setHMDAManufacturedHomeLegalClassificationType(JAXBElement<HMDAManufacturedHomeLegalClassificationEnum> value) {
        this.hmdaManufacturedHomeLegalClassificationType = value;
    }

    /**
     * Gets the value of the hmdaMultipleCreditScoresUsedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHMDAMultipleCreditScoresUsedIndicator() {
        return hmdaMultipleCreditScoresUsedIndicator;
    }

    /**
     * Sets the value of the hmdaMultipleCreditScoresUsedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHMDAMultipleCreditScoresUsedIndicator(JAXBElement<MISMOIndicator> value) {
        this.hmdaMultipleCreditScoresUsedIndicator = value;
    }

    /**
     * Gets the value of the hmdaOtherNonAmortizingFeaturesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHMDAOtherNonAmortizingFeaturesIndicator() {
        return hmdaOtherNonAmortizingFeaturesIndicator;
    }

    /**
     * Sets the value of the hmdaOtherNonAmortizingFeaturesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHMDAOtherNonAmortizingFeaturesIndicator(JAXBElement<MISMOIndicator> value) {
        this.hmdaOtherNonAmortizingFeaturesIndicator = value;
    }

    /**
     * Gets the value of the hmdaPostalAddressUnknownType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAPostalAddressUnknownEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAPostalAddressUnknownEnum> getHMDAPostalAddressUnknownType() {
        return hmdaPostalAddressUnknownType;
    }

    /**
     * Sets the value of the hmdaPostalAddressUnknownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAPostalAddressUnknownEnum }{@code >}
     *     
     */
    public void setHMDAPostalAddressUnknownType(JAXBElement<HMDAPostalAddressUnknownEnum> value) {
        this.hmdaPostalAddressUnknownType = value;
    }

    /**
     * Gets the value of the hmdaPreapprovalType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAPreapprovalEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAPreapprovalEnum> getHMDAPreapprovalType() {
        return hmdaPreapprovalType;
    }

    /**
     * Sets the value of the hmdaPreapprovalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAPreapprovalEnum }{@code >}
     *     
     */
    public void setHMDAPreapprovalType(JAXBElement<HMDAPreapprovalEnum> value) {
        this.hmdaPreapprovalType = value;
    }

    /**
     * Gets the value of the hmdaPurchaserType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAPurchaserEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAPurchaserEnum> getHMDAPurchaserType() {
        return hmdaPurchaserType;
    }

    /**
     * Sets the value of the hmdaPurchaserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAPurchaserEnum }{@code >}
     *     
     */
    public void setHMDAPurchaserType(JAXBElement<HMDAPurchaserEnum> value) {
        this.hmdaPurchaserType = value;
    }

    /**
     * Gets the value of the hmdaPurchaserTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHMDAPurchaserTypeOtherDescription() {
        return hmdaPurchaserTypeOtherDescription;
    }

    /**
     * Sets the value of the hmdaPurchaserTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHMDAPurchaserTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.hmdaPurchaserTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hmdaPurposeOfLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDAPurposeOfLoanEnum }{@code >}
     *     
     */
    public JAXBElement<HMDAPurposeOfLoanEnum> getHMDAPurposeOfLoanType() {
        return hmdaPurposeOfLoanType;
    }

    /**
     * Sets the value of the hmdaPurposeOfLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDAPurposeOfLoanEnum }{@code >}
     *     
     */
    public void setHMDAPurposeOfLoanType(JAXBElement<HMDAPurposeOfLoanEnum> value) {
        this.hmdaPurposeOfLoanType = value;
    }

    /**
     * Gets the value of the hmdaPurposeOfLoanTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHMDAPurposeOfLoanTypeOtherDescription() {
        return hmdaPurposeOfLoanTypeOtherDescription;
    }

    /**
     * Sets the value of the hmdaPurposeOfLoanTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHMDAPurposeOfLoanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.hmdaPurposeOfLoanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hmdaRateSpreadPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getHMDARateSpreadPercent() {
        return hmdaRateSpreadPercent;
    }

    /**
     * Sets the value of the hmdaRateSpreadPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setHMDARateSpreadPercent(JAXBElement<MISMOPercent> value) {
        this.hmdaRateSpreadPercent = value;
    }

    /**
     * Gets the value of the hmdaReportingCRAExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHMDAReportingCRAExemptionIndicator() {
        return hmdaReportingCRAExemptionIndicator;
    }

    /**
     * Sets the value of the hmdaReportingCRAExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHMDAReportingCRAExemptionIndicator(JAXBElement<MISMOIndicator> value) {
        this.hmdaReportingCRAExemptionIndicator = value;
    }

    /**
     * Gets the value of the hmdaReportingSmallPopulationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHMDAReportingSmallPopulationIndicator() {
        return hmdaReportingSmallPopulationIndicator;
    }

    /**
     * Sets the value of the hmdaReportingSmallPopulationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHMDAReportingSmallPopulationIndicator(JAXBElement<MISMOIndicator> value) {
        this.hmdaReportingSmallPopulationIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link HMDALOANDETAILEXTENSION }
     *     
     */
    public HMDALOANDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HMDALOANDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(HMDALOANDETAILEXTENSION value) {
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
