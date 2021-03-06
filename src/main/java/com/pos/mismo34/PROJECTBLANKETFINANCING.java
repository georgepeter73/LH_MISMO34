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
 * <p>Java class for PROJECT_BLANKET_FINANCING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_BLANKET_FINANCING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmortizationType" type="{http://www.mismo.org/residential/2009/schemas}AmortizationEnum" minOccurs="0"/>
 *         &lt;element name="AmortizationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BalloonIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CurrentInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="LienDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LienPriorityType" type="{http://www.mismo.org/residential/2009/schemas}LienPriorityEnum" minOccurs="0"/>
 *         &lt;element name="LienPriorityTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanRemainingMaturityTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="ProjectLienHolderName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROJECT_BLANKET_FINANCING_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "PROJECT_BLANKET_FINANCING", propOrder = {
    "amortizationType",
    "amortizationTypeOtherDescription",
    "balloonIndicator",
    "currentInterestRatePercent",
    "lienDescription",
    "lienPriorityType",
    "lienPriorityTypeOtherDescription",
    "loanRemainingMaturityTermMonthsCount",
    "projectLienHolderName",
    "totalPaymentAmount",
    "upbAmount",
    "extension"
})
public class PROJECTBLANKETFINANCING {

    @XmlElementRef(name = "AmortizationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AmortizationEnum> amortizationType;
    @XmlElementRef(name = "AmortizationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> amortizationTypeOtherDescription;
    @XmlElementRef(name = "BalloonIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> balloonIndicator;
    @XmlElementRef(name = "CurrentInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> currentInterestRatePercent;
    @XmlElementRef(name = "LienDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> lienDescription;
    @XmlElementRef(name = "LienPriorityType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LienPriorityEnum> lienPriorityType;
    @XmlElementRef(name = "LienPriorityTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> lienPriorityTypeOtherDescription;
    @XmlElementRef(name = "LoanRemainingMaturityTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanRemainingMaturityTermMonthsCount;
    @XmlElementRef(name = "ProjectLienHolderName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectLienHolderName;
    @XmlElementRef(name = "TotalPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> totalPaymentAmount;
    @XmlElementRef(name = "UPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> upbAmount;
    @XmlElement(name = "EXTENSION")
    protected PROJECTBLANKETFINANCINGEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the amortizationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmortizationEnum }{@code >}
     *     
     */
    public JAXBElement<AmortizationEnum> getAmortizationType() {
        return amortizationType;
    }

    /**
     * Sets the value of the amortizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmortizationEnum }{@code >}
     *     
     */
    public void setAmortizationType(JAXBElement<AmortizationEnum> value) {
        this.amortizationType = value;
    }

    /**
     * Gets the value of the amortizationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAmortizationTypeOtherDescription() {
        return amortizationTypeOtherDescription;
    }

    /**
     * Sets the value of the amortizationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAmortizationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.amortizationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the balloonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getBalloonIndicator() {
        return balloonIndicator;
    }

    /**
     * Sets the value of the balloonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setBalloonIndicator(JAXBElement<MISMOIndicator> value) {
        this.balloonIndicator = value;
    }

    /**
     * Gets the value of the currentInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getCurrentInterestRatePercent() {
        return currentInterestRatePercent;
    }

    /**
     * Sets the value of the currentInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setCurrentInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.currentInterestRatePercent = value;
    }

    /**
     * Gets the value of the lienDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLienDescription() {
        return lienDescription;
    }

    /**
     * Sets the value of the lienDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLienDescription(JAXBElement<MISMOString> value) {
        this.lienDescription = value;
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
     * Gets the value of the loanRemainingMaturityTermMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLoanRemainingMaturityTermMonthsCount() {
        return loanRemainingMaturityTermMonthsCount;
    }

    /**
     * Sets the value of the loanRemainingMaturityTermMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLoanRemainingMaturityTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanRemainingMaturityTermMonthsCount = value;
    }

    /**
     * Gets the value of the projectLienHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getProjectLienHolderName() {
        return projectLienHolderName;
    }

    /**
     * Sets the value of the projectLienHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setProjectLienHolderName(JAXBElement<MISMOString> value) {
        this.projectLienHolderName = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTotalPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the upbAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUPBAmount() {
        return upbAmount;
    }

    /**
     * Sets the value of the upbAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUPBAmount(JAXBElement<MISMOAmount> value) {
        this.upbAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECTBLANKETFINANCINGEXTENSION }
     *     
     */
    public PROJECTBLANKETFINANCINGEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECTBLANKETFINANCINGEXTENSION }
     *     
     */
    public void setEXTENSION(PROJECTBLANKETFINANCINGEXTENSION value) {
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
