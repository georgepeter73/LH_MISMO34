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
 * Information about an agreement between parties to honor a given price for a specified period of time. In some contexts, this is commonly known as a Rate Lock, as the interest rate is one of the key attributes of the price quote that is being locked.
 * 
 * <p>Java class for LOCK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanPriceQuoteIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="LoanPriceQuoteType" type="{http://www.mismo.org/residential/2009/schemas}LoanPriceQuoteEnum" minOccurs="0"/>
 *         &lt;element name="LoanPriceQuoteTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LockDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *         &lt;element name="LockDurationDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LockExpirationDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *         &lt;element name="LockIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="LockRequestedExtensionDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LockStatusType" type="{http://www.mismo.org/residential/2009/schemas}LockStatusEnum" minOccurs="0"/>
 *         &lt;element name="LockStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PriceRequestIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PriceResponseIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LOCK_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "LOCK", propOrder = {
    "loanPriceQuoteIdentifier",
    "loanPriceQuoteType",
    "loanPriceQuoteTypeOtherDescription",
    "lockDatetime",
    "lockDurationDaysCount",
    "lockExpirationDatetime",
    "lockIdentifier",
    "lockRequestedExtensionDaysCount",
    "lockStatusType",
    "lockStatusTypeOtherDescription",
    "priceRequestIdentifier",
    "priceResponseIdentifier",
    "extension"
})
public class LOCK {

    @XmlElementRef(name = "LoanPriceQuoteIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> loanPriceQuoteIdentifier;
    @XmlElementRef(name = "LoanPriceQuoteType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanPriceQuoteEnum> loanPriceQuoteType;
    @XmlElementRef(name = "LoanPriceQuoteTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanPriceQuoteTypeOtherDescription;
    @XmlElementRef(name = "LockDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> lockDatetime;
    @XmlElementRef(name = "LockDurationDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> lockDurationDaysCount;
    @XmlElementRef(name = "LockExpirationDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> lockExpirationDatetime;
    @XmlElementRef(name = "LockIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> lockIdentifier;
    @XmlElementRef(name = "LockRequestedExtensionDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> lockRequestedExtensionDaysCount;
    @XmlElementRef(name = "LockStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LockStatusEnum> lockStatusType;
    @XmlElementRef(name = "LockStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> lockStatusTypeOtherDescription;
    @XmlElementRef(name = "PriceRequestIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> priceRequestIdentifier;
    @XmlElementRef(name = "PriceResponseIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> priceResponseIdentifier;
    @XmlElement(name = "EXTENSION")
    protected LOCKEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the loanPriceQuoteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getLoanPriceQuoteIdentifier() {
        return loanPriceQuoteIdentifier;
    }

    /**
     * Sets the value of the loanPriceQuoteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setLoanPriceQuoteIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.loanPriceQuoteIdentifier = value;
    }

    /**
     * Gets the value of the loanPriceQuoteType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanPriceQuoteEnum }{@code >}
     *     
     */
    public JAXBElement<LoanPriceQuoteEnum> getLoanPriceQuoteType() {
        return loanPriceQuoteType;
    }

    /**
     * Sets the value of the loanPriceQuoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanPriceQuoteEnum }{@code >}
     *     
     */
    public void setLoanPriceQuoteType(JAXBElement<LoanPriceQuoteEnum> value) {
        this.loanPriceQuoteType = value;
    }

    /**
     * Gets the value of the loanPriceQuoteTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLoanPriceQuoteTypeOtherDescription() {
        return loanPriceQuoteTypeOtherDescription;
    }

    /**
     * Sets the value of the loanPriceQuoteTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLoanPriceQuoteTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanPriceQuoteTypeOtherDescription = value;
    }

    /**
     * Gets the value of the lockDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public JAXBElement<MISMODatetime> getLockDatetime() {
        return lockDatetime;
    }

    /**
     * Sets the value of the lockDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public void setLockDatetime(JAXBElement<MISMODatetime> value) {
        this.lockDatetime = value;
    }

    /**
     * Gets the value of the lockDurationDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLockDurationDaysCount() {
        return lockDurationDaysCount;
    }

    /**
     * Sets the value of the lockDurationDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLockDurationDaysCount(JAXBElement<MISMOCount> value) {
        this.lockDurationDaysCount = value;
    }

    /**
     * Gets the value of the lockExpirationDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public JAXBElement<MISMODatetime> getLockExpirationDatetime() {
        return lockExpirationDatetime;
    }

    /**
     * Sets the value of the lockExpirationDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public void setLockExpirationDatetime(JAXBElement<MISMODatetime> value) {
        this.lockExpirationDatetime = value;
    }

    /**
     * Gets the value of the lockIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getLockIdentifier() {
        return lockIdentifier;
    }

    /**
     * Sets the value of the lockIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setLockIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.lockIdentifier = value;
    }

    /**
     * Gets the value of the lockRequestedExtensionDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLockRequestedExtensionDaysCount() {
        return lockRequestedExtensionDaysCount;
    }

    /**
     * Sets the value of the lockRequestedExtensionDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLockRequestedExtensionDaysCount(JAXBElement<MISMOCount> value) {
        this.lockRequestedExtensionDaysCount = value;
    }

    /**
     * Gets the value of the lockStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LockStatusEnum }{@code >}
     *     
     */
    public JAXBElement<LockStatusEnum> getLockStatusType() {
        return lockStatusType;
    }

    /**
     * Sets the value of the lockStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LockStatusEnum }{@code >}
     *     
     */
    public void setLockStatusType(JAXBElement<LockStatusEnum> value) {
        this.lockStatusType = value;
    }

    /**
     * Gets the value of the lockStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLockStatusTypeOtherDescription() {
        return lockStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the lockStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLockStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.lockStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the priceRequestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getPriceRequestIdentifier() {
        return priceRequestIdentifier;
    }

    /**
     * Sets the value of the priceRequestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setPriceRequestIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.priceRequestIdentifier = value;
    }

    /**
     * Gets the value of the priceResponseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getPriceResponseIdentifier() {
        return priceResponseIdentifier;
    }

    /**
     * Sets the value of the priceResponseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setPriceResponseIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.priceResponseIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link LOCKEXTENSION }
     *     
     */
    public LOCKEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCKEXTENSION }
     *     
     */
    public void setEXTENSION(LOCKEXTENSION value) {
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
