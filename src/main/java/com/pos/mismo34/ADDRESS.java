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
 * Address is based upon USPS publication 28. Publication 28 has two sections, format of an address on a piece of mail and data points that MAY compose an address. The data point children of ADDRESS are the union components of an address on a piece of mail or a package.
 * 
 * <p>Java class for ADDRESS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDRESS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressAdditionalLineText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AddressFormatType" type="{http://www.mismo.org/residential/2009/schemas}AddressFormatEnum" minOccurs="0"/>
 *         &lt;element name="AddressFormatTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AddressLineText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AddressType" type="{http://www.mismo.org/residential/2009/schemas}AddressEnum" minOccurs="0"/>
 *         &lt;element name="AddressTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AddressUnitDesignatorType" type="{http://www.mismo.org/residential/2009/schemas}AddressUnitDesignatorEnum" minOccurs="0"/>
 *         &lt;element name="AddressUnitDesignatorTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AddressUnitIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AttentionToName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CarrierRouteCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CountyCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CountyName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DeliveryPointBarCodeCheckValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="DeliveryPointBarCodeValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="HighwayContractRouteIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MailStopCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="PlusFourZipCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="PostOfficeBoxIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="RuralRouteBoxIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="RuralRouteIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="StateName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StreetPostDirectionalText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StreetPreDirectionalText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StreetPrimaryNumberText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StreetSuffixText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ADDRESS_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ADDRESS", propOrder = {
    "addressAdditionalLineText",
    "addressFormatType",
    "addressFormatTypeOtherDescription",
    "addressLineText",
    "addressType",
    "addressTypeOtherDescription",
    "addressUnitDesignatorType",
    "addressUnitDesignatorTypeOtherDescription",
    "addressUnitIdentifier",
    "attentionToName",
    "carrierRouteCode",
    "cityName",
    "countryCode",
    "countryName",
    "countyCode",
    "countyName",
    "deliveryPointBarCodeCheckValue",
    "deliveryPointBarCodeValue",
    "highwayContractRouteIdentifier",
    "mailStopCode",
    "plusFourZipCode",
    "postalCode",
    "postOfficeBoxIdentifier",
    "ruralRouteBoxIdentifier",
    "ruralRouteIdentifier",
    "stateCode",
    "stateName",
    "streetName",
    "streetPostDirectionalText",
    "streetPreDirectionalText",
    "streetPrimaryNumberText",
    "streetSuffixText",
    "extension"
})
public class ADDRESS {

    @XmlElementRef(name = "AddressAdditionalLineText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> addressAdditionalLineText;
    @XmlElementRef(name = "AddressFormatType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressFormatEnum> addressFormatType;
    @XmlElementRef(name = "AddressFormatTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> addressFormatTypeOtherDescription;
    @XmlElementRef(name = "AddressLineText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> addressLineText;
    @XmlElementRef(name = "AddressType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressEnum> addressType;
    @XmlElementRef(name = "AddressTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> addressTypeOtherDescription;
    @XmlElementRef(name = "AddressUnitDesignatorType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressUnitDesignatorEnum> addressUnitDesignatorType;
    @XmlElementRef(name = "AddressUnitDesignatorTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> addressUnitDesignatorTypeOtherDescription;
    @XmlElementRef(name = "AddressUnitIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> addressUnitIdentifier;
    @XmlElementRef(name = "AttentionToName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> attentionToName;
    @XmlElementRef(name = "CarrierRouteCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> carrierRouteCode;
    @XmlElementRef(name = "CityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> cityName;
    @XmlElementRef(name = "CountryCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> countryCode;
    @XmlElementRef(name = "CountryName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> countryName;
    @XmlElementRef(name = "CountyCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> countyCode;
    @XmlElementRef(name = "CountyName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> countyName;
    @XmlElementRef(name = "DeliveryPointBarCodeCheckValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> deliveryPointBarCodeCheckValue;
    @XmlElementRef(name = "DeliveryPointBarCodeValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> deliveryPointBarCodeValue;
    @XmlElementRef(name = "HighwayContractRouteIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> highwayContractRouteIdentifier;
    @XmlElementRef(name = "MailStopCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> mailStopCode;
    @XmlElementRef(name = "PlusFourZipCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> plusFourZipCode;
    @XmlElementRef(name = "PostalCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> postalCode;
    @XmlElementRef(name = "PostOfficeBoxIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> postOfficeBoxIdentifier;
    @XmlElementRef(name = "RuralRouteBoxIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> ruralRouteBoxIdentifier;
    @XmlElementRef(name = "RuralRouteIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> ruralRouteIdentifier;
    @XmlElementRef(name = "StateCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> stateCode;
    @XmlElementRef(name = "StateName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> stateName;
    @XmlElementRef(name = "StreetName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> streetName;
    @XmlElementRef(name = "StreetPostDirectionalText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> streetPostDirectionalText;
    @XmlElementRef(name = "StreetPreDirectionalText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> streetPreDirectionalText;
    @XmlElementRef(name = "StreetPrimaryNumberText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> streetPrimaryNumberText;
    @XmlElementRef(name = "StreetSuffixText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> streetSuffixText;
    @XmlElement(name = "EXTENSION")
    protected ADDRESSEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the addressAdditionalLineText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAddressAdditionalLineText() {
        return addressAdditionalLineText;
    }

    /**
     * Sets the value of the addressAdditionalLineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAddressAdditionalLineText(JAXBElement<MISMOString> value) {
        this.addressAdditionalLineText = value;
    }

    /**
     * Gets the value of the addressFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressFormatEnum }{@code >}
     *     
     */
    public JAXBElement<AddressFormatEnum> getAddressFormatType() {
        return addressFormatType;
    }

    /**
     * Sets the value of the addressFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressFormatEnum }{@code >}
     *     
     */
    public void setAddressFormatType(JAXBElement<AddressFormatEnum> value) {
        this.addressFormatType = value;
    }

    /**
     * Gets the value of the addressFormatTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAddressFormatTypeOtherDescription() {
        return addressFormatTypeOtherDescription;
    }

    /**
     * Sets the value of the addressFormatTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAddressFormatTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.addressFormatTypeOtherDescription = value;
    }

    /**
     * Gets the value of the addressLineText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAddressLineText() {
        return addressLineText;
    }

    /**
     * Sets the value of the addressLineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAddressLineText(JAXBElement<MISMOString> value) {
        this.addressLineText = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressEnum }{@code >}
     *     
     */
    public JAXBElement<AddressEnum> getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressEnum }{@code >}
     *     
     */
    public void setAddressType(JAXBElement<AddressEnum> value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAddressTypeOtherDescription() {
        return addressTypeOtherDescription;
    }

    /**
     * Sets the value of the addressTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAddressTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.addressTypeOtherDescription = value;
    }

    /**
     * Gets the value of the addressUnitDesignatorType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressUnitDesignatorEnum }{@code >}
     *     
     */
    public JAXBElement<AddressUnitDesignatorEnum> getAddressUnitDesignatorType() {
        return addressUnitDesignatorType;
    }

    /**
     * Sets the value of the addressUnitDesignatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressUnitDesignatorEnum }{@code >}
     *     
     */
    public void setAddressUnitDesignatorType(JAXBElement<AddressUnitDesignatorEnum> value) {
        this.addressUnitDesignatorType = value;
    }

    /**
     * Gets the value of the addressUnitDesignatorTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAddressUnitDesignatorTypeOtherDescription() {
        return addressUnitDesignatorTypeOtherDescription;
    }

    /**
     * Sets the value of the addressUnitDesignatorTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAddressUnitDesignatorTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.addressUnitDesignatorTypeOtherDescription = value;
    }

    /**
     * Gets the value of the addressUnitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAddressUnitIdentifier() {
        return addressUnitIdentifier;
    }

    /**
     * Sets the value of the addressUnitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAddressUnitIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.addressUnitIdentifier = value;
    }

    /**
     * Gets the value of the attentionToName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAttentionToName() {
        return attentionToName;
    }

    /**
     * Sets the value of the attentionToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAttentionToName(JAXBElement<MISMOString> value) {
        this.attentionToName = value;
    }

    /**
     * Gets the value of the carrierRouteCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCarrierRouteCode() {
        return carrierRouteCode;
    }

    /**
     * Sets the value of the carrierRouteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCarrierRouteCode(JAXBElement<MISMOCode> value) {
        this.carrierRouteCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCityName(JAXBElement<MISMOString> value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<MISMOCode> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCountryName(JAXBElement<MISMOString> value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setCountyCode(JAXBElement<MISMOCode> value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCountyName(JAXBElement<MISMOString> value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the deliveryPointBarCodeCheckValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getDeliveryPointBarCodeCheckValue() {
        return deliveryPointBarCodeCheckValue;
    }

    /**
     * Sets the value of the deliveryPointBarCodeCheckValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setDeliveryPointBarCodeCheckValue(JAXBElement<MISMOValue> value) {
        this.deliveryPointBarCodeCheckValue = value;
    }

    /**
     * Gets the value of the deliveryPointBarCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getDeliveryPointBarCodeValue() {
        return deliveryPointBarCodeValue;
    }

    /**
     * Sets the value of the deliveryPointBarCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setDeliveryPointBarCodeValue(JAXBElement<MISMOValue> value) {
        this.deliveryPointBarCodeValue = value;
    }

    /**
     * Gets the value of the highwayContractRouteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getHighwayContractRouteIdentifier() {
        return highwayContractRouteIdentifier;
    }

    /**
     * Sets the value of the highwayContractRouteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setHighwayContractRouteIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.highwayContractRouteIdentifier = value;
    }

    /**
     * Gets the value of the mailStopCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getMailStopCode() {
        return mailStopCode;
    }

    /**
     * Sets the value of the mailStopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setMailStopCode(JAXBElement<MISMOCode> value) {
        this.mailStopCode = value;
    }

    /**
     * Gets the value of the plusFourZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getPlusFourZipCode() {
        return plusFourZipCode;
    }

    /**
     * Sets the value of the plusFourZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setPlusFourZipCode(JAXBElement<MISMOCode> value) {
        this.plusFourZipCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<MISMOCode> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postOfficeBoxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getPostOfficeBoxIdentifier() {
        return postOfficeBoxIdentifier;
    }

    /**
     * Sets the value of the postOfficeBoxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setPostOfficeBoxIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.postOfficeBoxIdentifier = value;
    }

    /**
     * Gets the value of the ruralRouteBoxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getRuralRouteBoxIdentifier() {
        return ruralRouteBoxIdentifier;
    }

    /**
     * Sets the value of the ruralRouteBoxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setRuralRouteBoxIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.ruralRouteBoxIdentifier = value;
    }

    /**
     * Gets the value of the ruralRouteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getRuralRouteIdentifier() {
        return ruralRouteIdentifier;
    }

    /**
     * Sets the value of the ruralRouteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setRuralRouteIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.ruralRouteIdentifier = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public JAXBElement<MISMOCode> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<MISMOCode> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStateName(JAXBElement<MISMOString> value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStreetName(JAXBElement<MISMOString> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetPostDirectionalText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStreetPostDirectionalText() {
        return streetPostDirectionalText;
    }

    /**
     * Sets the value of the streetPostDirectionalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStreetPostDirectionalText(JAXBElement<MISMOString> value) {
        this.streetPostDirectionalText = value;
    }

    /**
     * Gets the value of the streetPreDirectionalText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStreetPreDirectionalText() {
        return streetPreDirectionalText;
    }

    /**
     * Sets the value of the streetPreDirectionalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStreetPreDirectionalText(JAXBElement<MISMOString> value) {
        this.streetPreDirectionalText = value;
    }

    /**
     * Gets the value of the streetPrimaryNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStreetPrimaryNumberText() {
        return streetPrimaryNumberText;
    }

    /**
     * Sets the value of the streetPrimaryNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStreetPrimaryNumberText(JAXBElement<MISMOString> value) {
        this.streetPrimaryNumberText = value;
    }

    /**
     * Gets the value of the streetSuffixText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getStreetSuffixText() {
        return streetSuffixText;
    }

    /**
     * Sets the value of the streetSuffixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setStreetSuffixText(JAXBElement<MISMOString> value) {
        this.streetSuffixText = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSEXTENSION }
     *     
     */
    public ADDRESSEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSEXTENSION }
     *     
     */
    public void setEXTENSION(ADDRESSEXTENSION value) {
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
