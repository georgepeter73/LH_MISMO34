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
 * <p>Java class for AMORTIZATION_SCHEDULE_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMORTIZATION_SCHEDULE_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmortizationScheduleEndingBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AmortizationScheduleInterestPortionAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AmortizationScheduleInterestRatePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="AmortizationScheduleLoanToValuePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="AmortizationScheduleMIPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AmortizationSchedulePaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AmortizationSchedulePaymentDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AmortizationSchedulePaymentNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="AmortizationSchedulePrincipalPortionAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AmortizationScheduleUSDAAnnualFeePaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AMORTIZATION_SCHEDULE_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "AMORTIZATION_SCHEDULE_ITEM", propOrder = {
    "amortizationScheduleEndingBalanceAmount",
    "amortizationScheduleInterestPortionAmount",
    "amortizationScheduleInterestRatePercent",
    "amortizationScheduleLoanToValuePercent",
    "amortizationScheduleMIPaymentAmount",
    "amortizationSchedulePaymentAmount",
    "amortizationSchedulePaymentDueDate",
    "amortizationSchedulePaymentNumber",
    "amortizationSchedulePrincipalPortionAmount",
    "amortizationScheduleUSDAAnnualFeePaymentAmount",
    "extension"
})
public class AMORTIZATIONSCHEDULEITEM {

    @XmlElementRef(name = "AmortizationScheduleEndingBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> amortizationScheduleEndingBalanceAmount;
    @XmlElementRef(name = "AmortizationScheduleInterestPortionAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> amortizationScheduleInterestPortionAmount;
    @XmlElementRef(name = "AmortizationScheduleInterestRatePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> amortizationScheduleInterestRatePercent;
    @XmlElementRef(name = "AmortizationScheduleLoanToValuePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> amortizationScheduleLoanToValuePercent;
    @XmlElementRef(name = "AmortizationScheduleMIPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> amortizationScheduleMIPaymentAmount;
    @XmlElementRef(name = "AmortizationSchedulePaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> amortizationSchedulePaymentAmount;
    @XmlElementRef(name = "AmortizationSchedulePaymentDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> amortizationSchedulePaymentDueDate;
    @XmlElementRef(name = "AmortizationSchedulePaymentNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> amortizationSchedulePaymentNumber;
    @XmlElementRef(name = "AmortizationSchedulePrincipalPortionAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> amortizationSchedulePrincipalPortionAmount;
    @XmlElementRef(name = "AmortizationScheduleUSDAAnnualFeePaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> amortizationScheduleUSDAAnnualFeePaymentAmount;
    @XmlElement(name = "EXTENSION")
    protected AMORTIZATIONSCHEDULEITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the amortizationScheduleEndingBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAmortizationScheduleEndingBalanceAmount() {
        return amortizationScheduleEndingBalanceAmount;
    }

    /**
     * Sets the value of the amortizationScheduleEndingBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAmortizationScheduleEndingBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.amortizationScheduleEndingBalanceAmount = value;
    }

    /**
     * Gets the value of the amortizationScheduleInterestPortionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAmortizationScheduleInterestPortionAmount() {
        return amortizationScheduleInterestPortionAmount;
    }

    /**
     * Sets the value of the amortizationScheduleInterestPortionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAmortizationScheduleInterestPortionAmount(JAXBElement<MISMOAmount> value) {
        this.amortizationScheduleInterestPortionAmount = value;
    }

    /**
     * Gets the value of the amortizationScheduleInterestRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getAmortizationScheduleInterestRatePercent() {
        return amortizationScheduleInterestRatePercent;
    }

    /**
     * Sets the value of the amortizationScheduleInterestRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setAmortizationScheduleInterestRatePercent(JAXBElement<MISMOPercent> value) {
        this.amortizationScheduleInterestRatePercent = value;
    }

    /**
     * Gets the value of the amortizationScheduleLoanToValuePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getAmortizationScheduleLoanToValuePercent() {
        return amortizationScheduleLoanToValuePercent;
    }

    /**
     * Sets the value of the amortizationScheduleLoanToValuePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setAmortizationScheduleLoanToValuePercent(JAXBElement<MISMOPercent> value) {
        this.amortizationScheduleLoanToValuePercent = value;
    }

    /**
     * Gets the value of the amortizationScheduleMIPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAmortizationScheduleMIPaymentAmount() {
        return amortizationScheduleMIPaymentAmount;
    }

    /**
     * Sets the value of the amortizationScheduleMIPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAmortizationScheduleMIPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.amortizationScheduleMIPaymentAmount = value;
    }

    /**
     * Gets the value of the amortizationSchedulePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAmortizationSchedulePaymentAmount() {
        return amortizationSchedulePaymentAmount;
    }

    /**
     * Sets the value of the amortizationSchedulePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAmortizationSchedulePaymentAmount(JAXBElement<MISMOAmount> value) {
        this.amortizationSchedulePaymentAmount = value;
    }

    /**
     * Gets the value of the amortizationSchedulePaymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAmortizationSchedulePaymentDueDate() {
        return amortizationSchedulePaymentDueDate;
    }

    /**
     * Sets the value of the amortizationSchedulePaymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAmortizationSchedulePaymentDueDate(JAXBElement<MISMODate> value) {
        this.amortizationSchedulePaymentDueDate = value;
    }

    /**
     * Gets the value of the amortizationSchedulePaymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getAmortizationSchedulePaymentNumber() {
        return amortizationSchedulePaymentNumber;
    }

    /**
     * Sets the value of the amortizationSchedulePaymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setAmortizationSchedulePaymentNumber(JAXBElement<MISMONumeric> value) {
        this.amortizationSchedulePaymentNumber = value;
    }

    /**
     * Gets the value of the amortizationSchedulePrincipalPortionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAmortizationSchedulePrincipalPortionAmount() {
        return amortizationSchedulePrincipalPortionAmount;
    }

    /**
     * Sets the value of the amortizationSchedulePrincipalPortionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAmortizationSchedulePrincipalPortionAmount(JAXBElement<MISMOAmount> value) {
        this.amortizationSchedulePrincipalPortionAmount = value;
    }

    /**
     * Gets the value of the amortizationScheduleUSDAAnnualFeePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAmortizationScheduleUSDAAnnualFeePaymentAmount() {
        return amortizationScheduleUSDAAnnualFeePaymentAmount;
    }

    /**
     * Sets the value of the amortizationScheduleUSDAAnnualFeePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAmortizationScheduleUSDAAnnualFeePaymentAmount(JAXBElement<MISMOAmount> value) {
        this.amortizationScheduleUSDAAnnualFeePaymentAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AMORTIZATIONSCHEDULEITEMEXTENSION }
     *     
     */
    public AMORTIZATIONSCHEDULEITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMORTIZATIONSCHEDULEITEMEXTENSION }
     *     
     */
    public void setEXTENSION(AMORTIZATIONSCHEDULEITEMEXTENSION value) {
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
