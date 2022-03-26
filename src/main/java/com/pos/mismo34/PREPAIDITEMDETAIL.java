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
 * Information regarding the type of prepaid item and the associated per diem amounts.
 * 
 * <p>Java class for PREPAID_ITEM_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREPAID_ITEM_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BorrowerChosenProviderIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FeePaidToType" type="{http://www.mismo.org/residential/2009/schemas}FeePaidToEnum" minOccurs="0"/>
 *         &lt;element name="FeePaidToTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureLineNumberValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PrepaidItemActualTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemEstimatedTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemMonthlyAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemMonthsPaidCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemNumberOfDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPaidFromDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPaidThroughDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemCalculationMethodType" type="{http://www.mismo.org/residential/2009/schemas}PrepaidItemPerDiemCalculationMethodEnum" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemCalculationMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemPrintDecimalCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemRoundingDecimalCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemRoundingType" type="{http://www.mismo.org/residential/2009/schemas}PrepaidItemPerDiemRoundingEnum" minOccurs="0"/>
 *         &lt;element name="PrepaidItemPerDiemRoundingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PrepaidItemRefundableAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidItemRefundableConditionsDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PrepaidItemRefundableIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PrepaidItemType" type="{http://www.mismo.org/residential/2009/schemas}PrepaidItemEnum" minOccurs="0"/>
 *         &lt;element name="PrepaidItemTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RegulationZPointsAndFeesIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RequiredProviderOfServiceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PREPAID_ITEM_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PREPAID_ITEM_DETAIL", propOrder = {
    "borrowerChosenProviderIndicator",
    "feePaidToType",
    "feePaidToTypeOtherDescription",
    "integratedDisclosureLineNumberValue",
    "integratedDisclosureSectionType",
    "integratedDisclosureSectionTypeOtherDescription",
    "prepaidItemActualTotalAmount",
    "prepaidItemEstimatedTotalAmount",
    "prepaidItemMonthlyAmount",
    "prepaidItemMonthsPaidCount",
    "prepaidItemNumberOfDaysCount",
    "prepaidItemPaidFromDate",
    "prepaidItemPaidThroughDate",
    "prepaidItemPerDiemAmount",
    "prepaidItemPerDiemCalculationMethodType",
    "prepaidItemPerDiemCalculationMethodTypeOtherDescription",
    "prepaidItemPerDiemPrintDecimalCount",
    "prepaidItemPerDiemRoundingDecimalCount",
    "prepaidItemPerDiemRoundingType",
    "prepaidItemPerDiemRoundingTypeOtherDescription",
    "prepaidItemRefundableAmount",
    "prepaidItemRefundableConditionsDescription",
    "prepaidItemRefundableIndicator",
    "prepaidItemType",
    "prepaidItemTypeOtherDescription",
    "regulationZPointsAndFeesIndicator",
    "requiredProviderOfServiceIndicator",
    "extension"
})
public class PREPAIDITEMDETAIL {

    @XmlElementRef(name = "BorrowerChosenProviderIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> borrowerChosenProviderIndicator;
    @XmlElementRef(name = "FeePaidToType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FeePaidToEnum> feePaidToType;
    @XmlElementRef(name = "FeePaidToTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> feePaidToTypeOtherDescription;
    @XmlElementRef(name = "IntegratedDisclosureLineNumberValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> integratedDisclosureLineNumberValue;
    @XmlElementRef(name = "IntegratedDisclosureSectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSectionEnum> integratedDisclosureSectionType;
    @XmlElementRef(name = "IntegratedDisclosureSectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSectionTypeOtherDescription;
    @XmlElementRef(name = "PrepaidItemActualTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prepaidItemActualTotalAmount;
    @XmlElementRef(name = "PrepaidItemEstimatedTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prepaidItemEstimatedTotalAmount;
    @XmlElementRef(name = "PrepaidItemMonthlyAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prepaidItemMonthlyAmount;
    @XmlElementRef(name = "PrepaidItemMonthsPaidCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> prepaidItemMonthsPaidCount;
    @XmlElementRef(name = "PrepaidItemNumberOfDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> prepaidItemNumberOfDaysCount;
    @XmlElementRef(name = "PrepaidItemPaidFromDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> prepaidItemPaidFromDate;
    @XmlElementRef(name = "PrepaidItemPaidThroughDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> prepaidItemPaidThroughDate;
    @XmlElementRef(name = "PrepaidItemPerDiemAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prepaidItemPerDiemAmount;
    @XmlElementRef(name = "PrepaidItemPerDiemCalculationMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PrepaidItemPerDiemCalculationMethodEnum> prepaidItemPerDiemCalculationMethodType;
    @XmlElementRef(name = "PrepaidItemPerDiemCalculationMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> prepaidItemPerDiemCalculationMethodTypeOtherDescription;
    @XmlElementRef(name = "PrepaidItemPerDiemPrintDecimalCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> prepaidItemPerDiemPrintDecimalCount;
    @XmlElementRef(name = "PrepaidItemPerDiemRoundingDecimalCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> prepaidItemPerDiemRoundingDecimalCount;
    @XmlElementRef(name = "PrepaidItemPerDiemRoundingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PrepaidItemPerDiemRoundingEnum> prepaidItemPerDiemRoundingType;
    @XmlElementRef(name = "PrepaidItemPerDiemRoundingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> prepaidItemPerDiemRoundingTypeOtherDescription;
    @XmlElementRef(name = "PrepaidItemRefundableAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> prepaidItemRefundableAmount;
    @XmlElementRef(name = "PrepaidItemRefundableConditionsDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> prepaidItemRefundableConditionsDescription;
    @XmlElementRef(name = "PrepaidItemRefundableIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> prepaidItemRefundableIndicator;
    @XmlElementRef(name = "PrepaidItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PrepaidItemEnum> prepaidItemType;
    @XmlElementRef(name = "PrepaidItemTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> prepaidItemTypeOtherDescription;
    @XmlElementRef(name = "RegulationZPointsAndFeesIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> regulationZPointsAndFeesIndicator;
    @XmlElementRef(name = "RequiredProviderOfServiceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> requiredProviderOfServiceIndicator;
    @XmlElement(name = "EXTENSION")
    protected PREPAIDITEMDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the borrowerChosenProviderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getBorrowerChosenProviderIndicator() {
        return borrowerChosenProviderIndicator;
    }

    /**
     * Sets the value of the borrowerChosenProviderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setBorrowerChosenProviderIndicator(JAXBElement<MISMOIndicator> value) {
        this.borrowerChosenProviderIndicator = value;
    }

    /**
     * Gets the value of the feePaidToType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeePaidToEnum }{@code >}
     *     
     */
    public JAXBElement<FeePaidToEnum> getFeePaidToType() {
        return feePaidToType;
    }

    /**
     * Sets the value of the feePaidToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeePaidToEnum }{@code >}
     *     
     */
    public void setFeePaidToType(JAXBElement<FeePaidToEnum> value) {
        this.feePaidToType = value;
    }

    /**
     * Gets the value of the feePaidToTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getFeePaidToTypeOtherDescription() {
        return feePaidToTypeOtherDescription;
    }

    /**
     * Sets the value of the feePaidToTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setFeePaidToTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.feePaidToTypeOtherDescription = value;
    }

    /**
     * Gets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getIntegratedDisclosureLineNumberValue() {
        return integratedDisclosureLineNumberValue;
    }

    /**
     * Sets the value of the integratedDisclosureLineNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setIntegratedDisclosureLineNumberValue(JAXBElement<MISMOValue> value) {
        this.integratedDisclosureLineNumberValue = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSectionEnum> getIntegratedDisclosureSectionType() {
        return integratedDisclosureSectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionType(JAXBElement<IntegratedDisclosureSectionEnum> value) {
        this.integratedDisclosureSectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSectionTypeOtherDescription() {
        return integratedDisclosureSectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the prepaidItemActualTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrepaidItemActualTotalAmount() {
        return prepaidItemActualTotalAmount;
    }

    /**
     * Sets the value of the prepaidItemActualTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrepaidItemActualTotalAmount(JAXBElement<MISMOAmount> value) {
        this.prepaidItemActualTotalAmount = value;
    }

    /**
     * Gets the value of the prepaidItemEstimatedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrepaidItemEstimatedTotalAmount() {
        return prepaidItemEstimatedTotalAmount;
    }

    /**
     * Sets the value of the prepaidItemEstimatedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrepaidItemEstimatedTotalAmount(JAXBElement<MISMOAmount> value) {
        this.prepaidItemEstimatedTotalAmount = value;
    }

    /**
     * Gets the value of the prepaidItemMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrepaidItemMonthlyAmount() {
        return prepaidItemMonthlyAmount;
    }

    /**
     * Sets the value of the prepaidItemMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrepaidItemMonthlyAmount(JAXBElement<MISMOAmount> value) {
        this.prepaidItemMonthlyAmount = value;
    }

    /**
     * Gets the value of the prepaidItemMonthsPaidCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPrepaidItemMonthsPaidCount() {
        return prepaidItemMonthsPaidCount;
    }

    /**
     * Sets the value of the prepaidItemMonthsPaidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPrepaidItemMonthsPaidCount(JAXBElement<MISMOCount> value) {
        this.prepaidItemMonthsPaidCount = value;
    }

    /**
     * Gets the value of the prepaidItemNumberOfDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPrepaidItemNumberOfDaysCount() {
        return prepaidItemNumberOfDaysCount;
    }

    /**
     * Sets the value of the prepaidItemNumberOfDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPrepaidItemNumberOfDaysCount(JAXBElement<MISMOCount> value) {
        this.prepaidItemNumberOfDaysCount = value;
    }

    /**
     * Gets the value of the prepaidItemPaidFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getPrepaidItemPaidFromDate() {
        return prepaidItemPaidFromDate;
    }

    /**
     * Sets the value of the prepaidItemPaidFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setPrepaidItemPaidFromDate(JAXBElement<MISMODate> value) {
        this.prepaidItemPaidFromDate = value;
    }

    /**
     * Gets the value of the prepaidItemPaidThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getPrepaidItemPaidThroughDate() {
        return prepaidItemPaidThroughDate;
    }

    /**
     * Sets the value of the prepaidItemPaidThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setPrepaidItemPaidThroughDate(JAXBElement<MISMODate> value) {
        this.prepaidItemPaidThroughDate = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrepaidItemPerDiemAmount() {
        return prepaidItemPerDiemAmount;
    }

    /**
     * Sets the value of the prepaidItemPerDiemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemAmount(JAXBElement<MISMOAmount> value) {
        this.prepaidItemPerDiemAmount = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemCalculationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrepaidItemPerDiemCalculationMethodEnum }{@code >}
     *     
     */
    public JAXBElement<PrepaidItemPerDiemCalculationMethodEnum> getPrepaidItemPerDiemCalculationMethodType() {
        return prepaidItemPerDiemCalculationMethodType;
    }

    /**
     * Sets the value of the prepaidItemPerDiemCalculationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrepaidItemPerDiemCalculationMethodEnum }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemCalculationMethodType(JAXBElement<PrepaidItemPerDiemCalculationMethodEnum> value) {
        this.prepaidItemPerDiemCalculationMethodType = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemCalculationMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPrepaidItemPerDiemCalculationMethodTypeOtherDescription() {
        return prepaidItemPerDiemCalculationMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the prepaidItemPerDiemCalculationMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemCalculationMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.prepaidItemPerDiemCalculationMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemPrintDecimalCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPrepaidItemPerDiemPrintDecimalCount() {
        return prepaidItemPerDiemPrintDecimalCount;
    }

    /**
     * Sets the value of the prepaidItemPerDiemPrintDecimalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemPrintDecimalCount(JAXBElement<MISMOCount> value) {
        this.prepaidItemPerDiemPrintDecimalCount = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemRoundingDecimalCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPrepaidItemPerDiemRoundingDecimalCount() {
        return prepaidItemPerDiemRoundingDecimalCount;
    }

    /**
     * Sets the value of the prepaidItemPerDiemRoundingDecimalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemRoundingDecimalCount(JAXBElement<MISMOCount> value) {
        this.prepaidItemPerDiemRoundingDecimalCount = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemRoundingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrepaidItemPerDiemRoundingEnum }{@code >}
     *     
     */
    public JAXBElement<PrepaidItemPerDiemRoundingEnum> getPrepaidItemPerDiemRoundingType() {
        return prepaidItemPerDiemRoundingType;
    }

    /**
     * Sets the value of the prepaidItemPerDiemRoundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrepaidItemPerDiemRoundingEnum }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemRoundingType(JAXBElement<PrepaidItemPerDiemRoundingEnum> value) {
        this.prepaidItemPerDiemRoundingType = value;
    }

    /**
     * Gets the value of the prepaidItemPerDiemRoundingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPrepaidItemPerDiemRoundingTypeOtherDescription() {
        return prepaidItemPerDiemRoundingTypeOtherDescription;
    }

    /**
     * Sets the value of the prepaidItemPerDiemRoundingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPrepaidItemPerDiemRoundingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.prepaidItemPerDiemRoundingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the prepaidItemRefundableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPrepaidItemRefundableAmount() {
        return prepaidItemRefundableAmount;
    }

    /**
     * Sets the value of the prepaidItemRefundableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPrepaidItemRefundableAmount(JAXBElement<MISMOAmount> value) {
        this.prepaidItemRefundableAmount = value;
    }

    /**
     * Gets the value of the prepaidItemRefundableConditionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPrepaidItemRefundableConditionsDescription() {
        return prepaidItemRefundableConditionsDescription;
    }

    /**
     * Sets the value of the prepaidItemRefundableConditionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPrepaidItemRefundableConditionsDescription(JAXBElement<MISMOString> value) {
        this.prepaidItemRefundableConditionsDescription = value;
    }

    /**
     * Gets the value of the prepaidItemRefundableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPrepaidItemRefundableIndicator() {
        return prepaidItemRefundableIndicator;
    }

    /**
     * Sets the value of the prepaidItemRefundableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPrepaidItemRefundableIndicator(JAXBElement<MISMOIndicator> value) {
        this.prepaidItemRefundableIndicator = value;
    }

    /**
     * Gets the value of the prepaidItemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrepaidItemEnum }{@code >}
     *     
     */
    public JAXBElement<PrepaidItemEnum> getPrepaidItemType() {
        return prepaidItemType;
    }

    /**
     * Sets the value of the prepaidItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrepaidItemEnum }{@code >}
     *     
     */
    public void setPrepaidItemType(JAXBElement<PrepaidItemEnum> value) {
        this.prepaidItemType = value;
    }

    /**
     * Gets the value of the prepaidItemTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPrepaidItemTypeOtherDescription() {
        return prepaidItemTypeOtherDescription;
    }

    /**
     * Sets the value of the prepaidItemTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPrepaidItemTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.prepaidItemTypeOtherDescription = value;
    }

    /**
     * Gets the value of the regulationZPointsAndFeesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRegulationZPointsAndFeesIndicator() {
        return regulationZPointsAndFeesIndicator;
    }

    /**
     * Sets the value of the regulationZPointsAndFeesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRegulationZPointsAndFeesIndicator(JAXBElement<MISMOIndicator> value) {
        this.regulationZPointsAndFeesIndicator = value;
    }

    /**
     * Gets the value of the requiredProviderOfServiceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRequiredProviderOfServiceIndicator() {
        return requiredProviderOfServiceIndicator;
    }

    /**
     * Sets the value of the requiredProviderOfServiceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRequiredProviderOfServiceIndicator(JAXBElement<MISMOIndicator> value) {
        this.requiredProviderOfServiceIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PREPAIDITEMDETAILEXTENSION }
     *     
     */
    public PREPAIDITEMDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREPAIDITEMDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(PREPAIDITEMDETAILEXTENSION value) {
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
