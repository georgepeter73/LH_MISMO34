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
 * Information regarding the type, quality, condition, description and other facts about a site feature for the property.
 * 
 * <p>Java class for SITE_FEATURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SITE_FEATURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IrrigationSystemSourceType" type="{http://www.mismo.org/residential/2009/schemas}IrrigationSystemSourceEnum" minOccurs="0"/>
 *         &lt;element name="IrrigationSystemSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LandscapeLightingPowerSourceType" type="{http://www.mismo.org/residential/2009/schemas}LandscapeLightingPowerSourceEnum" minOccurs="0"/>
 *         &lt;element name="LandscapeLightingPowerSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LandscapingType" type="{http://www.mismo.org/residential/2009/schemas}LandscapingEnum" minOccurs="0"/>
 *         &lt;element name="LandscapingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SITE_FEATURE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SITE_FEATURE", propOrder = {
    "irrigationSystemSourceType",
    "irrigationSystemSourceTypeOtherDescription",
    "landscapeLightingPowerSourceType",
    "landscapeLightingPowerSourceTypeOtherDescription",
    "landscapingType",
    "landscapingTypeOtherDescription",
    "extension"
})
public class SITEFEATURE {

    @XmlElementRef(name = "IrrigationSystemSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IrrigationSystemSourceEnum> irrigationSystemSourceType;
    @XmlElementRef(name = "IrrigationSystemSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> irrigationSystemSourceTypeOtherDescription;
    @XmlElementRef(name = "LandscapeLightingPowerSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LandscapeLightingPowerSourceEnum> landscapeLightingPowerSourceType;
    @XmlElementRef(name = "LandscapeLightingPowerSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> landscapeLightingPowerSourceTypeOtherDescription;
    @XmlElementRef(name = "LandscapingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LandscapingEnum> landscapingType;
    @XmlElementRef(name = "LandscapingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> landscapingTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected SITEFEATUREEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the irrigationSystemSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IrrigationSystemSourceEnum }{@code >}
     *     
     */
    public JAXBElement<IrrigationSystemSourceEnum> getIrrigationSystemSourceType() {
        return irrigationSystemSourceType;
    }

    /**
     * Sets the value of the irrigationSystemSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IrrigationSystemSourceEnum }{@code >}
     *     
     */
    public void setIrrigationSystemSourceType(JAXBElement<IrrigationSystemSourceEnum> value) {
        this.irrigationSystemSourceType = value;
    }

    /**
     * Gets the value of the irrigationSystemSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIrrigationSystemSourceTypeOtherDescription() {
        return irrigationSystemSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the irrigationSystemSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIrrigationSystemSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.irrigationSystemSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the landscapeLightingPowerSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandscapeLightingPowerSourceEnum }{@code >}
     *     
     */
    public JAXBElement<LandscapeLightingPowerSourceEnum> getLandscapeLightingPowerSourceType() {
        return landscapeLightingPowerSourceType;
    }

    /**
     * Sets the value of the landscapeLightingPowerSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandscapeLightingPowerSourceEnum }{@code >}
     *     
     */
    public void setLandscapeLightingPowerSourceType(JAXBElement<LandscapeLightingPowerSourceEnum> value) {
        this.landscapeLightingPowerSourceType = value;
    }

    /**
     * Gets the value of the landscapeLightingPowerSourceTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLandscapeLightingPowerSourceTypeOtherDescription() {
        return landscapeLightingPowerSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the landscapeLightingPowerSourceTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLandscapeLightingPowerSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.landscapeLightingPowerSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the landscapingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandscapingEnum }{@code >}
     *     
     */
    public JAXBElement<LandscapingEnum> getLandscapingType() {
        return landscapingType;
    }

    /**
     * Sets the value of the landscapingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandscapingEnum }{@code >}
     *     
     */
    public void setLandscapingType(JAXBElement<LandscapingEnum> value) {
        this.landscapingType = value;
    }

    /**
     * Gets the value of the landscapingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLandscapingTypeOtherDescription() {
        return landscapingTypeOtherDescription;
    }

    /**
     * Sets the value of the landscapingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLandscapingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.landscapingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SITEFEATUREEXTENSION }
     *     
     */
    public SITEFEATUREEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEFEATUREEXTENSION }
     *     
     */
    public void setEXTENSION(SITEFEATUREEXTENSION value) {
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
