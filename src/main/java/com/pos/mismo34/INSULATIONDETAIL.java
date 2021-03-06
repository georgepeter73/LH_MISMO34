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
 * Information regarding insulation areas such as general comments.
 * 
 * <p>Java class for INSULATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSULATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsulationCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="InsulationHERSType" type="{http://www.mismo.org/residential/2009/schemas}InsulationHERSEnum" minOccurs="0"/>
 *         &lt;element name="ThermalRatedItemsType" type="{http://www.mismo.org/residential/2009/schemas}ThermalRatedItemsEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INSULATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INSULATION_DETAIL", propOrder = {
    "insulationCommentDescription",
    "insulationHERSType",
    "thermalRatedItemsType",
    "extension"
})
public class INSULATIONDETAIL {

    @XmlElementRef(name = "InsulationCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> insulationCommentDescription;
    @XmlElementRef(name = "InsulationHERSType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InsulationHERSEnum> insulationHERSType;
    @XmlElementRef(name = "ThermalRatedItemsType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ThermalRatedItemsEnum> thermalRatedItemsType;
    @XmlElement(name = "EXTENSION")
    protected INSULATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the insulationCommentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getInsulationCommentDescription() {
        return insulationCommentDescription;
    }

    /**
     * Sets the value of the insulationCommentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setInsulationCommentDescription(JAXBElement<MISMOString> value) {
        this.insulationCommentDescription = value;
    }

    /**
     * Gets the value of the insulationHERSType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsulationHERSEnum }{@code >}
     *     
     */
    public JAXBElement<InsulationHERSEnum> getInsulationHERSType() {
        return insulationHERSType;
    }

    /**
     * Sets the value of the insulationHERSType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsulationHERSEnum }{@code >}
     *     
     */
    public void setInsulationHERSType(JAXBElement<InsulationHERSEnum> value) {
        this.insulationHERSType = value;
    }

    /**
     * Gets the value of the thermalRatedItemsType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ThermalRatedItemsEnum }{@code >}
     *     
     */
    public JAXBElement<ThermalRatedItemsEnum> getThermalRatedItemsType() {
        return thermalRatedItemsType;
    }

    /**
     * Sets the value of the thermalRatedItemsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ThermalRatedItemsEnum }{@code >}
     *     
     */
    public void setThermalRatedItemsType(JAXBElement<ThermalRatedItemsEnum> value) {
        this.thermalRatedItemsType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INSULATIONDETAILEXTENSION }
     *     
     */
    public INSULATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSULATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(INSULATIONDETAILEXTENSION value) {
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
