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
 * <p>Java class for URLA_TOTAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="URLA_TOTAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URLATotalAssetsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalBaseIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalBonusIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalCashFromToBorrowerAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalCombinedPresentHousingExpenseAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalCombinedProposedHousingExpenseAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalCommissionsIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalDividendsInterestIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalDueFromBorrowerAtClosingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalLiabilityMonthlyPaymentsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalLiabilityUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalLotAndImprovementsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalMonthlyIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalNetRentalIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalNetWorthAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalOtherTypesOfIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalOvertimeIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalREOLienInstallmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalREOLienUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalREOMaintenanceExpenseAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalREOMarketValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalREORentalIncomeGrossAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalREORentalIncomeNetAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="URLATotalTransactionCostAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}URLA_TOTAL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "URLA_TOTAL", propOrder = {
    "urlaTotalAssetsAmount",
    "urlaTotalBaseIncomeAmount",
    "urlaTotalBonusIncomeAmount",
    "urlaTotalCashFromToBorrowerAmount",
    "urlaTotalCombinedPresentHousingExpenseAmount",
    "urlaTotalCombinedProposedHousingExpenseAmount",
    "urlaTotalCommissionsIncomeAmount",
    "urlaTotalDividendsInterestIncomeAmount",
    "urlaTotalDueFromBorrowerAtClosingAmount",
    "urlaTotalLiabilityMonthlyPaymentsAmount",
    "urlaTotalLiabilityUPBAmount",
    "urlaTotalLotAndImprovementsAmount",
    "urlaTotalMonthlyIncomeAmount",
    "urlaTotalNetRentalIncomeAmount",
    "urlaTotalNetWorthAmount",
    "urlaTotalOtherTypesOfIncomeAmount",
    "urlaTotalOvertimeIncomeAmount",
    "urlaTotalREOLienInstallmentAmount",
    "urlaTotalREOLienUPBAmount",
    "urlaTotalREOMaintenanceExpenseAmount",
    "urlaTotalREOMarketValueAmount",
    "urlaTotalREORentalIncomeGrossAmount",
    "urlaTotalREORentalIncomeNetAmount",
    "urlaTotalTransactionCostAmount",
    "extension"
})
public class URLATOTAL {

    @XmlElementRef(name = "URLATotalAssetsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalAssetsAmount;
    @XmlElementRef(name = "URLATotalBaseIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalBaseIncomeAmount;
    @XmlElementRef(name = "URLATotalBonusIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalBonusIncomeAmount;
    @XmlElementRef(name = "URLATotalCashFromToBorrowerAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalCashFromToBorrowerAmount;
    @XmlElementRef(name = "URLATotalCombinedPresentHousingExpenseAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalCombinedPresentHousingExpenseAmount;
    @XmlElementRef(name = "URLATotalCombinedProposedHousingExpenseAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalCombinedProposedHousingExpenseAmount;
    @XmlElementRef(name = "URLATotalCommissionsIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalCommissionsIncomeAmount;
    @XmlElementRef(name = "URLATotalDividendsInterestIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalDividendsInterestIncomeAmount;
    @XmlElementRef(name = "URLATotalDueFromBorrowerAtClosingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalDueFromBorrowerAtClosingAmount;
    @XmlElementRef(name = "URLATotalLiabilityMonthlyPaymentsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalLiabilityMonthlyPaymentsAmount;
    @XmlElementRef(name = "URLATotalLiabilityUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalLiabilityUPBAmount;
    @XmlElementRef(name = "URLATotalLotAndImprovementsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalLotAndImprovementsAmount;
    @XmlElementRef(name = "URLATotalMonthlyIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalMonthlyIncomeAmount;
    @XmlElementRef(name = "URLATotalNetRentalIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalNetRentalIncomeAmount;
    @XmlElementRef(name = "URLATotalNetWorthAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalNetWorthAmount;
    @XmlElementRef(name = "URLATotalOtherTypesOfIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalOtherTypesOfIncomeAmount;
    @XmlElementRef(name = "URLATotalOvertimeIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalOvertimeIncomeAmount;
    @XmlElementRef(name = "URLATotalREOLienInstallmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalREOLienInstallmentAmount;
    @XmlElementRef(name = "URLATotalREOLienUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalREOLienUPBAmount;
    @XmlElementRef(name = "URLATotalREOMaintenanceExpenseAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalREOMaintenanceExpenseAmount;
    @XmlElementRef(name = "URLATotalREOMarketValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalREOMarketValueAmount;
    @XmlElementRef(name = "URLATotalREORentalIncomeGrossAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalREORentalIncomeGrossAmount;
    @XmlElementRef(name = "URLATotalREORentalIncomeNetAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalREORentalIncomeNetAmount;
    @XmlElementRef(name = "URLATotalTransactionCostAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> urlaTotalTransactionCostAmount;
    @XmlElement(name = "EXTENSION")
    protected URLATOTALEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the urlaTotalAssetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalAssetsAmount() {
        return urlaTotalAssetsAmount;
    }

    /**
     * Sets the value of the urlaTotalAssetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalAssetsAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalAssetsAmount = value;
    }

    /**
     * Gets the value of the urlaTotalBaseIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalBaseIncomeAmount() {
        return urlaTotalBaseIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalBaseIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalBaseIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalBaseIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalBonusIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalBonusIncomeAmount() {
        return urlaTotalBonusIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalBonusIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalBonusIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalBonusIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalCashFromToBorrowerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalCashFromToBorrowerAmount() {
        return urlaTotalCashFromToBorrowerAmount;
    }

    /**
     * Sets the value of the urlaTotalCashFromToBorrowerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalCashFromToBorrowerAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalCashFromToBorrowerAmount = value;
    }

    /**
     * Gets the value of the urlaTotalCombinedPresentHousingExpenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalCombinedPresentHousingExpenseAmount() {
        return urlaTotalCombinedPresentHousingExpenseAmount;
    }

    /**
     * Sets the value of the urlaTotalCombinedPresentHousingExpenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalCombinedPresentHousingExpenseAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalCombinedPresentHousingExpenseAmount = value;
    }

    /**
     * Gets the value of the urlaTotalCombinedProposedHousingExpenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalCombinedProposedHousingExpenseAmount() {
        return urlaTotalCombinedProposedHousingExpenseAmount;
    }

    /**
     * Sets the value of the urlaTotalCombinedProposedHousingExpenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalCombinedProposedHousingExpenseAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalCombinedProposedHousingExpenseAmount = value;
    }

    /**
     * Gets the value of the urlaTotalCommissionsIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalCommissionsIncomeAmount() {
        return urlaTotalCommissionsIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalCommissionsIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalCommissionsIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalCommissionsIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalDividendsInterestIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalDividendsInterestIncomeAmount() {
        return urlaTotalDividendsInterestIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalDividendsInterestIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalDividendsInterestIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalDividendsInterestIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalDueFromBorrowerAtClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalDueFromBorrowerAtClosingAmount() {
        return urlaTotalDueFromBorrowerAtClosingAmount;
    }

    /**
     * Sets the value of the urlaTotalDueFromBorrowerAtClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalDueFromBorrowerAtClosingAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalDueFromBorrowerAtClosingAmount = value;
    }

    /**
     * Gets the value of the urlaTotalLiabilityMonthlyPaymentsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalLiabilityMonthlyPaymentsAmount() {
        return urlaTotalLiabilityMonthlyPaymentsAmount;
    }

    /**
     * Sets the value of the urlaTotalLiabilityMonthlyPaymentsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalLiabilityMonthlyPaymentsAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalLiabilityMonthlyPaymentsAmount = value;
    }

    /**
     * Gets the value of the urlaTotalLiabilityUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalLiabilityUPBAmount() {
        return urlaTotalLiabilityUPBAmount;
    }

    /**
     * Sets the value of the urlaTotalLiabilityUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalLiabilityUPBAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalLiabilityUPBAmount = value;
    }

    /**
     * Gets the value of the urlaTotalLotAndImprovementsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalLotAndImprovementsAmount() {
        return urlaTotalLotAndImprovementsAmount;
    }

    /**
     * Sets the value of the urlaTotalLotAndImprovementsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalLotAndImprovementsAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalLotAndImprovementsAmount = value;
    }

    /**
     * Gets the value of the urlaTotalMonthlyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalMonthlyIncomeAmount() {
        return urlaTotalMonthlyIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalMonthlyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalMonthlyIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalMonthlyIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalNetRentalIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalNetRentalIncomeAmount() {
        return urlaTotalNetRentalIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalNetRentalIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalNetRentalIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalNetRentalIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalNetWorthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalNetWorthAmount() {
        return urlaTotalNetWorthAmount;
    }

    /**
     * Sets the value of the urlaTotalNetWorthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalNetWorthAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalNetWorthAmount = value;
    }

    /**
     * Gets the value of the urlaTotalOtherTypesOfIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalOtherTypesOfIncomeAmount() {
        return urlaTotalOtherTypesOfIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalOtherTypesOfIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalOtherTypesOfIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalOtherTypesOfIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalOvertimeIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalOvertimeIncomeAmount() {
        return urlaTotalOvertimeIncomeAmount;
    }

    /**
     * Sets the value of the urlaTotalOvertimeIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalOvertimeIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalOvertimeIncomeAmount = value;
    }

    /**
     * Gets the value of the urlaTotalREOLienInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalREOLienInstallmentAmount() {
        return urlaTotalREOLienInstallmentAmount;
    }

    /**
     * Sets the value of the urlaTotalREOLienInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalREOLienInstallmentAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalREOLienInstallmentAmount = value;
    }

    /**
     * Gets the value of the urlaTotalREOLienUPBAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalREOLienUPBAmount() {
        return urlaTotalREOLienUPBAmount;
    }

    /**
     * Sets the value of the urlaTotalREOLienUPBAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalREOLienUPBAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalREOLienUPBAmount = value;
    }

    /**
     * Gets the value of the urlaTotalREOMaintenanceExpenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalREOMaintenanceExpenseAmount() {
        return urlaTotalREOMaintenanceExpenseAmount;
    }

    /**
     * Sets the value of the urlaTotalREOMaintenanceExpenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalREOMaintenanceExpenseAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalREOMaintenanceExpenseAmount = value;
    }

    /**
     * Gets the value of the urlaTotalREOMarketValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalREOMarketValueAmount() {
        return urlaTotalREOMarketValueAmount;
    }

    /**
     * Sets the value of the urlaTotalREOMarketValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalREOMarketValueAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalREOMarketValueAmount = value;
    }

    /**
     * Gets the value of the urlaTotalREORentalIncomeGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalREORentalIncomeGrossAmount() {
        return urlaTotalREORentalIncomeGrossAmount;
    }

    /**
     * Sets the value of the urlaTotalREORentalIncomeGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalREORentalIncomeGrossAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalREORentalIncomeGrossAmount = value;
    }

    /**
     * Gets the value of the urlaTotalREORentalIncomeNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalREORentalIncomeNetAmount() {
        return urlaTotalREORentalIncomeNetAmount;
    }

    /**
     * Sets the value of the urlaTotalREORentalIncomeNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalREORentalIncomeNetAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalREORentalIncomeNetAmount = value;
    }

    /**
     * Gets the value of the urlaTotalTransactionCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getURLATotalTransactionCostAmount() {
        return urlaTotalTransactionCostAmount;
    }

    /**
     * Sets the value of the urlaTotalTransactionCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setURLATotalTransactionCostAmount(JAXBElement<MISMOAmount> value) {
        this.urlaTotalTransactionCostAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link URLATOTALEXTENSION }
     *     
     */
    public URLATOTALEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLATOTALEXTENSION }
     *     
     */
    public void setEXTENSION(URLATOTALEXTENSION value) {
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
