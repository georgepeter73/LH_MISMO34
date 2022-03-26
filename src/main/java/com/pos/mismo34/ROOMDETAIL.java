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
 * <p>Java class for ROOM_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROOM_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AboveGradeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ComponentAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ConditionRatingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ConditionRatingType" type="{http://www.mismo.org/residential/2009/schemas}ConditionRatingEnum" minOccurs="0"/>
 *         &lt;element name="LengthFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="LevelType" type="{http://www.mismo.org/residential/2009/schemas}LevelEnum" minOccurs="0"/>
 *         &lt;element name="LevelTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://www.mismo.org/residential/2009/schemas}RoomEnum" minOccurs="0"/>
 *         &lt;element name="RoomTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RoomTypeSummaryCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="SquareFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="WidthFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ROOM_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ROOM_DETAIL", propOrder = {
    "aboveGradeIndicator",
    "componentAdjustmentAmount",
    "conditionRatingDescription",
    "conditionRatingType",
    "lengthFeetNumber",
    "levelType",
    "levelTypeOtherDescription",
    "roomType",
    "roomTypeOtherDescription",
    "roomTypeSummaryCount",
    "squareFeetNumber",
    "widthFeetNumber",
    "extension"
})
public class ROOMDETAIL {

    @XmlElementRef(name = "AboveGradeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> aboveGradeIndicator;
    @XmlElementRef(name = "ComponentAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> componentAdjustmentAmount;
    @XmlElementRef(name = "ConditionRatingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> conditionRatingDescription;
    @XmlElementRef(name = "ConditionRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionRatingEnum> conditionRatingType;
    @XmlElementRef(name = "LengthFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> lengthFeetNumber;
    @XmlElementRef(name = "LevelType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LevelEnum> levelType;
    @XmlElementRef(name = "LevelTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> levelTypeOtherDescription;
    @XmlElementRef(name = "RoomType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RoomEnum> roomType;
    @XmlElementRef(name = "RoomTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> roomTypeOtherDescription;
    @XmlElementRef(name = "RoomTypeSummaryCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> roomTypeSummaryCount;
    @XmlElementRef(name = "SquareFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> squareFeetNumber;
    @XmlElementRef(name = "WidthFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> widthFeetNumber;
    @XmlElement(name = "EXTENSION")
    protected ROOMDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the aboveGradeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAboveGradeIndicator() {
        return aboveGradeIndicator;
    }

    /**
     * Sets the value of the aboveGradeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAboveGradeIndicator(JAXBElement<MISMOIndicator> value) {
        this.aboveGradeIndicator = value;
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
     * Gets the value of the lengthFeetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getLengthFeetNumber() {
        return lengthFeetNumber;
    }

    /**
     * Sets the value of the lengthFeetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setLengthFeetNumber(JAXBElement<MISMONumeric> value) {
        this.lengthFeetNumber = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LevelEnum }{@code >}
     *     
     */
    public JAXBElement<LevelEnum> getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LevelEnum }{@code >}
     *     
     */
    public void setLevelType(JAXBElement<LevelEnum> value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the levelTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getLevelTypeOtherDescription() {
        return levelTypeOtherDescription;
    }

    /**
     * Sets the value of the levelTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setLevelTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.levelTypeOtherDescription = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoomEnum }{@code >}
     *     
     */
    public JAXBElement<RoomEnum> getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoomEnum }{@code >}
     *     
     */
    public void setRoomType(JAXBElement<RoomEnum> value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the roomTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getRoomTypeOtherDescription() {
        return roomTypeOtherDescription;
    }

    /**
     * Sets the value of the roomTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setRoomTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.roomTypeOtherDescription = value;
    }

    /**
     * Gets the value of the roomTypeSummaryCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getRoomTypeSummaryCount() {
        return roomTypeSummaryCount;
    }

    /**
     * Sets the value of the roomTypeSummaryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setRoomTypeSummaryCount(JAXBElement<MISMOCount> value) {
        this.roomTypeSummaryCount = value;
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
     * Gets the value of the widthFeetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getWidthFeetNumber() {
        return widthFeetNumber;
    }

    /**
     * Sets the value of the widthFeetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setWidthFeetNumber(JAXBElement<MISMONumeric> value) {
        this.widthFeetNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMDETAILEXTENSION }
     *     
     */
    public ROOMDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(ROOMDETAILEXTENSION value) {
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
