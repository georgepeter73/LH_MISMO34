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
 * Additional information about the borrowers residence.
 * 
 * <p>Java class for RESIDENCE_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESIDENCE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BorrowerResidencyBasisType" type="{http://www.mismo.org/residential/2009/schemas}BorrowerResidencyBasisEnum" minOccurs="0"/>
 *         &lt;element name="BorrowerResidencyDurationMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="BorrowerResidencyDurationYearsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="BorrowerResidencyEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="BorrowerResidencyReportedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="BorrowerResidencyStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="BorrowerResidencyType" type="{http://www.mismo.org/residential/2009/schemas}BorrowerResidencyEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RESIDENCE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RESIDENCE_DETAIL", propOrder = {
    "borrowerResidencyBasisType",
    "borrowerResidencyDurationMonthsCount",
    "borrowerResidencyDurationYearsCount",
    "borrowerResidencyEndDate",
    "borrowerResidencyReportedDate",
    "borrowerResidencyStartDate",
    "borrowerResidencyType",
    "extension"
})
public class RESIDENCEDETAIL {

    @XmlElementRef(name = "BorrowerResidencyBasisType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BorrowerResidencyBasisEnum> borrowerResidencyBasisType;
    @XmlElementRef(name = "BorrowerResidencyDurationMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> borrowerResidencyDurationMonthsCount;
    @XmlElementRef(name = "BorrowerResidencyDurationYearsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> borrowerResidencyDurationYearsCount;
    @XmlElementRef(name = "BorrowerResidencyEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> borrowerResidencyEndDate;
    @XmlElementRef(name = "BorrowerResidencyReportedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> borrowerResidencyReportedDate;
    @XmlElementRef(name = "BorrowerResidencyStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> borrowerResidencyStartDate;
    @XmlElementRef(name = "BorrowerResidencyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BorrowerResidencyEnum> borrowerResidencyType;
    @XmlElement(name = "EXTENSION")
    protected RESIDENCEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the borrowerResidencyBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorrowerResidencyBasisEnum }{@code >}
     *     
     */
    public JAXBElement<BorrowerResidencyBasisEnum> getBorrowerResidencyBasisType() {
        return borrowerResidencyBasisType;
    }

    /**
     * Sets the value of the borrowerResidencyBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorrowerResidencyBasisEnum }{@code >}
     *     
     */
    public void setBorrowerResidencyBasisType(JAXBElement<BorrowerResidencyBasisEnum> value) {
        this.borrowerResidencyBasisType = value;
    }

    /**
     * Gets the value of the borrowerResidencyDurationMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getBorrowerResidencyDurationMonthsCount() {
        return borrowerResidencyDurationMonthsCount;
    }

    /**
     * Sets the value of the borrowerResidencyDurationMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setBorrowerResidencyDurationMonthsCount(JAXBElement<MISMOCount> value) {
        this.borrowerResidencyDurationMonthsCount = value;
    }

    /**
     * Gets the value of the borrowerResidencyDurationYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getBorrowerResidencyDurationYearsCount() {
        return borrowerResidencyDurationYearsCount;
    }

    /**
     * Sets the value of the borrowerResidencyDurationYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setBorrowerResidencyDurationYearsCount(JAXBElement<MISMOCount> value) {
        this.borrowerResidencyDurationYearsCount = value;
    }

    /**
     * Gets the value of the borrowerResidencyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBorrowerResidencyEndDate() {
        return borrowerResidencyEndDate;
    }

    /**
     * Sets the value of the borrowerResidencyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBorrowerResidencyEndDate(JAXBElement<MISMODate> value) {
        this.borrowerResidencyEndDate = value;
    }

    /**
     * Gets the value of the borrowerResidencyReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBorrowerResidencyReportedDate() {
        return borrowerResidencyReportedDate;
    }

    /**
     * Sets the value of the borrowerResidencyReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBorrowerResidencyReportedDate(JAXBElement<MISMODate> value) {
        this.borrowerResidencyReportedDate = value;
    }

    /**
     * Gets the value of the borrowerResidencyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBorrowerResidencyStartDate() {
        return borrowerResidencyStartDate;
    }

    /**
     * Sets the value of the borrowerResidencyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBorrowerResidencyStartDate(JAXBElement<MISMODate> value) {
        this.borrowerResidencyStartDate = value;
    }

    /**
     * Gets the value of the borrowerResidencyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorrowerResidencyEnum }{@code >}
     *     
     */
    public JAXBElement<BorrowerResidencyEnum> getBorrowerResidencyType() {
        return borrowerResidencyType;
    }

    /**
     * Sets the value of the borrowerResidencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorrowerResidencyEnum }{@code >}
     *     
     */
    public void setBorrowerResidencyType(JAXBElement<BorrowerResidencyEnum> value) {
        this.borrowerResidencyType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENCEDETAILEXTENSION }
     *     
     */
    public RESIDENCEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENCEDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(RESIDENCEDETAILEXTENSION value) {
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
