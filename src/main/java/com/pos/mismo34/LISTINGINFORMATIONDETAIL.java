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
 * Information regarding the status, amount and other facts about the offering for sale of the property.
 * 
 * <p>Java class for LISTING_INFORMATION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LISTING_INFORMATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CumulativeDaysOnMarketCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="CurrentListPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CurrentlyListedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="DaysOnMarketCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="FinalListPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ForSaleByOwnerIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LastListPriceRevisionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ListedWithinPreviousYearDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ListedWithinPreviousYearIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ListingStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ListingStatusType" type="{http://www.mismo.org/residential/2009/schemas}ListingStatusEnum" minOccurs="0"/>
 *         &lt;element name="ListingStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="MLSNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PropertyForecastSalePriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PropertyTypicalMarketingDaysDurationType" type="{http://www.mismo.org/residential/2009/schemas}PropertyTypicalMarketingDaysDurationEnum" minOccurs="0"/>
 *         &lt;element name="ShortSaleOfferingType" type="{http://www.mismo.org/residential/2009/schemas}ShortSaleOfferingEnum" minOccurs="0"/>
 *         &lt;element name="ShortSaleOfferingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LISTING_INFORMATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "LISTING_INFORMATION_DETAIL", propOrder = {
    "cumulativeDaysOnMarketCount",
    "currentListPriceAmount",
    "currentlyListedIndicator",
    "daysOnMarketCount",
    "finalListPriceAmount",
    "forSaleByOwnerIndicator",
    "lastListPriceRevisionDate",
    "listedWithinPreviousYearDescription",
    "listedWithinPreviousYearIndicator",
    "listingStatusDate",
    "listingStatusType",
    "listingStatusTypeOtherDescription",
    "mlsNumberIdentifier",
    "propertyForecastSalePriceAmount",
    "propertyTypicalMarketingDaysDurationType",
    "shortSaleOfferingType",
    "shortSaleOfferingTypeOtherDescription",
    "extension"
})
public class LISTINGINFORMATIONDETAIL {

    @XmlElementRef(name = "CumulativeDaysOnMarketCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> cumulativeDaysOnMarketCount;
    @XmlElementRef(name = "CurrentListPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> currentListPriceAmount;
    @XmlElementRef(name = "CurrentlyListedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> currentlyListedIndicator;
    @XmlElementRef(name = "DaysOnMarketCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> daysOnMarketCount;
    @XmlElementRef(name = "FinalListPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> finalListPriceAmount;
    @XmlElementRef(name = "ForSaleByOwnerIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> forSaleByOwnerIndicator;
    @XmlElementRef(name = "LastListPriceRevisionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> lastListPriceRevisionDate;
    @XmlElementRef(name = "ListedWithinPreviousYearDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> listedWithinPreviousYearDescription;
    @XmlElementRef(name = "ListedWithinPreviousYearIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> listedWithinPreviousYearIndicator;
    @XmlElementRef(name = "ListingStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> listingStatusDate;
    @XmlElementRef(name = "ListingStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ListingStatusEnum> listingStatusType;
    @XmlElementRef(name = "ListingStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> listingStatusTypeOtherDescription;
    @XmlElementRef(name = "MLSNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mlsNumberIdentifier;
    @XmlElementRef(name = "PropertyForecastSalePriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> propertyForecastSalePriceAmount;
    @XmlElementRef(name = "PropertyTypicalMarketingDaysDurationType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyTypicalMarketingDaysDurationEnum> propertyTypicalMarketingDaysDurationType;
    @XmlElementRef(name = "ShortSaleOfferingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ShortSaleOfferingEnum> shortSaleOfferingType;
    @XmlElementRef(name = "ShortSaleOfferingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> shortSaleOfferingTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected LISTINGINFORMATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the cumulativeDaysOnMarketCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getCumulativeDaysOnMarketCount() {
        return cumulativeDaysOnMarketCount;
    }

    /**
     * Sets the value of the cumulativeDaysOnMarketCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setCumulativeDaysOnMarketCount(JAXBElement<MISMOCount> value) {
        this.cumulativeDaysOnMarketCount = value;
    }

    /**
     * Gets the value of the currentListPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCurrentListPriceAmount() {
        return currentListPriceAmount;
    }

    /**
     * Sets the value of the currentListPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCurrentListPriceAmount(JAXBElement<MISMOAmount> value) {
        this.currentListPriceAmount = value;
    }

    /**
     * Gets the value of the currentlyListedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getCurrentlyListedIndicator() {
        return currentlyListedIndicator;
    }

    /**
     * Sets the value of the currentlyListedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setCurrentlyListedIndicator(JAXBElement<MISMOIndicator> value) {
        this.currentlyListedIndicator = value;
    }

    /**
     * Gets the value of the daysOnMarketCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getDaysOnMarketCount() {
        return daysOnMarketCount;
    }

    /**
     * Sets the value of the daysOnMarketCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setDaysOnMarketCount(JAXBElement<MISMOCount> value) {
        this.daysOnMarketCount = value;
    }

    /**
     * Gets the value of the finalListPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getFinalListPriceAmount() {
        return finalListPriceAmount;
    }

    /**
     * Sets the value of the finalListPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setFinalListPriceAmount(JAXBElement<MISMOAmount> value) {
        this.finalListPriceAmount = value;
    }

    /**
     * Gets the value of the forSaleByOwnerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getForSaleByOwnerIndicator() {
        return forSaleByOwnerIndicator;
    }

    /**
     * Sets the value of the forSaleByOwnerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setForSaleByOwnerIndicator(JAXBElement<MISMOIndicator> value) {
        this.forSaleByOwnerIndicator = value;
    }

    /**
     * Gets the value of the lastListPriceRevisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLastListPriceRevisionDate() {
        return lastListPriceRevisionDate;
    }

    /**
     * Sets the value of the lastListPriceRevisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLastListPriceRevisionDate(JAXBElement<MISMODate> value) {
        this.lastListPriceRevisionDate = value;
    }

    /**
     * Gets the value of the listedWithinPreviousYearDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getListedWithinPreviousYearDescription() {
        return listedWithinPreviousYearDescription;
    }

    /**
     * Sets the value of the listedWithinPreviousYearDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setListedWithinPreviousYearDescription(JAXBElement<MISMOString> value) {
        this.listedWithinPreviousYearDescription = value;
    }

    /**
     * Gets the value of the listedWithinPreviousYearIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getListedWithinPreviousYearIndicator() {
        return listedWithinPreviousYearIndicator;
    }

    /**
     * Sets the value of the listedWithinPreviousYearIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setListedWithinPreviousYearIndicator(JAXBElement<MISMOIndicator> value) {
        this.listedWithinPreviousYearIndicator = value;
    }

    /**
     * Gets the value of the listingStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getListingStatusDate() {
        return listingStatusDate;
    }

    /**
     * Sets the value of the listingStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setListingStatusDate(JAXBElement<MISMODate> value) {
        this.listingStatusDate = value;
    }

    /**
     * Gets the value of the listingStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListingStatusEnum }{@code >}
     *     
     */
    public JAXBElement<ListingStatusEnum> getListingStatusType() {
        return listingStatusType;
    }

    /**
     * Sets the value of the listingStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListingStatusEnum }{@code >}
     *     
     */
    public void setListingStatusType(JAXBElement<ListingStatusEnum> value) {
        this.listingStatusType = value;
    }

    /**
     * Gets the value of the listingStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getListingStatusTypeOtherDescription() {
        return listingStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the listingStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setListingStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.listingStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the mlsNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getMLSNumberIdentifier() {
        return mlsNumberIdentifier;
    }

    /**
     * Sets the value of the mlsNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setMLSNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mlsNumberIdentifier = value;
    }

    /**
     * Gets the value of the propertyForecastSalePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getPropertyForecastSalePriceAmount() {
        return propertyForecastSalePriceAmount;
    }

    /**
     * Sets the value of the propertyForecastSalePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setPropertyForecastSalePriceAmount(JAXBElement<MISMOAmount> value) {
        this.propertyForecastSalePriceAmount = value;
    }

    /**
     * Gets the value of the propertyTypicalMarketingDaysDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyTypicalMarketingDaysDurationEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyTypicalMarketingDaysDurationEnum> getPropertyTypicalMarketingDaysDurationType() {
        return propertyTypicalMarketingDaysDurationType;
    }

    /**
     * Sets the value of the propertyTypicalMarketingDaysDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyTypicalMarketingDaysDurationEnum }{@code >}
     *     
     */
    public void setPropertyTypicalMarketingDaysDurationType(JAXBElement<PropertyTypicalMarketingDaysDurationEnum> value) {
        this.propertyTypicalMarketingDaysDurationType = value;
    }

    /**
     * Gets the value of the shortSaleOfferingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShortSaleOfferingEnum }{@code >}
     *     
     */
    public JAXBElement<ShortSaleOfferingEnum> getShortSaleOfferingType() {
        return shortSaleOfferingType;
    }

    /**
     * Sets the value of the shortSaleOfferingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShortSaleOfferingEnum }{@code >}
     *     
     */
    public void setShortSaleOfferingType(JAXBElement<ShortSaleOfferingEnum> value) {
        this.shortSaleOfferingType = value;
    }

    /**
     * Gets the value of the shortSaleOfferingTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getShortSaleOfferingTypeOtherDescription() {
        return shortSaleOfferingTypeOtherDescription;
    }

    /**
     * Sets the value of the shortSaleOfferingTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setShortSaleOfferingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.shortSaleOfferingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link LISTINGINFORMATIONDETAILEXTENSION }
     *     
     */
    public LISTINGINFORMATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTINGINFORMATIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(LISTINGINFORMATIONDETAILEXTENSION value) {
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
