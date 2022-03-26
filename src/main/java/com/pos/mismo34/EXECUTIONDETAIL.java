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
 * Contains date and additional location detail regarding the signing event.
 * 
 * <p>Java class for EXECUTION_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXECUTION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualSignatureType" type="{http://www.mismo.org/residential/2009/schemas}ActualSignatureEnum" minOccurs="0"/>
 *         &lt;element name="ActualSignatureTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ExecutionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ExecutionDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *         &lt;element name="ExecutionJudicialDistrictName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ExecutionJudicialDistrictType" type="{http://www.mismo.org/residential/2009/schemas}ExecutionJudicialDistrictEnum" minOccurs="0"/>
 *         &lt;element name="ExecutionJudicialDistrictTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}EXECUTION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "EXECUTION_DETAIL", propOrder = {
    "actualSignatureType",
    "actualSignatureTypeOtherDescription",
    "executionDate",
    "executionDatetime",
    "executionJudicialDistrictName",
    "executionJudicialDistrictType",
    "executionJudicialDistrictTypeOtherDescription",
    "extension"
})
public class EXECUTIONDETAIL {

    @XmlElementRef(name = "ActualSignatureType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ActualSignatureEnum> actualSignatureType;
    @XmlElementRef(name = "ActualSignatureTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> actualSignatureTypeOtherDescription;
    @XmlElementRef(name = "ExecutionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> executionDate;
    @XmlElementRef(name = "ExecutionDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> executionDatetime;
    @XmlElementRef(name = "ExecutionJudicialDistrictName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> executionJudicialDistrictName;
    @XmlElementRef(name = "ExecutionJudicialDistrictType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ExecutionJudicialDistrictEnum> executionJudicialDistrictType;
    @XmlElementRef(name = "ExecutionJudicialDistrictTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> executionJudicialDistrictTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected EXECUTIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the actualSignatureType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActualSignatureEnum }{@code >}
     *     
     */
    public JAXBElement<ActualSignatureEnum> getActualSignatureType() {
        return actualSignatureType;
    }

    /**
     * Sets the value of the actualSignatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActualSignatureEnum }{@code >}
     *     
     */
    public void setActualSignatureType(JAXBElement<ActualSignatureEnum> value) {
        this.actualSignatureType = value;
    }

    /**
     * Gets the value of the actualSignatureTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getActualSignatureTypeOtherDescription() {
        return actualSignatureTypeOtherDescription;
    }

    /**
     * Sets the value of the actualSignatureTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setActualSignatureTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.actualSignatureTypeOtherDescription = value;
    }

    /**
     * Gets the value of the executionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getExecutionDate() {
        return executionDate;
    }

    /**
     * Sets the value of the executionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setExecutionDate(JAXBElement<MISMODate> value) {
        this.executionDate = value;
    }

    /**
     * Gets the value of the executionDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public JAXBElement<MISMODatetime> getExecutionDatetime() {
        return executionDatetime;
    }

    /**
     * Sets the value of the executionDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *     
     */
    public void setExecutionDatetime(JAXBElement<MISMODatetime> value) {
        this.executionDatetime = value;
    }

    /**
     * Gets the value of the executionJudicialDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getExecutionJudicialDistrictName() {
        return executionJudicialDistrictName;
    }

    /**
     * Sets the value of the executionJudicialDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setExecutionJudicialDistrictName(JAXBElement<MISMOString> value) {
        this.executionJudicialDistrictName = value;
    }

    /**
     * Gets the value of the executionJudicialDistrictType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExecutionJudicialDistrictEnum }{@code >}
     *     
     */
    public JAXBElement<ExecutionJudicialDistrictEnum> getExecutionJudicialDistrictType() {
        return executionJudicialDistrictType;
    }

    /**
     * Sets the value of the executionJudicialDistrictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExecutionJudicialDistrictEnum }{@code >}
     *     
     */
    public void setExecutionJudicialDistrictType(JAXBElement<ExecutionJudicialDistrictEnum> value) {
        this.executionJudicialDistrictType = value;
    }

    /**
     * Gets the value of the executionJudicialDistrictTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getExecutionJudicialDistrictTypeOtherDescription() {
        return executionJudicialDistrictTypeOtherDescription;
    }

    /**
     * Sets the value of the executionJudicialDistrictTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setExecutionJudicialDistrictTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.executionJudicialDistrictTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EXECUTIONDETAILEXTENSION }
     *     
     */
    public EXECUTIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXECUTIONDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(EXECUTIONDETAILEXTENSION value) {
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