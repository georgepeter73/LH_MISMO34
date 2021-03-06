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
 * Information regarding the type, date and results for collection efforts for a loan.
 * 
 * <p>Java class for COLLECTION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLLECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BorrowerCollectionResponseIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="CollectionContactDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CollectionContactMethodIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="CollectionContactMethodType" type="{http://www.mismo.org/residential/2009/schemas}CollectionContactMethodEnum" minOccurs="0"/>
 *         &lt;element name="CollectionContactMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CollectionContactProductiveIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PromiseToPayIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="RightPartyContactIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}COLLECTION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "COLLECTION", propOrder = {
    "borrowerCollectionResponseIndicator",
    "collectionContactDate",
    "collectionContactMethodIdentifier",
    "collectionContactMethodType",
    "collectionContactMethodTypeOtherDescription",
    "collectionContactProductiveIndicator",
    "promiseToPayIndicator",
    "rightPartyContactIndicator",
    "extension"
})
public class COLLECTION {

    @XmlElementRef(name = "BorrowerCollectionResponseIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> borrowerCollectionResponseIndicator;
    @XmlElementRef(name = "CollectionContactDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> collectionContactDate;
    @XmlElementRef(name = "CollectionContactMethodIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> collectionContactMethodIdentifier;
    @XmlElementRef(name = "CollectionContactMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectionContactMethodEnum> collectionContactMethodType;
    @XmlElementRef(name = "CollectionContactMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> collectionContactMethodTypeOtherDescription;
    @XmlElementRef(name = "CollectionContactProductiveIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> collectionContactProductiveIndicator;
    @XmlElementRef(name = "PromiseToPayIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> promiseToPayIndicator;
    @XmlElementRef(name = "RightPartyContactIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> rightPartyContactIndicator;
    @XmlElement(name = "EXTENSION")
    protected COLLECTIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the borrowerCollectionResponseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getBorrowerCollectionResponseIndicator() {
        return borrowerCollectionResponseIndicator;
    }

    /**
     * Sets the value of the borrowerCollectionResponseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setBorrowerCollectionResponseIndicator(JAXBElement<MISMOIndicator> value) {
        this.borrowerCollectionResponseIndicator = value;
    }

    /**
     * Gets the value of the collectionContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCollectionContactDate() {
        return collectionContactDate;
    }

    /**
     * Sets the value of the collectionContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCollectionContactDate(JAXBElement<MISMODate> value) {
        this.collectionContactDate = value;
    }

    /**
     * Gets the value of the collectionContactMethodIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getCollectionContactMethodIdentifier() {
        return collectionContactMethodIdentifier;
    }

    /**
     * Sets the value of the collectionContactMethodIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setCollectionContactMethodIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.collectionContactMethodIdentifier = value;
    }

    /**
     * Gets the value of the collectionContactMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectionContactMethodEnum }{@code >}
     *     
     */
    public JAXBElement<CollectionContactMethodEnum> getCollectionContactMethodType() {
        return collectionContactMethodType;
    }

    /**
     * Sets the value of the collectionContactMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectionContactMethodEnum }{@code >}
     *     
     */
    public void setCollectionContactMethodType(JAXBElement<CollectionContactMethodEnum> value) {
        this.collectionContactMethodType = value;
    }

    /**
     * Gets the value of the collectionContactMethodTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCollectionContactMethodTypeOtherDescription() {
        return collectionContactMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the collectionContactMethodTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCollectionContactMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.collectionContactMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the collectionContactProductiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCollectionContactProductiveIndicator() {
        return collectionContactProductiveIndicator;
    }

    /**
     * Sets the value of the collectionContactProductiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCollectionContactProductiveIndicator(JAXBElement<MISMOIndicator> value) {
        this.collectionContactProductiveIndicator = value;
    }

    /**
     * Gets the value of the promiseToPayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPromiseToPayIndicator() {
        return promiseToPayIndicator;
    }

    /**
     * Sets the value of the promiseToPayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPromiseToPayIndicator(JAXBElement<MISMOIndicator> value) {
        this.promiseToPayIndicator = value;
    }

    /**
     * Gets the value of the rightPartyContactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getRightPartyContactIndicator() {
        return rightPartyContactIndicator;
    }

    /**
     * Sets the value of the rightPartyContactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setRightPartyContactIndicator(JAXBElement<MISMOIndicator> value) {
        this.rightPartyContactIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link COLLECTIONEXTENSION }
     *     
     */
    public COLLECTIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link COLLECTIONEXTENSION }
     *     
     */
    public void setEXTENSION(COLLECTIONEXTENSION value) {
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
