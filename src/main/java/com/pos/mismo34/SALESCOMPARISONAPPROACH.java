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
 * Information about the results of the sales comparison approach to value developed by the appraiser. This approach compares the characteristics of similar properties to the subject property. The process uses recognized techniques to adjust the prices of the comparable properties according to the presence, absence, or differences in characteristics.
 * 
 * <p>Java class for SALES_COMPARISON_APPROACH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SALES_COMPARISON_APPROACH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesComparisonCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SalesComparisonValuePerBedroomAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesComparisonValuePerGrossBuildingAreaAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesComparisonValuePerRoomAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SalesComparisonValuePerUnitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ValueIndicatedBySalesComparisonAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SALES_COMPARISON_APPROACH_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SALES_COMPARISON_APPROACH", propOrder = {
    "salesComparisonCommentDescription",
    "salesComparisonValuePerBedroomAmount",
    "salesComparisonValuePerGrossBuildingAreaAmount",
    "salesComparisonValuePerRoomAmount",
    "salesComparisonValuePerUnitAmount",
    "valueIndicatedBySalesComparisonAmount",
    "extension"
})
public class SALESCOMPARISONAPPROACH {

    @XmlElementRef(name = "SalesComparisonCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> salesComparisonCommentDescription;
    @XmlElementRef(name = "SalesComparisonValuePerBedroomAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesComparisonValuePerBedroomAmount;
    @XmlElementRef(name = "SalesComparisonValuePerGrossBuildingAreaAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesComparisonValuePerGrossBuildingAreaAmount;
    @XmlElementRef(name = "SalesComparisonValuePerRoomAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesComparisonValuePerRoomAmount;
    @XmlElementRef(name = "SalesComparisonValuePerUnitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> salesComparisonValuePerUnitAmount;
    @XmlElementRef(name = "ValueIndicatedBySalesComparisonAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> valueIndicatedBySalesComparisonAmount;
    @XmlElement(name = "EXTENSION")
    protected SALESCOMPARISONAPPROACHEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the salesComparisonCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSalesComparisonCommentDescription() {
        return salesComparisonCommentDescription;
    }

    /**
     * Sets the value of the salesComparisonCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSalesComparisonCommentDescription(JAXBElement<MISMOString> value) {
        this.salesComparisonCommentDescription = value;
    }

    /**
     * Gets the value of the salesComparisonValuePerBedroomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesComparisonValuePerBedroomAmount() {
        return salesComparisonValuePerBedroomAmount;
    }

    /**
     * Sets the value of the salesComparisonValuePerBedroomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesComparisonValuePerBedroomAmount(JAXBElement<MISMOAmount> value) {
        this.salesComparisonValuePerBedroomAmount = value;
    }

    /**
     * Gets the value of the salesComparisonValuePerGrossBuildingAreaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesComparisonValuePerGrossBuildingAreaAmount() {
        return salesComparisonValuePerGrossBuildingAreaAmount;
    }

    /**
     * Sets the value of the salesComparisonValuePerGrossBuildingAreaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesComparisonValuePerGrossBuildingAreaAmount(JAXBElement<MISMOAmount> value) {
        this.salesComparisonValuePerGrossBuildingAreaAmount = value;
    }

    /**
     * Gets the value of the salesComparisonValuePerRoomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesComparisonValuePerRoomAmount() {
        return salesComparisonValuePerRoomAmount;
    }

    /**
     * Sets the value of the salesComparisonValuePerRoomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesComparisonValuePerRoomAmount(JAXBElement<MISMOAmount> value) {
        this.salesComparisonValuePerRoomAmount = value;
    }

    /**
     * Gets the value of the salesComparisonValuePerUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getSalesComparisonValuePerUnitAmount() {
        return salesComparisonValuePerUnitAmount;
    }

    /**
     * Sets the value of the salesComparisonValuePerUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setSalesComparisonValuePerUnitAmount(JAXBElement<MISMOAmount> value) {
        this.salesComparisonValuePerUnitAmount = value;
    }

    /**
     * Gets the value of the valueIndicatedBySalesComparisonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getValueIndicatedBySalesComparisonAmount() {
        return valueIndicatedBySalesComparisonAmount;
    }

    /**
     * Sets the value of the valueIndicatedBySalesComparisonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setValueIndicatedBySalesComparisonAmount(JAXBElement<MISMOAmount> value) {
        this.valueIndicatedBySalesComparisonAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SALESCOMPARISONAPPROACHEXTENSION }
     *     
     */
    public SALESCOMPARISONAPPROACHEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SALESCOMPARISONAPPROACHEXTENSION }
     *     
     */
    public void setEXTENSION(SALESCOMPARISONAPPROACHEXTENSION value) {
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
