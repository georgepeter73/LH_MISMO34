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
 * Information detailing the type, amount and other facts about the adjustment to price made to a comparable property in the context of grid style reporting for the sales comparison approach to value.
 * 
 * <p>Java class for COMPARABLE_ADJUSTMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPARABLE_ADJUSTMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComparableAdjustmentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ComparableAdjustmentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ComparableAdjustmentType" type="{http://www.mismo.org/residential/2009/schemas}ComparableAdjustmentEnum" minOccurs="0"/>
 *         &lt;element name="ComparableAdjustmentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SalesComparisonUnitOfMeasureDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COMPARABLE_ADJUSTMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COMPARABLE_ADJUSTMENT", propOrder = {
    "comparableAdjustmentAmount",
    "comparableAdjustmentDescription",
    "comparableAdjustmentType",
    "comparableAdjustmentTypeOtherDescription",
    "salesComparisonUnitOfMeasureDescription",
    "extension"
})
public class COMPARABLEADJUSTMENT {

    @XmlElementRef(name = "ComparableAdjustmentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> comparableAdjustmentAmount;
    @XmlElementRef(name = "ComparableAdjustmentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> comparableAdjustmentDescription;
    @XmlElementRef(name = "ComparableAdjustmentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ComparableAdjustmentEnum> comparableAdjustmentType;
    @XmlElementRef(name = "ComparableAdjustmentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> comparableAdjustmentTypeOtherDescription;
    @XmlElementRef(name = "SalesComparisonUnitOfMeasureDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> salesComparisonUnitOfMeasureDescription;
    @XmlElement(name = "EXTENSION")
    protected COMPARABLEADJUSTMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the comparableAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getComparableAdjustmentAmount() {
        return comparableAdjustmentAmount;
    }

    /**
     * Sets the value of the comparableAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setComparableAdjustmentAmount(JAXBElement<MISMOAmount> value) {
        this.comparableAdjustmentAmount = value;
    }

    /**
     * Gets the value of the comparableAdjustmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getComparableAdjustmentDescription() {
        return comparableAdjustmentDescription;
    }

    /**
     * Sets the value of the comparableAdjustmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setComparableAdjustmentDescription(JAXBElement<MISMOString> value) {
        this.comparableAdjustmentDescription = value;
    }

    /**
     * Gets the value of the comparableAdjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComparableAdjustmentEnum }{@code >}
     *     
     */
    public JAXBElement<ComparableAdjustmentEnum> getComparableAdjustmentType() {
        return comparableAdjustmentType;
    }

    /**
     * Sets the value of the comparableAdjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComparableAdjustmentEnum }{@code >}
     *     
     */
    public void setComparableAdjustmentType(JAXBElement<ComparableAdjustmentEnum> value) {
        this.comparableAdjustmentType = value;
    }

    /**
     * Gets the value of the comparableAdjustmentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getComparableAdjustmentTypeOtherDescription() {
        return comparableAdjustmentTypeOtherDescription;
    }

    /**
     * Sets the value of the comparableAdjustmentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setComparableAdjustmentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.comparableAdjustmentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the salesComparisonUnitOfMeasureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSalesComparisonUnitOfMeasureDescription() {
        return salesComparisonUnitOfMeasureDescription;
    }

    /**
     * Sets the value of the salesComparisonUnitOfMeasureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSalesComparisonUnitOfMeasureDescription(JAXBElement<MISMOString> value) {
        this.salesComparisonUnitOfMeasureDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COMPARABLEADJUSTMENTEXTENSION }
     *     
     */
    public COMPARABLEADJUSTMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPARABLEADJUSTMENTEXTENSION }
     *     
     */
    public void setEXTENSION(COMPARABLEADJUSTMENTEXTENSION value) {
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
