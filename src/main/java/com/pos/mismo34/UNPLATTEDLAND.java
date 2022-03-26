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
 * Information regarding land with boundaries that are determined by metes and bounds descriptions based on references to known Township, Range and Section corners.
 * 
 * <p>Java class for UNPLATTED_LAND complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNPLATTED_LAND">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbstractIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="BaseIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="LegalTractIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MeridianIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="MetesAndBoundsRemainingDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="QuarterSectionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="RangeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="SectionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="TownshipIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="UnplattedLandType" type="{http://www.mismo.org/residential/2009/schemas}UnplattedLandEnum" minOccurs="0"/>
 *         &lt;element name="UnplattedLandTypeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="UnplattedLandTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}UNPLATTED_LAND_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "UNPLATTED_LAND", propOrder = {
    "abstractIdentifier",
    "baseIdentifier",
    "legalTractIdentifier",
    "meridianIdentifier",
    "metesAndBoundsRemainingDescription",
    "quarterSectionIdentifier",
    "rangeIdentifier",
    "sectionIdentifier",
    "townshipIdentifier",
    "unplattedLandType",
    "unplattedLandTypeIdentifier",
    "unplattedLandTypeOtherDescription",
    "extension"
})
public class UNPLATTEDLAND {

    @XmlElementRef(name = "AbstractIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> abstractIdentifier;
    @XmlElementRef(name = "BaseIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> baseIdentifier;
    @XmlElementRef(name = "LegalTractIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> legalTractIdentifier;
    @XmlElementRef(name = "MeridianIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> meridianIdentifier;
    @XmlElementRef(name = "MetesAndBoundsRemainingDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> metesAndBoundsRemainingDescription;
    @XmlElementRef(name = "QuarterSectionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> quarterSectionIdentifier;
    @XmlElementRef(name = "RangeIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> rangeIdentifier;
    @XmlElementRef(name = "SectionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> sectionIdentifier;
    @XmlElementRef(name = "TownshipIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> townshipIdentifier;
    @XmlElementRef(name = "UnplattedLandType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnplattedLandEnum> unplattedLandType;
    @XmlElementRef(name = "UnplattedLandTypeIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> unplattedLandTypeIdentifier;
    @XmlElementRef(name = "UnplattedLandTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> unplattedLandTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected UNPLATTEDLANDEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the abstractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAbstractIdentifier() {
        return abstractIdentifier;
    }

    /**
     * Sets the value of the abstractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAbstractIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.abstractIdentifier = value;
    }

    /**
     * Gets the value of the baseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getBaseIdentifier() {
        return baseIdentifier;
    }

    /**
     * Sets the value of the baseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setBaseIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.baseIdentifier = value;
    }

    /**
     * Gets the value of the legalTractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getLegalTractIdentifier() {
        return legalTractIdentifier;
    }

    /**
     * Sets the value of the legalTractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setLegalTractIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.legalTractIdentifier = value;
    }

    /**
     * Gets the value of the meridianIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMeridianIdentifier() {
        return meridianIdentifier;
    }

    /**
     * Sets the value of the meridianIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMeridianIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.meridianIdentifier = value;
    }

    /**
     * Gets the value of the metesAndBoundsRemainingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getMetesAndBoundsRemainingDescription() {
        return metesAndBoundsRemainingDescription;
    }

    /**
     * Sets the value of the metesAndBoundsRemainingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setMetesAndBoundsRemainingDescription(JAXBElement<MISMOString> value) {
        this.metesAndBoundsRemainingDescription = value;
    }

    /**
     * Gets the value of the quarterSectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getQuarterSectionIdentifier() {
        return quarterSectionIdentifier;
    }

    /**
     * Sets the value of the quarterSectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setQuarterSectionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.quarterSectionIdentifier = value;
    }

    /**
     * Gets the value of the rangeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getRangeIdentifier() {
        return rangeIdentifier;
    }

    /**
     * Sets the value of the rangeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setRangeIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.rangeIdentifier = value;
    }

    /**
     * Gets the value of the sectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getSectionIdentifier() {
        return sectionIdentifier;
    }

    /**
     * Sets the value of the sectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setSectionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.sectionIdentifier = value;
    }

    /**
     * Gets the value of the townshipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getTownshipIdentifier() {
        return townshipIdentifier;
    }

    /**
     * Sets the value of the townshipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setTownshipIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.townshipIdentifier = value;
    }

    /**
     * Gets the value of the unplattedLandType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnplattedLandEnum }{@code >}
     *     
     */
    public JAXBElement<UnplattedLandEnum> getUnplattedLandType() {
        return unplattedLandType;
    }

    /**
     * Sets the value of the unplattedLandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnplattedLandEnum }{@code >}
     *     
     */
    public void setUnplattedLandType(JAXBElement<UnplattedLandEnum> value) {
        this.unplattedLandType = value;
    }

    /**
     * Gets the value of the unplattedLandTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getUnplattedLandTypeIdentifier() {
        return unplattedLandTypeIdentifier;
    }

    /**
     * Sets the value of the unplattedLandTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setUnplattedLandTypeIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.unplattedLandTypeIdentifier = value;
    }

    /**
     * Gets the value of the unplattedLandTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getUnplattedLandTypeOtherDescription() {
        return unplattedLandTypeOtherDescription;
    }

    /**
     * Sets the value of the unplattedLandTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setUnplattedLandTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.unplattedLandTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link UNPLATTEDLANDEXTENSION }
     *     
     */
    public UNPLATTEDLANDEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNPLATTEDLANDEXTENSION }
     *     
     */
    public void setEXTENSION(UNPLATTEDLANDEXTENSION value) {
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
