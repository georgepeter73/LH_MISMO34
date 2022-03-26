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
 * Describes characteristics of the loan, including the behavior defined in the financial instrument.
 * 
 * <p>Java class for TERMS_OF_LOAN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TERMS_OF_LOAN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssumedLoanAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="BaseLoanAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DisclosedFullyIndexedRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="DisclosedIndexRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="DisclosedMarginRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="LienPriorityType" type="{http://www.mismo.org/residential/2009/schemas}LienPriorityEnum" minOccurs="0"/>
 *         &lt;element name="LienPriorityTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanPurposeType" type="{http://www.mismo.org/residential/2009/schemas}LoanPurposeEnum" minOccurs="0"/>
 *         &lt;element name="LoanPurposeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MortgageType" type="{http://www.mismo.org/residential/2009/schemas}MortgageEnum" minOccurs="0"/>
 *         &lt;element name="MortgageTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NoteAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="NoteCityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NoteDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="NoteRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="NoteStateName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OriginalInterestRateDiscountPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="SharedAppreciationCapAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SharedAppreciationRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="SupplementalMortgageType" type="{http://www.mismo.org/residential/2009/schemas}SupplementalMortgageEnum" minOccurs="0"/>
 *         &lt;element name="SupplementalMortgageTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="UPBChangeFrequencyType" type="{http://www.mismo.org/residential/2009/schemas}UPBChangeFrequencyEnum" minOccurs="0"/>
 *         &lt;element name="WeightedAverageInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TERMS_OF_LOAN_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TERMS_OF_LOAN", propOrder = {
    "assumedLoanAmount",
    "baseLoanAmount",
    "disclosedFullyIndexedRatePercent",
    "disclosedIndexRatePercent",
    "disclosedMarginRatePercent",
    "lienPriorityType",
    "lienPriorityTypeOtherDescription",
    "loanPurposeType",
    "loanPurposeTypeOtherDescription",
    "mortgageType",
    "mortgageTypeOtherDescription",
    "noteAmount",
    "noteCityName",
    "noteDate",
    "noteRatePercent",
    "noteStateName",
    "originalInterestRateDiscountPercent",
    "sharedAppreciationCapAmount",
    "sharedAppreciationRatePercent",
    "supplementalMortgageType",
    "supplementalMortgageTypeOtherDescription",
    "upbChangeFrequencyType",
    "weightedAverageInterestRatePercent",
    "extension"
})
public class TERMSOFLOAN {

    @XmlElementRef(name = "AssumedLoanAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> assumedLoanAmount;
    @XmlElementRef(name = "BaseLoanAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> baseLoanAmount;
    @XmlElementRef(name = "DisclosedFullyIndexedRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> disclosedFullyIndexedRatePercent;
    @XmlElementRef(name = "DisclosedIndexRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> disclosedIndexRatePercent;
    @XmlElementRef(name = "DisclosedMarginRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> disclosedMarginRatePercent;
    @XmlElementRef(name = "LienPriorityType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LienPriorityEnum> lienPriorityType;
    @XmlElementRef(name = "LienPriorityTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> lienPriorityTypeOtherDescription;
    @XmlElementRef(name = "LoanPurposeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanPurposeEnum> loanPurposeType;
    @XmlElementRef(name = "LoanPurposeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanPurposeTypeOtherDescription;
    @XmlElementRef(name = "MortgageType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MortgageEnum> mortgageType;
    @XmlElementRef(name = "MortgageTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> mortgageTypeOtherDescription;
    @XmlElementRef(name = "NoteAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> noteAmount;
    @XmlElementRef(name = "NoteCityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> noteCityName;
    @XmlElementRef(name = "NoteDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> noteDate;
    @XmlElementRef(name = "NoteRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> noteRatePercent;
    @XmlElementRef(name = "NoteStateName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> noteStateName;
    @XmlElementRef(name = "OriginalInterestRateDiscountPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> originalInterestRateDiscountPercent;
    @XmlElementRef(name = "SharedAppreciationCapAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> sharedAppreciationCapAmount;
    @XmlElementRef(name = "SharedAppreciationRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> sharedAppreciationRatePercent;
    @XmlElementRef(name = "SupplementalMortgageType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SupplementalMortgageEnum> supplementalMortgageType;
    @XmlElementRef(name = "SupplementalMortgageTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> supplementalMortgageTypeOtherDescription;
    @XmlElementRef(name = "UPBChangeFrequencyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UPBChangeFrequencyEnum> upbChangeFrequencyType;
    @XmlElementRef(name = "WeightedAverageInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> weightedAverageInterestRatePercent;
    @XmlElement(name = "EXTENSION")
    protected TERMSOFLOANEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the assumedLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAssumedLoanAmount() {
        return assumedLoanAmount;
    }

    /**
     * Sets the value of the assumedLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAssumedLoanAmount(JAXBElement<MISMOAmount> value) {
        this.assumedLoanAmount = value;
    }

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
     * Gets the value of the disclosedFullyIndexedRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getDisclosedFullyIndexedRatePercent() {
        return disclosedFullyIndexedRatePercent;
    }

    /**
     * Sets the value of the disclosedFullyIndexedRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setDisclosedFullyIndexedRatePercent(JAXBElement<MISMOPercent> value) {
        this.disclosedFullyIndexedRatePercent = value;
    }

    /**
     * Gets the value of the disclosedIndexRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getDisclosedIndexRatePercent() {
        return disclosedIndexRatePercent;
    }

    /**
     * Sets the value of the disclosedIndexRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setDisclosedIndexRatePercent(JAXBElement<MISMOPercent> value) {
        this.disclosedIndexRatePercent = value;
    }

    /**
     * Gets the value of the disclosedMarginRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getDisclosedMarginRatePercent() {
        return disclosedMarginRatePercent;
    }

    /**
     * Sets the value of the disclosedMarginRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setDisclosedMarginRatePercent(JAXBElement<MISMOPercent> value) {
        this.disclosedMarginRatePercent = value;
    }

    /**
     * Gets the value of the lienPriorityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LienPriorityEnum }{@code >}
     *     
     */
    public JAXBElement<LienPriorityEnum> getLienPriorityType() {
        return lienPriorityType;
    }

    /**
     * Sets the value of the lienPriorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LienPriorityEnum }{@code >}
     *     
     */
    public void setLienPriorityType(JAXBElement<LienPriorityEnum> value) {
        this.lienPriorityType = value;
    }

    /**
     * Gets the value of the lienPriorityTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLienPriorityTypeOtherDescription() {
        return lienPriorityTypeOtherDescription;
    }

    /**
     * Sets the value of the lienPriorityTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLienPriorityTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.lienPriorityTypeOtherDescription = value;
    }

    /**
     * Gets the value of the loanPurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanPurposeEnum }{@code >}
     *     
     */
    public JAXBElement<LoanPurposeEnum> getLoanPurposeType() {
        return loanPurposeType;
    }

    /**
     * Sets the value of the loanPurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanPurposeEnum }{@code >}
     *     
     */
    public void setLoanPurposeType(JAXBElement<LoanPurposeEnum> value) {
        this.loanPurposeType = value;
    }

    /**
     * Gets the value of the loanPurposeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanPurposeTypeOtherDescription() {
        return loanPurposeTypeOtherDescription;
    }

    /**
     * Sets the value of the loanPurposeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanPurposeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanPurposeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the mortgageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MortgageEnum }{@code >}
     *     
     */
    public JAXBElement<MortgageEnum> getMortgageType() {
        return mortgageType;
    }

    /**
     * Sets the value of the mortgageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MortgageEnum }{@code >}
     *     
     */
    public void setMortgageType(JAXBElement<MortgageEnum> value) {
        this.mortgageType = value;
    }

    /**
     * Gets the value of the mortgageTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMortgageTypeOtherDescription() {
        return mortgageTypeOtherDescription;
    }

    /**
     * Sets the value of the mortgageTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMortgageTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.mortgageTypeOtherDescription = value;
    }

    /**
     * Gets the value of the noteAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getNoteAmount() {
        return noteAmount;
    }

    /**
     * Sets the value of the noteAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setNoteAmount(JAXBElement<MISMOAmount> value) {
        this.noteAmount = value;
    }

    /**
     * Gets the value of the noteCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNoteCityName() {
        return noteCityName;
    }

    /**
     * Sets the value of the noteCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNoteCityName(JAXBElement<MISMOString> value) {
        this.noteCityName = value;
    }

    /**
     * Gets the value of the noteDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getNoteDate() {
        return noteDate;
    }

    /**
     * Sets the value of the noteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setNoteDate(JAXBElement<MISMODate> value) {
        this.noteDate = value;
    }

    /**
     * Gets the value of the noteRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getNoteRatePercent() {
        return noteRatePercent;
    }

    /**
     * Sets the value of the noteRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setNoteRatePercent(JAXBElement<MISMOPercent> value) {
        this.noteRatePercent = value;
    }

    /**
     * Gets the value of the noteStateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNoteStateName() {
        return noteStateName;
    }

    /**
     * Sets the value of the noteStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNoteStateName(JAXBElement<MISMOString> value) {
        this.noteStateName = value;
    }

    /**
     * Gets the value of the originalInterestRateDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getOriginalInterestRateDiscountPercent() {
        return originalInterestRateDiscountPercent;
    }

    /**
     * Sets the value of the originalInterestRateDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setOriginalInterestRateDiscountPercent(JAXBElement<MISMOPercent> value) {
        this.originalInterestRateDiscountPercent = value;
    }

    /**
     * Gets the value of the sharedAppreciationCapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSharedAppreciationCapAmount() {
        return sharedAppreciationCapAmount;
    }

    /**
     * Sets the value of the sharedAppreciationCapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSharedAppreciationCapAmount(JAXBElement<MISMOAmount> value) {
        this.sharedAppreciationCapAmount = value;
    }

    /**
     * Gets the value of the sharedAppreciationRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getSharedAppreciationRatePercent() {
        return sharedAppreciationRatePercent;
    }

    /**
     * Sets the value of the sharedAppreciationRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setSharedAppreciationRatePercent(JAXBElement<MISMOPercent> value) {
        this.sharedAppreciationRatePercent = value;
    }

    /**
     * Gets the value of the supplementalMortgageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupplementalMortgageEnum }{@code >}
     *     
     */
    public JAXBElement<SupplementalMortgageEnum> getSupplementalMortgageType() {
        return supplementalMortgageType;
    }

    /**
     * Sets the value of the supplementalMortgageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupplementalMortgageEnum }{@code >}
     *     
     */
    public void setSupplementalMortgageType(JAXBElement<SupplementalMortgageEnum> value) {
        this.supplementalMortgageType = value;
    }

    /**
     * Gets the value of the supplementalMortgageTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSupplementalMortgageTypeOtherDescription() {
        return supplementalMortgageTypeOtherDescription;
    }

    /**
     * Sets the value of the supplementalMortgageTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSupplementalMortgageTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.supplementalMortgageTypeOtherDescription = value;
    }

    /**
     * Gets the value of the upbChangeFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UPBChangeFrequencyEnum }{@code >}
     *     
     */
    public JAXBElement<UPBChangeFrequencyEnum> getUPBChangeFrequencyType() {
        return upbChangeFrequencyType;
    }

    /**
     * Sets the value of the upbChangeFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UPBChangeFrequencyEnum }{@code >}
     *     
     */
    public void setUPBChangeFrequencyType(JAXBElement<UPBChangeFrequencyEnum> value) {
        this.upbChangeFrequencyType = value;
    }

    /**
     * Gets the value of the weightedAverageInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getWeightedAverageInterestRatePercent() {
        return weightedAverageInterestRatePercent;
    }

    /**
     * Sets the value of the weightedAverageInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setWeightedAverageInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.weightedAverageInterestRatePercent = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TERMSOFLOANEXTENSION }
     *     
     */
    public TERMSOFLOANEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TERMSOFLOANEXTENSION }
     *     
     */
    public void setEXTENSION(TERMSOFLOANEXTENSION value) {
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
