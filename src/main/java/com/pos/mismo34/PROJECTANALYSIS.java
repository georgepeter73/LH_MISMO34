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
 * <p>Java class for PROJECT_ANALYSIS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_ANALYSIS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsAffectMarketabilityDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OwnersWithinProjectMoreThanTwoMonthsDelinquentCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisAdditionalFacilitiesFeeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisAdditionalFacilitiesFeeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisAdditionalFacilitiesFeeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisAdequacyOfBudgetType" type="{http://www.mismo.org/residential/2009/schemas}ProjectAnalysisAdequacyOfBudgetEnum" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisAdequacyOfManagementType" type="{http://www.mismo.org/residential/2009/schemas}ProjectAnalysisAdequacyOfManagementEnum" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisBudgetAnalysisCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisBudgetAnalyzedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisCharacteristicsAffectMarketabilityIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisCompetitiveProjectComparisonDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisCompetitiveProjectComparisonType" type="{http://www.mismo.org/residential/2009/schemas}ProjectAnalysisCompetitiveProjectComparisonEnum" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisGroundRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisGroundRentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisGroundRentIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisSpecialCharacteristicsDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectAnalysisSpecialCharacteristicsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ProjectConditionAndQualityDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROJECT_ANALYSIS_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROJECT_ANALYSIS", propOrder = {
    "characteristicsAffectMarketabilityDescription",
    "ownersWithinProjectMoreThanTwoMonthsDelinquentCount",
    "projectAnalysisAdditionalFacilitiesFeeAmount",
    "projectAnalysisAdditionalFacilitiesFeeDescription",
    "projectAnalysisAdditionalFacilitiesFeeIndicator",
    "projectAnalysisAdequacyOfBudgetType",
    "projectAnalysisAdequacyOfManagementType",
    "projectAnalysisBudgetAnalysisCommentDescription",
    "projectAnalysisBudgetAnalyzedIndicator",
    "projectAnalysisCharacteristicsAffectMarketabilityIndicator",
    "projectAnalysisCompetitiveProjectComparisonDescription",
    "projectAnalysisCompetitiveProjectComparisonType",
    "projectAnalysisGroundRentAmount",
    "projectAnalysisGroundRentDescription",
    "projectAnalysisGroundRentIndicator",
    "projectAnalysisSpecialCharacteristicsDescription",
    "projectAnalysisSpecialCharacteristicsIndicator",
    "projectConditionAndQualityDescription",
    "extension"
})
public class PROJECTANALYSIS {

    @XmlElementRef(name = "CharacteristicsAffectMarketabilityDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> characteristicsAffectMarketabilityDescription;
    @XmlElementRef(name = "OwnersWithinProjectMoreThanTwoMonthsDelinquentCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> ownersWithinProjectMoreThanTwoMonthsDelinquentCount;
    @XmlElementRef(name = "ProjectAnalysisAdditionalFacilitiesFeeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectAnalysisAdditionalFacilitiesFeeAmount;
    @XmlElementRef(name = "ProjectAnalysisAdditionalFacilitiesFeeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectAnalysisAdditionalFacilitiesFeeDescription;
    @XmlElementRef(name = "ProjectAnalysisAdditionalFacilitiesFeeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> projectAnalysisAdditionalFacilitiesFeeIndicator;
    @XmlElementRef(name = "ProjectAnalysisAdequacyOfBudgetType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectAnalysisAdequacyOfBudgetEnum> projectAnalysisAdequacyOfBudgetType;
    @XmlElementRef(name = "ProjectAnalysisAdequacyOfManagementType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectAnalysisAdequacyOfManagementEnum> projectAnalysisAdequacyOfManagementType;
    @XmlElementRef(name = "ProjectAnalysisBudgetAnalysisCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectAnalysisBudgetAnalysisCommentDescription;
    @XmlElementRef(name = "ProjectAnalysisBudgetAnalyzedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> projectAnalysisBudgetAnalyzedIndicator;
    @XmlElementRef(name = "ProjectAnalysisCharacteristicsAffectMarketabilityIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> projectAnalysisCharacteristicsAffectMarketabilityIndicator;
    @XmlElementRef(name = "ProjectAnalysisCompetitiveProjectComparisonDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectAnalysisCompetitiveProjectComparisonDescription;
    @XmlElementRef(name = "ProjectAnalysisCompetitiveProjectComparisonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectAnalysisCompetitiveProjectComparisonEnum> projectAnalysisCompetitiveProjectComparisonType;
    @XmlElementRef(name = "ProjectAnalysisGroundRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> projectAnalysisGroundRentAmount;
    @XmlElementRef(name = "ProjectAnalysisGroundRentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectAnalysisGroundRentDescription;
    @XmlElementRef(name = "ProjectAnalysisGroundRentIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> projectAnalysisGroundRentIndicator;
    @XmlElementRef(name = "ProjectAnalysisSpecialCharacteristicsDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectAnalysisSpecialCharacteristicsDescription;
    @XmlElementRef(name = "ProjectAnalysisSpecialCharacteristicsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> projectAnalysisSpecialCharacteristicsIndicator;
    @XmlElementRef(name = "ProjectConditionAndQualityDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectConditionAndQualityDescription;
    @XmlElement(name = "EXTENSION")
    protected PROJECTANALYSISEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the characteristicsAffectMarketabilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCharacteristicsAffectMarketabilityDescription() {
        return characteristicsAffectMarketabilityDescription;
    }

    /**
     * Sets the value of the characteristicsAffectMarketabilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCharacteristicsAffectMarketabilityDescription(JAXBElement<MISMOString> value) {
        this.characteristicsAffectMarketabilityDescription = value;
    }

    /**
     * Gets the value of the ownersWithinProjectMoreThanTwoMonthsDelinquentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getOwnersWithinProjectMoreThanTwoMonthsDelinquentCount() {
        return ownersWithinProjectMoreThanTwoMonthsDelinquentCount;
    }

    /**
     * Sets the value of the ownersWithinProjectMoreThanTwoMonthsDelinquentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setOwnersWithinProjectMoreThanTwoMonthsDelinquentCount(JAXBElement<MISMOCount> value) {
        this.ownersWithinProjectMoreThanTwoMonthsDelinquentCount = value;
    }

    /**
     * Gets the value of the projectAnalysisAdditionalFacilitiesFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectAnalysisAdditionalFacilitiesFeeAmount() {
        return projectAnalysisAdditionalFacilitiesFeeAmount;
    }

    /**
     * Sets the value of the projectAnalysisAdditionalFacilitiesFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectAnalysisAdditionalFacilitiesFeeAmount(JAXBElement<MISMOAmount> value) {
        this.projectAnalysisAdditionalFacilitiesFeeAmount = value;
    }

    /**
     * Gets the value of the projectAnalysisAdditionalFacilitiesFeeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectAnalysisAdditionalFacilitiesFeeDescription() {
        return projectAnalysisAdditionalFacilitiesFeeDescription;
    }

    /**
     * Sets the value of the projectAnalysisAdditionalFacilitiesFeeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectAnalysisAdditionalFacilitiesFeeDescription(JAXBElement<MISMOString> value) {
        this.projectAnalysisAdditionalFacilitiesFeeDescription = value;
    }

    /**
     * Gets the value of the projectAnalysisAdditionalFacilitiesFeeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getProjectAnalysisAdditionalFacilitiesFeeIndicator() {
        return projectAnalysisAdditionalFacilitiesFeeIndicator;
    }

    /**
     * Sets the value of the projectAnalysisAdditionalFacilitiesFeeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setProjectAnalysisAdditionalFacilitiesFeeIndicator(JAXBElement<MISMOIndicator> value) {
        this.projectAnalysisAdditionalFacilitiesFeeIndicator = value;
    }

    /**
     * Gets the value of the projectAnalysisAdequacyOfBudgetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectAnalysisAdequacyOfBudgetEnum }{@code >}
     *     
     */
    public JAXBElement<ProjectAnalysisAdequacyOfBudgetEnum> getProjectAnalysisAdequacyOfBudgetType() {
        return projectAnalysisAdequacyOfBudgetType;
    }

    /**
     * Sets the value of the projectAnalysisAdequacyOfBudgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectAnalysisAdequacyOfBudgetEnum }{@code >}
     *     
     */
    public void setProjectAnalysisAdequacyOfBudgetType(JAXBElement<ProjectAnalysisAdequacyOfBudgetEnum> value) {
        this.projectAnalysisAdequacyOfBudgetType = value;
    }

    /**
     * Gets the value of the projectAnalysisAdequacyOfManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectAnalysisAdequacyOfManagementEnum }{@code >}
     *     
     */
    public JAXBElement<ProjectAnalysisAdequacyOfManagementEnum> getProjectAnalysisAdequacyOfManagementType() {
        return projectAnalysisAdequacyOfManagementType;
    }

    /**
     * Sets the value of the projectAnalysisAdequacyOfManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectAnalysisAdequacyOfManagementEnum }{@code >}
     *     
     */
    public void setProjectAnalysisAdequacyOfManagementType(JAXBElement<ProjectAnalysisAdequacyOfManagementEnum> value) {
        this.projectAnalysisAdequacyOfManagementType = value;
    }

    /**
     * Gets the value of the projectAnalysisBudgetAnalysisCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectAnalysisBudgetAnalysisCommentDescription() {
        return projectAnalysisBudgetAnalysisCommentDescription;
    }

    /**
     * Sets the value of the projectAnalysisBudgetAnalysisCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectAnalysisBudgetAnalysisCommentDescription(JAXBElement<MISMOString> value) {
        this.projectAnalysisBudgetAnalysisCommentDescription = value;
    }

    /**
     * Gets the value of the projectAnalysisBudgetAnalyzedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getProjectAnalysisBudgetAnalyzedIndicator() {
        return projectAnalysisBudgetAnalyzedIndicator;
    }

    /**
     * Sets the value of the projectAnalysisBudgetAnalyzedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setProjectAnalysisBudgetAnalyzedIndicator(JAXBElement<MISMOIndicator> value) {
        this.projectAnalysisBudgetAnalyzedIndicator = value;
    }

    /**
     * Gets the value of the projectAnalysisCharacteristicsAffectMarketabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getProjectAnalysisCharacteristicsAffectMarketabilityIndicator() {
        return projectAnalysisCharacteristicsAffectMarketabilityIndicator;
    }

    /**
     * Sets the value of the projectAnalysisCharacteristicsAffectMarketabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setProjectAnalysisCharacteristicsAffectMarketabilityIndicator(JAXBElement<MISMOIndicator> value) {
        this.projectAnalysisCharacteristicsAffectMarketabilityIndicator = value;
    }

    /**
     * Gets the value of the projectAnalysisCompetitiveProjectComparisonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectAnalysisCompetitiveProjectComparisonDescription() {
        return projectAnalysisCompetitiveProjectComparisonDescription;
    }

    /**
     * Sets the value of the projectAnalysisCompetitiveProjectComparisonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectAnalysisCompetitiveProjectComparisonDescription(JAXBElement<MISMOString> value) {
        this.projectAnalysisCompetitiveProjectComparisonDescription = value;
    }

    /**
     * Gets the value of the projectAnalysisCompetitiveProjectComparisonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectAnalysisCompetitiveProjectComparisonEnum }{@code >}
     *     
     */
    public JAXBElement<ProjectAnalysisCompetitiveProjectComparisonEnum> getProjectAnalysisCompetitiveProjectComparisonType() {
        return projectAnalysisCompetitiveProjectComparisonType;
    }

    /**
     * Sets the value of the projectAnalysisCompetitiveProjectComparisonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectAnalysisCompetitiveProjectComparisonEnum }{@code >}
     *     
     */
    public void setProjectAnalysisCompetitiveProjectComparisonType(JAXBElement<ProjectAnalysisCompetitiveProjectComparisonEnum> value) {
        this.projectAnalysisCompetitiveProjectComparisonType = value;
    }

    /**
     * Gets the value of the projectAnalysisGroundRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getProjectAnalysisGroundRentAmount() {
        return projectAnalysisGroundRentAmount;
    }

    /**
     * Sets the value of the projectAnalysisGroundRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setProjectAnalysisGroundRentAmount(JAXBElement<MISMOAmount> value) {
        this.projectAnalysisGroundRentAmount = value;
    }

    /**
     * Gets the value of the projectAnalysisGroundRentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectAnalysisGroundRentDescription() {
        return projectAnalysisGroundRentDescription;
    }

    /**
     * Sets the value of the projectAnalysisGroundRentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectAnalysisGroundRentDescription(JAXBElement<MISMOString> value) {
        this.projectAnalysisGroundRentDescription = value;
    }

    /**
     * Gets the value of the projectAnalysisGroundRentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getProjectAnalysisGroundRentIndicator() {
        return projectAnalysisGroundRentIndicator;
    }

    /**
     * Sets the value of the projectAnalysisGroundRentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setProjectAnalysisGroundRentIndicator(JAXBElement<MISMOIndicator> value) {
        this.projectAnalysisGroundRentIndicator = value;
    }

    /**
     * Gets the value of the projectAnalysisSpecialCharacteristicsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectAnalysisSpecialCharacteristicsDescription() {
        return projectAnalysisSpecialCharacteristicsDescription;
    }

    /**
     * Sets the value of the projectAnalysisSpecialCharacteristicsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectAnalysisSpecialCharacteristicsDescription(JAXBElement<MISMOString> value) {
        this.projectAnalysisSpecialCharacteristicsDescription = value;
    }

    /**
     * Gets the value of the projectAnalysisSpecialCharacteristicsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getProjectAnalysisSpecialCharacteristicsIndicator() {
        return projectAnalysisSpecialCharacteristicsIndicator;
    }

    /**
     * Sets the value of the projectAnalysisSpecialCharacteristicsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setProjectAnalysisSpecialCharacteristicsIndicator(JAXBElement<MISMOIndicator> value) {
        this.projectAnalysisSpecialCharacteristicsIndicator = value;
    }

    /**
     * Gets the value of the projectConditionAndQualityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectConditionAndQualityDescription() {
        return projectConditionAndQualityDescription;
    }

    /**
     * Sets the value of the projectConditionAndQualityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectConditionAndQualityDescription(JAXBElement<MISMOString> value) {
        this.projectConditionAndQualityDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTANALYSISEXTENSION }
     *     
     */
    public PROJECTANALYSISEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTANALYSISEXTENSION }
     *     
     */
    public void setEXTENSION(PROJECTANALYSISEXTENSION value) {
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
