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
 * <p>Java class for PROPERTY_OWNER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY_OWNER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnershipPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="PropertyOwnerStatusType" type="{http://www.mismo.org/residential/2009/schemas}PropertyOwnerStatusEnum" minOccurs="0"/>
 *         &lt;element name="RelationshipVestingType" type="{http://www.mismo.org/residential/2009/schemas}RelationshipVestingEnum" minOccurs="0"/>
 *         &lt;element name="RelationshipVestingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_OWNER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROPERTY_OWNER", propOrder = {
    "ownershipPercent",
    "propertyOwnerStatusType",
    "relationshipVestingType",
    "relationshipVestingTypeOtherDescription",
    "extension"
})
public class PROPERTYOWNER {

    @XmlElementRef(name = "OwnershipPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> ownershipPercent;
    @XmlElementRef(name = "PropertyOwnerStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOwnerStatusEnum> propertyOwnerStatusType;
    @XmlElementRef(name = "RelationshipVestingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RelationshipVestingEnum> relationshipVestingType;
    @XmlElementRef(name = "RelationshipVestingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> relationshipVestingTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYOWNEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ownershipPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getOwnershipPercent() {
        return ownershipPercent;
    }

    /**
     * Sets the value of the ownershipPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setOwnershipPercent(JAXBElement<MISMOPercent> value) {
        this.ownershipPercent = value;
    }

    /**
     * Gets the value of the propertyOwnerStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOwnerStatusEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyOwnerStatusEnum> getPropertyOwnerStatusType() {
        return propertyOwnerStatusType;
    }

    /**
     * Sets the value of the propertyOwnerStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOwnerStatusEnum }{@code >}
     *     
     */
    public void setPropertyOwnerStatusType(JAXBElement<PropertyOwnerStatusEnum> value) {
        this.propertyOwnerStatusType = value;
    }

    /**
     * Gets the value of the relationshipVestingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelationshipVestingEnum }{@code >}
     *     
     */
    public JAXBElement<RelationshipVestingEnum> getRelationshipVestingType() {
        return relationshipVestingType;
    }

    /**
     * Sets the value of the relationshipVestingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelationshipVestingEnum }{@code >}
     *     
     */
    public void setRelationshipVestingType(JAXBElement<RelationshipVestingEnum> value) {
        this.relationshipVestingType = value;
    }

    /**
     * Gets the value of the relationshipVestingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getRelationshipVestingTypeOtherDescription() {
        return relationshipVestingTypeOtherDescription;
    }

    /**
     * Sets the value of the relationshipVestingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setRelationshipVestingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.relationshipVestingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYOWNEREXTENSION }
     *     
     */
    public PROPERTYOWNEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYOWNEREXTENSION }
     *     
     */
    public void setEXTENSION(PROPERTYOWNEREXTENSION value) {
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
