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
 * <p>Java class for VALUATION_UPDATE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_UPDATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppraisalCompletionCertificateCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraisalCompletionCertificateIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AppraisalReviewOriginalAppraisalEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="AppraisalReviewOriginalAppraisedValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="AppraisalUpdateCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraisalUpdateIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="AppraisalUpdateOriginalAppraiserCompanyName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraisalUpdateOriginalAppraiserUnparsedName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraisalUpdateOriginalLenderAddressLineText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraisalUpdateOriginalLenderUnparsedName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyImprovementsCompletedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertyMarketValueDecreasedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_UPDATE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VALUATION_UPDATE", propOrder = {
    "appraisalCompletionCertificateCommentDescription",
    "appraisalCompletionCertificateIndicator",
    "appraisalReviewOriginalAppraisalEffectiveDate",
    "appraisalReviewOriginalAppraisedValueAmount",
    "appraisalUpdateCommentDescription",
    "appraisalUpdateIndicator",
    "appraisalUpdateOriginalAppraiserCompanyName",
    "appraisalUpdateOriginalAppraiserUnparsedName",
    "appraisalUpdateOriginalLenderAddressLineText",
    "appraisalUpdateOriginalLenderUnparsedName",
    "propertyImprovementsCompletedIndicator",
    "propertyMarketValueDecreasedIndicator",
    "extension"
})
public class VALUATIONUPDATE {

    @XmlElementRef(name = "AppraisalCompletionCertificateCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraisalCompletionCertificateCommentDescription;
    @XmlElementRef(name = "AppraisalCompletionCertificateIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> appraisalCompletionCertificateIndicator;
    @XmlElementRef(name = "AppraisalReviewOriginalAppraisalEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> appraisalReviewOriginalAppraisalEffectiveDate;
    @XmlElementRef(name = "AppraisalReviewOriginalAppraisedValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> appraisalReviewOriginalAppraisedValueAmount;
    @XmlElementRef(name = "AppraisalUpdateCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraisalUpdateCommentDescription;
    @XmlElementRef(name = "AppraisalUpdateIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> appraisalUpdateIndicator;
    @XmlElementRef(name = "AppraisalUpdateOriginalAppraiserCompanyName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraisalUpdateOriginalAppraiserCompanyName;
    @XmlElementRef(name = "AppraisalUpdateOriginalAppraiserUnparsedName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraisalUpdateOriginalAppraiserUnparsedName;
    @XmlElementRef(name = "AppraisalUpdateOriginalLenderAddressLineText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraisalUpdateOriginalLenderAddressLineText;
    @XmlElementRef(name = "AppraisalUpdateOriginalLenderUnparsedName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraisalUpdateOriginalLenderUnparsedName;
    @XmlElementRef(name = "PropertyImprovementsCompletedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> propertyImprovementsCompletedIndicator;
    @XmlElementRef(name = "PropertyMarketValueDecreasedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> propertyMarketValueDecreasedIndicator;
    @XmlElement(name = "EXTENSION")
    protected VALUATIONUPDATEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraisalCompletionCertificateCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraisalCompletionCertificateCommentDescription() {
        return appraisalCompletionCertificateCommentDescription;
    }

    /**
     * Sets the value of the appraisalCompletionCertificateCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraisalCompletionCertificateCommentDescription(JAXBElement<MISMOString> value) {
        this.appraisalCompletionCertificateCommentDescription = value;
    }

    /**
     * Gets the value of the appraisalCompletionCertificateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAppraisalCompletionCertificateIndicator() {
        return appraisalCompletionCertificateIndicator;
    }

    /**
     * Sets the value of the appraisalCompletionCertificateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAppraisalCompletionCertificateIndicator(JAXBElement<MISMOIndicator> value) {
        this.appraisalCompletionCertificateIndicator = value;
    }

    /**
     * Gets the value of the appraisalReviewOriginalAppraisalEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAppraisalReviewOriginalAppraisalEffectiveDate() {
        return appraisalReviewOriginalAppraisalEffectiveDate;
    }

    /**
     * Sets the value of the appraisalReviewOriginalAppraisalEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAppraisalReviewOriginalAppraisalEffectiveDate(JAXBElement<MISMODate> value) {
        this.appraisalReviewOriginalAppraisalEffectiveDate = value;
    }

    /**
     * Gets the value of the appraisalReviewOriginalAppraisedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getAppraisalReviewOriginalAppraisedValueAmount() {
        return appraisalReviewOriginalAppraisedValueAmount;
    }

    /**
     * Sets the value of the appraisalReviewOriginalAppraisedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setAppraisalReviewOriginalAppraisedValueAmount(JAXBElement<MISMOAmount> value) {
        this.appraisalReviewOriginalAppraisedValueAmount = value;
    }

    /**
     * Gets the value of the appraisalUpdateCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraisalUpdateCommentDescription() {
        return appraisalUpdateCommentDescription;
    }

    /**
     * Sets the value of the appraisalUpdateCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraisalUpdateCommentDescription(JAXBElement<MISMOString> value) {
        this.appraisalUpdateCommentDescription = value;
    }

    /**
     * Gets the value of the appraisalUpdateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAppraisalUpdateIndicator() {
        return appraisalUpdateIndicator;
    }

    /**
     * Sets the value of the appraisalUpdateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAppraisalUpdateIndicator(JAXBElement<MISMOIndicator> value) {
        this.appraisalUpdateIndicator = value;
    }

    /**
     * Gets the value of the appraisalUpdateOriginalAppraiserCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraisalUpdateOriginalAppraiserCompanyName() {
        return appraisalUpdateOriginalAppraiserCompanyName;
    }

    /**
     * Sets the value of the appraisalUpdateOriginalAppraiserCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraisalUpdateOriginalAppraiserCompanyName(JAXBElement<MISMOString> value) {
        this.appraisalUpdateOriginalAppraiserCompanyName = value;
    }

    /**
     * Gets the value of the appraisalUpdateOriginalAppraiserUnparsedName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraisalUpdateOriginalAppraiserUnparsedName() {
        return appraisalUpdateOriginalAppraiserUnparsedName;
    }

    /**
     * Sets the value of the appraisalUpdateOriginalAppraiserUnparsedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraisalUpdateOriginalAppraiserUnparsedName(JAXBElement<MISMOString> value) {
        this.appraisalUpdateOriginalAppraiserUnparsedName = value;
    }

    /**
     * Gets the value of the appraisalUpdateOriginalLenderAddressLineText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraisalUpdateOriginalLenderAddressLineText() {
        return appraisalUpdateOriginalLenderAddressLineText;
    }

    /**
     * Sets the value of the appraisalUpdateOriginalLenderAddressLineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraisalUpdateOriginalLenderAddressLineText(JAXBElement<MISMOString> value) {
        this.appraisalUpdateOriginalLenderAddressLineText = value;
    }

    /**
     * Gets the value of the appraisalUpdateOriginalLenderUnparsedName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraisalUpdateOriginalLenderUnparsedName() {
        return appraisalUpdateOriginalLenderUnparsedName;
    }

    /**
     * Sets the value of the appraisalUpdateOriginalLenderUnparsedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraisalUpdateOriginalLenderUnparsedName(JAXBElement<MISMOString> value) {
        this.appraisalUpdateOriginalLenderUnparsedName = value;
    }

    /**
     * Gets the value of the propertyImprovementsCompletedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPropertyImprovementsCompletedIndicator() {
        return propertyImprovementsCompletedIndicator;
    }

    /**
     * Sets the value of the propertyImprovementsCompletedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPropertyImprovementsCompletedIndicator(JAXBElement<MISMOIndicator> value) {
        this.propertyImprovementsCompletedIndicator = value;
    }

    /**
     * Gets the value of the propertyMarketValueDecreasedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPropertyMarketValueDecreasedIndicator() {
        return propertyMarketValueDecreasedIndicator;
    }

    /**
     * Sets the value of the propertyMarketValueDecreasedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPropertyMarketValueDecreasedIndicator(JAXBElement<MISMOIndicator> value) {
        this.propertyMarketValueDecreasedIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONUPDATEEXTENSION }
     *     
     */
    public VALUATIONUPDATEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONUPDATEEXTENSION }
     *     
     */
    public void setEXTENSION(VALUATIONUPDATEEXTENSION value) {
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
