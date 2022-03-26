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
 * <p>Java class for UNIT_RENT_SCHEDULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNIT_RENT_SCHEDULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeaseExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LeaseStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="UnitActualRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UnitFurnishedActualRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UnitFurnishedMarketRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UnitMarketRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UnitUnfurnishedActualRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="UnitUnfurnishedMarketRentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}UNIT_RENT_SCHEDULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "UNIT_RENT_SCHEDULE", propOrder = {
    "leaseExpirationDate",
    "leaseStartDate",
    "unitActualRentAmount",
    "unitFurnishedActualRentAmount",
    "unitFurnishedMarketRentAmount",
    "unitMarketRentAmount",
    "unitUnfurnishedActualRentAmount",
    "unitUnfurnishedMarketRentAmount",
    "extension"
})
public class UNITRENTSCHEDULE {

    @XmlElementRef(name = "LeaseExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> leaseExpirationDate;
    @XmlElementRef(name = "LeaseStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> leaseStartDate;
    @XmlElementRef(name = "UnitActualRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unitActualRentAmount;
    @XmlElementRef(name = "UnitFurnishedActualRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unitFurnishedActualRentAmount;
    @XmlElementRef(name = "UnitFurnishedMarketRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unitFurnishedMarketRentAmount;
    @XmlElementRef(name = "UnitMarketRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unitMarketRentAmount;
    @XmlElementRef(name = "UnitUnfurnishedActualRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unitUnfurnishedActualRentAmount;
    @XmlElementRef(name = "UnitUnfurnishedMarketRentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> unitUnfurnishedMarketRentAmount;
    @XmlElement(name = "EXTENSION")
    protected UNITRENTSCHEDULEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the leaseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLeaseStartDate() {
        return leaseStartDate;
    }

    /**
     * Sets the value of the leaseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLeaseStartDate(JAXBElement<MISMODate> value) {
        this.leaseStartDate = value;
    }

    /**
     * Gets the value of the unitActualRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnitActualRentAmount() {
        return unitActualRentAmount;
    }

    /**
     * Sets the value of the unitActualRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnitActualRentAmount(JAXBElement<MISMOAmount> value) {
        this.unitActualRentAmount = value;
    }

    /**
     * Gets the value of the unitFurnishedActualRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnitFurnishedActualRentAmount() {
        return unitFurnishedActualRentAmount;
    }

    /**
     * Sets the value of the unitFurnishedActualRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnitFurnishedActualRentAmount(JAXBElement<MISMOAmount> value) {
        this.unitFurnishedActualRentAmount = value;
    }

    /**
     * Gets the value of the unitFurnishedMarketRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnitFurnishedMarketRentAmount() {
        return unitFurnishedMarketRentAmount;
    }

    /**
     * Sets the value of the unitFurnishedMarketRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnitFurnishedMarketRentAmount(JAXBElement<MISMOAmount> value) {
        this.unitFurnishedMarketRentAmount = value;
    }

    /**
     * Gets the value of the unitMarketRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnitMarketRentAmount() {
        return unitMarketRentAmount;
    }

    /**
     * Sets the value of the unitMarketRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnitMarketRentAmount(JAXBElement<MISMOAmount> value) {
        this.unitMarketRentAmount = value;
    }

    /**
     * Gets the value of the unitUnfurnishedActualRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnitUnfurnishedActualRentAmount() {
        return unitUnfurnishedActualRentAmount;
    }

    /**
     * Sets the value of the unitUnfurnishedActualRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnitUnfurnishedActualRentAmount(JAXBElement<MISMOAmount> value) {
        this.unitUnfurnishedActualRentAmount = value;
    }

    /**
     * Gets the value of the unitUnfurnishedMarketRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getUnitUnfurnishedMarketRentAmount() {
        return unitUnfurnishedMarketRentAmount;
    }

    /**
     * Sets the value of the unitUnfurnishedMarketRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setUnitUnfurnishedMarketRentAmount(JAXBElement<MISMOAmount> value) {
        this.unitUnfurnishedMarketRentAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link UNITRENTSCHEDULEEXTENSION }
     *     
     */
    public UNITRENTSCHEDULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNITRENTSCHEDULEEXTENSION }
     *     
     */
    public void setEXTENSION(UNITRENTSCHEDULEEXTENSION value) {
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
