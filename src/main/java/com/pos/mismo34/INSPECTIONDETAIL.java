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
 * Additional information about the inspection.
 * 
 * <p>Java class for INSPECTION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSPECTION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExteriorInspectionSufficientIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InspectionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PropertyInaccessibleIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionOrderDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionPurposeType" type="{http://www.mismo.org/residential/2009/schemas}PropertyInspectionPurposeEnum" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionPurposeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionRequestCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionResultCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionType" type="{http://www.mismo.org/residential/2009/schemas}PropertyInspectionEnum" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INSPECTION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INSPECTION_DETAIL", propOrder = {
    "exteriorInspectionSufficientIndicator",
    "inspectionDate",
    "propertyInaccessibleIndicator",
    "propertyInspectionOrderDate",
    "propertyInspectionPurposeType",
    "propertyInspectionPurposeTypeOtherDescription",
    "propertyInspectionRequestCommentDescription",
    "propertyInspectionResultCommentDescription",
    "propertyInspectionType",
    "propertyInspectionTypeOtherDescription",
    "extension"
})
public class INSPECTIONDETAIL {

    @XmlElementRef(name = "ExteriorInspectionSufficientIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> exteriorInspectionSufficientIndicator;
    @XmlElementRef(name = "InspectionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> inspectionDate;
    @XmlElementRef(name = "PropertyInaccessibleIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> propertyInaccessibleIndicator;
    @XmlElementRef(name = "PropertyInspectionOrderDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> propertyInspectionOrderDate;
    @XmlElementRef(name = "PropertyInspectionPurposeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyInspectionPurposeEnum> propertyInspectionPurposeType;
    @XmlElementRef(name = "PropertyInspectionPurposeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionPurposeTypeOtherDescription;
    @XmlElementRef(name = "PropertyInspectionRequestCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionRequestCommentDescription;
    @XmlElementRef(name = "PropertyInspectionResultCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionResultCommentDescription;
    @XmlElementRef(name = "PropertyInspectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyInspectionEnum> propertyInspectionType;
    @XmlElementRef(name = "PropertyInspectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected INSPECTIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the exteriorInspectionSufficientIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getExteriorInspectionSufficientIndicator() {
        return exteriorInspectionSufficientIndicator;
    }

    /**
     * Sets the value of the exteriorInspectionSufficientIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setExteriorInspectionSufficientIndicator(JAXBElement<MISMOIndicator> value) {
        this.exteriorInspectionSufficientIndicator = value;
    }

    /**
     * Gets the value of the inspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets the value of the inspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setInspectionDate(JAXBElement<MISMODate> value) {
        this.inspectionDate = value;
    }

    /**
     * Gets the value of the propertyInaccessibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPropertyInaccessibleIndicator() {
        return propertyInaccessibleIndicator;
    }

    /**
     * Sets the value of the propertyInaccessibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPropertyInaccessibleIndicator(JAXBElement<MISMOIndicator> value) {
        this.propertyInaccessibleIndicator = value;
    }

    /**
     * Gets the value of the propertyInspectionOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getPropertyInspectionOrderDate() {
        return propertyInspectionOrderDate;
    }

    /**
     * Sets the value of the propertyInspectionOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setPropertyInspectionOrderDate(JAXBElement<MISMODate> value) {
        this.propertyInspectionOrderDate = value;
    }

    /**
     * Gets the value of the propertyInspectionPurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyInspectionPurposeEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyInspectionPurposeEnum> getPropertyInspectionPurposeType() {
        return propertyInspectionPurposeType;
    }

    /**
     * Sets the value of the propertyInspectionPurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyInspectionPurposeEnum }{@code >}
     *     
     */
    public void setPropertyInspectionPurposeType(JAXBElement<PropertyInspectionPurposeEnum> value) {
        this.propertyInspectionPurposeType = value;
    }

    /**
     * Gets the value of the propertyInspectionPurposeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyInspectionPurposeTypeOtherDescription() {
        return propertyInspectionPurposeTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyInspectionPurposeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyInspectionPurposeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionPurposeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyInspectionRequestCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyInspectionRequestCommentDescription() {
        return propertyInspectionRequestCommentDescription;
    }

    /**
     * Sets the value of the propertyInspectionRequestCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyInspectionRequestCommentDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionRequestCommentDescription = value;
    }

    /**
     * Gets the value of the propertyInspectionResultCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyInspectionResultCommentDescription() {
        return propertyInspectionResultCommentDescription;
    }

    /**
     * Sets the value of the propertyInspectionResultCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyInspectionResultCommentDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionResultCommentDescription = value;
    }

    /**
     * Gets the value of the propertyInspectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyInspectionEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyInspectionEnum> getPropertyInspectionType() {
        return propertyInspectionType;
    }

    /**
     * Sets the value of the propertyInspectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyInspectionEnum }{@code >}
     *     
     */
    public void setPropertyInspectionType(JAXBElement<PropertyInspectionEnum> value) {
        this.propertyInspectionType = value;
    }

    /**
     * Gets the value of the propertyInspectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyInspectionTypeOtherDescription() {
        return propertyInspectionTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyInspectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyInspectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INSPECTIONDETAILEXTENSION }
     *     
     */
    public INSPECTIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSPECTIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(INSPECTIONDETAILEXTENSION value) {
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
