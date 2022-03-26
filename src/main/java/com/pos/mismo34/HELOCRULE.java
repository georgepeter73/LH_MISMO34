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
 * <p>Java class for HELOC_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HELOC_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HELOCAnnualFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCCreditCardAccountIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="HELOCCreditCardIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HELOCCreditLineDrawAccessFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCDailyPeriodicInterestRateCalculationType" type="{http://www.mismo.org/residential/2009/schemas}HELOCDailyPeriodicInterestRateCalculationEnum" minOccurs="0"/>
 *         &lt;element name="HELOCInitialAdvanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCMaximumAPRPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="HELOCMaximumBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCMinimumAdvanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCMinimumPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCMinimumPaymentPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="HELOCRepayPeriodMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="HELOCReturnedCheckChargeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCStopPaymentChargeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCTeaserMarginRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="HELOCTeaserRateType" type="{http://www.mismo.org/residential/2009/schemas}HELOCTeaserRateEnum" minOccurs="0"/>
 *         &lt;element name="HELOCTeaserTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="HELOCTerminationFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HELOCTerminationPeriodMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HELOC_RULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HELOC_RULE", propOrder = {
    "helocAnnualFeeAmount",
    "helocCreditCardAccountIdentifier",
    "helocCreditCardIndicator",
    "helocCreditLineDrawAccessFeeAmount",
    "helocDailyPeriodicInterestRateCalculationType",
    "helocInitialAdvanceAmount",
    "helocMaximumAPRPercent",
    "helocMaximumBalanceAmount",
    "helocMinimumAdvanceAmount",
    "helocMinimumPaymentAmount",
    "helocMinimumPaymentPercent",
    "helocRepayPeriodMonthsCount",
    "helocReturnedCheckChargeAmount",
    "helocStopPaymentChargeAmount",
    "helocTeaserMarginRatePercent",
    "helocTeaserRateType",
    "helocTeaserTermMonthsCount",
    "helocTerminationFeeAmount",
    "helocTerminationPeriodMonthsCount",
    "extension"
})
public class HELOCRULE {

    @XmlElementRef(name = "HELOCAnnualFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocAnnualFeeAmount;
    @XmlElementRef(name = "HELOCCreditCardAccountIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> helocCreditCardAccountIdentifier;
    @XmlElementRef(name = "HELOCCreditCardIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> helocCreditCardIndicator;
    @XmlElementRef(name = "HELOCCreditLineDrawAccessFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocCreditLineDrawAccessFeeAmount;
    @XmlElementRef(name = "HELOCDailyPeriodicInterestRateCalculationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HELOCDailyPeriodicInterestRateCalculationEnum> helocDailyPeriodicInterestRateCalculationType;
    @XmlElementRef(name = "HELOCInitialAdvanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocInitialAdvanceAmount;
    @XmlElementRef(name = "HELOCMaximumAPRPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> helocMaximumAPRPercent;
    @XmlElementRef(name = "HELOCMaximumBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocMaximumBalanceAmount;
    @XmlElementRef(name = "HELOCMinimumAdvanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocMinimumAdvanceAmount;
    @XmlElementRef(name = "HELOCMinimumPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocMinimumPaymentAmount;
    @XmlElementRef(name = "HELOCMinimumPaymentPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> helocMinimumPaymentPercent;
    @XmlElementRef(name = "HELOCRepayPeriodMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> helocRepayPeriodMonthsCount;
    @XmlElementRef(name = "HELOCReturnedCheckChargeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocReturnedCheckChargeAmount;
    @XmlElementRef(name = "HELOCStopPaymentChargeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocStopPaymentChargeAmount;
    @XmlElementRef(name = "HELOCTeaserMarginRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> helocTeaserMarginRatePercent;
    @XmlElementRef(name = "HELOCTeaserRateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HELOCTeaserRateEnum> helocTeaserRateType;
    @XmlElementRef(name = "HELOCTeaserTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> helocTeaserTermMonthsCount;
    @XmlElementRef(name = "HELOCTerminationFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> helocTerminationFeeAmount;
    @XmlElementRef(name = "HELOCTerminationPeriodMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> helocTerminationPeriodMonthsCount;
    @XmlElement(name = "EXTENSION")
    protected HELOCRULEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the helocAnnualFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCAnnualFeeAmount() {
        return helocAnnualFeeAmount;
    }

    /**
     * Sets the value of the helocAnnualFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCAnnualFeeAmount(JAXBElement<MISMOAmount> value) {
        this.helocAnnualFeeAmount = value;
    }

    /**
     * Gets the value of the helocCreditCardAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getHELOCCreditCardAccountIdentifier() {
        return helocCreditCardAccountIdentifier;
    }

    /**
     * Sets the value of the helocCreditCardAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setHELOCCreditCardAccountIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.helocCreditCardAccountIdentifier = value;
    }

    /**
     * Gets the value of the helocCreditCardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHELOCCreditCardIndicator() {
        return helocCreditCardIndicator;
    }

    /**
     * Sets the value of the helocCreditCardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHELOCCreditCardIndicator(JAXBElement<MISMOIndicator> value) {
        this.helocCreditCardIndicator = value;
    }

    /**
     * Gets the value of the helocCreditLineDrawAccessFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCCreditLineDrawAccessFeeAmount() {
        return helocCreditLineDrawAccessFeeAmount;
    }

    /**
     * Sets the value of the helocCreditLineDrawAccessFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCCreditLineDrawAccessFeeAmount(JAXBElement<MISMOAmount> value) {
        this.helocCreditLineDrawAccessFeeAmount = value;
    }

    /**
     * Gets the value of the helocDailyPeriodicInterestRateCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HELOCDailyPeriodicInterestRateCalculationEnum }{@code >}
     *     
     */
    public JAXBElement<HELOCDailyPeriodicInterestRateCalculationEnum> getHELOCDailyPeriodicInterestRateCalculationType() {
        return helocDailyPeriodicInterestRateCalculationType;
    }

    /**
     * Sets the value of the helocDailyPeriodicInterestRateCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HELOCDailyPeriodicInterestRateCalculationEnum }{@code >}
     *     
     */
    public void setHELOCDailyPeriodicInterestRateCalculationType(JAXBElement<HELOCDailyPeriodicInterestRateCalculationEnum> value) {
        this.helocDailyPeriodicInterestRateCalculationType = value;
    }

    /**
     * Gets the value of the helocInitialAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCInitialAdvanceAmount() {
        return helocInitialAdvanceAmount;
    }

    /**
     * Sets the value of the helocInitialAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCInitialAdvanceAmount(JAXBElement<MISMOAmount> value) {
        this.helocInitialAdvanceAmount = value;
    }

    /**
     * Gets the value of the helocMaximumAPRPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getHELOCMaximumAPRPercent() {
        return helocMaximumAPRPercent;
    }

    /**
     * Sets the value of the helocMaximumAPRPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setHELOCMaximumAPRPercent(JAXBElement<MISMOPercent> value) {
        this.helocMaximumAPRPercent = value;
    }

    /**
     * Gets the value of the helocMaximumBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCMaximumBalanceAmount() {
        return helocMaximumBalanceAmount;
    }

    /**
     * Sets the value of the helocMaximumBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCMaximumBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.helocMaximumBalanceAmount = value;
    }

    /**
     * Gets the value of the helocMinimumAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCMinimumAdvanceAmount() {
        return helocMinimumAdvanceAmount;
    }

    /**
     * Sets the value of the helocMinimumAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCMinimumAdvanceAmount(JAXBElement<MISMOAmount> value) {
        this.helocMinimumAdvanceAmount = value;
    }

    /**
     * Gets the value of the helocMinimumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCMinimumPaymentAmount() {
        return helocMinimumPaymentAmount;
    }

    /**
     * Sets the value of the helocMinimumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCMinimumPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.helocMinimumPaymentAmount = value;
    }

    /**
     * Gets the value of the helocMinimumPaymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getHELOCMinimumPaymentPercent() {
        return helocMinimumPaymentPercent;
    }

    /**
     * Sets the value of the helocMinimumPaymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setHELOCMinimumPaymentPercent(JAXBElement<MISMOPercent> value) {
        this.helocMinimumPaymentPercent = value;
    }

    /**
     * Gets the value of the helocRepayPeriodMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getHELOCRepayPeriodMonthsCount() {
        return helocRepayPeriodMonthsCount;
    }

    /**
     * Sets the value of the helocRepayPeriodMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setHELOCRepayPeriodMonthsCount(JAXBElement<MISMOCount> value) {
        this.helocRepayPeriodMonthsCount = value;
    }

    /**
     * Gets the value of the helocReturnedCheckChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCReturnedCheckChargeAmount() {
        return helocReturnedCheckChargeAmount;
    }

    /**
     * Sets the value of the helocReturnedCheckChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCReturnedCheckChargeAmount(JAXBElement<MISMOAmount> value) {
        this.helocReturnedCheckChargeAmount = value;
    }

    /**
     * Gets the value of the helocStopPaymentChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCStopPaymentChargeAmount() {
        return helocStopPaymentChargeAmount;
    }

    /**
     * Sets the value of the helocStopPaymentChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCStopPaymentChargeAmount(JAXBElement<MISMOAmount> value) {
        this.helocStopPaymentChargeAmount = value;
    }

    /**
     * Gets the value of the helocTeaserMarginRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getHELOCTeaserMarginRatePercent() {
        return helocTeaserMarginRatePercent;
    }

    /**
     * Sets the value of the helocTeaserMarginRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setHELOCTeaserMarginRatePercent(JAXBElement<MISMOPercent> value) {
        this.helocTeaserMarginRatePercent = value;
    }

    /**
     * Gets the value of the helocTeaserRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HELOCTeaserRateEnum }{@code >}
     *     
     */
    public JAXBElement<HELOCTeaserRateEnum> getHELOCTeaserRateType() {
        return helocTeaserRateType;
    }

    /**
     * Sets the value of the helocTeaserRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HELOCTeaserRateEnum }{@code >}
     *     
     */
    public void setHELOCTeaserRateType(JAXBElement<HELOCTeaserRateEnum> value) {
        this.helocTeaserRateType = value;
    }

    /**
     * Gets the value of the helocTeaserTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getHELOCTeaserTermMonthsCount() {
        return helocTeaserTermMonthsCount;
    }

    /**
     * Sets the value of the helocTeaserTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setHELOCTeaserTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.helocTeaserTermMonthsCount = value;
    }

    /**
     * Gets the value of the helocTerminationFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHELOCTerminationFeeAmount() {
        return helocTerminationFeeAmount;
    }

    /**
     * Sets the value of the helocTerminationFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHELOCTerminationFeeAmount(JAXBElement<MISMOAmount> value) {
        this.helocTerminationFeeAmount = value;
    }

    /**
     * Gets the value of the helocTerminationPeriodMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getHELOCTerminationPeriodMonthsCount() {
        return helocTerminationPeriodMonthsCount;
    }

    /**
     * Sets the value of the helocTerminationPeriodMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setHELOCTerminationPeriodMonthsCount(JAXBElement<MISMOCount> value) {
        this.helocTerminationPeriodMonthsCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link HELOCRULEEXTENSION }
     *     
     */
    public HELOCRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HELOCRULEEXTENSION }
     *     
     */
    public void setEXTENSION(HELOCRULEEXTENSION value) {
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
