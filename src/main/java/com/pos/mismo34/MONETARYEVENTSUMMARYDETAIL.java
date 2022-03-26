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
 * <p>Java class for MONETARY_EVENT_SUMMARY_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MONETARY_EVENT_SUMMARY_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryMonetaryEventBorrowerIncentiveCurtailmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventDeferredPrincipalCurtailmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventDeferredUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventEscrowPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventGrossInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventGrossPrincipalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventInterestBearingUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventInterestPaidThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventInvestorSpecialHandlingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventLastPaidInstallmentAppliedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventLastPaidInstallmentDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventNetInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventNetPrincipalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventOptionalProductsPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventScheduledUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryEventUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryInvestorRemittanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SummaryMonetaryInvestorRemittanceEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="SuspenseBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UnremittedOptionalProductsPremiumBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MONETARY_EVENT_SUMMARY_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MONETARY_EVENT_SUMMARY_DETAIL", propOrder = {
    "summaryMonetaryEventBorrowerIncentiveCurtailmentAmount",
    "summaryMonetaryEventDeferredPrincipalCurtailmentAmount",
    "summaryMonetaryEventDeferredUPBAmount",
    "summaryMonetaryEventEscrowPaymentAmount",
    "summaryMonetaryEventGrossInterestAmount",
    "summaryMonetaryEventGrossPrincipalAmount",
    "summaryMonetaryEventInterestBearingUPBAmount",
    "summaryMonetaryEventInterestPaidThroughDate",
    "summaryMonetaryEventInvestorSpecialHandlingDescription",
    "summaryMonetaryEventLastPaidInstallmentAppliedDate",
    "summaryMonetaryEventLastPaidInstallmentDueDate",
    "summaryMonetaryEventNetInterestAmount",
    "summaryMonetaryEventNetPrincipalAmount",
    "summaryMonetaryEventOptionalProductsPaymentAmount",
    "summaryMonetaryEventScheduledUPBAmount",
    "summaryMonetaryEventUPBAmount",
    "summaryMonetaryInvestorRemittanceAmount",
    "summaryMonetaryInvestorRemittanceEffectiveDate",
    "suspenseBalanceAmount",
    "unremittedOptionalProductsPremiumBalanceAmount",
    "extension"
})
public class MONETARYEVENTSUMMARYDETAIL {

    @XmlElementRef(name = "SummaryMonetaryEventBorrowerIncentiveCurtailmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventBorrowerIncentiveCurtailmentAmount;
    @XmlElementRef(name = "SummaryMonetaryEventDeferredPrincipalCurtailmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventDeferredPrincipalCurtailmentAmount;
    @XmlElementRef(name = "SummaryMonetaryEventDeferredUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventDeferredUPBAmount;
    @XmlElementRef(name = "SummaryMonetaryEventEscrowPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventEscrowPaymentAmount;
    @XmlElementRef(name = "SummaryMonetaryEventGrossInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventGrossInterestAmount;
    @XmlElementRef(name = "SummaryMonetaryEventGrossPrincipalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventGrossPrincipalAmount;
    @XmlElementRef(name = "SummaryMonetaryEventInterestBearingUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventInterestBearingUPBAmount;
    @XmlElementRef(name = "SummaryMonetaryEventInterestPaidThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> summaryMonetaryEventInterestPaidThroughDate;
    @XmlElementRef(name = "SummaryMonetaryEventInvestorSpecialHandlingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> summaryMonetaryEventInvestorSpecialHandlingDescription;
    @XmlElementRef(name = "SummaryMonetaryEventLastPaidInstallmentAppliedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> summaryMonetaryEventLastPaidInstallmentAppliedDate;
    @XmlElementRef(name = "SummaryMonetaryEventLastPaidInstallmentDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> summaryMonetaryEventLastPaidInstallmentDueDate;
    @XmlElementRef(name = "SummaryMonetaryEventNetInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventNetInterestAmount;
    @XmlElementRef(name = "SummaryMonetaryEventNetPrincipalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventNetPrincipalAmount;
    @XmlElementRef(name = "SummaryMonetaryEventOptionalProductsPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventOptionalProductsPaymentAmount;
    @XmlElementRef(name = "SummaryMonetaryEventScheduledUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventScheduledUPBAmount;
    @XmlElementRef(name = "SummaryMonetaryEventUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryEventUPBAmount;
    @XmlElementRef(name = "SummaryMonetaryInvestorRemittanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> summaryMonetaryInvestorRemittanceAmount;
    @XmlElementRef(name = "SummaryMonetaryInvestorRemittanceEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> summaryMonetaryInvestorRemittanceEffectiveDate;
    @XmlElementRef(name = "SuspenseBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> suspenseBalanceAmount;
    @XmlElementRef(name = "UnremittedOptionalProductsPremiumBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unremittedOptionalProductsPremiumBalanceAmount;
    @XmlElement(name = "EXTENSION")
    protected MONETARYEVENTSUMMARYDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the summaryMonetaryEventBorrowerIncentiveCurtailmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventBorrowerIncentiveCurtailmentAmount() {
        return summaryMonetaryEventBorrowerIncentiveCurtailmentAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventBorrowerIncentiveCurtailmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventBorrowerIncentiveCurtailmentAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventBorrowerIncentiveCurtailmentAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventDeferredPrincipalCurtailmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventDeferredPrincipalCurtailmentAmount() {
        return summaryMonetaryEventDeferredPrincipalCurtailmentAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventDeferredPrincipalCurtailmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventDeferredPrincipalCurtailmentAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventDeferredPrincipalCurtailmentAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventDeferredUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventDeferredUPBAmount() {
        return summaryMonetaryEventDeferredUPBAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventDeferredUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventDeferredUPBAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventDeferredUPBAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventEscrowPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventEscrowPaymentAmount() {
        return summaryMonetaryEventEscrowPaymentAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventEscrowPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventEscrowPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventEscrowPaymentAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventGrossInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventGrossInterestAmount() {
        return summaryMonetaryEventGrossInterestAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventGrossInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventGrossInterestAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventGrossInterestAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventGrossPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventGrossPrincipalAmount() {
        return summaryMonetaryEventGrossPrincipalAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventGrossPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventGrossPrincipalAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventGrossPrincipalAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventInterestBearingUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventInterestBearingUPBAmount() {
        return summaryMonetaryEventInterestBearingUPBAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventInterestBearingUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventInterestBearingUPBAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventInterestBearingUPBAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventInterestPaidThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getSummaryMonetaryEventInterestPaidThroughDate() {
        return summaryMonetaryEventInterestPaidThroughDate;
    }

    /**
     * Sets the value of the summaryMonetaryEventInterestPaidThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setSummaryMonetaryEventInterestPaidThroughDate(JAXBElement<MISMODate> value) {
        this.summaryMonetaryEventInterestPaidThroughDate = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventInvestorSpecialHandlingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSummaryMonetaryEventInvestorSpecialHandlingDescription() {
        return summaryMonetaryEventInvestorSpecialHandlingDescription;
    }

    /**
     * Sets the value of the summaryMonetaryEventInvestorSpecialHandlingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSummaryMonetaryEventInvestorSpecialHandlingDescription(JAXBElement<MISMOString> value) {
        this.summaryMonetaryEventInvestorSpecialHandlingDescription = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventLastPaidInstallmentAppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getSummaryMonetaryEventLastPaidInstallmentAppliedDate() {
        return summaryMonetaryEventLastPaidInstallmentAppliedDate;
    }

    /**
     * Sets the value of the summaryMonetaryEventLastPaidInstallmentAppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setSummaryMonetaryEventLastPaidInstallmentAppliedDate(JAXBElement<MISMODate> value) {
        this.summaryMonetaryEventLastPaidInstallmentAppliedDate = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventLastPaidInstallmentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getSummaryMonetaryEventLastPaidInstallmentDueDate() {
        return summaryMonetaryEventLastPaidInstallmentDueDate;
    }

    /**
     * Sets the value of the summaryMonetaryEventLastPaidInstallmentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setSummaryMonetaryEventLastPaidInstallmentDueDate(JAXBElement<MISMODate> value) {
        this.summaryMonetaryEventLastPaidInstallmentDueDate = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventNetInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventNetInterestAmount() {
        return summaryMonetaryEventNetInterestAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventNetInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventNetInterestAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventNetInterestAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventNetPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventNetPrincipalAmount() {
        return summaryMonetaryEventNetPrincipalAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventNetPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventNetPrincipalAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventNetPrincipalAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventOptionalProductsPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventOptionalProductsPaymentAmount() {
        return summaryMonetaryEventOptionalProductsPaymentAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventOptionalProductsPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventOptionalProductsPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventOptionalProductsPaymentAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventScheduledUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventScheduledUPBAmount() {
        return summaryMonetaryEventScheduledUPBAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventScheduledUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventScheduledUPBAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventScheduledUPBAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryEventUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryEventUPBAmount() {
        return summaryMonetaryEventUPBAmount;
    }

    /**
     * Sets the value of the summaryMonetaryEventUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryEventUPBAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryEventUPBAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryInvestorRemittanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSummaryMonetaryInvestorRemittanceAmount() {
        return summaryMonetaryInvestorRemittanceAmount;
    }

    /**
     * Sets the value of the summaryMonetaryInvestorRemittanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSummaryMonetaryInvestorRemittanceAmount(JAXBElement<MISMOAmount> value) {
        this.summaryMonetaryInvestorRemittanceAmount = value;
    }

    /**
     * Gets the value of the summaryMonetaryInvestorRemittanceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getSummaryMonetaryInvestorRemittanceEffectiveDate() {
        return summaryMonetaryInvestorRemittanceEffectiveDate;
    }

    /**
     * Sets the value of the summaryMonetaryInvestorRemittanceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setSummaryMonetaryInvestorRemittanceEffectiveDate(JAXBElement<MISMODate> value) {
        this.summaryMonetaryInvestorRemittanceEffectiveDate = value;
    }

    /**
     * Gets the value of the suspenseBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSuspenseBalanceAmount() {
        return suspenseBalanceAmount;
    }

    /**
     * Sets the value of the suspenseBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSuspenseBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.suspenseBalanceAmount = value;
    }

    /**
     * Gets the value of the unremittedOptionalProductsPremiumBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnremittedOptionalProductsPremiumBalanceAmount() {
        return unremittedOptionalProductsPremiumBalanceAmount;
    }

    /**
     * Sets the value of the unremittedOptionalProductsPremiumBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnremittedOptionalProductsPremiumBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.unremittedOptionalProductsPremiumBalanceAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MONETARYEVENTSUMMARYDETAILEXTENSION }
     *     
     */
    public MONETARYEVENTSUMMARYDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MONETARYEVENTSUMMARYDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(MONETARYEVENTSUMMARYDETAILEXTENSION value) {
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