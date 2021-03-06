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
 * Information regarding the type, quality, condition, description and other facts about the water system for the property.
 * 
 * <p>Java class for WATER_SYSTEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WATER_SYSTEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WaterHeaterType" type="{http://www.mismo.org/residential/2009/schemas}WaterHeaterEnum" minOccurs="0"/>
 *         &lt;element name="WaterHeaterTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="WaterTreatmentType" type="{http://www.mismo.org/residential/2009/schemas}WaterTreatmentEnum" minOccurs="0"/>
 *         &lt;element name="WaterTreatmentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}WATER_SYSTEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "WATER_SYSTEM", propOrder = {
    "waterHeaterType",
    "waterHeaterTypeOtherDescription",
    "waterTreatmentType",
    "waterTreatmentTypeOtherDescription",
    "extension"
})
public class WATERSYSTEM {

    @XmlElementRef(name = "WaterHeaterType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<WaterHeaterEnum> waterHeaterType;
    @XmlElementRef(name = "WaterHeaterTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> waterHeaterTypeOtherDescription;
    @XmlElementRef(name = "WaterTreatmentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<WaterTreatmentEnum> waterTreatmentType;
    @XmlElementRef(name = "WaterTreatmentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> waterTreatmentTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected WATERSYSTEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the waterHeaterType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WaterHeaterEnum }{@code >}
     *     
     */
    public JAXBElement<WaterHeaterEnum> getWaterHeaterType() {
        return waterHeaterType;
    }

    /**
     * Sets the value of the waterHeaterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WaterHeaterEnum }{@code >}
     *     
     */
    public void setWaterHeaterType(JAXBElement<WaterHeaterEnum> value) {
        this.waterHeaterType = value;
    }

    /**
     * Gets the value of the waterHeaterTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getWaterHeaterTypeOtherDescription() {
        return waterHeaterTypeOtherDescription;
    }

    /**
     * Sets the value of the waterHeaterTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setWaterHeaterTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.waterHeaterTypeOtherDescription = value;
    }

    /**
     * Gets the value of the waterTreatmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WaterTreatmentEnum }{@code >}
     *     
     */
    public JAXBElement<WaterTreatmentEnum> getWaterTreatmentType() {
        return waterTreatmentType;
    }

    /**
     * Sets the value of the waterTreatmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WaterTreatmentEnum }{@code >}
     *     
     */
    public void setWaterTreatmentType(JAXBElement<WaterTreatmentEnum> value) {
        this.waterTreatmentType = value;
    }

    /**
     * Gets the value of the waterTreatmentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getWaterTreatmentTypeOtherDescription() {
        return waterTreatmentTypeOtherDescription;
    }

    /**
     * Sets the value of the waterTreatmentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setWaterTreatmentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.waterTreatmentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link WATERSYSTEMEXTENSION }
     *     
     */
    public WATERSYSTEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link WATERSYSTEMEXTENSION }
     *     
     */
    public void setEXTENSION(WATERSYSTEMEXTENSION value) {
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
