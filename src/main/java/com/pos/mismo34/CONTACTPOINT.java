//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Describes information associated with an electronic method of contacting or communication with a party.
 * 
 * <p>Java class for CONTACT_POINT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTACT_POINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CONTACT_POINT_EMAIL" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINT_EMAIL" minOccurs="0"/>
 *           &lt;element name="CONTACT_POINT_SOCIAL_MEDIA" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINT_SOCIAL_MEDIA" minOccurs="0"/>
 *           &lt;element name="CONTACT_POINT_TELEPHONE" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINT_TELEPHONE" minOccurs="0"/>
 *           &lt;element name="OTHER_CONTACT_POINT" type="{http://www.mismo.org/residential/2009/schemas}OTHER_CONTACT_POINT" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CONTACT_POINT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINT_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CONTACT_POINT", propOrder = {
    "contactpointemail",
    "contactpointsocialmedia",
    "contactpointtelephone",
    "othercontactpoint",
    "contactpointdetail",
    "extension"
})
public class CONTACTPOINT {

    @XmlElement(name = "CONTACT_POINT_EMAIL")
    protected CONTACTPOINTEMAIL contactpointemail;
    @XmlElement(name = "CONTACT_POINT_SOCIAL_MEDIA")
    protected CONTACTPOINTSOCIALMEDIA contactpointsocialmedia;
    @XmlElement(name = "CONTACT_POINT_TELEPHONE")
    protected CONTACTPOINTTELEPHONE contactpointtelephone;
    @XmlElement(name = "OTHER_CONTACT_POINT")
    protected OTHERCONTACTPOINT othercontactpoint;
    @XmlElement(name = "CONTACT_POINT_DETAIL")
    protected CONTACTPOINTDETAIL contactpointdetail;
    @XmlElement(name = "EXTENSION")
    protected CONTACTPOINTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the contactpointemail property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINTEMAIL }
     *     
     */
    public CONTACTPOINTEMAIL getCONTACTPOINTEMAIL() {
        return contactpointemail;
    }

    /**
     * Sets the value of the contactpointemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTEMAIL }
     *     
     */
    public void setCONTACTPOINTEMAIL(CONTACTPOINTEMAIL value) {
        this.contactpointemail = value;
    }

    /**
     * Gets the value of the contactpointsocialmedia property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINTSOCIALMEDIA }
     *     
     */
    public CONTACTPOINTSOCIALMEDIA getCONTACTPOINTSOCIALMEDIA() {
        return contactpointsocialmedia;
    }

    /**
     * Sets the value of the contactpointsocialmedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTSOCIALMEDIA }
     *     
     */
    public void setCONTACTPOINTSOCIALMEDIA(CONTACTPOINTSOCIALMEDIA value) {
        this.contactpointsocialmedia = value;
    }

    /**
     * Gets the value of the contactpointtelephone property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINTTELEPHONE }
     *     
     */
    public CONTACTPOINTTELEPHONE getCONTACTPOINTTELEPHONE() {
        return contactpointtelephone;
    }

    /**
     * Sets the value of the contactpointtelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTTELEPHONE }
     *     
     */
    public void setCONTACTPOINTTELEPHONE(CONTACTPOINTTELEPHONE value) {
        this.contactpointtelephone = value;
    }

    /**
     * Gets the value of the othercontactpoint property.
     * 
     * @return
     *     possible object is
     *     {@link OTHERCONTACTPOINT }
     *     
     */
    public OTHERCONTACTPOINT getOTHERCONTACTPOINT() {
        return othercontactpoint;
    }

    /**
     * Sets the value of the othercontactpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTHERCONTACTPOINT }
     *     
     */
    public void setOTHERCONTACTPOINT(OTHERCONTACTPOINT value) {
        this.othercontactpoint = value;
    }

    /**
     * Gets the value of the contactpointdetail property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINTDETAIL }
     *     
     */
    public CONTACTPOINTDETAIL getCONTACTPOINTDETAIL() {
        return contactpointdetail;
    }

    /**
     * Sets the value of the contactpointdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTDETAIL }
     *     
     */
    public void setCONTACTPOINTDETAIL(CONTACTPOINTDETAIL value) {
        this.contactpointdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTPOINTEXTENSION }
     *     
     */
    public CONTACTPOINTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTEXTENSION }
     *     
     */
    public void setEXTENSION(CONTACTPOINTEXTENSION value) {
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
