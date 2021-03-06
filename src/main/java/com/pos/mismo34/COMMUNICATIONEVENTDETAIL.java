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
 * High level details of a comprehensive collection of facts about activities initiated by a communication and ending when all identified issues are resolved.
 * 
 * <p>Java class for COMMUNICATION_EVENT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMMUNICATION_EVENT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EventSummaryText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OnlinePortalAssignedIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="OnlinePortalHostType" type="{http://www.mismo.org/residential/2009/schemas}OnlinePortalHostEnum" minOccurs="0"/>
 *         &lt;element name="OnlinePortalHostTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COMMUNICATION_EVENT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COMMUNICATION_EVENT_DETAIL", propOrder = {
    "eventIdentifier",
    "eventSummaryText",
    "onlinePortalAssignedIdentifier",
    "onlinePortalHostType",
    "onlinePortalHostTypeOtherDescription",
    "extension"
})
public class COMMUNICATIONEVENTDETAIL {

    @XmlElementRef(name = "EventIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> eventIdentifier;
    @XmlElementRef(name = "EventSummaryText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> eventSummaryText;
    @XmlElementRef(name = "OnlinePortalAssignedIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> onlinePortalAssignedIdentifier;
    @XmlElementRef(name = "OnlinePortalHostType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OnlinePortalHostEnum> onlinePortalHostType;
    @XmlElementRef(name = "OnlinePortalHostTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> onlinePortalHostTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected COMMUNICATIONEVENTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the eventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getEventIdentifier() {
        return eventIdentifier;
    }

    /**
     * Sets the value of the eventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setEventIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.eventIdentifier = value;
    }

    /**
     * Gets the value of the eventSummaryText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getEventSummaryText() {
        return eventSummaryText;
    }

    /**
     * Sets the value of the eventSummaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setEventSummaryText(JAXBElement<MISMOString> value) {
        this.eventSummaryText = value;
    }

    /**
     * Gets the value of the onlinePortalAssignedIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getOnlinePortalAssignedIdentifier() {
        return onlinePortalAssignedIdentifier;
    }

    /**
     * Sets the value of the onlinePortalAssignedIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setOnlinePortalAssignedIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.onlinePortalAssignedIdentifier = value;
    }

    /**
     * Gets the value of the onlinePortalHostType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OnlinePortalHostEnum }{@code >}
     *     
     */
    public JAXBElement<OnlinePortalHostEnum> getOnlinePortalHostType() {
        return onlinePortalHostType;
    }

    /**
     * Sets the value of the onlinePortalHostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OnlinePortalHostEnum }{@code >}
     *     
     */
    public void setOnlinePortalHostType(JAXBElement<OnlinePortalHostEnum> value) {
        this.onlinePortalHostType = value;
    }

    /**
     * Gets the value of the onlinePortalHostTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getOnlinePortalHostTypeOtherDescription() {
        return onlinePortalHostTypeOtherDescription;
    }

    /**
     * Sets the value of the onlinePortalHostTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setOnlinePortalHostTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.onlinePortalHostTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COMMUNICATIONEVENTDETAILEXTENSION }
     *     
     */
    public COMMUNICATIONEVENTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMUNICATIONEVENTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(COMMUNICATIONEVENTDETAILEXTENSION value) {
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
