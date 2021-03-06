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
 * Information regarding  the type, purpose, issuer, status and details specific to a particular component of construction relative to the trade work planned, in progress or completed for the property.
 * 
 * <p>Java class for BUILDING_PERMIT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BUILDING_PERMIT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuildingPermitLevelType" type="{http://www.mismo.org/residential/2009/schemas}BuildingPermitLevelEnum" minOccurs="0"/>
 *         &lt;element name="BuildingPermitLevelTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitProposedUseDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitReferenceIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="BuildingPermitStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="BuildingPermitStatusDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitStatusType" type="{http://www.mismo.org/residential/2009/schemas}BuildingPermitStatusEnum" minOccurs="0"/>
 *         &lt;element name="BuildingPermitStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitTradeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitUsageStandardDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitUsageStandardType" type="{http://www.mismo.org/residential/2009/schemas}BuildingPermitUsageStandardEnum" minOccurs="0"/>
 *         &lt;element name="BuildingPermitUsageStandardTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitWorkPurposeDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitWorkPurposeType" type="{http://www.mismo.org/residential/2009/schemas}BuildingPermitWorkPurposeEnum" minOccurs="0"/>
 *         &lt;element name="BuildingPermitWorkPurposeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BuildingPermitWorkType" type="{http://www.mismo.org/residential/2009/schemas}BuildingPermitWorkEnum" minOccurs="0"/>
 *         &lt;element name="BuildingPermitWorkTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BUILDING_PERMIT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BUILDING_PERMIT", propOrder = {
    "buildingPermitLevelType",
    "buildingPermitLevelTypeOtherDescription",
    "buildingPermitProposedUseDescription",
    "buildingPermitReferenceIdentifier",
    "buildingPermitStatusDate",
    "buildingPermitStatusDescription",
    "buildingPermitStatusType",
    "buildingPermitStatusTypeOtherDescription",
    "buildingPermitTradeDescription",
    "buildingPermitUsageStandardDescription",
    "buildingPermitUsageStandardType",
    "buildingPermitUsageStandardTypeOtherDescription",
    "buildingPermitWorkPurposeDescription",
    "buildingPermitWorkPurposeType",
    "buildingPermitWorkPurposeTypeOtherDescription",
    "buildingPermitWorkType",
    "buildingPermitWorkTypeOtherDescription",
    "extension"
})
public class BUILDINGPERMIT {

    @XmlElementRef(name = "BuildingPermitLevelType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildingPermitLevelEnum> buildingPermitLevelType;
    @XmlElementRef(name = "BuildingPermitLevelTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitLevelTypeOtherDescription;
    @XmlElementRef(name = "BuildingPermitProposedUseDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitProposedUseDescription;
    @XmlElementRef(name = "BuildingPermitReferenceIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> buildingPermitReferenceIdentifier;
    @XmlElementRef(name = "BuildingPermitStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> buildingPermitStatusDate;
    @XmlElementRef(name = "BuildingPermitStatusDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitStatusDescription;
    @XmlElementRef(name = "BuildingPermitStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildingPermitStatusEnum> buildingPermitStatusType;
    @XmlElementRef(name = "BuildingPermitStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitStatusTypeOtherDescription;
    @XmlElementRef(name = "BuildingPermitTradeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitTradeDescription;
    @XmlElementRef(name = "BuildingPermitUsageStandardDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitUsageStandardDescription;
    @XmlElementRef(name = "BuildingPermitUsageStandardType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildingPermitUsageStandardEnum> buildingPermitUsageStandardType;
    @XmlElementRef(name = "BuildingPermitUsageStandardTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitUsageStandardTypeOtherDescription;
    @XmlElementRef(name = "BuildingPermitWorkPurposeDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitWorkPurposeDescription;
    @XmlElementRef(name = "BuildingPermitWorkPurposeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildingPermitWorkPurposeEnum> buildingPermitWorkPurposeType;
    @XmlElementRef(name = "BuildingPermitWorkPurposeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitWorkPurposeTypeOtherDescription;
    @XmlElementRef(name = "BuildingPermitWorkType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildingPermitWorkEnum> buildingPermitWorkType;
    @XmlElementRef(name = "BuildingPermitWorkTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> buildingPermitWorkTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected BUILDINGPERMITEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the buildingPermitLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitLevelEnum }{@code >}
     *     
     */
    public JAXBElement<BuildingPermitLevelEnum> getBuildingPermitLevelType() {
        return buildingPermitLevelType;
    }

    /**
     * Sets the value of the buildingPermitLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitLevelEnum }{@code >}
     *     
     */
    public void setBuildingPermitLevelType(JAXBElement<BuildingPermitLevelEnum> value) {
        this.buildingPermitLevelType = value;
    }

    /**
     * Gets the value of the buildingPermitLevelTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitLevelTypeOtherDescription() {
        return buildingPermitLevelTypeOtherDescription;
    }

    /**
     * Sets the value of the buildingPermitLevelTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitLevelTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitLevelTypeOtherDescription = value;
    }

    /**
     * Gets the value of the buildingPermitProposedUseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitProposedUseDescription() {
        return buildingPermitProposedUseDescription;
    }

    /**
     * Sets the value of the buildingPermitProposedUseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitProposedUseDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitProposedUseDescription = value;
    }

    /**
     * Gets the value of the buildingPermitReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getBuildingPermitReferenceIdentifier() {
        return buildingPermitReferenceIdentifier;
    }

    /**
     * Sets the value of the buildingPermitReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setBuildingPermitReferenceIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.buildingPermitReferenceIdentifier = value;
    }

    /**
     * Gets the value of the buildingPermitStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBuildingPermitStatusDate() {
        return buildingPermitStatusDate;
    }

    /**
     * Sets the value of the buildingPermitStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBuildingPermitStatusDate(JAXBElement<MISMODate> value) {
        this.buildingPermitStatusDate = value;
    }

    /**
     * Gets the value of the buildingPermitStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitStatusDescription() {
        return buildingPermitStatusDescription;
    }

    /**
     * Sets the value of the buildingPermitStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitStatusDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitStatusDescription = value;
    }

    /**
     * Gets the value of the buildingPermitStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitStatusEnum }{@code >}
     *     
     */
    public JAXBElement<BuildingPermitStatusEnum> getBuildingPermitStatusType() {
        return buildingPermitStatusType;
    }

    /**
     * Sets the value of the buildingPermitStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitStatusEnum }{@code >}
     *     
     */
    public void setBuildingPermitStatusType(JAXBElement<BuildingPermitStatusEnum> value) {
        this.buildingPermitStatusType = value;
    }

    /**
     * Gets the value of the buildingPermitStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitStatusTypeOtherDescription() {
        return buildingPermitStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the buildingPermitStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the buildingPermitTradeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitTradeDescription() {
        return buildingPermitTradeDescription;
    }

    /**
     * Sets the value of the buildingPermitTradeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitTradeDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitTradeDescription = value;
    }

    /**
     * Gets the value of the buildingPermitUsageStandardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitUsageStandardDescription() {
        return buildingPermitUsageStandardDescription;
    }

    /**
     * Sets the value of the buildingPermitUsageStandardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitUsageStandardDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitUsageStandardDescription = value;
    }

    /**
     * Gets the value of the buildingPermitUsageStandardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitUsageStandardEnum }{@code >}
     *     
     */
    public JAXBElement<BuildingPermitUsageStandardEnum> getBuildingPermitUsageStandardType() {
        return buildingPermitUsageStandardType;
    }

    /**
     * Sets the value of the buildingPermitUsageStandardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitUsageStandardEnum }{@code >}
     *     
     */
    public void setBuildingPermitUsageStandardType(JAXBElement<BuildingPermitUsageStandardEnum> value) {
        this.buildingPermitUsageStandardType = value;
    }

    /**
     * Gets the value of the buildingPermitUsageStandardTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitUsageStandardTypeOtherDescription() {
        return buildingPermitUsageStandardTypeOtherDescription;
    }

    /**
     * Sets the value of the buildingPermitUsageStandardTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitUsageStandardTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitUsageStandardTypeOtherDescription = value;
    }

    /**
     * Gets the value of the buildingPermitWorkPurposeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitWorkPurposeDescription() {
        return buildingPermitWorkPurposeDescription;
    }

    /**
     * Sets the value of the buildingPermitWorkPurposeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitWorkPurposeDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitWorkPurposeDescription = value;
    }

    /**
     * Gets the value of the buildingPermitWorkPurposeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitWorkPurposeEnum }{@code >}
     *     
     */
    public JAXBElement<BuildingPermitWorkPurposeEnum> getBuildingPermitWorkPurposeType() {
        return buildingPermitWorkPurposeType;
    }

    /**
     * Sets the value of the buildingPermitWorkPurposeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitWorkPurposeEnum }{@code >}
     *     
     */
    public void setBuildingPermitWorkPurposeType(JAXBElement<BuildingPermitWorkPurposeEnum> value) {
        this.buildingPermitWorkPurposeType = value;
    }

    /**
     * Gets the value of the buildingPermitWorkPurposeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitWorkPurposeTypeOtherDescription() {
        return buildingPermitWorkPurposeTypeOtherDescription;
    }

    /**
     * Sets the value of the buildingPermitWorkPurposeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitWorkPurposeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitWorkPurposeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the buildingPermitWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitWorkEnum }{@code >}
     *     
     */
    public JAXBElement<BuildingPermitWorkEnum> getBuildingPermitWorkType() {
        return buildingPermitWorkType;
    }

    /**
     * Sets the value of the buildingPermitWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingPermitWorkEnum }{@code >}
     *     
     */
    public void setBuildingPermitWorkType(JAXBElement<BuildingPermitWorkEnum> value) {
        this.buildingPermitWorkType = value;
    }

    /**
     * Gets the value of the buildingPermitWorkTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getBuildingPermitWorkTypeOtherDescription() {
        return buildingPermitWorkTypeOtherDescription;
    }

    /**
     * Sets the value of the buildingPermitWorkTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setBuildingPermitWorkTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.buildingPermitWorkTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDINGPERMITEXTENSION }
     *     
     */
    public BUILDINGPERMITEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDINGPERMITEXTENSION }
     *     
     */
    public void setEXTENSION(BUILDINGPERMITEXTENSION value) {
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
