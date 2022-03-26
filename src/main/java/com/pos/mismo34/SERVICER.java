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
 * <p>Java class for SERVICER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicerProgramIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServicerRoleEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServicerType" type="{http://www.mismo.org/residential/2009/schemas}ServicerEnum" minOccurs="0"/>
 *         &lt;element name="ServicerTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServicingTransferEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServicingTransferRoleType" type="{http://www.mismo.org/residential/2009/schemas}ServicingTransferRoleEnum" minOccurs="0"/>
 *         &lt;element name="SubservicerRightsType" type="{http://www.mismo.org/residential/2009/schemas}SubservicerRightsEnum" minOccurs="0"/>
 *         &lt;element name="SubservicerRightsTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="TransferOfServicingDisclosureType" type="{http://www.mismo.org/residential/2009/schemas}TransferOfServicingDisclosureEnum" minOccurs="0"/>
 *         &lt;element name="TransferOfServicingDisclosureTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVICER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SERVICER", propOrder = {
    "servicerProgramIdentifier",
    "servicerRoleEffectiveDate",
    "servicerType",
    "servicerTypeOtherDescription",
    "servicingTransferEffectiveDate",
    "servicingTransferRoleType",
    "subservicerRightsType",
    "subservicerRightsTypeOtherDescription",
    "transferOfServicingDisclosureType",
    "transferOfServicingDisclosureTypeOtherDescription",
    "extension"
})
public class SERVICER {

    @XmlElementRef(name = "ServicerProgramIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicerProgramIdentifier;
    @XmlElementRef(name = "ServicerRoleEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> servicerRoleEffectiveDate;
    @XmlElementRef(name = "ServicerType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicerEnum> servicerType;
    @XmlElementRef(name = "ServicerTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> servicerTypeOtherDescription;
    @XmlElementRef(name = "ServicingTransferEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> servicingTransferEffectiveDate;
    @XmlElementRef(name = "ServicingTransferRoleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicingTransferRoleEnum> servicingTransferRoleType;
    @XmlElementRef(name = "SubservicerRightsType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SubservicerRightsEnum> subservicerRightsType;
    @XmlElementRef(name = "SubservicerRightsTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> subservicerRightsTypeOtherDescription;
    @XmlElementRef(name = "TransferOfServicingDisclosureType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferOfServicingDisclosureEnum> transferOfServicingDisclosureType;
    @XmlElementRef(name = "TransferOfServicingDisclosureTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> transferOfServicingDisclosureTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected SERVICEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the servicerProgramIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getServicerProgramIdentifier() {
        return servicerProgramIdentifier;
    }

    /**
     * Sets the value of the servicerProgramIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setServicerProgramIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicerProgramIdentifier = value;
    }

    /**
     * Gets the value of the servicerRoleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServicerRoleEffectiveDate() {
        return servicerRoleEffectiveDate;
    }

    /**
     * Sets the value of the servicerRoleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServicerRoleEffectiveDate(JAXBElement<MISMODate> value) {
        this.servicerRoleEffectiveDate = value;
    }

    /**
     * Gets the value of the servicerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicerEnum }{@code >}
     *     
     */
    public JAXBElement<ServicerEnum> getServicerType() {
        return servicerType;
    }

    /**
     * Sets the value of the servicerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicerEnum }{@code >}
     *     
     */
    public void setServicerType(JAXBElement<ServicerEnum> value) {
        this.servicerType = value;
    }

    /**
     * Gets the value of the servicerTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getServicerTypeOtherDescription() {
        return servicerTypeOtherDescription;
    }

    /**
     * Sets the value of the servicerTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setServicerTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.servicerTypeOtherDescription = value;
    }

    /**
     * Gets the value of the servicingTransferEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServicingTransferEffectiveDate() {
        return servicingTransferEffectiveDate;
    }

    /**
     * Sets the value of the servicingTransferEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServicingTransferEffectiveDate(JAXBElement<MISMODate> value) {
        this.servicingTransferEffectiveDate = value;
    }

    /**
     * Gets the value of the servicingTransferRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicingTransferRoleEnum }{@code >}
     *     
     */
    public JAXBElement<ServicingTransferRoleEnum> getServicingTransferRoleType() {
        return servicingTransferRoleType;
    }

    /**
     * Sets the value of the servicingTransferRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicingTransferRoleEnum }{@code >}
     *     
     */
    public void setServicingTransferRoleType(JAXBElement<ServicingTransferRoleEnum> value) {
        this.servicingTransferRoleType = value;
    }

    /**
     * Gets the value of the subservicerRightsType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubservicerRightsEnum }{@code >}
     *     
     */
    public JAXBElement<SubservicerRightsEnum> getSubservicerRightsType() {
        return subservicerRightsType;
    }

    /**
     * Sets the value of the subservicerRightsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubservicerRightsEnum }{@code >}
     *     
     */
    public void setSubservicerRightsType(JAXBElement<SubservicerRightsEnum> value) {
        this.subservicerRightsType = value;
    }

    /**
     * Gets the value of the subservicerRightsTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSubservicerRightsTypeOtherDescription() {
        return subservicerRightsTypeOtherDescription;
    }

    /**
     * Sets the value of the subservicerRightsTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSubservicerRightsTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.subservicerRightsTypeOtherDescription = value;
    }

    /**
     * Gets the value of the transferOfServicingDisclosureType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferOfServicingDisclosureEnum }{@code >}
     *     
     */
    public JAXBElement<TransferOfServicingDisclosureEnum> getTransferOfServicingDisclosureType() {
        return transferOfServicingDisclosureType;
    }

    /**
     * Sets the value of the transferOfServicingDisclosureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferOfServicingDisclosureEnum }{@code >}
     *     
     */
    public void setTransferOfServicingDisclosureType(JAXBElement<TransferOfServicingDisclosureEnum> value) {
        this.transferOfServicingDisclosureType = value;
    }

    /**
     * Gets the value of the transferOfServicingDisclosureTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getTransferOfServicingDisclosureTypeOtherDescription() {
        return transferOfServicingDisclosureTypeOtherDescription;
    }

    /**
     * Sets the value of the transferOfServicingDisclosureTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setTransferOfServicingDisclosureTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.transferOfServicingDisclosureTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEREXTENSION }
     *     
     */
    public SERVICEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEREXTENSION }
     *     
     */
    public void setEXTENSION(SERVICEREXTENSION value) {
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
