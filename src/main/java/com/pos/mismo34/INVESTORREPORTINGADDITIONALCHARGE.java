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
 * Container detailing charges, adjustments, losses,  recoveries or advances associated with a loan as  required for Investor reporting.
 * 
 * <p>Java class for INVESTOR_REPORTING_ADDITIONAL_CHARGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INVESTOR_REPORTING_ADDITIONAL_CHARGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvestorReportingAdditionalChargeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="InvestorReportingAdditionalChargeAssessedToPartyType" type="{http://www.mismo.org/residential/2009/schemas}InvestorReportingAdditionalChargeAssessedToPartyEnum" minOccurs="0"/>
 *         &lt;element name="InvestorReportingAdditionalChargeAssessedToPartyTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InvestorReportingAdditionalChargeDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="InvestorReportingAdditionalChargeReversalIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InvestorReportingAdditionalChargeType" type="{http://www.mismo.org/residential/2009/schemas}InvestorReportingAdditionalChargeEnum" minOccurs="0"/>
 *         &lt;element name="InvestorReportingAdditionalChargeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INVESTOR_REPORTING_ADDITIONAL_CHARGE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INVESTOR_REPORTING_ADDITIONAL_CHARGE", propOrder = {
    "investorReportingAdditionalChargeAmount",
    "investorReportingAdditionalChargeAssessedToPartyType",
    "investorReportingAdditionalChargeAssessedToPartyTypeOtherDescription",
    "investorReportingAdditionalChargeDate",
    "investorReportingAdditionalChargeReversalIndicator",
    "investorReportingAdditionalChargeType",
    "investorReportingAdditionalChargeTypeOtherDescription",
    "extension"
})
public class INVESTORREPORTINGADDITIONALCHARGE {

    @XmlElementRef(name = "InvestorReportingAdditionalChargeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> investorReportingAdditionalChargeAmount;
    @XmlElementRef(name = "InvestorReportingAdditionalChargeAssessedToPartyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InvestorReportingAdditionalChargeAssessedToPartyEnum> investorReportingAdditionalChargeAssessedToPartyType;
    @XmlElementRef(name = "InvestorReportingAdditionalChargeAssessedToPartyTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> investorReportingAdditionalChargeAssessedToPartyTypeOtherDescription;
    @XmlElementRef(name = "InvestorReportingAdditionalChargeDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> investorReportingAdditionalChargeDate;
    @XmlElementRef(name = "InvestorReportingAdditionalChargeReversalIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> investorReportingAdditionalChargeReversalIndicator;
    @XmlElementRef(name = "InvestorReportingAdditionalChargeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InvestorReportingAdditionalChargeEnum> investorReportingAdditionalChargeType;
    @XmlElementRef(name = "InvestorReportingAdditionalChargeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> investorReportingAdditionalChargeTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected INVESTORREPORTINGADDITIONALCHARGEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the investorReportingAdditionalChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getInvestorReportingAdditionalChargeAmount() {
        return investorReportingAdditionalChargeAmount;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeAmount(JAXBElement<MISMOAmount> value) {
        this.investorReportingAdditionalChargeAmount = value;
    }

    /**
     * Gets the value of the investorReportingAdditionalChargeAssessedToPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvestorReportingAdditionalChargeAssessedToPartyEnum }{@code >}
     *     
     */
    public JAXBElement<InvestorReportingAdditionalChargeAssessedToPartyEnum> getInvestorReportingAdditionalChargeAssessedToPartyType() {
        return investorReportingAdditionalChargeAssessedToPartyType;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeAssessedToPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvestorReportingAdditionalChargeAssessedToPartyEnum }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeAssessedToPartyType(JAXBElement<InvestorReportingAdditionalChargeAssessedToPartyEnum> value) {
        this.investorReportingAdditionalChargeAssessedToPartyType = value;
    }

    /**
     * Gets the value of the investorReportingAdditionalChargeAssessedToPartyTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInvestorReportingAdditionalChargeAssessedToPartyTypeOtherDescription() {
        return investorReportingAdditionalChargeAssessedToPartyTypeOtherDescription;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeAssessedToPartyTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeAssessedToPartyTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.investorReportingAdditionalChargeAssessedToPartyTypeOtherDescription = value;
    }

    /**
     * Gets the value of the investorReportingAdditionalChargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInvestorReportingAdditionalChargeDate() {
        return investorReportingAdditionalChargeDate;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeDate(JAXBElement<MISMODate> value) {
        this.investorReportingAdditionalChargeDate = value;
    }

    /**
     * Gets the value of the investorReportingAdditionalChargeReversalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getInvestorReportingAdditionalChargeReversalIndicator() {
        return investorReportingAdditionalChargeReversalIndicator;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeReversalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeReversalIndicator(JAXBElement<MISMOIndicator> value) {
        this.investorReportingAdditionalChargeReversalIndicator = value;
    }

    /**
     * Gets the value of the investorReportingAdditionalChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvestorReportingAdditionalChargeEnum }{@code >}
     *     
     */
    public JAXBElement<InvestorReportingAdditionalChargeEnum> getInvestorReportingAdditionalChargeType() {
        return investorReportingAdditionalChargeType;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvestorReportingAdditionalChargeEnum }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeType(JAXBElement<InvestorReportingAdditionalChargeEnum> value) {
        this.investorReportingAdditionalChargeType = value;
    }

    /**
     * Gets the value of the investorReportingAdditionalChargeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInvestorReportingAdditionalChargeTypeOtherDescription() {
        return investorReportingAdditionalChargeTypeOtherDescription;
    }

    /**
     * Sets the value of the investorReportingAdditionalChargeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInvestorReportingAdditionalChargeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.investorReportingAdditionalChargeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGEEXTENSION }
     *     
     */
    public INVESTORREPORTINGADDITIONALCHARGEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGEEXTENSION }
     *     
     */
    public void setEXTENSION(INVESTORREPORTINGADDITIONALCHARGEEXTENSION value) {
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
