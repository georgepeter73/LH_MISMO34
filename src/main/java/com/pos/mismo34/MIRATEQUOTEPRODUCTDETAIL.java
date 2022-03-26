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
 * Contains information specific to a particular product that is being returned on a rate quote response.
 * 
 * <p>Java class for MI_RATE_QUOTE_PRODUCT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_RATE_QUOTE_PRODUCT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseLoanAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="FiveYearCostComparisonAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="HousingCostOverFiveYearsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MIDurationType" type="{http://www.mismo.org/residential/2009/schemas}MIDurationEnum" minOccurs="0"/>
 *         &lt;element name="MIDurationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIEligibleIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="MIPremiumFinancedAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MIPremiumFinancedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="MIPremiumRefundableType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumRefundableEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumRefundableTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumSourceType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumSourceEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumUpfrontAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MIPremiumUpfrontPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MIProductDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIRateFoundIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="MIRenewalCalculationType" type="{http://www.mismo.org/residential/2009/schemas}MIRenewalCalculationEnum" minOccurs="0"/>
 *         &lt;element name="MIRenewalCalculationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_RATE_QUOTE_PRODUCT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_RATE_QUOTE_PRODUCT_DETAIL", propOrder = {
    "baseLoanAmount",
    "fiveYearCostComparisonAmount",
    "housingCostOverFiveYearsAmount",
    "miDurationType",
    "miDurationTypeOtherDescription",
    "miEligibleIndicator",
    "miPremiumFinancedAmount",
    "miPremiumFinancedIndicator",
    "miPremiumRefundableType",
    "miPremiumRefundableTypeOtherDescription",
    "miPremiumSourceType",
    "miPremiumSourceTypeOtherDescription",
    "miPremiumUpfrontAmount",
    "miPremiumUpfrontPercent",
    "miProductDescription",
    "miRateFoundIndicator",
    "miRenewalCalculationType",
    "miRenewalCalculationTypeOtherDescription",
    "extension"
})
public class MIRATEQUOTEPRODUCTDETAIL {

    @XmlElementRef(name = "BaseLoanAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> baseLoanAmount;
    @XmlElementRef(name = "FiveYearCostComparisonAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> fiveYearCostComparisonAmount;
    @XmlElementRef(name = "HousingCostOverFiveYearsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> housingCostOverFiveYearsAmount;
    @XmlElementRef(name = "MIDurationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIDurationEnum> miDurationType;
    @XmlElementRef(name = "MIDurationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miDurationTypeOtherDescription;
    @XmlElementRef(name = "MIEligibleIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> miEligibleIndicator;
    @XmlElementRef(name = "MIPremiumFinancedAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miPremiumFinancedAmount;
    @XmlElementRef(name = "MIPremiumFinancedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> miPremiumFinancedIndicator;
    @XmlElementRef(name = "MIPremiumRefundableType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumRefundableEnum> miPremiumRefundableType;
    @XmlElementRef(name = "MIPremiumRefundableTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumRefundableTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumSourceEnum> miPremiumSourceType;
    @XmlElementRef(name = "MIPremiumSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumSourceTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumUpfrontAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miPremiumUpfrontAmount;
    @XmlElementRef(name = "MIPremiumUpfrontPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> miPremiumUpfrontPercent;
    @XmlElementRef(name = "MIProductDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miProductDescription;
    @XmlElementRef(name = "MIRateFoundIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> miRateFoundIndicator;
    @XmlElementRef(name = "MIRenewalCalculationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIRenewalCalculationEnum> miRenewalCalculationType;
    @XmlElementRef(name = "MIRenewalCalculationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miRenewalCalculationTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected MIRATEQUOTEPRODUCTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the baseLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getBaseLoanAmount() {
        return baseLoanAmount;
    }

    /**
     * Sets the value of the baseLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setBaseLoanAmount(JAXBElement<MISMOAmount> value) {
        this.baseLoanAmount = value;
    }

    /**
     * Gets the value of the fiveYearCostComparisonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getFiveYearCostComparisonAmount() {
        return fiveYearCostComparisonAmount;
    }

    /**
     * Sets the value of the fiveYearCostComparisonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setFiveYearCostComparisonAmount(JAXBElement<MISMOAmount> value) {
        this.fiveYearCostComparisonAmount = value;
    }

    /**
     * Gets the value of the housingCostOverFiveYearsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getHousingCostOverFiveYearsAmount() {
        return housingCostOverFiveYearsAmount;
    }

    /**
     * Sets the value of the housingCostOverFiveYearsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setHousingCostOverFiveYearsAmount(JAXBElement<MISMOAmount> value) {
        this.housingCostOverFiveYearsAmount = value;
    }

    /**
     * Gets the value of the miDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIDurationEnum }{@code >}
     *     
     */
    public JAXBElement<MIDurationEnum> getMIDurationType() {
        return miDurationType;
    }

    /**
     * Sets the value of the miDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIDurationEnum }{@code >}
     *     
     */
    public void setMIDurationType(JAXBElement<MIDurationEnum> value) {
        this.miDurationType = value;
    }

    /**
     * Gets the value of the miDurationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIDurationTypeOtherDescription() {
        return miDurationTypeOtherDescription;
    }

    /**
     * Sets the value of the miDurationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIDurationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miDurationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getMIEligibleIndicator() {
        return miEligibleIndicator;
    }

    /**
     * Sets the value of the miEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setMIEligibleIndicator(JAXBElement<MISMOIndicator> value) {
        this.miEligibleIndicator = value;
    }

    /**
     * Gets the value of the miPremiumFinancedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIPremiumFinancedAmount() {
        return miPremiumFinancedAmount;
    }

    /**
     * Sets the value of the miPremiumFinancedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIPremiumFinancedAmount(JAXBElement<MISMOAmount> value) {
        this.miPremiumFinancedAmount = value;
    }

    /**
     * Gets the value of the miPremiumFinancedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getMIPremiumFinancedIndicator() {
        return miPremiumFinancedIndicator;
    }

    /**
     * Sets the value of the miPremiumFinancedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setMIPremiumFinancedIndicator(JAXBElement<MISMOIndicator> value) {
        this.miPremiumFinancedIndicator = value;
    }

    /**
     * Gets the value of the miPremiumRefundableType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRefundableEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumRefundableEnum> getMIPremiumRefundableType() {
        return miPremiumRefundableType;
    }

    /**
     * Sets the value of the miPremiumRefundableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRefundableEnum }{@code >}
     *     
     */
    public void setMIPremiumRefundableType(JAXBElement<MIPremiumRefundableEnum> value) {
        this.miPremiumRefundableType = value;
    }

    /**
     * Gets the value of the miPremiumRefundableTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumRefundableTypeOtherDescription() {
        return miPremiumRefundableTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumRefundableTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumRefundableTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumRefundableTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumSourceEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumSourceEnum> getMIPremiumSourceType() {
        return miPremiumSourceType;
    }

    /**
     * Sets the value of the miPremiumSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumSourceEnum }{@code >}
     *     
     */
    public void setMIPremiumSourceType(JAXBElement<MIPremiumSourceEnum> value) {
        this.miPremiumSourceType = value;
    }

    /**
     * Gets the value of the miPremiumSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumSourceTypeOtherDescription() {
        return miPremiumSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumUpfrontAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIPremiumUpfrontAmount() {
        return miPremiumUpfrontAmount;
    }

    /**
     * Sets the value of the miPremiumUpfrontAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIPremiumUpfrontAmount(JAXBElement<MISMOAmount> value) {
        this.miPremiumUpfrontAmount = value;
    }

    /**
     * Gets the value of the miPremiumUpfrontPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMIPremiumUpfrontPercent() {
        return miPremiumUpfrontPercent;
    }

    /**
     * Sets the value of the miPremiumUpfrontPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMIPremiumUpfrontPercent(JAXBElement<MISMOPercent> value) {
        this.miPremiumUpfrontPercent = value;
    }

    /**
     * Gets the value of the miProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIProductDescription() {
        return miProductDescription;
    }

    /**
     * Sets the value of the miProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIProductDescription(JAXBElement<MISMOString> value) {
        this.miProductDescription = value;
    }

    /**
     * Gets the value of the miRateFoundIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getMIRateFoundIndicator() {
        return miRateFoundIndicator;
    }

    /**
     * Sets the value of the miRateFoundIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setMIRateFoundIndicator(JAXBElement<MISMOIndicator> value) {
        this.miRateFoundIndicator = value;
    }

    /**
     * Gets the value of the miRenewalCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIRenewalCalculationEnum }{@code >}
     *     
     */
    public JAXBElement<MIRenewalCalculationEnum> getMIRenewalCalculationType() {
        return miRenewalCalculationType;
    }

    /**
     * Sets the value of the miRenewalCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIRenewalCalculationEnum }{@code >}
     *     
     */
    public void setMIRenewalCalculationType(JAXBElement<MIRenewalCalculationEnum> value) {
        this.miRenewalCalculationType = value;
    }

    /**
     * Gets the value of the miRenewalCalculationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIRenewalCalculationTypeOtherDescription() {
        return miRenewalCalculationTypeOtherDescription;
    }

    /**
     * Sets the value of the miRenewalCalculationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIRenewalCalculationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miRenewalCalculationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIRATEQUOTEPRODUCTDETAILEXTENSION }
     *     
     */
    public MIRATEQUOTEPRODUCTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIRATEQUOTEPRODUCTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(MIRATEQUOTEPRODUCTDETAILEXTENSION value) {
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
