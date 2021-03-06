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
 * <p>Java class for SITE_VIEW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SITE_VIEW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfluenceImpactType" type="{http://www.mismo.org/residential/2009/schemas}InfluenceImpactEnum" minOccurs="0"/>
 *         &lt;element name="SiteViewDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SiteViewType" type="{http://www.mismo.org/residential/2009/schemas}SiteViewEnum" minOccurs="0"/>
 *         &lt;element name="SiteViewTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SITE_VIEW_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SITE_VIEW", propOrder = {
    "influenceImpactType",
    "siteViewDescription",
    "siteViewType",
    "siteViewTypeOtherDescription",
    "extension"
})
public class SITEVIEW {

    @XmlElementRef(name = "InfluenceImpactType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<InfluenceImpactEnum> influenceImpactType;
    @XmlElementRef(name = "SiteViewDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> siteViewDescription;
    @XmlElementRef(name = "SiteViewType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SiteViewEnum> siteViewType;
    @XmlElementRef(name = "SiteViewTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> siteViewTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected SITEVIEWEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the influenceImpactType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfluenceImpactEnum }{@code >}
     *     
     */
    public JAXBElement<InfluenceImpactEnum> getInfluenceImpactType() {
        return influenceImpactType;
    }

    /**
     * Sets the value of the influenceImpactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfluenceImpactEnum }{@code >}
     *     
     */
    public void setInfluenceImpactType(JAXBElement<InfluenceImpactEnum> value) {
        this.influenceImpactType = value;
    }

    /**
     * Gets the value of the siteViewDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSiteViewDescription() {
        return siteViewDescription;
    }

    /**
     * Sets the value of the siteViewDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSiteViewDescription(JAXBElement<MISMOString> value) {
        this.siteViewDescription = value;
    }

    /**
     * Gets the value of the siteViewType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SiteViewEnum }{@code >}
     *     
     */
    public JAXBElement<SiteViewEnum> getSiteViewType() {
        return siteViewType;
    }

    /**
     * Sets the value of the siteViewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SiteViewEnum }{@code >}
     *     
     */
    public void setSiteViewType(JAXBElement<SiteViewEnum> value) {
        this.siteViewType = value;
    }

    /**
     * Gets the value of the siteViewTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getSiteViewTypeOtherDescription() {
        return siteViewTypeOtherDescription;
    }

    /**
     * Sets the value of the siteViewTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setSiteViewTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.siteViewTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SITEVIEWEXTENSION }
     *     
     */
    public SITEVIEWEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITEVIEWEXTENSION }
     *     
     */
    public void setEXTENSION(SITEVIEWEXTENSION value) {
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
