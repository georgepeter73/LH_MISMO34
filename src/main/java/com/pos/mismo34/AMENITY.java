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
 * Information regarding the type, quality, condition and details specific to an amenity of a property. An amenity is a feature that enhances property value, such as a fireplace, pool, spa, etc.
 * 
 * <p>Java class for AMENITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMENITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmenityCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AmenityDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AmenityType" type="{http://www.mismo.org/residential/2009/schemas}AmenityEnum" minOccurs="0"/>
 *         &lt;element name="AmenityTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ComponentAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ComponentClassificationType" type="{http://www.mismo.org/residential/2009/schemas}ComponentClassificationEnum" minOccurs="0"/>
 *         &lt;element name="ConditionRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConditionRatingType" type="{http://www.mismo.org/residential/2009/schemas}ConditionRatingEnum" minOccurs="0"/>
 *         &lt;element name="QualityRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="QualityRatingType" type="{http://www.mismo.org/residential/2009/schemas}QualityRatingEnum" minOccurs="0"/>
 *         &lt;element name="SquareFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}AMENITY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "AMENITY", propOrder = {
    "amenityCount",
    "amenityDescription",
    "amenityType",
    "amenityTypeOtherDescription",
    "componentAdjustmentAmount",
    "componentClassificationType",
    "conditionRatingDescription",
    "conditionRatingType",
    "qualityRatingDescription",
    "qualityRatingType",
    "squareFeetNumber",
    "extension"
})
public class AMENITY {

    @XmlElementRef(name = "AmenityCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> amenityCount;
    @XmlElementRef(name = "AmenityDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> amenityDescription;
    @XmlElementRef(name = "AmenityType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AmenityEnum> amenityType;
    @XmlElementRef(name = "AmenityTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> amenityTypeOtherDescription;
    @XmlElementRef(name = "ComponentAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> componentAdjustmentAmount;
    @XmlElementRef(name = "ComponentClassificationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ComponentClassificationEnum> componentClassificationType;
    @XmlElementRef(name = "ConditionRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> conditionRatingDescription;
    @XmlElementRef(name = "ConditionRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionRatingEnum> conditionRatingType;
    @XmlElementRef(name = "QualityRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> qualityRatingDescription;
    @XmlElementRef(name = "QualityRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityRatingEnum> qualityRatingType;
    @XmlElementRef(name = "SquareFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> squareFeetNumber;
    @XmlElement(name = "EXTENSION")
    protected AMENITYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the amenityCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getAmenityCount() {
        return amenityCount;
    }

    /**
     * Sets the value of the amenityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setAmenityCount(JAXBElement<MISMOCount> value) {
        this.amenityCount = value;
    }

    /**
     * Gets the value of the amenityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAmenityDescription() {
        return amenityDescription;
    }

    /**
     * Sets the value of the amenityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAmenityDescription(JAXBElement<MISMOString> value) {
        this.amenityDescription = value;
    }

    /**
     * Gets the value of the amenityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmenityEnum }{@code >}
     *     
     */
    public JAXBElement<AmenityEnum> getAmenityType() {
        return amenityType;
    }

    /**
     * Sets the value of the amenityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmenityEnum }{@code >}
     *     
     */
    public void setAmenityType(JAXBElement<AmenityEnum> value) {
        this.amenityType = value;
    }

    /**
     * Gets the value of the amenityTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAmenityTypeOtherDescription() {
        return amenityTypeOtherDescription;
    }

    /**
     * Sets the value of the amenityTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAmenityTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.amenityTypeOtherDescription = value;
    }

    /**
     * Gets the value of the componentAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getComponentAdjustmentAmount() {
        return componentAdjustmentAmount;
    }

    /**
     * Sets the value of the componentAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setComponentAdjustmentAmount(JAXBElement<MISMOAmount> value) {
        this.componentAdjustmentAmount = value;
    }

    /**
     * Gets the value of the componentClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComponentClassificationEnum }{@code >}
     *     
     */
    public JAXBElement<ComponentClassificationEnum> getComponentClassificationType() {
        return componentClassificationType;
    }

    /**
     * Sets the value of the componentClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComponentClassificationEnum }{@code >}
     *     
     */
    public void setComponentClassificationType(JAXBElement<ComponentClassificationEnum> value) {
        this.componentClassificationType = value;
    }

    /**
     * Gets the value of the conditionRatingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getConditionRatingDescription() {
        return conditionRatingDescription;
    }

    /**
     * Sets the value of the conditionRatingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setConditionRatingDescription(JAXBElement<MISMOString> value) {
        this.conditionRatingDescription = value;
    }

    /**
     * Gets the value of the conditionRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *     
     */
    public JAXBElement<ConditionRatingEnum> getConditionRatingType() {
        return conditionRatingType;
    }

    /**
     * Sets the value of the conditionRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *     
     */
    public void setConditionRatingType(JAXBElement<ConditionRatingEnum> value) {
        this.conditionRatingType = value;
    }

    /**
     * Gets the value of the qualityRatingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getQualityRatingDescription() {
        return qualityRatingDescription;
    }

    /**
     * Sets the value of the qualityRatingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setQualityRatingDescription(JAXBElement<MISMOString> value) {
        this.qualityRatingDescription = value;
    }

    /**
     * Gets the value of the qualityRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityRatingEnum }{@code >}
     *     
     */
    public JAXBElement<QualityRatingEnum> getQualityRatingType() {
        return qualityRatingType;
    }

    /**
     * Sets the value of the qualityRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityRatingEnum }{@code >}
     *     
     */
    public void setQualityRatingType(JAXBElement<QualityRatingEnum> value) {
        this.qualityRatingType = value;
    }

    /**
     * Gets the value of the squareFeetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getSquareFeetNumber() {
        return squareFeetNumber;
    }

    /**
     * Sets the value of the squareFeetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setSquareFeetNumber(JAXBElement<MISMONumeric> value) {
        this.squareFeetNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AMENITYEXTENSION }
     *     
     */
    public AMENITYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMENITYEXTENSION }
     *     
     */
    public void setEXTENSION(AMENITYEXTENSION value) {
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
