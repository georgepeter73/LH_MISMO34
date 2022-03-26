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
 * Information about the foreclosure status, methods and associated facts.
 * 
 * <p>Java class for FORECLOSURE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FORECLOSURE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveForeclosureIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="BidActualAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="BidMinimumAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="BidOpenAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DaysToForeclosureSaleCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="DeficiencyRightsPreservedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ForeclosureCaseDismissedReasonType" type="{http://www.mismo.org/residential/2009/schemas}ForeclosureCaseDismissedReasonEnum" minOccurs="0"/>
 *         &lt;element name="ForeclosureCaseDismissedReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ForeclosureCaseIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ForeclosureDelayIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ForeclosureFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ForeclosureMethodType" type="{http://www.mismo.org/residential/2009/schemas}ForeclosureMethodEnum" minOccurs="0"/>
 *         &lt;element name="ForeclosureMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ForeclosurePerformanceMaximumDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ForeclosureProcedureEndedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ForeclosureSaleProceedsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ForeclosureSaleProjectedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ForeclosureSaleTotalSubordinateLienholderPayoutAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="IRSLienNotificationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RedemptionExercisedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RedemptionPeriodExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RedemptionPeriodTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FORECLOSURE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FORECLOSURE_DETAIL", propOrder = {
    "activeForeclosureIndicator",
    "bidActualAmount",
    "bidMinimumAmount",
    "bidOpenAmount",
    "daysToForeclosureSaleCount",
    "deficiencyRightsPreservedIndicator",
    "foreclosureCaseDismissedReasonType",
    "foreclosureCaseDismissedReasonTypeOtherDescription",
    "foreclosureCaseIdentifier",
    "foreclosureDelayIndicator",
    "foreclosureFeeAmount",
    "foreclosureMethodType",
    "foreclosureMethodTypeOtherDescription",
    "foreclosurePerformanceMaximumDaysCount",
    "foreclosureProcedureEndedDate",
    "foreclosureSaleProceedsAmount",
    "foreclosureSaleProjectedDate",
    "foreclosureSaleTotalSubordinateLienholderPayoutAmount",
    "irsLienNotificationIndicator",
    "redemptionExercisedIndicator",
    "redemptionPeriodExpirationDate",
    "redemptionPeriodTermMonthsCount",
    "extension"
})
public class FORECLOSUREDETAIL {

    @XmlElementRef(name = "ActiveForeclosureIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> activeForeclosureIndicator;
    @XmlElementRef(name = "BidActualAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> bidActualAmount;
    @XmlElementRef(name = "BidMinimumAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> bidMinimumAmount;
    @XmlElementRef(name = "BidOpenAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> bidOpenAmount;
    @XmlElementRef(name = "DaysToForeclosureSaleCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> daysToForeclosureSaleCount;
    @XmlElementRef(name = "DeficiencyRightsPreservedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> deficiencyRightsPreservedIndicator;
    @XmlElementRef(name = "ForeclosureCaseDismissedReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ForeclosureCaseDismissedReasonEnum> foreclosureCaseDismissedReasonType;
    @XmlElementRef(name = "ForeclosureCaseDismissedReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> foreclosureCaseDismissedReasonTypeOtherDescription;
    @XmlElementRef(name = "ForeclosureCaseIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> foreclosureCaseIdentifier;
    @XmlElementRef(name = "ForeclosureDelayIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> foreclosureDelayIndicator;
    @XmlElementRef(name = "ForeclosureFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> foreclosureFeeAmount;
    @XmlElementRef(name = "ForeclosureMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ForeclosureMethodEnum> foreclosureMethodType;
    @XmlElementRef(name = "ForeclosureMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> foreclosureMethodTypeOtherDescription;
    @XmlElementRef(name = "ForeclosurePerformanceMaximumDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> foreclosurePerformanceMaximumDaysCount;
    @XmlElementRef(name = "ForeclosureProcedureEndedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> foreclosureProcedureEndedDate;
    @XmlElementRef(name = "ForeclosureSaleProceedsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> foreclosureSaleProceedsAmount;
    @XmlElementRef(name = "ForeclosureSaleProjectedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> foreclosureSaleProjectedDate;
    @XmlElementRef(name = "ForeclosureSaleTotalSubordinateLienholderPayoutAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> foreclosureSaleTotalSubordinateLienholderPayoutAmount;
    @XmlElementRef(name = "IRSLienNotificationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> irsLienNotificationIndicator;
    @XmlElementRef(name = "RedemptionExercisedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> redemptionExercisedIndicator;
    @XmlElementRef(name = "RedemptionPeriodExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> redemptionPeriodExpirationDate;
    @XmlElementRef(name = "RedemptionPeriodTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> redemptionPeriodTermMonthsCount;
    @XmlElement(name = "EXTENSION")
    protected FORECLOSUREDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the activeForeclosureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getActiveForeclosureIndicator() {
        return activeForeclosureIndicator;
    }

    /**
     * Sets the value of the activeForeclosureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setActiveForeclosureIndicator(JAXBElement<MISMOIndicator> value) {
        this.activeForeclosureIndicator = value;
    }

    /**
     * Gets the value of the bidActualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBidActualAmount() {
        return bidActualAmount;
    }

    /**
     * Sets the value of the bidActualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBidActualAmount(JAXBElement<MISMOAmount> value) {
        this.bidActualAmount = value;
    }

    /**
     * Gets the value of the bidMinimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBidMinimumAmount() {
        return bidMinimumAmount;
    }

    /**
     * Sets the value of the bidMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBidMinimumAmount(JAXBElement<MISMOAmount> value) {
        this.bidMinimumAmount = value;
    }

    /**
     * Gets the value of the bidOpenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBidOpenAmount() {
        return bidOpenAmount;
    }

    /**
     * Sets the value of the bidOpenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBidOpenAmount(JAXBElement<MISMOAmount> value) {
        this.bidOpenAmount = value;
    }

    /**
     * Gets the value of the daysToForeclosureSaleCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getDaysToForeclosureSaleCount() {
        return daysToForeclosureSaleCount;
    }

    /**
     * Sets the value of the daysToForeclosureSaleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setDaysToForeclosureSaleCount(JAXBElement<MISMOCount> value) {
        this.daysToForeclosureSaleCount = value;
    }

    /**
     * Gets the value of the deficiencyRightsPreservedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getDeficiencyRightsPreservedIndicator() {
        return deficiencyRightsPreservedIndicator;
    }

    /**
     * Sets the value of the deficiencyRightsPreservedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setDeficiencyRightsPreservedIndicator(JAXBElement<MISMOIndicator> value) {
        this.deficiencyRightsPreservedIndicator = value;
    }

    /**
     * Gets the value of the foreclosureCaseDismissedReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForeclosureCaseDismissedReasonEnum }{@code >}
     *     
     */
    public JAXBElement<ForeclosureCaseDismissedReasonEnum> getForeclosureCaseDismissedReasonType() {
        return foreclosureCaseDismissedReasonType;
    }

    /**
     * Sets the value of the foreclosureCaseDismissedReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForeclosureCaseDismissedReasonEnum }{@code >}
     *     
     */
    public void setForeclosureCaseDismissedReasonType(JAXBElement<ForeclosureCaseDismissedReasonEnum> value) {
        this.foreclosureCaseDismissedReasonType = value;
    }

    /**
     * Gets the value of the foreclosureCaseDismissedReasonTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getForeclosureCaseDismissedReasonTypeOtherDescription() {
        return foreclosureCaseDismissedReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the foreclosureCaseDismissedReasonTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setForeclosureCaseDismissedReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.foreclosureCaseDismissedReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the foreclosureCaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getForeclosureCaseIdentifier() {
        return foreclosureCaseIdentifier;
    }

    /**
     * Sets the value of the foreclosureCaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setForeclosureCaseIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.foreclosureCaseIdentifier = value;
    }

    /**
     * Gets the value of the foreclosureDelayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getForeclosureDelayIndicator() {
        return foreclosureDelayIndicator;
    }

    /**
     * Sets the value of the foreclosureDelayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setForeclosureDelayIndicator(JAXBElement<MISMOIndicator> value) {
        this.foreclosureDelayIndicator = value;
    }

    /**
     * Gets the value of the foreclosureFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getForeclosureFeeAmount() {
        return foreclosureFeeAmount;
    }

    /**
     * Sets the value of the foreclosureFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setForeclosureFeeAmount(JAXBElement<MISMOAmount> value) {
        this.foreclosureFeeAmount = value;
    }

    /**
     * Gets the value of the foreclosureMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForeclosureMethodEnum }{@code >}
     *     
     */
    public JAXBElement<ForeclosureMethodEnum> getForeclosureMethodType() {
        return foreclosureMethodType;
    }

    /**
     * Sets the value of the foreclosureMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForeclosureMethodEnum }{@code >}
     *     
     */
    public void setForeclosureMethodType(JAXBElement<ForeclosureMethodEnum> value) {
        this.foreclosureMethodType = value;
    }

    /**
     * Gets the value of the foreclosureMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getForeclosureMethodTypeOtherDescription() {
        return foreclosureMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the foreclosureMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setForeclosureMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.foreclosureMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the foreclosurePerformanceMaximumDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getForeclosurePerformanceMaximumDaysCount() {
        return foreclosurePerformanceMaximumDaysCount;
    }

    /**
     * Sets the value of the foreclosurePerformanceMaximumDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setForeclosurePerformanceMaximumDaysCount(JAXBElement<MISMOCount> value) {
        this.foreclosurePerformanceMaximumDaysCount = value;
    }

    /**
     * Gets the value of the foreclosureProcedureEndedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getForeclosureProcedureEndedDate() {
        return foreclosureProcedureEndedDate;
    }

    /**
     * Sets the value of the foreclosureProcedureEndedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setForeclosureProcedureEndedDate(JAXBElement<MISMODate> value) {
        this.foreclosureProcedureEndedDate = value;
    }

    /**
     * Gets the value of the foreclosureSaleProceedsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getForeclosureSaleProceedsAmount() {
        return foreclosureSaleProceedsAmount;
    }

    /**
     * Sets the value of the foreclosureSaleProceedsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setForeclosureSaleProceedsAmount(JAXBElement<MISMOAmount> value) {
        this.foreclosureSaleProceedsAmount = value;
    }

    /**
     * Gets the value of the foreclosureSaleProjectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getForeclosureSaleProjectedDate() {
        return foreclosureSaleProjectedDate;
    }

    /**
     * Sets the value of the foreclosureSaleProjectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setForeclosureSaleProjectedDate(JAXBElement<MISMODate> value) {
        this.foreclosureSaleProjectedDate = value;
    }

    /**
     * Gets the value of the foreclosureSaleTotalSubordinateLienholderPayoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getForeclosureSaleTotalSubordinateLienholderPayoutAmount() {
        return foreclosureSaleTotalSubordinateLienholderPayoutAmount;
    }

    /**
     * Sets the value of the foreclosureSaleTotalSubordinateLienholderPayoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setForeclosureSaleTotalSubordinateLienholderPayoutAmount(JAXBElement<MISMOAmount> value) {
        this.foreclosureSaleTotalSubordinateLienholderPayoutAmount = value;
    }

    /**
     * Gets the value of the irsLienNotificationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getIRSLienNotificationIndicator() {
        return irsLienNotificationIndicator;
    }

    /**
     * Sets the value of the irsLienNotificationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setIRSLienNotificationIndicator(JAXBElement<MISMOIndicator> value) {
        this.irsLienNotificationIndicator = value;
    }

    /**
     * Gets the value of the redemptionExercisedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRedemptionExercisedIndicator() {
        return redemptionExercisedIndicator;
    }

    /**
     * Sets the value of the redemptionExercisedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRedemptionExercisedIndicator(JAXBElement<MISMOIndicator> value) {
        this.redemptionExercisedIndicator = value;
    }

    /**
     * Gets the value of the redemptionPeriodExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getRedemptionPeriodExpirationDate() {
        return redemptionPeriodExpirationDate;
    }

    /**
     * Sets the value of the redemptionPeriodExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setRedemptionPeriodExpirationDate(JAXBElement<MISMODate> value) {
        this.redemptionPeriodExpirationDate = value;
    }

    /**
     * Gets the value of the redemptionPeriodTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getRedemptionPeriodTermMonthsCount() {
        return redemptionPeriodTermMonthsCount;
    }

    /**
     * Sets the value of the redemptionPeriodTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setRedemptionPeriodTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.redemptionPeriodTermMonthsCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FORECLOSUREDETAILEXTENSION }
     *     
     */
    public FORECLOSUREDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FORECLOSUREDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(FORECLOSUREDETAILEXTENSION value) {
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