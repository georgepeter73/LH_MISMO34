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
 * Additional information about mortgage counseling or education delivered to the borrower.
 * 
 * <p>Java class for COUNSELING_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COUNSELING_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HousingCounselingAgenciesListProvidedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="HousingCounselingAgencyListSourceType" type="{http://www.mismo.org/residential/2009/schemas}HousingCounselingAgencyListSourceEnum" minOccurs="0"/>
 *         &lt;element name="HousingCounselingAgencyListSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="HUDCounselingInitiatedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COUNSELING_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COUNSELING_DETAIL", propOrder = {
    "housingCounselingAgenciesListProvidedDate",
    "housingCounselingAgencyListSourceType",
    "housingCounselingAgencyListSourceTypeOtherDescription",
    "hudCounselingInitiatedIndicator",
    "extension"
})
public class COUNSELINGDETAIL {

    @XmlElementRef(name = "HousingCounselingAgenciesListProvidedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> housingCounselingAgenciesListProvidedDate;
    @XmlElementRef(name = "HousingCounselingAgencyListSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<HousingCounselingAgencyListSourceEnum> housingCounselingAgencyListSourceType;
    @XmlElementRef(name = "HousingCounselingAgencyListSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> housingCounselingAgencyListSourceTypeOtherDescription;
    @XmlElementRef(name = "HUDCounselingInitiatedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hudCounselingInitiatedIndicator;
    @XmlElement(name = "EXTENSION")
    protected COUNSELINGDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the housingCounselingAgenciesListProvidedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getHousingCounselingAgenciesListProvidedDate() {
        return housingCounselingAgenciesListProvidedDate;
    }

    /**
     * Sets the value of the housingCounselingAgenciesListProvidedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setHousingCounselingAgenciesListProvidedDate(JAXBElement<MISMODate> value) {
        this.housingCounselingAgenciesListProvidedDate = value;
    }

    /**
     * Gets the value of the housingCounselingAgencyListSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HousingCounselingAgencyListSourceEnum }{@code >}
     *     
     */
    public JAXBElement<HousingCounselingAgencyListSourceEnum> getHousingCounselingAgencyListSourceType() {
        return housingCounselingAgencyListSourceType;
    }

    /**
     * Sets the value of the housingCounselingAgencyListSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HousingCounselingAgencyListSourceEnum }{@code >}
     *     
     */
    public void setHousingCounselingAgencyListSourceType(JAXBElement<HousingCounselingAgencyListSourceEnum> value) {
        this.housingCounselingAgencyListSourceType = value;
    }

    /**
     * Gets the value of the housingCounselingAgencyListSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getHousingCounselingAgencyListSourceTypeOtherDescription() {
        return housingCounselingAgencyListSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the housingCounselingAgencyListSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setHousingCounselingAgencyListSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.housingCounselingAgencyListSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the hudCounselingInitiatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getHUDCounselingInitiatedIndicator() {
        return hudCounselingInitiatedIndicator;
    }

    /**
     * Sets the value of the hudCounselingInitiatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setHUDCounselingInitiatedIndicator(JAXBElement<MISMOIndicator> value) {
        this.hudCounselingInitiatedIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COUNSELINGDETAILEXTENSION }
     *     
     */
    public COUNSELINGDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUNSELINGDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(COUNSELINGDETAILEXTENSION value) {
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
