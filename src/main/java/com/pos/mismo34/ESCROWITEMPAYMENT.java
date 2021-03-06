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
 * Information on the escrow item payment.
 * 
 * <p>Java class for ESCROW_ITEM_PAYMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESCROW_ITEM_PAYMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EscrowItemActualPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowItemEstimatedPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EscrowItemPaymentPaidByType" type="{http://www.mismo.org/residential/2009/schemas}EscrowItemPaymentPaidByEnum" minOccurs="0"/>
 *         &lt;element name="EscrowItemPaymentPaidByTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EscrowItemPaymentTimingType" type="{http://www.mismo.org/residential/2009/schemas}EscrowItemPaymentTimingEnum" minOccurs="0"/>
 *         &lt;element name="EscrowItemPaymentTimingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PaymentFinancedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PaymentIncludedInAPRIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PaymentIncludedInJurisdictionHighCostIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PrepaidFinanceChargeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RegulationZPointsAndFeesIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_ITEM_PAYMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ESCROW_ITEM_PAYMENT", propOrder = {
    "escrowItemActualPaymentAmount",
    "escrowItemEstimatedPaymentAmount",
    "escrowItemPaymentPaidByType",
    "escrowItemPaymentPaidByTypeOtherDescription",
    "escrowItemPaymentTimingType",
    "escrowItemPaymentTimingTypeOtherDescription",
    "paymentFinancedIndicator",
    "paymentIncludedInAPRIndicator",
    "paymentIncludedInJurisdictionHighCostIndicator",
    "prepaidFinanceChargeIndicator",
    "regulationZPointsAndFeesIndicator",
    "extension"
})
public class ESCROWITEMPAYMENT {

    @XmlElementRef(name = "EscrowItemActualPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowItemActualPaymentAmount;
    @XmlElementRef(name = "EscrowItemEstimatedPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> escrowItemEstimatedPaymentAmount;
    @XmlElementRef(name = "EscrowItemPaymentPaidByType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrowItemPaymentPaidByEnum> escrowItemPaymentPaidByType;
    @XmlElementRef(name = "EscrowItemPaymentPaidByTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> escrowItemPaymentPaidByTypeOtherDescription;
    @XmlElementRef(name = "EscrowItemPaymentTimingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrowItemPaymentTimingEnum> escrowItemPaymentTimingType;
    @XmlElementRef(name = "EscrowItemPaymentTimingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> escrowItemPaymentTimingTypeOtherDescription;
    @XmlElementRef(name = "PaymentFinancedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> paymentFinancedIndicator;
    @XmlElementRef(name = "PaymentIncludedInAPRIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> paymentIncludedInAPRIndicator;
    @XmlElementRef(name = "PaymentIncludedInJurisdictionHighCostIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> paymentIncludedInJurisdictionHighCostIndicator;
    @XmlElementRef(name = "PrepaidFinanceChargeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> prepaidFinanceChargeIndicator;
    @XmlElementRef(name = "RegulationZPointsAndFeesIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> regulationZPointsAndFeesIndicator;
    @XmlElement(name = "EXTENSION")
    protected ESCROWITEMPAYMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the escrowItemActualPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowItemActualPaymentAmount() {
        return escrowItemActualPaymentAmount;
    }

    /**
     * Sets the value of the escrowItemActualPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowItemActualPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.escrowItemActualPaymentAmount = value;
    }

    /**
     * Gets the value of the escrowItemEstimatedPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getEscrowItemEstimatedPaymentAmount() {
        return escrowItemEstimatedPaymentAmount;
    }

    /**
     * Sets the value of the escrowItemEstimatedPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setEscrowItemEstimatedPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.escrowItemEstimatedPaymentAmount = value;
    }

    /**
     * Gets the value of the escrowItemPaymentPaidByType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrowItemPaymentPaidByEnum }{@code >}
     *     
     */
    public JAXBElement<EscrowItemPaymentPaidByEnum> getEscrowItemPaymentPaidByType() {
        return escrowItemPaymentPaidByType;
    }

    /**
     * Sets the value of the escrowItemPaymentPaidByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrowItemPaymentPaidByEnum }{@code >}
     *     
     */
    public void setEscrowItemPaymentPaidByType(JAXBElement<EscrowItemPaymentPaidByEnum> value) {
        this.escrowItemPaymentPaidByType = value;
    }

    /**
     * Gets the value of the escrowItemPaymentPaidByTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEscrowItemPaymentPaidByTypeOtherDescription() {
        return escrowItemPaymentPaidByTypeOtherDescription;
    }

    /**
     * Sets the value of the escrowItemPaymentPaidByTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEscrowItemPaymentPaidByTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.escrowItemPaymentPaidByTypeOtherDescription = value;
    }

    /**
     * Gets the value of the escrowItemPaymentTimingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrowItemPaymentTimingEnum }{@code >}
     *     
     */
    public JAXBElement<EscrowItemPaymentTimingEnum> getEscrowItemPaymentTimingType() {
        return escrowItemPaymentTimingType;
    }

    /**
     * Sets the value of the escrowItemPaymentTimingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrowItemPaymentTimingEnum }{@code >}
     *     
     */
    public void setEscrowItemPaymentTimingType(JAXBElement<EscrowItemPaymentTimingEnum> value) {
        this.escrowItemPaymentTimingType = value;
    }

    /**
     * Gets the value of the escrowItemPaymentTimingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEscrowItemPaymentTimingTypeOtherDescription() {
        return escrowItemPaymentTimingTypeOtherDescription;
    }

    /**
     * Sets the value of the escrowItemPaymentTimingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEscrowItemPaymentTimingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.escrowItemPaymentTimingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the paymentFinancedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPaymentFinancedIndicator() {
        return paymentFinancedIndicator;
    }

    /**
     * Sets the value of the paymentFinancedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPaymentFinancedIndicator(JAXBElement<MISMOIndicator> value) {
        this.paymentFinancedIndicator = value;
    }

    /**
     * Gets the value of the paymentIncludedInAPRIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPaymentIncludedInAPRIndicator() {
        return paymentIncludedInAPRIndicator;
    }

    /**
     * Sets the value of the paymentIncludedInAPRIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPaymentIncludedInAPRIndicator(JAXBElement<MISMOIndicator> value) {
        this.paymentIncludedInAPRIndicator = value;
    }

    /**
     * Gets the value of the paymentIncludedInJurisdictionHighCostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPaymentIncludedInJurisdictionHighCostIndicator() {
        return paymentIncludedInJurisdictionHighCostIndicator;
    }

    /**
     * Sets the value of the paymentIncludedInJurisdictionHighCostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPaymentIncludedInJurisdictionHighCostIndicator(JAXBElement<MISMOIndicator> value) {
        this.paymentIncludedInJurisdictionHighCostIndicator = value;
    }

    /**
     * Gets the value of the prepaidFinanceChargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPrepaidFinanceChargeIndicator() {
        return prepaidFinanceChargeIndicator;
    }

    /**
     * Sets the value of the prepaidFinanceChargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPrepaidFinanceChargeIndicator(JAXBElement<MISMOIndicator> value) {
        this.prepaidFinanceChargeIndicator = value;
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
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWITEMPAYMENTEXTENSION }
     *     
     */
    public ESCROWITEMPAYMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWITEMPAYMENTEXTENSION }
     *     
     */
    public void setEXTENSION(ESCROWITEMPAYMENTEXTENSION value) {
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
