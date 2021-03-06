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
 * Information specific to a reverse mortgage.
 * 
 * <p>Java class for REVERSE_MORTGAGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REVERSE_MORTGAGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReverseGrossLineOfCreditReserveAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseInitialPrincipalLimitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseMortgageDisclosedMonthlyServicingFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseMortgageInitialAdvanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseNetLineOfCreditAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseNetPrincipalLimitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReversePaymentPlanType" type="{http://www.mismo.org/residential/2009/schemas}ReversePaymentPlanEnum" minOccurs="0"/>
 *         &lt;element name="ReversePaymentPlanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ReversePaymentTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ReverseScheduledPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseSetAsideFirstYearPropertyChargesAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseSetAsideTaxesAndInsuranceWithholdingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ReverseSetAsideTaxesAndInsuranceWithholdingEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ReverseSetAsideTaxesAndInsuranceWithholdingRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ReverseSetAsideTaxesAndInsuranceWithholdingStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ReverseTotalAvailableAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}REVERSE_MORTGAGE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "REVERSE_MORTGAGE", propOrder = {
    "reverseGrossLineOfCreditReserveAmount",
    "reverseInitialPrincipalLimitAmount",
    "reverseMortgageDisclosedMonthlyServicingFeeAmount",
    "reverseMortgageInitialAdvanceAmount",
    "reverseNetLineOfCreditAmount",
    "reverseNetPrincipalLimitAmount",
    "reversePaymentPlanType",
    "reversePaymentPlanTypeOtherDescription",
    "reversePaymentTermMonthsCount",
    "reverseScheduledPaymentAmount",
    "reverseSetAsideFirstYearPropertyChargesAmount",
    "reverseSetAsideTaxesAndInsuranceWithholdingAmount",
    "reverseSetAsideTaxesAndInsuranceWithholdingEndDate",
    "reverseSetAsideTaxesAndInsuranceWithholdingRatePercent",
    "reverseSetAsideTaxesAndInsuranceWithholdingStartDate",
    "reverseTotalAvailableAmount",
    "upbAmount",
    "extension"
})
public class REVERSEMORTGAGE {

    @XmlElementRef(name = "ReverseGrossLineOfCreditReserveAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseGrossLineOfCreditReserveAmount;
    @XmlElementRef(name = "ReverseInitialPrincipalLimitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseInitialPrincipalLimitAmount;
    @XmlElementRef(name = "ReverseMortgageDisclosedMonthlyServicingFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseMortgageDisclosedMonthlyServicingFeeAmount;
    @XmlElementRef(name = "ReverseMortgageInitialAdvanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseMortgageInitialAdvanceAmount;
    @XmlElementRef(name = "ReverseNetLineOfCreditAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseNetLineOfCreditAmount;
    @XmlElementRef(name = "ReverseNetPrincipalLimitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseNetPrincipalLimitAmount;
    @XmlElementRef(name = "ReversePaymentPlanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ReversePaymentPlanEnum> reversePaymentPlanType;
    @XmlElementRef(name = "ReversePaymentPlanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> reversePaymentPlanTypeOtherDescription;
    @XmlElementRef(name = "ReversePaymentTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> reversePaymentTermMonthsCount;
    @XmlElementRef(name = "ReverseScheduledPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseScheduledPaymentAmount;
    @XmlElementRef(name = "ReverseSetAsideFirstYearPropertyChargesAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseSetAsideFirstYearPropertyChargesAmount;
    @XmlElementRef(name = "ReverseSetAsideTaxesAndInsuranceWithholdingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseSetAsideTaxesAndInsuranceWithholdingAmount;
    @XmlElementRef(name = "ReverseSetAsideTaxesAndInsuranceWithholdingEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> reverseSetAsideTaxesAndInsuranceWithholdingEndDate;
    @XmlElementRef(name = "ReverseSetAsideTaxesAndInsuranceWithholdingRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> reverseSetAsideTaxesAndInsuranceWithholdingRatePercent;
    @XmlElementRef(name = "ReverseSetAsideTaxesAndInsuranceWithholdingStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> reverseSetAsideTaxesAndInsuranceWithholdingStartDate;
    @XmlElementRef(name = "ReverseTotalAvailableAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> reverseTotalAvailableAmount;
    @XmlElementRef(name = "UPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> upbAmount;
    @XmlElement(name = "EXTENSION")
    protected REVERSEMORTGAGEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the reverseGrossLineOfCreditReserveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseGrossLineOfCreditReserveAmount() {
        return reverseGrossLineOfCreditReserveAmount;
    }

    /**
     * Sets the value of the reverseGrossLineOfCreditReserveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseGrossLineOfCreditReserveAmount(JAXBElement<MISMOAmount> value) {
        this.reverseGrossLineOfCreditReserveAmount = value;
    }

    /**
     * Gets the value of the reverseInitialPrincipalLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseInitialPrincipalLimitAmount() {
        return reverseInitialPrincipalLimitAmount;
    }

    /**
     * Sets the value of the reverseInitialPrincipalLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseInitialPrincipalLimitAmount(JAXBElement<MISMOAmount> value) {
        this.reverseInitialPrincipalLimitAmount = value;
    }

    /**
     * Gets the value of the reverseMortgageDisclosedMonthlyServicingFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseMortgageDisclosedMonthlyServicingFeeAmount() {
        return reverseMortgageDisclosedMonthlyServicingFeeAmount;
    }

    /**
     * Sets the value of the reverseMortgageDisclosedMonthlyServicingFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseMortgageDisclosedMonthlyServicingFeeAmount(JAXBElement<MISMOAmount> value) {
        this.reverseMortgageDisclosedMonthlyServicingFeeAmount = value;
    }

    /**
     * Gets the value of the reverseMortgageInitialAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseMortgageInitialAdvanceAmount() {
        return reverseMortgageInitialAdvanceAmount;
    }

    /**
     * Sets the value of the reverseMortgageInitialAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseMortgageInitialAdvanceAmount(JAXBElement<MISMOAmount> value) {
        this.reverseMortgageInitialAdvanceAmount = value;
    }

    /**
     * Gets the value of the reverseNetLineOfCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseNetLineOfCreditAmount() {
        return reverseNetLineOfCreditAmount;
    }

    /**
     * Sets the value of the reverseNetLineOfCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseNetLineOfCreditAmount(JAXBElement<MISMOAmount> value) {
        this.reverseNetLineOfCreditAmount = value;
    }

    /**
     * Gets the value of the reverseNetPrincipalLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseNetPrincipalLimitAmount() {
        return reverseNetPrincipalLimitAmount;
    }

    /**
     * Sets the value of the reverseNetPrincipalLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseNetPrincipalLimitAmount(JAXBElement<MISMOAmount> value) {
        this.reverseNetPrincipalLimitAmount = value;
    }

    /**
     * Gets the value of the reversePaymentPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReversePaymentPlanEnum }{@code >}
     *     
     */
    public JAXBElement<ReversePaymentPlanEnum> getReversePaymentPlanType() {
        return reversePaymentPlanType;
    }

    /**
     * Sets the value of the reversePaymentPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReversePaymentPlanEnum }{@code >}
     *     
     */
    public void setReversePaymentPlanType(JAXBElement<ReversePaymentPlanEnum> value) {
        this.reversePaymentPlanType = value;
    }

    /**
     * Gets the value of the reversePaymentPlanTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getReversePaymentPlanTypeOtherDescription() {
        return reversePaymentPlanTypeOtherDescription;
    }

    /**
     * Sets the value of the reversePaymentPlanTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setReversePaymentPlanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.reversePaymentPlanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the reversePaymentTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getReversePaymentTermMonthsCount() {
        return reversePaymentTermMonthsCount;
    }

    /**
     * Sets the value of the reversePaymentTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setReversePaymentTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.reversePaymentTermMonthsCount = value;
    }

    /**
     * Gets the value of the reverseScheduledPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseScheduledPaymentAmount() {
        return reverseScheduledPaymentAmount;
    }

    /**
     * Sets the value of the reverseScheduledPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseScheduledPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.reverseScheduledPaymentAmount = value;
    }

    /**
     * Gets the value of the reverseSetAsideFirstYearPropertyChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseSetAsideFirstYearPropertyChargesAmount() {
        return reverseSetAsideFirstYearPropertyChargesAmount;
    }

    /**
     * Sets the value of the reverseSetAsideFirstYearPropertyChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseSetAsideFirstYearPropertyChargesAmount(JAXBElement<MISMOAmount> value) {
        this.reverseSetAsideFirstYearPropertyChargesAmount = value;
    }

    /**
     * Gets the value of the reverseSetAsideTaxesAndInsuranceWithholdingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseSetAsideTaxesAndInsuranceWithholdingAmount() {
        return reverseSetAsideTaxesAndInsuranceWithholdingAmount;
    }

    /**
     * Sets the value of the reverseSetAsideTaxesAndInsuranceWithholdingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseSetAsideTaxesAndInsuranceWithholdingAmount(JAXBElement<MISMOAmount> value) {
        this.reverseSetAsideTaxesAndInsuranceWithholdingAmount = value;
    }

    /**
     * Gets the value of the reverseSetAsideTaxesAndInsuranceWithholdingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getReverseSetAsideTaxesAndInsuranceWithholdingEndDate() {
        return reverseSetAsideTaxesAndInsuranceWithholdingEndDate;
    }

    /**
     * Sets the value of the reverseSetAsideTaxesAndInsuranceWithholdingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setReverseSetAsideTaxesAndInsuranceWithholdingEndDate(JAXBElement<MISMODate> value) {
        this.reverseSetAsideTaxesAndInsuranceWithholdingEndDate = value;
    }

    /**
     * Gets the value of the reverseSetAsideTaxesAndInsuranceWithholdingRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getReverseSetAsideTaxesAndInsuranceWithholdingRatePercent() {
        return reverseSetAsideTaxesAndInsuranceWithholdingRatePercent;
    }

    /**
     * Sets the value of the reverseSetAsideTaxesAndInsuranceWithholdingRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setReverseSetAsideTaxesAndInsuranceWithholdingRatePercent(JAXBElement<MISMOPercent> value) {
        this.reverseSetAsideTaxesAndInsuranceWithholdingRatePercent = value;
    }

    /**
     * Gets the value of the reverseSetAsideTaxesAndInsuranceWithholdingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getReverseSetAsideTaxesAndInsuranceWithholdingStartDate() {
        return reverseSetAsideTaxesAndInsuranceWithholdingStartDate;
    }

    /**
     * Sets the value of the reverseSetAsideTaxesAndInsuranceWithholdingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setReverseSetAsideTaxesAndInsuranceWithholdingStartDate(JAXBElement<MISMODate> value) {
        this.reverseSetAsideTaxesAndInsuranceWithholdingStartDate = value;
    }

    /**
     * Gets the value of the reverseTotalAvailableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getReverseTotalAvailableAmount() {
        return reverseTotalAvailableAmount;
    }

    /**
     * Sets the value of the reverseTotalAvailableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setReverseTotalAvailableAmount(JAXBElement<MISMOAmount> value) {
        this.reverseTotalAvailableAmount = value;
    }

    /**
     * Gets the value of the upbAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUPBAmount() {
        return upbAmount;
    }

    /**
     * Sets the value of the upbAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUPBAmount(JAXBElement<MISMOAmount> value) {
        this.upbAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link REVERSEMORTGAGEEXTENSION }
     *     
     */
    public REVERSEMORTGAGEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link REVERSEMORTGAGEEXTENSION }
     *     
     */
    public void setEXTENSION(REVERSEMORTGAGEEXTENSION value) {
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
