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
 * <p>Java class for PRESENT_LAND_USE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRESENT_LAND_USE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeighborhoodLandUseChangeStatusType" type="{http://www.mismo.org/residential/2009/schemas}NeighborhoodLandUseChangeStatusEnum" minOccurs="0"/>
 *         &lt;element name="NeighborhoodLandUseCurrentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodLandUseFutureDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PRESENT_LAND_USE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PRESENT_LAND_USE_DETAIL", propOrder = {
    "neighborhoodLandUseChangeStatusType",
    "neighborhoodLandUseCurrentDescription",
    "neighborhoodLandUseFutureDescription",
    "extension"
})
public class PRESENTLANDUSEDETAIL {

    @XmlElementRef(name = "NeighborhoodLandUseChangeStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<NeighborhoodLandUseChangeStatusEnum> neighborhoodLandUseChangeStatusType;
    @XmlElementRef(name = "NeighborhoodLandUseCurrentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodLandUseCurrentDescription;
    @XmlElementRef(name = "NeighborhoodLandUseFutureDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodLandUseFutureDescription;
    @XmlElement(name = "EXTENSION")
    protected PRESENTLANDUSEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the neighborhoodLandUseChangeStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NeighborhoodLandUseChangeStatusEnum }{@code >}
     *     
     */
    public JAXBElement<NeighborhoodLandUseChangeStatusEnum> getNeighborhoodLandUseChangeStatusType() {
        return neighborhoodLandUseChangeStatusType;
    }

    /**
     * Sets the value of the neighborhoodLandUseChangeStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NeighborhoodLandUseChangeStatusEnum }{@code >}
     *     
     */
    public void setNeighborhoodLandUseChangeStatusType(JAXBElement<NeighborhoodLandUseChangeStatusEnum> value) {
        this.neighborhoodLandUseChangeStatusType = value;
    }

    /**
     * Gets the value of the neighborhoodLandUseCurrentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodLandUseCurrentDescription() {
        return neighborhoodLandUseCurrentDescription;
    }

    /**
     * Sets the value of the neighborhoodLandUseCurrentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodLandUseCurrentDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodLandUseCurrentDescription = value;
    }

    /**
     * Gets the value of the neighborhoodLandUseFutureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodLandUseFutureDescription() {
        return neighborhoodLandUseFutureDescription;
    }

    /**
     * Sets the value of the neighborhoodLandUseFutureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodLandUseFutureDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodLandUseFutureDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PRESENTLANDUSEDETAILEXTENSION }
     *     
     */
    public PRESENTLANDUSEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRESENTLANDUSEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(PRESENTLANDUSEDETAILEXTENSION value) {
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
