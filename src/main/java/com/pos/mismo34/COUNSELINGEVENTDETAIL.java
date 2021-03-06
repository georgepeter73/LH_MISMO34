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
 * Collection of data points pertaining to the details of the counseling event.
 * 
 * <p>Java class for COUNSELING_EVENT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COUNSELING_EVENT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CounselingCompletedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CounselingConfirmationIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CounselingDeliveredDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CounselingFormatType" type="{http://www.mismo.org/residential/2009/schemas}CounselingFormatEnum" minOccurs="0"/>
 *         &lt;element name="CounselingFormatTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CounselingInitiatedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CounselingProviderType" type="{http://www.mismo.org/residential/2009/schemas}CounselingProviderEnum" minOccurs="0"/>
 *         &lt;element name="CounselingProviderTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CounselingSettingType" type="{http://www.mismo.org/residential/2009/schemas}CounselingSettingEnum" minOccurs="0"/>
 *         &lt;element name="CounselingSettingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CounselingType" type="{http://www.mismo.org/residential/2009/schemas}CounselingEnum" minOccurs="0"/>
 *         &lt;element name="HousingCounselingCertificationIssuedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COUNSELING_EVENT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COUNSELING_EVENT_DETAIL", propOrder = {
    "counselingCompletedDate",
    "counselingConfirmationIndicator",
    "counselingDeliveredDate",
    "counselingFormatType",
    "counselingFormatTypeOtherDescription",
    "counselingInitiatedDate",
    "counselingProviderType",
    "counselingProviderTypeOtherDescription",
    "counselingSettingType",
    "counselingSettingTypeOtherDescription",
    "counselingType",
    "housingCounselingCertificationIssuedDate",
    "extension"
})
public class COUNSELINGEVENTDETAIL {

    @XmlElementRef(name = "CounselingCompletedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> counselingCompletedDate;
    @XmlElementRef(name = "CounselingConfirmationIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> counselingConfirmationIndicator;
    @XmlElementRef(name = "CounselingDeliveredDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> counselingDeliveredDate;
    @XmlElementRef(name = "CounselingFormatType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CounselingFormatEnum> counselingFormatType;
    @XmlElementRef(name = "CounselingFormatTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> counselingFormatTypeOtherDescription;
    @XmlElementRef(name = "CounselingInitiatedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> counselingInitiatedDate;
    @XmlElementRef(name = "CounselingProviderType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CounselingProviderEnum> counselingProviderType;
    @XmlElementRef(name = "CounselingProviderTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> counselingProviderTypeOtherDescription;
    @XmlElementRef(name = "CounselingSettingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CounselingSettingEnum> counselingSettingType;
    @XmlElementRef(name = "CounselingSettingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> counselingSettingTypeOtherDescription;
    @XmlElementRef(name = "CounselingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CounselingEnum> counselingType;
    @XmlElementRef(name = "HousingCounselingCertificationIssuedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> housingCounselingCertificationIssuedDate;
    @XmlElement(name = "EXTENSION")
    protected COUNSELINGEVENTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the counselingCompletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCounselingCompletedDate() {
        return counselingCompletedDate;
    }

    /**
     * Sets the value of the counselingCompletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCounselingCompletedDate(JAXBElement<MISMODate> value) {
        this.counselingCompletedDate = value;
    }

    /**
     * Gets the value of the counselingConfirmationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCounselingConfirmationIndicator() {
        return counselingConfirmationIndicator;
    }

    /**
     * Sets the value of the counselingConfirmationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCounselingConfirmationIndicator(JAXBElement<MISMOIndicator> value) {
        this.counselingConfirmationIndicator = value;
    }

    /**
     * Gets the value of the counselingDeliveredDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCounselingDeliveredDate() {
        return counselingDeliveredDate;
    }

    /**
     * Sets the value of the counselingDeliveredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCounselingDeliveredDate(JAXBElement<MISMODate> value) {
        this.counselingDeliveredDate = value;
    }

    /**
     * Gets the value of the counselingFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CounselingFormatEnum }{@code >}
     *     
     */
    public JAXBElement<CounselingFormatEnum> getCounselingFormatType() {
        return counselingFormatType;
    }

    /**
     * Sets the value of the counselingFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CounselingFormatEnum }{@code >}
     *     
     */
    public void setCounselingFormatType(JAXBElement<CounselingFormatEnum> value) {
        this.counselingFormatType = value;
    }

    /**
     * Gets the value of the counselingFormatTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCounselingFormatTypeOtherDescription() {
        return counselingFormatTypeOtherDescription;
    }

    /**
     * Sets the value of the counselingFormatTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCounselingFormatTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.counselingFormatTypeOtherDescription = value;
    }

    /**
     * Gets the value of the counselingInitiatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCounselingInitiatedDate() {
        return counselingInitiatedDate;
    }

    /**
     * Sets the value of the counselingInitiatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCounselingInitiatedDate(JAXBElement<MISMODate> value) {
        this.counselingInitiatedDate = value;
    }

    /**
     * Gets the value of the counselingProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CounselingProviderEnum }{@code >}
     *     
     */
    public JAXBElement<CounselingProviderEnum> getCounselingProviderType() {
        return counselingProviderType;
    }

    /**
     * Sets the value of the counselingProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CounselingProviderEnum }{@code >}
     *     
     */
    public void setCounselingProviderType(JAXBElement<CounselingProviderEnum> value) {
        this.counselingProviderType = value;
    }

    /**
     * Gets the value of the counselingProviderTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCounselingProviderTypeOtherDescription() {
        return counselingProviderTypeOtherDescription;
    }

    /**
     * Sets the value of the counselingProviderTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCounselingProviderTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.counselingProviderTypeOtherDescription = value;
    }

    /**
     * Gets the value of the counselingSettingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CounselingSettingEnum }{@code >}
     *     
     */
    public JAXBElement<CounselingSettingEnum> getCounselingSettingType() {
        return counselingSettingType;
    }

    /**
     * Sets the value of the counselingSettingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CounselingSettingEnum }{@code >}
     *     
     */
    public void setCounselingSettingType(JAXBElement<CounselingSettingEnum> value) {
        this.counselingSettingType = value;
    }

    /**
     * Gets the value of the counselingSettingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCounselingSettingTypeOtherDescription() {
        return counselingSettingTypeOtherDescription;
    }

    /**
     * Sets the value of the counselingSettingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCounselingSettingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.counselingSettingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the counselingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CounselingEnum }{@code >}
     *     
     */
    public JAXBElement<CounselingEnum> getCounselingType() {
        return counselingType;
    }

    /**
     * Sets the value of the counselingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CounselingEnum }{@code >}
     *     
     */
    public void setCounselingType(JAXBElement<CounselingEnum> value) {
        this.counselingType = value;
    }

    /**
     * Gets the value of the housingCounselingCertificationIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHousingCounselingCertificationIssuedDate() {
        return housingCounselingCertificationIssuedDate;
    }

    /**
     * Sets the value of the housingCounselingCertificationIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHousingCounselingCertificationIssuedDate(JAXBElement<MISMODate> value) {
        this.housingCounselingCertificationIssuedDate = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COUNSELINGEVENTDETAILEXTENSION }
     *     
     */
    public COUNSELINGEVENTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNSELINGEVENTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(COUNSELINGEVENTDETAILEXTENSION value) {
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
