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
 * <p>Java class for PROPERTY_UNIT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPERTY_UNIT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BathroomNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="BedroomCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="CooperativeAssignmentOfLeaseDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CooperativeProprietaryLeaseDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CooperativeStockCertificateNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="CooperativeUnitSharesCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="FloorIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="LeaseExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LevelCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PropertyDwellingUnitEligibleRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PropertyDwellingUnitLeaseProvidedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertyDwellingUnitPastDueRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="SquareFeetPerUnitNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="TotalRoomCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="UnitIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="UnitOccupancyType" type="{http://www.mismo.org/residential/2009/schemas}UnitOccupancyEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_UNIT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROPERTY_UNIT_DETAIL", propOrder = {
    "bathroomNumber",
    "bedroomCount",
    "cooperativeAssignmentOfLeaseDate",
    "cooperativeProprietaryLeaseDate",
    "cooperativeStockCertificateNumberIdentifier",
    "cooperativeUnitSharesCount",
    "floorIdentifier",
    "leaseExpirationDate",
    "levelCount",
    "propertyDwellingUnitEligibleRentAmount",
    "propertyDwellingUnitLeaseProvidedIndicator",
    "propertyDwellingUnitPastDueRentAmount",
    "squareFeetPerUnitNumber",
    "totalRoomCount",
    "unitIdentifier",
    "unitOccupancyType",
    "extension"
})
public class PROPERTYUNITDETAIL {

    @XmlElementRef(name = "BathroomNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> bathroomNumber;
    @XmlElementRef(name = "BedroomCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> bedroomCount;
    @XmlElementRef(name = "CooperativeAssignmentOfLeaseDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> cooperativeAssignmentOfLeaseDate;
    @XmlElementRef(name = "CooperativeProprietaryLeaseDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> cooperativeProprietaryLeaseDate;
    @XmlElementRef(name = "CooperativeStockCertificateNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> cooperativeStockCertificateNumberIdentifier;
    @XmlElementRef(name = "CooperativeUnitSharesCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> cooperativeUnitSharesCount;
    @XmlElementRef(name = "FloorIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> floorIdentifier;
    @XmlElementRef(name = "LeaseExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> leaseExpirationDate;
    @XmlElementRef(name = "LevelCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> levelCount;
    @XmlElementRef(name = "PropertyDwellingUnitEligibleRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> propertyDwellingUnitEligibleRentAmount;
    @XmlElementRef(name = "PropertyDwellingUnitLeaseProvidedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> propertyDwellingUnitLeaseProvidedIndicator;
    @XmlElementRef(name = "PropertyDwellingUnitPastDueRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> propertyDwellingUnitPastDueRentAmount;
    @XmlElementRef(name = "SquareFeetPerUnitNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> squareFeetPerUnitNumber;
    @XmlElementRef(name = "TotalRoomCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> totalRoomCount;
    @XmlElementRef(name = "UnitIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> unitIdentifier;
    @XmlElementRef(name = "UnitOccupancyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOccupancyEnum> unitOccupancyType;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYUNITDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the bathroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getBathroomNumber() {
        return bathroomNumber;
    }

    /**
     * Sets the value of the bathroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setBathroomNumber(JAXBElement<MISMONumeric> value) {
        this.bathroomNumber = value;
    }

    /**
     * Gets the value of the bedroomCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getBedroomCount() {
        return bedroomCount;
    }

    /**
     * Sets the value of the bedroomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setBedroomCount(JAXBElement<MISMOCount> value) {
        this.bedroomCount = value;
    }

    /**
     * Gets the value of the cooperativeAssignmentOfLeaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCooperativeAssignmentOfLeaseDate() {
        return cooperativeAssignmentOfLeaseDate;
    }

    /**
     * Sets the value of the cooperativeAssignmentOfLeaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCooperativeAssignmentOfLeaseDate(JAXBElement<MISMODate> value) {
        this.cooperativeAssignmentOfLeaseDate = value;
    }

    /**
     * Gets the value of the cooperativeProprietaryLeaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getCooperativeProprietaryLeaseDate() {
        return cooperativeProprietaryLeaseDate;
    }

    /**
     * Sets the value of the cooperativeProprietaryLeaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setCooperativeProprietaryLeaseDate(JAXBElement<MISMODate> value) {
        this.cooperativeProprietaryLeaseDate = value;
    }

    /**
     * Gets the value of the cooperativeStockCertificateNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getCooperativeStockCertificateNumberIdentifier() {
        return cooperativeStockCertificateNumberIdentifier;
    }

    /**
     * Sets the value of the cooperativeStockCertificateNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setCooperativeStockCertificateNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.cooperativeStockCertificateNumberIdentifier = value;
    }

    /**
     * Gets the value of the cooperativeUnitSharesCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getCooperativeUnitSharesCount() {
        return cooperativeUnitSharesCount;
    }

    /**
     * Sets the value of the cooperativeUnitSharesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setCooperativeUnitSharesCount(JAXBElement<MISMOCount> value) {
        this.cooperativeUnitSharesCount = value;
    }

    /**
     * Gets the value of the floorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getFloorIdentifier() {
        return floorIdentifier;
    }

    /**
     * Sets the value of the floorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setFloorIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.floorIdentifier = value;
    }

    /**
     * Gets the value of the leaseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLeaseExpirationDate() {
        return leaseExpirationDate;
    }

    /**
     * Sets the value of the leaseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLeaseExpirationDate(JAXBElement<MISMODate> value) {
        this.leaseExpirationDate = value;
    }

    /**
     * Gets the value of the levelCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLevelCount() {
        return levelCount;
    }

    /**
     * Sets the value of the levelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLevelCount(JAXBElement<MISMOCount> value) {
        this.levelCount = value;
    }

    /**
     * Gets the value of the propertyDwellingUnitEligibleRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPropertyDwellingUnitEligibleRentAmount() {
        return propertyDwellingUnitEligibleRentAmount;
    }

    /**
     * Sets the value of the propertyDwellingUnitEligibleRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPropertyDwellingUnitEligibleRentAmount(JAXBElement<MISMOAmount> value) {
        this.propertyDwellingUnitEligibleRentAmount = value;
    }

    /**
     * Gets the value of the propertyDwellingUnitLeaseProvidedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPropertyDwellingUnitLeaseProvidedIndicator() {
        return propertyDwellingUnitLeaseProvidedIndicator;
    }

    /**
     * Sets the value of the propertyDwellingUnitLeaseProvidedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPropertyDwellingUnitLeaseProvidedIndicator(JAXBElement<MISMOIndicator> value) {
        this.propertyDwellingUnitLeaseProvidedIndicator = value;
    }

    /**
     * Gets the value of the propertyDwellingUnitPastDueRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPropertyDwellingUnitPastDueRentAmount() {
        return propertyDwellingUnitPastDueRentAmount;
    }

    /**
     * Sets the value of the propertyDwellingUnitPastDueRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPropertyDwellingUnitPastDueRentAmount(JAXBElement<MISMOAmount> value) {
        this.propertyDwellingUnitPastDueRentAmount = value;
    }

    /**
     * Gets the value of the squareFeetPerUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public JAXBElement<MISMONumeric> getSquareFeetPerUnitNumber() {
        return squareFeetPerUnitNumber;
    }

    /**
     * Sets the value of the squareFeetPerUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *     
     */
    public void setSquareFeetPerUnitNumber(JAXBElement<MISMONumeric> value) {
        this.squareFeetPerUnitNumber = value;
    }

    /**
     * Gets the value of the totalRoomCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getTotalRoomCount() {
        return totalRoomCount;
    }

    /**
     * Sets the value of the totalRoomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setTotalRoomCount(JAXBElement<MISMOCount> value) {
        this.totalRoomCount = value;
    }

    /**
     * Gets the value of the unitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getUnitIdentifier() {
        return unitIdentifier;
    }

    /**
     * Sets the value of the unitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setUnitIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.unitIdentifier = value;
    }

    /**
     * Gets the value of the unitOccupancyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOccupancyEnum }{@code >}
     *     
     */
    public JAXBElement<UnitOccupancyEnum> getUnitOccupancyType() {
        return unitOccupancyType;
    }

    /**
     * Sets the value of the unitOccupancyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOccupancyEnum }{@code >}
     *     
     */
    public void setUnitOccupancyType(JAXBElement<UnitOccupancyEnum> value) {
        this.unitOccupancyType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYUNITDETAILEXTENSION }
     *     
     */
    public PROPERTYUNITDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYUNITDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(PROPERTYUNITDETAILEXTENSION value) {
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
