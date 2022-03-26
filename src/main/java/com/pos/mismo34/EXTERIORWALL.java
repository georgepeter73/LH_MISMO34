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
 * Information regarding the quality, condition, material and other facts about an exterior wall of a property.
 * 
 * <p>Java class for EXTERIOR_WALL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXTERIOR_WALL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ComponentClassificationType" type="{http://www.mismo.org/residential/2009/schemas}ComponentClassificationEnum" minOccurs="0"/>
 *         &lt;element name="ConditionRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConditionRatingType" type="{http://www.mismo.org/residential/2009/schemas}ConditionRatingEnum" minOccurs="0"/>
 *         &lt;element name="MaterialDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="QualityRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="QualityRatingType" type="{http://www.mismo.org/residential/2009/schemas}QualityRatingEnum" minOccurs="0"/>
 *         &lt;element name="WallMaterialType" type="{http://www.mismo.org/residential/2009/schemas}WallMaterialEnum" minOccurs="0"/>
 *         &lt;element name="WallMaterialTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EXTERIOR_WALL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "EXTERIOR_WALL", propOrder = {
    "componentAdjustmentAmount",
    "componentClassificationType",
    "conditionRatingDescription",
    "conditionRatingType",
    "materialDescription",
    "qualityRatingDescription",
    "qualityRatingType",
    "wallMaterialType",
    "wallMaterialTypeOtherDescription",
    "extension"
})
public class EXTERIORWALL {

    @XmlElementRef(name = "ComponentAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> componentAdjustmentAmount;
    @XmlElementRef(name = "ComponentClassificationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ComponentClassificationEnum> componentClassificationType;
    @XmlElementRef(name = "ConditionRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> conditionRatingDescription;
    @XmlElementRef(name = "ConditionRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionRatingEnum> conditionRatingType;
    @XmlElementRef(name = "MaterialDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> materialDescription;
    @XmlElementRef(name = "QualityRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> qualityRatingDescription;
    @XmlElementRef(name = "QualityRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityRatingEnum> qualityRatingType;
    @XmlElementRef(name = "WallMaterialType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<WallMaterialEnum> wallMaterialType;
    @XmlElementRef(name = "WallMaterialTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> wallMaterialTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected EXTERIORWALLEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the materialDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMaterialDescription() {
        return materialDescription;
    }

    /**
     * Sets the value of the materialDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMaterialDescription(JAXBElement<MISMOString> value) {
        this.materialDescription = value;
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
     * Gets the value of the wallMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WallMaterialEnum }{@code >}
     *     
     */
    public JAXBElement<WallMaterialEnum> getWallMaterialType() {
        return wallMaterialType;
    }

    /**
     * Sets the value of the wallMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WallMaterialEnum }{@code >}
     *     
     */
    public void setWallMaterialType(JAXBElement<WallMaterialEnum> value) {
        this.wallMaterialType = value;
    }

    /**
     * Gets the value of the wallMaterialTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getWallMaterialTypeOtherDescription() {
        return wallMaterialTypeOtherDescription;
    }

    /**
     * Sets the value of the wallMaterialTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setWallMaterialTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.wallMaterialTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERIORWALLEXTENSION }
     *     
     */
    public EXTERIORWALLEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERIORWALLEXTENSION }
     *     
     */
    public void setEXTENSION(EXTERIORWALLEXTENSION value) {
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
