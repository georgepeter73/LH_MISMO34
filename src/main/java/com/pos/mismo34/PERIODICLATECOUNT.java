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
 * <p>Java class for PERIODIC_LATE_COUNT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERIODIC_LATE_COUNT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Periodic120DaysLateCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="Periodic30DaysLateCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="Periodic60DaysLateCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="Periodic90DaysLateCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PeriodicLateCountType" type="{http://www.mismo.org/residential/2009/schemas}PeriodicLateCountEnum" minOccurs="0"/>
 *         &lt;element name="PeriodicLateCountTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PERIODIC_LATE_COUNT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PERIODIC_LATE_COUNT", propOrder = {
    "periodic120DaysLateCount",
    "periodic30DaysLateCount",
    "periodic60DaysLateCount",
    "periodic90DaysLateCount",
    "periodicLateCountType",
    "periodicLateCountTypeOtherDescription",
    "extension"
})
public class PERIODICLATECOUNT {

    @XmlElementRef(name = "Periodic120DaysLateCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> periodic120DaysLateCount;
    @XmlElementRef(name = "Periodic30DaysLateCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> periodic30DaysLateCount;
    @XmlElementRef(name = "Periodic60DaysLateCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> periodic60DaysLateCount;
    @XmlElementRef(name = "Periodic90DaysLateCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> periodic90DaysLateCount;
    @XmlElementRef(name = "PeriodicLateCountType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodicLateCountEnum> periodicLateCountType;
    @XmlElementRef(name = "PeriodicLateCountTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> periodicLateCountTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected PERIODICLATECOUNTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the periodic120DaysLateCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPeriodic120DaysLateCount() {
        return periodic120DaysLateCount;
    }

    /**
     * Sets the value of the periodic120DaysLateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPeriodic120DaysLateCount(JAXBElement<MISMOCount> value) {
        this.periodic120DaysLateCount = value;
    }

    /**
     * Gets the value of the periodic30DaysLateCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPeriodic30DaysLateCount() {
        return periodic30DaysLateCount;
    }

    /**
     * Sets the value of the periodic30DaysLateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPeriodic30DaysLateCount(JAXBElement<MISMOCount> value) {
        this.periodic30DaysLateCount = value;
    }

    /**
     * Gets the value of the periodic60DaysLateCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPeriodic60DaysLateCount() {
        return periodic60DaysLateCount;
    }

    /**
     * Sets the value of the periodic60DaysLateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPeriodic60DaysLateCount(JAXBElement<MISMOCount> value) {
        this.periodic60DaysLateCount = value;
    }

    /**
     * Gets the value of the periodic90DaysLateCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPeriodic90DaysLateCount() {
        return periodic90DaysLateCount;
    }

    /**
     * Sets the value of the periodic90DaysLateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPeriodic90DaysLateCount(JAXBElement<MISMOCount> value) {
        this.periodic90DaysLateCount = value;
    }

    /**
     * Gets the value of the periodicLateCountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodicLateCountEnum }{@code >}
     *     
     */
    public JAXBElement<PeriodicLateCountEnum> getPeriodicLateCountType() {
        return periodicLateCountType;
    }

    /**
     * Sets the value of the periodicLateCountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodicLateCountEnum }{@code >}
     *     
     */
    public void setPeriodicLateCountType(JAXBElement<PeriodicLateCountEnum> value) {
        this.periodicLateCountType = value;
    }

    /**
     * Gets the value of the periodicLateCountTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPeriodicLateCountTypeOtherDescription() {
        return periodicLateCountTypeOtherDescription;
    }

    /**
     * Sets the value of the periodicLateCountTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPeriodicLateCountTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.periodicLateCountTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PERIODICLATECOUNTEXTENSION }
     *     
     */
    public PERIODICLATECOUNTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODICLATECOUNTEXTENSION }
     *     
     */
    public void setEXTENSION(PERIODICLATECOUNTEXTENSION value) {
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
