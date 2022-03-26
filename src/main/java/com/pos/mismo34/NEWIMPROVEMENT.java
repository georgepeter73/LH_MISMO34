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
 * Information regarding the type, cost, extent and description of a new improvement to the property as used in the cost approach to value.
 * 
 * <p>Java class for NEW_IMPROVEMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NEW_IMPROVEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewImprovementCostAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="NewImprovementCostDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NewImprovementType" type="{http://www.mismo.org/residential/2009/schemas}NewImprovementEnum" minOccurs="0"/>
 *         &lt;element name="NewImprovementTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PricePerSquareFootAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SquareFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}NEW_IMPROVEMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "NEW_IMPROVEMENT", propOrder = {
    "newImprovementCostAmount",
    "newImprovementCostDescription",
    "newImprovementType",
    "newImprovementTypeOtherDescription",
    "pricePerSquareFootAmount",
    "squareFeetNumber",
    "extension"
})
public class NEWIMPROVEMENT {

    @XmlElementRef(name = "NewImprovementCostAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> newImprovementCostAmount;
    @XmlElementRef(name = "NewImprovementCostDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> newImprovementCostDescription;
    @XmlElementRef(name = "NewImprovementType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<NewImprovementEnum> newImprovementType;
    @XmlElementRef(name = "NewImprovementTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> newImprovementTypeOtherDescription;
    @XmlElementRef(name = "PricePerSquareFootAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> pricePerSquareFootAmount;
    @XmlElementRef(name = "SquareFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> squareFeetNumber;
    @XmlElement(name = "EXTENSION")
    protected NEWIMPROVEMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the newImprovementCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getNewImprovementCostAmount() {
        return newImprovementCostAmount;
    }

    /**
     * Sets the value of the newImprovementCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setNewImprovementCostAmount(JAXBElement<MISMOAmount> value) {
        this.newImprovementCostAmount = value;
    }

    /**
     * Gets the value of the newImprovementCostDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNewImprovementCostDescription() {
        return newImprovementCostDescription;
    }

    /**
     * Sets the value of the newImprovementCostDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNewImprovementCostDescription(JAXBElement<MISMOString> value) {
        this.newImprovementCostDescription = value;
    }

    /**
     * Gets the value of the newImprovementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewImprovementEnum }{@code >}
     *     
     */
    public JAXBElement<NewImprovementEnum> getNewImprovementType() {
        return newImprovementType;
    }

    /**
     * Sets the value of the newImprovementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewImprovementEnum }{@code >}
     *     
     */
    public void setNewImprovementType(JAXBElement<NewImprovementEnum> value) {
        this.newImprovementType = value;
    }

    /**
     * Gets the value of the newImprovementTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNewImprovementTypeOtherDescription() {
        return newImprovementTypeOtherDescription;
    }

    /**
     * Sets the value of the newImprovementTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNewImprovementTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.newImprovementTypeOtherDescription = value;
    }

    /**
     * Gets the value of the pricePerSquareFootAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPricePerSquareFootAmount() {
        return pricePerSquareFootAmount;
    }

    /**
     * Sets the value of the pricePerSquareFootAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPricePerSquareFootAmount(JAXBElement<MISMOAmount> value) {
        this.pricePerSquareFootAmount = value;
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
     *     {@link NEWIMPROVEMENTEXTENSION }
     *     
     */
    public NEWIMPROVEMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEWIMPROVEMENTEXTENSION }
     *     
     */
    public void setEXTENSION(NEWIMPROVEMENTEXTENSION value) {
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
