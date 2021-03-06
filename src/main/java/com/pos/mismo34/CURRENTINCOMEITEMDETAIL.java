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
 * <p>Java class for CURRENT_INCOME_ITEM_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CURRENT_INCOME_ITEM_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentIncomeMonthlyTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EmploymentIncomeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ForeignIncomeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="IncomeFederalTaxExemptIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="IncomeType" type="{http://www.mismo.org/residential/2009/schemas}IncomeEnum" minOccurs="0"/>
 *         &lt;element name="IncomeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SeasonalIncomeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CURRENT_INCOME_ITEM_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CURRENT_INCOME_ITEM_DETAIL", propOrder = {
    "currentIncomeMonthlyTotalAmount",
    "employmentIncomeIndicator",
    "foreignIncomeIndicator",
    "incomeFederalTaxExemptIndicator",
    "incomeType",
    "incomeTypeOtherDescription",
    "seasonalIncomeIndicator",
    "extension"
})
public class CURRENTINCOMEITEMDETAIL {

    @XmlElementRef(name = "CurrentIncomeMonthlyTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> currentIncomeMonthlyTotalAmount;
    @XmlElementRef(name = "EmploymentIncomeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> employmentIncomeIndicator;
    @XmlElementRef(name = "ForeignIncomeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> foreignIncomeIndicator;
    @XmlElementRef(name = "IncomeFederalTaxExemptIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> incomeFederalTaxExemptIndicator;
    @XmlElementRef(name = "IncomeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IncomeEnum> incomeType;
    @XmlElementRef(name = "IncomeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> incomeTypeOtherDescription;
    @XmlElementRef(name = "SeasonalIncomeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> seasonalIncomeIndicator;
    @XmlElement(name = "EXTENSION")
    protected CURRENTINCOMEITEMDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the currentIncomeMonthlyTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getCurrentIncomeMonthlyTotalAmount() {
        return currentIncomeMonthlyTotalAmount;
    }

    /**
     * Sets the value of the currentIncomeMonthlyTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setCurrentIncomeMonthlyTotalAmount(JAXBElement<MISMOAmount> value) {
        this.currentIncomeMonthlyTotalAmount = value;
    }

    /**
     * Gets the value of the employmentIncomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getEmploymentIncomeIndicator() {
        return employmentIncomeIndicator;
    }

    /**
     * Sets the value of the employmentIncomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setEmploymentIncomeIndicator(JAXBElement<MISMOIndicator> value) {
        this.employmentIncomeIndicator = value;
    }

    /**
     * Gets the value of the foreignIncomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getForeignIncomeIndicator() {
        return foreignIncomeIndicator;
    }

    /**
     * Sets the value of the foreignIncomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setForeignIncomeIndicator(JAXBElement<MISMOIndicator> value) {
        this.foreignIncomeIndicator = value;
    }

    /**
     * Gets the value of the incomeFederalTaxExemptIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getIncomeFederalTaxExemptIndicator() {
        return incomeFederalTaxExemptIndicator;
    }

    /**
     * Sets the value of the incomeFederalTaxExemptIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setIncomeFederalTaxExemptIndicator(JAXBElement<MISMOIndicator> value) {
        this.incomeFederalTaxExemptIndicator = value;
    }

    /**
     * Gets the value of the incomeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncomeEnum }{@code >}
     *     
     */
    public JAXBElement<IncomeEnum> getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncomeEnum }{@code >}
     *     
     */
    public void setIncomeType(JAXBElement<IncomeEnum> value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the incomeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIncomeTypeOtherDescription() {
        return incomeTypeOtherDescription;
    }

    /**
     * Sets the value of the incomeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIncomeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.incomeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the seasonalIncomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getSeasonalIncomeIndicator() {
        return seasonalIncomeIndicator;
    }

    /**
     * Sets the value of the seasonalIncomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setSeasonalIncomeIndicator(JAXBElement<MISMOIndicator> value) {
        this.seasonalIncomeIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENTINCOMEITEMDETAILEXTENSION }
     *     
     */
    public CURRENTINCOMEITEMDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENTINCOMEITEMDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(CURRENTINCOMEITEMDETAILEXTENSION value) {
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
