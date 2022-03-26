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
 * Information regarding an automated valuation model including methodologies, outcomes and other facts. An AVM (Automated Valuation Model) uses electronic processes, mathematical formulas and property datasets to generate a property value estimate.
 * 
 * <p>Java class for AVM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVMCascadePreferenceIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AVMConfidenceLevelIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AVMConfidenceScoreIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AVMConfidenceScoreValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="AVMDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AVMHighValueRangeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AVMIndexType" type="{http://www.mismo.org/residential/2009/schemas}AVMIndexEnum" minOccurs="0"/>
 *         &lt;element name="AVMIndexTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AVMLowValueRangeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AVMMethodType" type="{http://www.mismo.org/residential/2009/schemas}AVMMethodEnum" minOccurs="0"/>
 *         &lt;element name="AVMMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AVMModelEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AVMModelNameType" type="{http://www.mismo.org/residential/2009/schemas}AVMModelNameEnum" minOccurs="0"/>
 *         &lt;element name="AVMModelNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AVMOutcomeType" type="{http://www.mismo.org/residential/2009/schemas}AVMOutcomeEnum" minOccurs="0"/>
 *         &lt;element name="AVMOutcomeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AVMServiceProviderName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AVMValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ForecastStandardDeviationScoreValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="ForecastStandardDeviationScoringModelName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ValuationRequestCascadeRuleIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ValuationRequestCascadingReturnType" type="{http://www.mismo.org/residential/2009/schemas}ValuationRequestCascadingReturnEnum" minOccurs="0"/>
 *         &lt;element name="ValuationRequestCascadingReturnTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AVM_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVM", propOrder = {
    "avmCascadePreferenceIdentifier",
    "avmConfidenceLevelIdentifier",
    "avmConfidenceScoreIndicator",
    "avmConfidenceScoreValue",
    "avmDate",
    "avmHighValueRangeAmount",
    "avmIndexType",
    "avmIndexTypeOtherDescription",
    "avmLowValueRangeAmount",
    "avmMethodType",
    "avmMethodTypeOtherDescription",
    "avmModelEffectiveDate",
    "avmModelNameType",
    "avmModelNameTypeOtherDescription",
    "avmOutcomeType",
    "avmOutcomeTypeOtherDescription",
    "avmServiceProviderName",
    "avmValueAmount",
    "forecastStandardDeviationScoreValue",
    "forecastStandardDeviationScoringModelName",
    "valuationRequestCascadeRuleIdentifier",
    "valuationRequestCascadingReturnType",
    "valuationRequestCascadingReturnTypeOtherDescription",
    "extension"
})
public class AVM {

    @XmlElementRef(name = "AVMCascadePreferenceIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> avmCascadePreferenceIdentifier;
    @XmlElementRef(name = "AVMConfidenceLevelIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> avmConfidenceLevelIdentifier;
    @XmlElementRef(name = "AVMConfidenceScoreIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> avmConfidenceScoreIndicator;
    @XmlElementRef(name = "AVMConfidenceScoreValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> avmConfidenceScoreValue;
    @XmlElementRef(name = "AVMDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> avmDate;
    @XmlElementRef(name = "AVMHighValueRangeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> avmHighValueRangeAmount;
    @XmlElementRef(name = "AVMIndexType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AVMIndexEnum> avmIndexType;
    @XmlElementRef(name = "AVMIndexTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> avmIndexTypeOtherDescription;
    @XmlElementRef(name = "AVMLowValueRangeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> avmLowValueRangeAmount;
    @XmlElementRef(name = "AVMMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AVMMethodEnum> avmMethodType;
    @XmlElementRef(name = "AVMMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> avmMethodTypeOtherDescription;
    @XmlElementRef(name = "AVMModelEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> avmModelEffectiveDate;
    @XmlElementRef(name = "AVMModelNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AVMModelNameEnum> avmModelNameType;
    @XmlElementRef(name = "AVMModelNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> avmModelNameTypeOtherDescription;
    @XmlElementRef(name = "AVMOutcomeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AVMOutcomeEnum> avmOutcomeType;
    @XmlElementRef(name = "AVMOutcomeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> avmOutcomeTypeOtherDescription;
    @XmlElementRef(name = "AVMServiceProviderName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> avmServiceProviderName;
    @XmlElementRef(name = "AVMValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> avmValueAmount;
    @XmlElementRef(name = "ForecastStandardDeviationScoreValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> forecastStandardDeviationScoreValue;
    @XmlElementRef(name = "ForecastStandardDeviationScoringModelName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> forecastStandardDeviationScoringModelName;
    @XmlElementRef(name = "ValuationRequestCascadeRuleIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> valuationRequestCascadeRuleIdentifier;
    @XmlElementRef(name = "ValuationRequestCascadingReturnType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuationRequestCascadingReturnEnum> valuationRequestCascadingReturnType;
    @XmlElementRef(name = "ValuationRequestCascadingReturnTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationRequestCascadingReturnTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected AVMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the avmCascadePreferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAVMCascadePreferenceIdentifier() {
        return avmCascadePreferenceIdentifier;
    }

    /**
     * Sets the value of the avmCascadePreferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAVMCascadePreferenceIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.avmCascadePreferenceIdentifier = value;
    }

    /**
     * Gets the value of the avmConfidenceLevelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAVMConfidenceLevelIdentifier() {
        return avmConfidenceLevelIdentifier;
    }

    /**
     * Sets the value of the avmConfidenceLevelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAVMConfidenceLevelIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.avmConfidenceLevelIdentifier = value;
    }

    /**
     * Gets the value of the avmConfidenceScoreIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAVMConfidenceScoreIndicator() {
        return avmConfidenceScoreIndicator;
    }

    /**
     * Sets the value of the avmConfidenceScoreIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAVMConfidenceScoreIndicator(JAXBElement<MISMOIndicator> value) {
        this.avmConfidenceScoreIndicator = value;
    }

    /**
     * Gets the value of the avmConfidenceScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getAVMConfidenceScoreValue() {
        return avmConfidenceScoreValue;
    }

    /**
     * Sets the value of the avmConfidenceScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setAVMConfidenceScoreValue(JAXBElement<MISMOValue> value) {
        this.avmConfidenceScoreValue = value;
    }

    /**
     * Gets the value of the avmDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAVMDate() {
        return avmDate;
    }

    /**
     * Sets the value of the avmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAVMDate(JAXBElement<MISMODate> value) {
        this.avmDate = value;
    }

    /**
     * Gets the value of the avmHighValueRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAVMHighValueRangeAmount() {
        return avmHighValueRangeAmount;
    }

    /**
     * Sets the value of the avmHighValueRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAVMHighValueRangeAmount(JAXBElement<MISMOAmount> value) {
        this.avmHighValueRangeAmount = value;
    }

    /**
     * Gets the value of the avmIndexType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVMIndexEnum }{@code >}
     *     
     */
    public JAXBElement<AVMIndexEnum> getAVMIndexType() {
        return avmIndexType;
    }

    /**
     * Sets the value of the avmIndexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVMIndexEnum }{@code >}
     *     
     */
    public void setAVMIndexType(JAXBElement<AVMIndexEnum> value) {
        this.avmIndexType = value;
    }

    /**
     * Gets the value of the avmIndexTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAVMIndexTypeOtherDescription() {
        return avmIndexTypeOtherDescription;
    }

    /**
     * Sets the value of the avmIndexTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAVMIndexTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.avmIndexTypeOtherDescription = value;
    }

    /**
     * Gets the value of the avmLowValueRangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAVMLowValueRangeAmount() {
        return avmLowValueRangeAmount;
    }

    /**
     * Sets the value of the avmLowValueRangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAVMLowValueRangeAmount(JAXBElement<MISMOAmount> value) {
        this.avmLowValueRangeAmount = value;
    }

    /**
     * Gets the value of the avmMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVMMethodEnum }{@code >}
     *     
     */
    public JAXBElement<AVMMethodEnum> getAVMMethodType() {
        return avmMethodType;
    }

    /**
     * Sets the value of the avmMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVMMethodEnum }{@code >}
     *     
     */
    public void setAVMMethodType(JAXBElement<AVMMethodEnum> value) {
        this.avmMethodType = value;
    }

    /**
     * Gets the value of the avmMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAVMMethodTypeOtherDescription() {
        return avmMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the avmMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAVMMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.avmMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the avmModelEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAVMModelEffectiveDate() {
        return avmModelEffectiveDate;
    }

    /**
     * Sets the value of the avmModelEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAVMModelEffectiveDate(JAXBElement<MISMODate> value) {
        this.avmModelEffectiveDate = value;
    }

    /**
     * Gets the value of the avmModelNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVMModelNameEnum }{@code >}
     *     
     */
    public JAXBElement<AVMModelNameEnum> getAVMModelNameType() {
        return avmModelNameType;
    }

    /**
     * Sets the value of the avmModelNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVMModelNameEnum }{@code >}
     *     
     */
    public void setAVMModelNameType(JAXBElement<AVMModelNameEnum> value) {
        this.avmModelNameType = value;
    }

    /**
     * Gets the value of the avmModelNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAVMModelNameTypeOtherDescription() {
        return avmModelNameTypeOtherDescription;
    }

    /**
     * Sets the value of the avmModelNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAVMModelNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.avmModelNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the avmOutcomeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVMOutcomeEnum }{@code >}
     *     
     */
    public JAXBElement<AVMOutcomeEnum> getAVMOutcomeType() {
        return avmOutcomeType;
    }

    /**
     * Sets the value of the avmOutcomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVMOutcomeEnum }{@code >}
     *     
     */
    public void setAVMOutcomeType(JAXBElement<AVMOutcomeEnum> value) {
        this.avmOutcomeType = value;
    }

    /**
     * Gets the value of the avmOutcomeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAVMOutcomeTypeOtherDescription() {
        return avmOutcomeTypeOtherDescription;
    }

    /**
     * Sets the value of the avmOutcomeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAVMOutcomeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.avmOutcomeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the avmServiceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAVMServiceProviderName() {
        return avmServiceProviderName;
    }

    /**
     * Sets the value of the avmServiceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAVMServiceProviderName(JAXBElement<MISMOString> value) {
        this.avmServiceProviderName = value;
    }

    /**
     * Gets the value of the avmValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAVMValueAmount() {
        return avmValueAmount;
    }

    /**
     * Sets the value of the avmValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAVMValueAmount(JAXBElement<MISMOAmount> value) {
        this.avmValueAmount = value;
    }

    /**
     * Gets the value of the forecastStandardDeviationScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getForecastStandardDeviationScoreValue() {
        return forecastStandardDeviationScoreValue;
    }

    /**
     * Sets the value of the forecastStandardDeviationScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setForecastStandardDeviationScoreValue(JAXBElement<MISMOValue> value) {
        this.forecastStandardDeviationScoreValue = value;
    }

    /**
     * Gets the value of the forecastStandardDeviationScoringModelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getForecastStandardDeviationScoringModelName() {
        return forecastStandardDeviationScoringModelName;
    }

    /**
     * Sets the value of the forecastStandardDeviationScoringModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setForecastStandardDeviationScoringModelName(JAXBElement<MISMOString> value) {
        this.forecastStandardDeviationScoringModelName = value;
    }

    /**
     * Gets the value of the valuationRequestCascadeRuleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getValuationRequestCascadeRuleIdentifier() {
        return valuationRequestCascadeRuleIdentifier;
    }

    /**
     * Sets the value of the valuationRequestCascadeRuleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setValuationRequestCascadeRuleIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.valuationRequestCascadeRuleIdentifier = value;
    }

    /**
     * Gets the value of the valuationRequestCascadingReturnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuationRequestCascadingReturnEnum }{@code >}
     *     
     */
    public JAXBElement<ValuationRequestCascadingReturnEnum> getValuationRequestCascadingReturnType() {
        return valuationRequestCascadingReturnType;
    }

    /**
     * Sets the value of the valuationRequestCascadingReturnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuationRequestCascadingReturnEnum }{@code >}
     *     
     */
    public void setValuationRequestCascadingReturnType(JAXBElement<ValuationRequestCascadingReturnEnum> value) {
        this.valuationRequestCascadingReturnType = value;
    }

    /**
     * Gets the value of the valuationRequestCascadingReturnTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationRequestCascadingReturnTypeOtherDescription() {
        return valuationRequestCascadingReturnTypeOtherDescription;
    }

    /**
     * Sets the value of the valuationRequestCascadingReturnTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationRequestCascadingReturnTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.valuationRequestCascadingReturnTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AVMEXTENSION }
     *     
     */
    public AVMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVMEXTENSION }
     *     
     */
    public void setEXTENSION(AVMEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
