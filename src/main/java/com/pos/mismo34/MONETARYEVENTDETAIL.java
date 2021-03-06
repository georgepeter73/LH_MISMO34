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
 * <p>Java class for MONETARY_EVENT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MONETARY_EVENT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanPartialPrepaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventAppliedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MonetaryEventBorrowerIncentiveCurtailmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventDeferredInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventDeferredPrincipalCurtailmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventDeferredUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MonetaryEventEscrowPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventExceptionInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventGrossInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventGrossPrincipalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventInterestBearingUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventInterestPaidThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MonetaryEventInvestorRemittanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventInvestorRemittanceEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MonetaryEventNetInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventNetPrincipalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventOptionalProductsPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventPaymentIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MonetaryEventReversalIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="MonetaryEventScheduledUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventSubsequentRecoveryAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventTotalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MonetaryEventType" type="{http://www.mismo.org/residential/2009/schemas}MonetaryEventEnum" minOccurs="0"/>
 *         &lt;element name="MonetaryEventTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MonetaryEventUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MONETARY_EVENT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MONETARY_EVENT_DETAIL", propOrder = {
    "loanPartialPrepaymentAmount",
    "monetaryEventAppliedDate",
    "monetaryEventBorrowerIncentiveCurtailmentAmount",
    "monetaryEventDeferredInterestAmount",
    "monetaryEventDeferredPrincipalCurtailmentAmount",
    "monetaryEventDeferredUPBAmount",
    "monetaryEventDueDate",
    "monetaryEventEscrowPaymentAmount",
    "monetaryEventExceptionInterestAmount",
    "monetaryEventGrossInterestAmount",
    "monetaryEventGrossPrincipalAmount",
    "monetaryEventInterestBearingUPBAmount",
    "monetaryEventInterestPaidThroughDate",
    "monetaryEventInvestorRemittanceAmount",
    "monetaryEventInvestorRemittanceEffectiveDate",
    "monetaryEventNetInterestAmount",
    "monetaryEventNetPrincipalAmount",
    "monetaryEventOptionalProductsPaymentAmount",
    "monetaryEventPaymentAmount",
    "monetaryEventPaymentIdentifier",
    "monetaryEventReversalIndicator",
    "monetaryEventScheduledUPBAmount",
    "monetaryEventSubsequentRecoveryAmount",
    "monetaryEventTotalPaymentAmount",
    "monetaryEventType",
    "monetaryEventTypeOtherDescription",
    "monetaryEventUPBAmount",
    "extension"
})
public class MONETARYEVENTDETAIL {

    @XmlElementRef(name = "LoanPartialPrepaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanPartialPrepaymentAmount;
    @XmlElementRef(name = "MonetaryEventAppliedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> monetaryEventAppliedDate;
    @XmlElementRef(name = "MonetaryEventBorrowerIncentiveCurtailmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventBorrowerIncentiveCurtailmentAmount;
    @XmlElementRef(name = "MonetaryEventDeferredInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventDeferredInterestAmount;
    @XmlElementRef(name = "MonetaryEventDeferredPrincipalCurtailmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventDeferredPrincipalCurtailmentAmount;
    @XmlElementRef(name = "MonetaryEventDeferredUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventDeferredUPBAmount;
    @XmlElementRef(name = "MonetaryEventDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> monetaryEventDueDate;
    @XmlElementRef(name = "MonetaryEventEscrowPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventEscrowPaymentAmount;
    @XmlElementRef(name = "MonetaryEventExceptionInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventExceptionInterestAmount;
    @XmlElementRef(name = "MonetaryEventGrossInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventGrossInterestAmount;
    @XmlElementRef(name = "MonetaryEventGrossPrincipalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventGrossPrincipalAmount;
    @XmlElementRef(name = "MonetaryEventInterestBearingUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventInterestBearingUPBAmount;
    @XmlElementRef(name = "MonetaryEventInterestPaidThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> monetaryEventInterestPaidThroughDate;
    @XmlElementRef(name = "MonetaryEventInvestorRemittanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventInvestorRemittanceAmount;
    @XmlElementRef(name = "MonetaryEventInvestorRemittanceEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> monetaryEventInvestorRemittanceEffectiveDate;
    @XmlElementRef(name = "MonetaryEventNetInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventNetInterestAmount;
    @XmlElementRef(name = "MonetaryEventNetPrincipalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventNetPrincipalAmount;
    @XmlElementRef(name = "MonetaryEventOptionalProductsPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventOptionalProductsPaymentAmount;
    @XmlElementRef(name = "MonetaryEventPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventPaymentAmount;
    @XmlElementRef(name = "MonetaryEventPaymentIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> monetaryEventPaymentIdentifier;
    @XmlElementRef(name = "MonetaryEventReversalIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> monetaryEventReversalIndicator;
    @XmlElementRef(name = "MonetaryEventScheduledUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventScheduledUPBAmount;
    @XmlElementRef(name = "MonetaryEventSubsequentRecoveryAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventSubsequentRecoveryAmount;
    @XmlElementRef(name = "MonetaryEventTotalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventTotalPaymentAmount;
    @XmlElementRef(name = "MonetaryEventType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryEventEnum> monetaryEventType;
    @XmlElementRef(name = "MonetaryEventTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> monetaryEventTypeOtherDescription;
    @XmlElementRef(name = "MonetaryEventUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> monetaryEventUPBAmount;
    @XmlElement(name = "EXTENSION")
    protected MONETARYEVENTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the loanPartialPrepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLoanPartialPrepaymentAmount() {
        return loanPartialPrepaymentAmount;
    }

    /**
     * Sets the value of the loanPartialPrepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLoanPartialPrepaymentAmount(JAXBElement<MISMOAmount> value) {
        this.loanPartialPrepaymentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventAppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getMonetaryEventAppliedDate() {
        return monetaryEventAppliedDate;
    }

    /**
     * Sets the value of the monetaryEventAppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setMonetaryEventAppliedDate(JAXBElement<MISMODate> value) {
        this.monetaryEventAppliedDate = value;
    }

    /**
     * Gets the value of the monetaryEventBorrowerIncentiveCurtailmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventBorrowerIncentiveCurtailmentAmount() {
        return monetaryEventBorrowerIncentiveCurtailmentAmount;
    }

    /**
     * Sets the value of the monetaryEventBorrowerIncentiveCurtailmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventBorrowerIncentiveCurtailmentAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventBorrowerIncentiveCurtailmentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventDeferredInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventDeferredInterestAmount() {
        return monetaryEventDeferredInterestAmount;
    }

    /**
     * Sets the value of the monetaryEventDeferredInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventDeferredInterestAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventDeferredInterestAmount = value;
    }

    /**
     * Gets the value of the monetaryEventDeferredPrincipalCurtailmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventDeferredPrincipalCurtailmentAmount() {
        return monetaryEventDeferredPrincipalCurtailmentAmount;
    }

    /**
     * Sets the value of the monetaryEventDeferredPrincipalCurtailmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventDeferredPrincipalCurtailmentAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventDeferredPrincipalCurtailmentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventDeferredUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventDeferredUPBAmount() {
        return monetaryEventDeferredUPBAmount;
    }

    /**
     * Sets the value of the monetaryEventDeferredUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventDeferredUPBAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventDeferredUPBAmount = value;
    }

    /**
     * Gets the value of the monetaryEventDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getMonetaryEventDueDate() {
        return monetaryEventDueDate;
    }

    /**
     * Sets the value of the monetaryEventDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setMonetaryEventDueDate(JAXBElement<MISMODate> value) {
        this.monetaryEventDueDate = value;
    }

    /**
     * Gets the value of the monetaryEventEscrowPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventEscrowPaymentAmount() {
        return monetaryEventEscrowPaymentAmount;
    }

    /**
     * Sets the value of the monetaryEventEscrowPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventEscrowPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventEscrowPaymentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventExceptionInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventExceptionInterestAmount() {
        return monetaryEventExceptionInterestAmount;
    }

    /**
     * Sets the value of the monetaryEventExceptionInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventExceptionInterestAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventExceptionInterestAmount = value;
    }

    /**
     * Gets the value of the monetaryEventGrossInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventGrossInterestAmount() {
        return monetaryEventGrossInterestAmount;
    }

    /**
     * Sets the value of the monetaryEventGrossInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventGrossInterestAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventGrossInterestAmount = value;
    }

    /**
     * Gets the value of the monetaryEventGrossPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventGrossPrincipalAmount() {
        return monetaryEventGrossPrincipalAmount;
    }

    /**
     * Sets the value of the monetaryEventGrossPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventGrossPrincipalAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventGrossPrincipalAmount = value;
    }

    /**
     * Gets the value of the monetaryEventInterestBearingUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventInterestBearingUPBAmount() {
        return monetaryEventInterestBearingUPBAmount;
    }

    /**
     * Sets the value of the monetaryEventInterestBearingUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventInterestBearingUPBAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventInterestBearingUPBAmount = value;
    }

    /**
     * Gets the value of the monetaryEventInterestPaidThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getMonetaryEventInterestPaidThroughDate() {
        return monetaryEventInterestPaidThroughDate;
    }

    /**
     * Sets the value of the monetaryEventInterestPaidThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setMonetaryEventInterestPaidThroughDate(JAXBElement<MISMODate> value) {
        this.monetaryEventInterestPaidThroughDate = value;
    }

    /**
     * Gets the value of the monetaryEventInvestorRemittanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventInvestorRemittanceAmount() {
        return monetaryEventInvestorRemittanceAmount;
    }

    /**
     * Sets the value of the monetaryEventInvestorRemittanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventInvestorRemittanceAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventInvestorRemittanceAmount = value;
    }

    /**
     * Gets the value of the monetaryEventInvestorRemittanceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getMonetaryEventInvestorRemittanceEffectiveDate() {
        return monetaryEventInvestorRemittanceEffectiveDate;
    }

    /**
     * Sets the value of the monetaryEventInvestorRemittanceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setMonetaryEventInvestorRemittanceEffectiveDate(JAXBElement<MISMODate> value) {
        this.monetaryEventInvestorRemittanceEffectiveDate = value;
    }

    /**
     * Gets the value of the monetaryEventNetInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventNetInterestAmount() {
        return monetaryEventNetInterestAmount;
    }

    /**
     * Sets the value of the monetaryEventNetInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventNetInterestAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventNetInterestAmount = value;
    }

    /**
     * Gets the value of the monetaryEventNetPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventNetPrincipalAmount() {
        return monetaryEventNetPrincipalAmount;
    }

    /**
     * Sets the value of the monetaryEventNetPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventNetPrincipalAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventNetPrincipalAmount = value;
    }

    /**
     * Gets the value of the monetaryEventOptionalProductsPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventOptionalProductsPaymentAmount() {
        return monetaryEventOptionalProductsPaymentAmount;
    }

    /**
     * Sets the value of the monetaryEventOptionalProductsPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventOptionalProductsPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventOptionalProductsPaymentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventPaymentAmount() {
        return monetaryEventPaymentAmount;
    }

    /**
     * Sets the value of the monetaryEventPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventPaymentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventPaymentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMonetaryEventPaymentIdentifier() {
        return monetaryEventPaymentIdentifier;
    }

    /**
     * Sets the value of the monetaryEventPaymentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMonetaryEventPaymentIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.monetaryEventPaymentIdentifier = value;
    }

    /**
     * Gets the value of the monetaryEventReversalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getMonetaryEventReversalIndicator() {
        return monetaryEventReversalIndicator;
    }

    /**
     * Sets the value of the monetaryEventReversalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setMonetaryEventReversalIndicator(JAXBElement<MISMOIndicator> value) {
        this.monetaryEventReversalIndicator = value;
    }

    /**
     * Gets the value of the monetaryEventScheduledUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventScheduledUPBAmount() {
        return monetaryEventScheduledUPBAmount;
    }

    /**
     * Sets the value of the monetaryEventScheduledUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventScheduledUPBAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventScheduledUPBAmount = value;
    }

    /**
     * Gets the value of the monetaryEventSubsequentRecoveryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventSubsequentRecoveryAmount() {
        return monetaryEventSubsequentRecoveryAmount;
    }

    /**
     * Sets the value of the monetaryEventSubsequentRecoveryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventSubsequentRecoveryAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventSubsequentRecoveryAmount = value;
    }

    /**
     * Gets the value of the monetaryEventTotalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventTotalPaymentAmount() {
        return monetaryEventTotalPaymentAmount;
    }

    /**
     * Sets the value of the monetaryEventTotalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventTotalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventTotalPaymentAmount = value;
    }

    /**
     * Gets the value of the monetaryEventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryEventEnum }{@code >}
     *     
     */
    public JAXBElement<MonetaryEventEnum> getMonetaryEventType() {
        return monetaryEventType;
    }

    /**
     * Sets the value of the monetaryEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryEventEnum }{@code >}
     *     
     */
    public void setMonetaryEventType(JAXBElement<MonetaryEventEnum> value) {
        this.monetaryEventType = value;
    }

    /**
     * Gets the value of the monetaryEventTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMonetaryEventTypeOtherDescription() {
        return monetaryEventTypeOtherDescription;
    }

    /**
     * Sets the value of the monetaryEventTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMonetaryEventTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.monetaryEventTypeOtherDescription = value;
    }

    /**
     * Gets the value of the monetaryEventUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMonetaryEventUPBAmount() {
        return monetaryEventUPBAmount;
    }

    /**
     * Sets the value of the monetaryEventUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMonetaryEventUPBAmount(JAXBElement<MISMOAmount> value) {
        this.monetaryEventUPBAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MONETARYEVENTDETAILEXTENSION }
     *     
     */
    public MONETARYEVENTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MONETARYEVENTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(MONETARYEVENTDETAILEXTENSION value) {
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
