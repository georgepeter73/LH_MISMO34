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
 * Information regarding the name, location, marketability, growth and other facts about the neighborhood, 
 * 
 * <p>Java class for NEIGHBORHOOD_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NEIGHBORHOOD_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdverseNeighborhoodInfluenceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="NeighborhoodAcceptabilityOfCooperativeOwnershipDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodAcceptanceOfCooperativeOwnershipIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="NeighborhoodBoundariesDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodBuiltUpPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="NeighborhoodDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodGrowthPaceType" type="{http://www.mismo.org/residential/2009/schemas}NeighborhoodGrowthPaceEnum" minOccurs="0"/>
 *         &lt;element name="NeighborhoodMarketabilityFactorsDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodMarketConditionsDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodPopulationDensityDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodPotentialManufacturedHomeParkDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodPropertyLocationType" type="{http://www.mismo.org/residential/2009/schemas}NeighborhoodPropertyLocationEnum" minOccurs="0"/>
 *         &lt;element name="NeighborhoodPropertyLocationTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="NeighborhoodStreetMeetsStandardsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}NEIGHBORHOOD_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "NEIGHBORHOOD_DETAIL", propOrder = {
    "adverseNeighborhoodInfluenceIndicator",
    "neighborhoodAcceptabilityOfCooperativeOwnershipDescription",
    "neighborhoodAcceptanceOfCooperativeOwnershipIndicator",
    "neighborhoodBoundariesDescription",
    "neighborhoodBuiltUpPercent",
    "neighborhoodDescription",
    "neighborhoodGrowthPaceType",
    "neighborhoodMarketabilityFactorsDescription",
    "neighborhoodMarketConditionsDescription",
    "neighborhoodName",
    "neighborhoodPopulationDensityDescription",
    "neighborhoodPotentialManufacturedHomeParkDescription",
    "neighborhoodPropertyLocationType",
    "neighborhoodPropertyLocationTypeOtherDescription",
    "neighborhoodStreetMeetsStandardsIndicator",
    "extension"
})
public class NEIGHBORHOODDETAIL {

    @XmlElementRef(name = "AdverseNeighborhoodInfluenceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> adverseNeighborhoodInfluenceIndicator;
    @XmlElementRef(name = "NeighborhoodAcceptabilityOfCooperativeOwnershipDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodAcceptabilityOfCooperativeOwnershipDescription;
    @XmlElementRef(name = "NeighborhoodAcceptanceOfCooperativeOwnershipIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> neighborhoodAcceptanceOfCooperativeOwnershipIndicator;
    @XmlElementRef(name = "NeighborhoodBoundariesDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodBoundariesDescription;
    @XmlElementRef(name = "NeighborhoodBuiltUpPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> neighborhoodBuiltUpPercent;
    @XmlElementRef(name = "NeighborhoodDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodDescription;
    @XmlElementRef(name = "NeighborhoodGrowthPaceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<NeighborhoodGrowthPaceEnum> neighborhoodGrowthPaceType;
    @XmlElementRef(name = "NeighborhoodMarketabilityFactorsDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodMarketabilityFactorsDescription;
    @XmlElementRef(name = "NeighborhoodMarketConditionsDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodMarketConditionsDescription;
    @XmlElementRef(name = "NeighborhoodName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodName;
    @XmlElementRef(name = "NeighborhoodPopulationDensityDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodPopulationDensityDescription;
    @XmlElementRef(name = "NeighborhoodPotentialManufacturedHomeParkDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodPotentialManufacturedHomeParkDescription;
    @XmlElementRef(name = "NeighborhoodPropertyLocationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<NeighborhoodPropertyLocationEnum> neighborhoodPropertyLocationType;
    @XmlElementRef(name = "NeighborhoodPropertyLocationTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> neighborhoodPropertyLocationTypeOtherDescription;
    @XmlElementRef(name = "NeighborhoodStreetMeetsStandardsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> neighborhoodStreetMeetsStandardsIndicator;
    @XmlElement(name = "EXTENSION")
    protected NEIGHBORHOODDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adverseNeighborhoodInfluenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getAdverseNeighborhoodInfluenceIndicator() {
        return adverseNeighborhoodInfluenceIndicator;
    }

    /**
     * Sets the value of the adverseNeighborhoodInfluenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setAdverseNeighborhoodInfluenceIndicator(JAXBElement<MISMOIndicator> value) {
        this.adverseNeighborhoodInfluenceIndicator = value;
    }

    /**
     * Gets the value of the neighborhoodAcceptabilityOfCooperativeOwnershipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodAcceptabilityOfCooperativeOwnershipDescription() {
        return neighborhoodAcceptabilityOfCooperativeOwnershipDescription;
    }

    /**
     * Sets the value of the neighborhoodAcceptabilityOfCooperativeOwnershipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodAcceptabilityOfCooperativeOwnershipDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodAcceptabilityOfCooperativeOwnershipDescription = value;
    }

    /**
     * Gets the value of the neighborhoodAcceptanceOfCooperativeOwnershipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getNeighborhoodAcceptanceOfCooperativeOwnershipIndicator() {
        return neighborhoodAcceptanceOfCooperativeOwnershipIndicator;
    }

    /**
     * Sets the value of the neighborhoodAcceptanceOfCooperativeOwnershipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setNeighborhoodAcceptanceOfCooperativeOwnershipIndicator(JAXBElement<MISMOIndicator> value) {
        this.neighborhoodAcceptanceOfCooperativeOwnershipIndicator = value;
    }

    /**
     * Gets the value of the neighborhoodBoundariesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodBoundariesDescription() {
        return neighborhoodBoundariesDescription;
    }

    /**
     * Sets the value of the neighborhoodBoundariesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodBoundariesDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodBoundariesDescription = value;
    }

    /**
     * Gets the value of the neighborhoodBuiltUpPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getNeighborhoodBuiltUpPercent() {
        return neighborhoodBuiltUpPercent;
    }

    /**
     * Sets the value of the neighborhoodBuiltUpPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setNeighborhoodBuiltUpPercent(JAXBElement<MISMOPercent> value) {
        this.neighborhoodBuiltUpPercent = value;
    }

    /**
     * Gets the value of the neighborhoodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodDescription() {
        return neighborhoodDescription;
    }

    /**
     * Sets the value of the neighborhoodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodDescription = value;
    }

    /**
     * Gets the value of the neighborhoodGrowthPaceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NeighborhoodGrowthPaceEnum }{@code >}
     *     
     */
    public JAXBElement<NeighborhoodGrowthPaceEnum> getNeighborhoodGrowthPaceType() {
        return neighborhoodGrowthPaceType;
    }

    /**
     * Sets the value of the neighborhoodGrowthPaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NeighborhoodGrowthPaceEnum }{@code >}
     *     
     */
    public void setNeighborhoodGrowthPaceType(JAXBElement<NeighborhoodGrowthPaceEnum> value) {
        this.neighborhoodGrowthPaceType = value;
    }

    /**
     * Gets the value of the neighborhoodMarketabilityFactorsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodMarketabilityFactorsDescription() {
        return neighborhoodMarketabilityFactorsDescription;
    }

    /**
     * Sets the value of the neighborhoodMarketabilityFactorsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodMarketabilityFactorsDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodMarketabilityFactorsDescription = value;
    }

    /**
     * Gets the value of the neighborhoodMarketConditionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodMarketConditionsDescription() {
        return neighborhoodMarketConditionsDescription;
    }

    /**
     * Sets the value of the neighborhoodMarketConditionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodMarketConditionsDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodMarketConditionsDescription = value;
    }

    /**
     * Gets the value of the neighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodName() {
        return neighborhoodName;
    }

    /**
     * Sets the value of the neighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodName(JAXBElement<MISMOString> value) {
        this.neighborhoodName = value;
    }

    /**
     * Gets the value of the neighborhoodPopulationDensityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodPopulationDensityDescription() {
        return neighborhoodPopulationDensityDescription;
    }

    /**
     * Sets the value of the neighborhoodPopulationDensityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodPopulationDensityDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodPopulationDensityDescription = value;
    }

    /**
     * Gets the value of the neighborhoodPotentialManufacturedHomeParkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodPotentialManufacturedHomeParkDescription() {
        return neighborhoodPotentialManufacturedHomeParkDescription;
    }

    /**
     * Sets the value of the neighborhoodPotentialManufacturedHomeParkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodPotentialManufacturedHomeParkDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodPotentialManufacturedHomeParkDescription = value;
    }

    /**
     * Gets the value of the neighborhoodPropertyLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NeighborhoodPropertyLocationEnum }{@code >}
     *     
     */
    public JAXBElement<NeighborhoodPropertyLocationEnum> getNeighborhoodPropertyLocationType() {
        return neighborhoodPropertyLocationType;
    }

    /**
     * Sets the value of the neighborhoodPropertyLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NeighborhoodPropertyLocationEnum }{@code >}
     *     
     */
    public void setNeighborhoodPropertyLocationType(JAXBElement<NeighborhoodPropertyLocationEnum> value) {
        this.neighborhoodPropertyLocationType = value;
    }

    /**
     * Gets the value of the neighborhoodPropertyLocationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getNeighborhoodPropertyLocationTypeOtherDescription() {
        return neighborhoodPropertyLocationTypeOtherDescription;
    }

    /**
     * Sets the value of the neighborhoodPropertyLocationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setNeighborhoodPropertyLocationTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.neighborhoodPropertyLocationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the neighborhoodStreetMeetsStandardsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getNeighborhoodStreetMeetsStandardsIndicator() {
        return neighborhoodStreetMeetsStandardsIndicator;
    }

    /**
     * Sets the value of the neighborhoodStreetMeetsStandardsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setNeighborhoodStreetMeetsStandardsIndicator(JAXBElement<MISMOIndicator> value) {
        this.neighborhoodStreetMeetsStandardsIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NEIGHBORHOODDETAILEXTENSION }
     *     
     */
    public NEIGHBORHOODDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEIGHBORHOODDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(NEIGHBORHOODDETAILEXTENSION value) {
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
