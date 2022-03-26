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
 * Information about an event, associated with a delinquency status, and the date the status occurred throughout the delinquency process.
 * 
 * <p>Java class for DELINQUENCY_STATUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DELINQUENCY_STATUS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelinquentPaymentCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanDelinquencyStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanDelinquencyStatusType" type="{http://www.mismo.org/residential/2009/schemas}LoanDelinquencyStatusEnum" minOccurs="0"/>
 *         &lt;element name="LoanDelinquencyStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PaymentDelinquencyStatusType" type="{http://www.mismo.org/residential/2009/schemas}PaymentDelinquencyStatusEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DELINQUENCY_STATUS_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DELINQUENCY_STATUS", propOrder = {
    "delinquentPaymentCount",
    "loanDelinquencyStatusDate",
    "loanDelinquencyStatusType",
    "loanDelinquencyStatusTypeOtherDescription",
    "paymentDelinquencyStatusType",
    "extension"
})
public class DELINQUENCYSTATUS {

    @XmlElementRef(name = "DelinquentPaymentCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> delinquentPaymentCount;
    @XmlElementRef(name = "LoanDelinquencyStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanDelinquencyStatusDate;
    @XmlElementRef(name = "LoanDelinquencyStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanDelinquencyStatusEnum> loanDelinquencyStatusType;
    @XmlElementRef(name = "LoanDelinquencyStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanDelinquencyStatusTypeOtherDescription;
    @XmlElementRef(name = "PaymentDelinquencyStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentDelinquencyStatusEnum> paymentDelinquencyStatusType;
    @XmlElement(name = "EXTENSION")
    protected DELINQUENCYSTATUSEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the delinquentPaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getDelinquentPaymentCount() {
        return delinquentPaymentCount;
    }

    /**
     * Sets the value of the delinquentPaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setDelinquentPaymentCount(JAXBElement<MISMOCount> value) {
        this.delinquentPaymentCount = value;
    }

    /**
     * Gets the value of the loanDelinquencyStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanDelinquencyStatusDate() {
        return loanDelinquencyStatusDate;
    }

    /**
     * Sets the value of the loanDelinquencyStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanDelinquencyStatusDate(JAXBElement<MISMODate> value) {
        this.loanDelinquencyStatusDate = value;
    }

    /**
     * Gets the value of the loanDelinquencyStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanDelinquencyStatusEnum }{@code >}
     *     
     */
    public JAXBElement<LoanDelinquencyStatusEnum> getLoanDelinquencyStatusType() {
        return loanDelinquencyStatusType;
    }

    /**
     * Sets the value of the loanDelinquencyStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanDelinquencyStatusEnum }{@code >}
     *     
     */
    public void setLoanDelinquencyStatusType(JAXBElement<LoanDelinquencyStatusEnum> value) {
        this.loanDelinquencyStatusType = value;
    }

    /**
     * Gets the value of the loanDelinquencyStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanDelinquencyStatusTypeOtherDescription() {
        return loanDelinquencyStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the loanDelinquencyStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanDelinquencyStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanDelinquencyStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the paymentDelinquencyStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentDelinquencyStatusEnum }{@code >}
     *     
     */
    public JAXBElement<PaymentDelinquencyStatusEnum> getPaymentDelinquencyStatusType() {
        return paymentDelinquencyStatusType;
    }

    /**
     * Sets the value of the paymentDelinquencyStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentDelinquencyStatusEnum }{@code >}
     *     
     */
    public void setPaymentDelinquencyStatusType(JAXBElement<PaymentDelinquencyStatusEnum> value) {
        this.paymentDelinquencyStatusType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DELINQUENCYSTATUSEXTENSION }
     *     
     */
    public DELINQUENCYSTATUSEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELINQUENCYSTATUSEXTENSION }
     *     
     */
    public void setEXTENSION(DELINQUENCYSTATUSEXTENSION value) {
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
