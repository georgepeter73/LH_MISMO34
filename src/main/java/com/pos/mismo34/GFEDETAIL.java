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
 * Form specific information about the Good Faith Estimate (GFE)
 * 
 * <p>Java class for GFE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GFE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GFECreditOrChargeForChosenInterestRateType" type="{http://www.mismo.org/residential/2009/schemas}GFECreditOrChargeForChosenInterestRateEnum" minOccurs="0"/>
 *         &lt;element name="GFECreditOrChargeForChosenInterestRateTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="GFEDisclosureDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="GFEInterestRateAvailableThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="GFELoanOriginatorFeePaymentCreditType" type="{http://www.mismo.org/residential/2009/schemas}GFELoanOriginatorFeePaymentCreditEnum" minOccurs="0"/>
 *         &lt;element name="GFELoanOriginatorFeePaymentCreditTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="GFEMonthlyPaymentFirstIncreasePaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="GFEMonthlyPaymentMaximumAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="GFERateLockMinimumDaysPriorToSettlementCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="GFERateLockPeriodDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="GFERedisclosureReasonDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="GFERedisclosureReasonDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="GFESettlementChargesAvailableThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}GFE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "GFE_DETAIL", propOrder = {
    "gfeCreditOrChargeForChosenInterestRateType",
    "gfeCreditOrChargeForChosenInterestRateTypeOtherDescription",
    "gfeDisclosureDate",
    "gfeInterestRateAvailableThroughDate",
    "gfeLoanOriginatorFeePaymentCreditType",
    "gfeLoanOriginatorFeePaymentCreditTypeOtherDescription",
    "gfeMonthlyPaymentFirstIncreasePaymentAmount",
    "gfeMonthlyPaymentMaximumAmount",
    "gfeRateLockMinimumDaysPriorToSettlementCount",
    "gfeRateLockPeriodDaysCount",
    "gfeRedisclosureReasonDate",
    "gfeRedisclosureReasonDescription",
    "gfeSettlementChargesAvailableThroughDate",
    "extension"
})
public class GFEDETAIL {

    @XmlElementRef(name = "GFECreditOrChargeForChosenInterestRateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<GFECreditOrChargeForChosenInterestRateEnum> gfeCreditOrChargeForChosenInterestRateType;
    @XmlElementRef(name = "GFECreditOrChargeForChosenInterestRateTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> gfeCreditOrChargeForChosenInterestRateTypeOtherDescription;
    @XmlElementRef(name = "GFEDisclosureDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> gfeDisclosureDate;
    @XmlElementRef(name = "GFEInterestRateAvailableThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> gfeInterestRateAvailableThroughDate;
    @XmlElementRef(name = "GFELoanOriginatorFeePaymentCreditType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<GFELoanOriginatorFeePaymentCreditEnum> gfeLoanOriginatorFeePaymentCreditType;
    @XmlElementRef(name = "GFELoanOriginatorFeePaymentCreditTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> gfeLoanOriginatorFeePaymentCreditTypeOtherDescription;
    @XmlElementRef(name = "GFEMonthlyPaymentFirstIncreasePaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> gfeMonthlyPaymentFirstIncreasePaymentAmount;
    @XmlElementRef(name = "GFEMonthlyPaymentMaximumAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> gfeMonthlyPaymentMaximumAmount;
    @XmlElementRef(name = "GFERateLockMinimumDaysPriorToSettlementCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> gfeRateLockMinimumDaysPriorToSettlementCount;
    @XmlElementRef(name = "GFERateLockPeriodDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> gfeRateLockPeriodDaysCount;
    @XmlElementRef(name = "GFERedisclosureReasonDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> gfeRedisclosureReasonDate;
    @XmlElementRef(name = "GFERedisclosureReasonDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> gfeRedisclosureReasonDescription;
    @XmlElementRef(name = "GFESettlementChargesAvailableThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> gfeSettlementChargesAvailableThroughDate;
    @XmlElement(name = "EXTENSION")
    protected GFEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the gfeCreditOrChargeForChosenInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GFECreditOrChargeForChosenInterestRateEnum }{@code >}
     *     
     */
    public JAXBElement<GFECreditOrChargeForChosenInterestRateEnum> getGFECreditOrChargeForChosenInterestRateType() {
        return gfeCreditOrChargeForChosenInterestRateType;
    }

    /**
     * Sets the value of the gfeCreditOrChargeForChosenInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GFECreditOrChargeForChosenInterestRateEnum }{@code >}
     *     
     */
    public void setGFECreditOrChargeForChosenInterestRateType(JAXBElement<GFECreditOrChargeForChosenInterestRateEnum> value) {
        this.gfeCreditOrChargeForChosenInterestRateType = value;
    }

    /**
     * Gets the value of the gfeCreditOrChargeForChosenInterestRateTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getGFECreditOrChargeForChosenInterestRateTypeOtherDescription() {
        return gfeCreditOrChargeForChosenInterestRateTypeOtherDescription;
    }

    /**
     * Sets the value of the gfeCreditOrChargeForChosenInterestRateTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setGFECreditOrChargeForChosenInterestRateTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.gfeCreditOrChargeForChosenInterestRateTypeOtherDescription = value;
    }

    /**
     * Gets the value of the gfeDisclosureDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getGFEDisclosureDate() {
        return gfeDisclosureDate;
    }

    /**
     * Sets the value of the gfeDisclosureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setGFEDisclosureDate(JAXBElement<MISMODate> value) {
        this.gfeDisclosureDate = value;
    }

    /**
     * Gets the value of the gfeInterestRateAvailableThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getGFEInterestRateAvailableThroughDate() {
        return gfeInterestRateAvailableThroughDate;
    }

    /**
     * Sets the value of the gfeInterestRateAvailableThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setGFEInterestRateAvailableThroughDate(JAXBElement<MISMODate> value) {
        this.gfeInterestRateAvailableThroughDate = value;
    }

    /**
     * Gets the value of the gfeLoanOriginatorFeePaymentCreditType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GFELoanOriginatorFeePaymentCreditEnum }{@code >}
     *     
     */
    public JAXBElement<GFELoanOriginatorFeePaymentCreditEnum> getGFELoanOriginatorFeePaymentCreditType() {
        return gfeLoanOriginatorFeePaymentCreditType;
    }

    /**
     * Sets the value of the gfeLoanOriginatorFeePaymentCreditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GFELoanOriginatorFeePaymentCreditEnum }{@code >}
     *     
     */
    public void setGFELoanOriginatorFeePaymentCreditType(JAXBElement<GFELoanOriginatorFeePaymentCreditEnum> value) {
        this.gfeLoanOriginatorFeePaymentCreditType = value;
    }

    /**
     * Gets the value of the gfeLoanOriginatorFeePaymentCreditTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getGFELoanOriginatorFeePaymentCreditTypeOtherDescription() {
        return gfeLoanOriginatorFeePaymentCreditTypeOtherDescription;
    }

    /**
     * Sets the value of the gfeLoanOriginatorFeePaymentCreditTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setGFELoanOriginatorFeePaymentCreditTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.gfeLoanOriginatorFeePaymentCreditTypeOtherDescription = value;
    }

    /**
     * Gets the value of the gfeMonthlyPaymentFirstIncreasePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getGFEMonthlyPaymentFirstIncreasePaymentAmount() {
        return gfeMonthlyPaymentFirstIncreasePaymentAmount;
    }

    /**
     * Sets the value of the gfeMonthlyPaymentFirstIncreasePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setGFEMonthlyPaymentFirstIncreasePaymentAmount(JAXBElement<MISMOAmount> value) {
        this.gfeMonthlyPaymentFirstIncreasePaymentAmount = value;
    }

    /**
     * Gets the value of the gfeMonthlyPaymentMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getGFEMonthlyPaymentMaximumAmount() {
        return gfeMonthlyPaymentMaximumAmount;
    }

    /**
     * Sets the value of the gfeMonthlyPaymentMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setGFEMonthlyPaymentMaximumAmount(JAXBElement<MISMOAmount> value) {
        this.gfeMonthlyPaymentMaximumAmount = value;
    }

    /**
     * Gets the value of the gfeRateLockMinimumDaysPriorToSettlementCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getGFERateLockMinimumDaysPriorToSettlementCount() {
        return gfeRateLockMinimumDaysPriorToSettlementCount;
    }

    /**
     * Sets the value of the gfeRateLockMinimumDaysPriorToSettlementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setGFERateLockMinimumDaysPriorToSettlementCount(JAXBElement<MISMOCount> value) {
        this.gfeRateLockMinimumDaysPriorToSettlementCount = value;
    }

    /**
     * Gets the value of the gfeRateLockPeriodDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getGFERateLockPeriodDaysCount() {
        return gfeRateLockPeriodDaysCount;
    }

    /**
     * Sets the value of the gfeRateLockPeriodDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setGFERateLockPeriodDaysCount(JAXBElement<MISMOCount> value) {
        this.gfeRateLockPeriodDaysCount = value;
    }

    /**
     * Gets the value of the gfeRedisclosureReasonDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getGFERedisclosureReasonDate() {
        return gfeRedisclosureReasonDate;
    }

    /**
     * Sets the value of the gfeRedisclosureReasonDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setGFERedisclosureReasonDate(JAXBElement<MISMODate> value) {
        this.gfeRedisclosureReasonDate = value;
    }

    /**
     * Gets the value of the gfeRedisclosureReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getGFERedisclosureReasonDescription() {
        return gfeRedisclosureReasonDescription;
    }

    /**
     * Sets the value of the gfeRedisclosureReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setGFERedisclosureReasonDescription(JAXBElement<MISMOString> value) {
        this.gfeRedisclosureReasonDescription = value;
    }

    /**
     * Gets the value of the gfeSettlementChargesAvailableThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getGFESettlementChargesAvailableThroughDate() {
        return gfeSettlementChargesAvailableThroughDate;
    }

    /**
     * Sets the value of the gfeSettlementChargesAvailableThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setGFESettlementChargesAvailableThroughDate(JAXBElement<MISMODate> value) {
        this.gfeSettlementChargesAvailableThroughDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link GFEDETAILEXTENSION }
     *     
     */
    public GFEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(GFEDETAILEXTENSION value) {
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
