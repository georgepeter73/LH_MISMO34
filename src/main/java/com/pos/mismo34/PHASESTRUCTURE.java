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
 * Information regarding the residential unit inventory, common elements, car storage, conversion and other facts about a structure within a phase of a real estate development project.
 * 
 * <p>Java class for PHASE_STRUCTURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PHASE_STRUCTURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PHASE_STRUCTURE_CAR_STORAGES" type="{http://www.mismo.org/residential/2009/schemas}CAR_STORAGES" minOccurs="0"/>
 *         &lt;element name="PHASE_STRUCTURE_COMMON_ELEMENTS" type="{http://www.mismo.org/residential/2009/schemas}COMMON_ELEMENTS" minOccurs="0"/>
 *         &lt;element name="PHASE_STRUCTURE_CONVERSION" type="{http://www.mismo.org/residential/2009/schemas}CONVERSION" minOccurs="0"/>
 *         &lt;element name="PHASE_STRUCTURE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PHASE_STRUCTURE_DETAIL" minOccurs="0"/>
 *         &lt;element name="PHASE_STRUCTURE_HOUSING_UNIT_INVENTORIES" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_UNIT_INVENTORIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PHASE_STRUCTURE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PHASE_STRUCTURE", propOrder = {
    "phasestructurecarstorages",
    "phasestructurecommonelements",
    "phasestructureconversion",
    "phasestructuredetail",
    "phasestructurehousingunitinventories",
    "extension"
})
public class PHASESTRUCTURE {

    @XmlElement(name = "PHASE_STRUCTURE_CAR_STORAGES")
    protected CARSTORAGES phasestructurecarstorages;
    @XmlElement(name = "PHASE_STRUCTURE_COMMON_ELEMENTS")
    protected COMMONELEMENTS phasestructurecommonelements;
    @XmlElement(name = "PHASE_STRUCTURE_CONVERSION")
    protected CONVERSION phasestructureconversion;
    @XmlElement(name = "PHASE_STRUCTURE_DETAIL")
    protected PHASESTRUCTUREDETAIL phasestructuredetail;
    @XmlElement(name = "PHASE_STRUCTURE_HOUSING_UNIT_INVENTORIES")
    protected HOUSINGUNITINVENTORIES phasestructurehousingunitinventories;
    @XmlElement(name = "EXTENSION")
    protected PHASESTRUCTUREEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the phasestructurecarstorages property.
     * 
     * @return
     *     possible object is
     *     {@link CARSTORAGES }
     *     
     */
    public CARSTORAGES getPHASESTRUCTURECARSTORAGES() {
        return phasestructurecarstorages;
    }

    /**
     * Sets the value of the phasestructurecarstorages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARSTORAGES }
     *     
     */
    public void setPHASESTRUCTURECARSTORAGES(CARSTORAGES value) {
        this.phasestructurecarstorages = value;
    }

    /**
     * Gets the value of the phasestructurecommonelements property.
     * 
     * @return
     *     possible object is
     *     {@link COMMONELEMENTS }
     *     
     */
    public COMMONELEMENTS getPHASESTRUCTURECOMMONELEMENTS() {
        return phasestructurecommonelements;
    }

    /**
     * Sets the value of the phasestructurecommonelements property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMONELEMENTS }
     *     
     */
    public void setPHASESTRUCTURECOMMONELEMENTS(COMMONELEMENTS value) {
        this.phasestructurecommonelements = value;
    }

    /**
     * Gets the value of the phasestructureconversion property.
     * 
     * @return
     *     possible object is
     *     {@link CONVERSION }
     *     
     */
    public CONVERSION getPHASESTRUCTURECONVERSION() {
        return phasestructureconversion;
    }

    /**
     * Sets the value of the phasestructureconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONVERSION }
     *     
     */
    public void setPHASESTRUCTURECONVERSION(CONVERSION value) {
        this.phasestructureconversion = value;
    }

    /**
     * Gets the value of the phasestructuredetail property.
     * 
     * @return
     *     possible object is
     *     {@link PHASESTRUCTUREDETAIL }
     *     
     */
    public PHASESTRUCTUREDETAIL getPHASESTRUCTUREDETAIL() {
        return phasestructuredetail;
    }

    /**
     * Sets the value of the phasestructuredetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHASESTRUCTUREDETAIL }
     *     
     */
    public void setPHASESTRUCTUREDETAIL(PHASESTRUCTUREDETAIL value) {
        this.phasestructuredetail = value;
    }

    /**
     * Gets the value of the phasestructurehousingunitinventories property.
     * 
     * @return
     *     possible object is
     *     {@link HOUSINGUNITINVENTORIES }
     *     
     */
    public HOUSINGUNITINVENTORIES getPHASESTRUCTUREHOUSINGUNITINVENTORIES() {
        return phasestructurehousingunitinventories;
    }

    /**
     * Sets the value of the phasestructurehousingunitinventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOUSINGUNITINVENTORIES }
     *     
     */
    public void setPHASESTRUCTUREHOUSINGUNITINVENTORIES(HOUSINGUNITINVENTORIES value) {
        this.phasestructurehousingunitinventories = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PHASESTRUCTUREEXTENSION }
     *     
     */
    public PHASESTRUCTUREEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHASESTRUCTUREEXTENSION }
     *     
     */
    public void setEXTENSION(PHASESTRUCTUREEXTENSION value) {
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
