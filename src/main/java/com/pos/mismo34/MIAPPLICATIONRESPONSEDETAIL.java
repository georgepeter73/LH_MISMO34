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
 * <p>Java class for MI_APPLICATION_RESPONSE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_APPLICATION_RESPONSE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MI_LTVPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MIApplicationType" type="{http://www.mismo.org/residential/2009/schemas}MIApplicationEnum" minOccurs="0"/>
 *         &lt;element name="MIApplicationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MICertificateExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="MICertificateIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MICertificateType" type="{http://www.mismo.org/residential/2009/schemas}MICertificateEnum" minOccurs="0"/>
 *         &lt;element name="MICommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MICompanyNameType" type="{http://www.mismo.org/residential/2009/schemas}MICompanyNameEnum" minOccurs="0"/>
 *         &lt;element name="MICompanyNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MICoveragePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="MICoveragePlanType" type="{http://www.mismo.org/residential/2009/schemas}MICoveragePlanEnum" minOccurs="0"/>
 *         &lt;element name="MICoveragePlanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIDecisionType" type="{http://www.mismo.org/residential/2009/schemas}MIDecisionEnum" minOccurs="0"/>
 *         &lt;element name="MIDurationType" type="{http://www.mismo.org/residential/2009/schemas}MIDurationEnum" minOccurs="0"/>
 *         &lt;element name="MIDurationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIInitialPremiumAtClosingType" type="{http://www.mismo.org/residential/2009/schemas}MIInitialPremiumAtClosingEnum" minOccurs="0"/>
 *         &lt;element name="MIInitialPremiumAtClosingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MILenderIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MIPremiumFromClosingAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="MIPremiumPaymentType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumPaymentEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumPaymentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumRatePlanType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumRatePlanEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumRatePlanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumRefundableType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumRefundableEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumRefundableTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIPremiumSourceType" type="{http://www.mismo.org/residential/2009/schemas}MIPremiumSourceEnum" minOccurs="0"/>
 *         &lt;element name="MIPremiumSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MIServiceType" type="{http://www.mismo.org/residential/2009/schemas}MIServiceEnum" minOccurs="0"/>
 *         &lt;element name="MIServiceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MISourceType" type="{http://www.mismo.org/residential/2009/schemas}MISourceEnum" minOccurs="0"/>
 *         &lt;element name="MISourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MITransactionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_APPLICATION_RESPONSE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_APPLICATION_RESPONSE_DETAIL", propOrder = {
    "miltvPercent",
    "miApplicationType",
    "miApplicationTypeOtherDescription",
    "miCertificateExpirationDate",
    "miCertificateIdentifier",
    "miCertificateType",
    "miCommentDescription",
    "miCompanyNameType",
    "miCompanyNameTypeOtherDescription",
    "miCoveragePercent",
    "miCoveragePlanType",
    "miCoveragePlanTypeOtherDescription",
    "miDecisionType",
    "miDurationType",
    "miDurationTypeOtherDescription",
    "miInitialPremiumAtClosingType",
    "miInitialPremiumAtClosingTypeOtherDescription",
    "miLenderIdentifier",
    "miPremiumFromClosingAmount",
    "miPremiumPaymentType",
    "miPremiumPaymentTypeOtherDescription",
    "miPremiumRatePlanType",
    "miPremiumRatePlanTypeOtherDescription",
    "miPremiumRefundableType",
    "miPremiumRefundableTypeOtherDescription",
    "miPremiumSourceType",
    "miPremiumSourceTypeOtherDescription",
    "miServiceType",
    "miServiceTypeOtherDescription",
    "miSourceType",
    "miSourceTypeOtherDescription",
    "miTransactionIdentifier",
    "extension"
})
public class MIAPPLICATIONRESPONSEDETAIL {

    @XmlElementRef(name = "MI_LTVPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> miltvPercent;
    @XmlElementRef(name = "MIApplicationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIApplicationEnum> miApplicationType;
    @XmlElementRef(name = "MIApplicationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miApplicationTypeOtherDescription;
    @XmlElementRef(name = "MICertificateExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> miCertificateExpirationDate;
    @XmlElementRef(name = "MICertificateIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miCertificateIdentifier;
    @XmlElementRef(name = "MICertificateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MICertificateEnum> miCertificateType;
    @XmlElementRef(name = "MICommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miCommentDescription;
    @XmlElementRef(name = "MICompanyNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MICompanyNameEnum> miCompanyNameType;
    @XmlElementRef(name = "MICompanyNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miCompanyNameTypeOtherDescription;
    @XmlElementRef(name = "MICoveragePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> miCoveragePercent;
    @XmlElementRef(name = "MICoveragePlanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MICoveragePlanEnum> miCoveragePlanType;
    @XmlElementRef(name = "MICoveragePlanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miCoveragePlanTypeOtherDescription;
    @XmlElementRef(name = "MIDecisionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIDecisionEnum> miDecisionType;
    @XmlElementRef(name = "MIDurationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIDurationEnum> miDurationType;
    @XmlElementRef(name = "MIDurationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miDurationTypeOtherDescription;
    @XmlElementRef(name = "MIInitialPremiumAtClosingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIInitialPremiumAtClosingEnum> miInitialPremiumAtClosingType;
    @XmlElementRef(name = "MIInitialPremiumAtClosingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miInitialPremiumAtClosingTypeOtherDescription;
    @XmlElementRef(name = "MILenderIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miLenderIdentifier;
    @XmlElementRef(name = "MIPremiumFromClosingAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> miPremiumFromClosingAmount;
    @XmlElementRef(name = "MIPremiumPaymentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumPaymentEnum> miPremiumPaymentType;
    @XmlElementRef(name = "MIPremiumPaymentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumPaymentTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumRatePlanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumRatePlanEnum> miPremiumRatePlanType;
    @XmlElementRef(name = "MIPremiumRatePlanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumRatePlanTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumRefundableType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumRefundableEnum> miPremiumRefundableType;
    @XmlElementRef(name = "MIPremiumRefundableTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumRefundableTypeOtherDescription;
    @XmlElementRef(name = "MIPremiumSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIPremiumSourceEnum> miPremiumSourceType;
    @XmlElementRef(name = "MIPremiumSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miPremiumSourceTypeOtherDescription;
    @XmlElementRef(name = "MIServiceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MIServiceEnum> miServiceType;
    @XmlElementRef(name = "MIServiceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miServiceTypeOtherDescription;
    @XmlElementRef(name = "MISourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISourceEnum> miSourceType;
    @XmlElementRef(name = "MISourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> miSourceTypeOtherDescription;
    @XmlElementRef(name = "MITransactionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> miTransactionIdentifier;
    @XmlElement(name = "EXTENSION")
    protected MIAPPLICATIONRESPONSEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the miltvPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMILTVPercent() {
        return miltvPercent;
    }

    /**
     * Sets the value of the miltvPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMILTVPercent(JAXBElement<MISMOPercent> value) {
        this.miltvPercent = value;
    }

    /**
     * Gets the value of the miApplicationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIApplicationEnum }{@code >}
     *     
     */
    public JAXBElement<MIApplicationEnum> getMIApplicationType() {
        return miApplicationType;
    }

    /**
     * Sets the value of the miApplicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIApplicationEnum }{@code >}
     *     
     */
    public void setMIApplicationType(JAXBElement<MIApplicationEnum> value) {
        this.miApplicationType = value;
    }

    /**
     * Gets the value of the miApplicationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIApplicationTypeOtherDescription() {
        return miApplicationTypeOtherDescription;
    }

    /**
     * Sets the value of the miApplicationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIApplicationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miApplicationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miCertificateExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getMICertificateExpirationDate() {
        return miCertificateExpirationDate;
    }

    /**
     * Sets the value of the miCertificateExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setMICertificateExpirationDate(JAXBElement<MISMODate> value) {
        this.miCertificateExpirationDate = value;
    }

    /**
     * Gets the value of the miCertificateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMICertificateIdentifier() {
        return miCertificateIdentifier;
    }

    /**
     * Sets the value of the miCertificateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMICertificateIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miCertificateIdentifier = value;
    }

    /**
     * Gets the value of the miCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MICertificateEnum }{@code >}
     *     
     */
    public JAXBElement<MICertificateEnum> getMICertificateType() {
        return miCertificateType;
    }

    /**
     * Sets the value of the miCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MICertificateEnum }{@code >}
     *     
     */
    public void setMICertificateType(JAXBElement<MICertificateEnum> value) {
        this.miCertificateType = value;
    }

    /**
     * Gets the value of the miCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMICommentDescription() {
        return miCommentDescription;
    }

    /**
     * Sets the value of the miCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMICommentDescription(JAXBElement<MISMOString> value) {
        this.miCommentDescription = value;
    }

    /**
     * Gets the value of the miCompanyNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MICompanyNameEnum }{@code >}
     *     
     */
    public JAXBElement<MICompanyNameEnum> getMICompanyNameType() {
        return miCompanyNameType;
    }

    /**
     * Sets the value of the miCompanyNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MICompanyNameEnum }{@code >}
     *     
     */
    public void setMICompanyNameType(JAXBElement<MICompanyNameEnum> value) {
        this.miCompanyNameType = value;
    }

    /**
     * Gets the value of the miCompanyNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMICompanyNameTypeOtherDescription() {
        return miCompanyNameTypeOtherDescription;
    }

    /**
     * Sets the value of the miCompanyNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMICompanyNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miCompanyNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miCoveragePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getMICoveragePercent() {
        return miCoveragePercent;
    }

    /**
     * Sets the value of the miCoveragePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setMICoveragePercent(JAXBElement<MISMOPercent> value) {
        this.miCoveragePercent = value;
    }

    /**
     * Gets the value of the miCoveragePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MICoveragePlanEnum }{@code >}
     *     
     */
    public JAXBElement<MICoveragePlanEnum> getMICoveragePlanType() {
        return miCoveragePlanType;
    }

    /**
     * Sets the value of the miCoveragePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MICoveragePlanEnum }{@code >}
     *     
     */
    public void setMICoveragePlanType(JAXBElement<MICoveragePlanEnum> value) {
        this.miCoveragePlanType = value;
    }

    /**
     * Gets the value of the miCoveragePlanTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMICoveragePlanTypeOtherDescription() {
        return miCoveragePlanTypeOtherDescription;
    }

    /**
     * Sets the value of the miCoveragePlanTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMICoveragePlanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miCoveragePlanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miDecisionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIDecisionEnum }{@code >}
     *     
     */
    public JAXBElement<MIDecisionEnum> getMIDecisionType() {
        return miDecisionType;
    }

    /**
     * Sets the value of the miDecisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIDecisionEnum }{@code >}
     *     
     */
    public void setMIDecisionType(JAXBElement<MIDecisionEnum> value) {
        this.miDecisionType = value;
    }

    /**
     * Gets the value of the miDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIDurationEnum }{@code >}
     *     
     */
    public JAXBElement<MIDurationEnum> getMIDurationType() {
        return miDurationType;
    }

    /**
     * Sets the value of the miDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIDurationEnum }{@code >}
     *     
     */
    public void setMIDurationType(JAXBElement<MIDurationEnum> value) {
        this.miDurationType = value;
    }

    /**
     * Gets the value of the miDurationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIDurationTypeOtherDescription() {
        return miDurationTypeOtherDescription;
    }

    /**
     * Sets the value of the miDurationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIDurationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miDurationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miInitialPremiumAtClosingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIInitialPremiumAtClosingEnum }{@code >}
     *     
     */
    public JAXBElement<MIInitialPremiumAtClosingEnum> getMIInitialPremiumAtClosingType() {
        return miInitialPremiumAtClosingType;
    }

    /**
     * Sets the value of the miInitialPremiumAtClosingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIInitialPremiumAtClosingEnum }{@code >}
     *     
     */
    public void setMIInitialPremiumAtClosingType(JAXBElement<MIInitialPremiumAtClosingEnum> value) {
        this.miInitialPremiumAtClosingType = value;
    }

    /**
     * Gets the value of the miInitialPremiumAtClosingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIInitialPremiumAtClosingTypeOtherDescription() {
        return miInitialPremiumAtClosingTypeOtherDescription;
    }

    /**
     * Sets the value of the miInitialPremiumAtClosingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIInitialPremiumAtClosingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miInitialPremiumAtClosingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miLenderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMILenderIdentifier() {
        return miLenderIdentifier;
    }

    /**
     * Sets the value of the miLenderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMILenderIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miLenderIdentifier = value;
    }

    /**
     * Gets the value of the miPremiumFromClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getMIPremiumFromClosingAmount() {
        return miPremiumFromClosingAmount;
    }

    /**
     * Sets the value of the miPremiumFromClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setMIPremiumFromClosingAmount(JAXBElement<MISMOAmount> value) {
        this.miPremiumFromClosingAmount = value;
    }

    /**
     * Gets the value of the miPremiumPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumPaymentEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumPaymentEnum> getMIPremiumPaymentType() {
        return miPremiumPaymentType;
    }

    /**
     * Sets the value of the miPremiumPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumPaymentEnum }{@code >}
     *     
     */
    public void setMIPremiumPaymentType(JAXBElement<MIPremiumPaymentEnum> value) {
        this.miPremiumPaymentType = value;
    }

    /**
     * Gets the value of the miPremiumPaymentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumPaymentTypeOtherDescription() {
        return miPremiumPaymentTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumPaymentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumPaymentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumPaymentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumRatePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRatePlanEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumRatePlanEnum> getMIPremiumRatePlanType() {
        return miPremiumRatePlanType;
    }

    /**
     * Sets the value of the miPremiumRatePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRatePlanEnum }{@code >}
     *     
     */
    public void setMIPremiumRatePlanType(JAXBElement<MIPremiumRatePlanEnum> value) {
        this.miPremiumRatePlanType = value;
    }

    /**
     * Gets the value of the miPremiumRatePlanTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumRatePlanTypeOtherDescription() {
        return miPremiumRatePlanTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumRatePlanTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumRatePlanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumRatePlanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumRefundableType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRefundableEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumRefundableEnum> getMIPremiumRefundableType() {
        return miPremiumRefundableType;
    }

    /**
     * Sets the value of the miPremiumRefundableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumRefundableEnum }{@code >}
     *     
     */
    public void setMIPremiumRefundableType(JAXBElement<MIPremiumRefundableEnum> value) {
        this.miPremiumRefundableType = value;
    }

    /**
     * Gets the value of the miPremiumRefundableTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumRefundableTypeOtherDescription() {
        return miPremiumRefundableTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumRefundableTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumRefundableTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumRefundableTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miPremiumSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumSourceEnum }{@code >}
     *     
     */
    public JAXBElement<MIPremiumSourceEnum> getMIPremiumSourceType() {
        return miPremiumSourceType;
    }

    /**
     * Sets the value of the miPremiumSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIPremiumSourceEnum }{@code >}
     *     
     */
    public void setMIPremiumSourceType(JAXBElement<MIPremiumSourceEnum> value) {
        this.miPremiumSourceType = value;
    }

    /**
     * Gets the value of the miPremiumSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIPremiumSourceTypeOtherDescription() {
        return miPremiumSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the miPremiumSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIPremiumSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miPremiumSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MIServiceEnum }{@code >}
     *     
     */
    public JAXBElement<MIServiceEnum> getMIServiceType() {
        return miServiceType;
    }

    /**
     * Sets the value of the miServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MIServiceEnum }{@code >}
     *     
     */
    public void setMIServiceType(JAXBElement<MIServiceEnum> value) {
        this.miServiceType = value;
    }

    /**
     * Gets the value of the miServiceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMIServiceTypeOtherDescription() {
        return miServiceTypeOtherDescription;
    }

    /**
     * Sets the value of the miServiceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMIServiceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miServiceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISourceEnum }{@code >}
     *     
     */
    public JAXBElement<MISourceEnum> getMISourceType() {
        return miSourceType;
    }

    /**
     * Sets the value of the miSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISourceEnum }{@code >}
     *     
     */
    public void setMISourceType(JAXBElement<MISourceEnum> value) {
        this.miSourceType = value;
    }

    /**
     * Gets the value of the miSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMISourceTypeOtherDescription() {
        return miSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the miSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMISourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.miSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the miTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMITransactionIdentifier() {
        return miTransactionIdentifier;
    }

    /**
     * Sets the value of the miTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMITransactionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.miTransactionIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIAPPLICATIONRESPONSEDETAILEXTENSION }
     *     
     */
    public MIAPPLICATIONRESPONSEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIAPPLICATIONRESPONSEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(MIAPPLICATIONRESPONSEDETAILEXTENSION value) {
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
