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
 * <p>Java class for MATURITY_RULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MATURITY_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BiweeklyComparableMonthlyMaturityDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanMaturityDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanMaturityPeriodCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanMaturityPeriodType" type="{http://www.mismo.org/residential/2009/schemas}LoanMaturityPeriodEnum" minOccurs="0"/>
 *         &lt;element name="LoanTermMaximumMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="MaximumMaturityTermExtensionCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MATURITY_RULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MATURITY_RULE", propOrder = {
    "biweeklyComparableMonthlyMaturityDate",
    "loanMaturityDate",
    "loanMaturityPeriodCount",
    "loanMaturityPeriodType",
    "loanTermMaximumMonthsCount",
    "maximumMaturityTermExtensionCount",
    "extension"
})
public class MATURITYRULE {

    @XmlElementRef(name = "BiweeklyComparableMonthlyMaturityDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> biweeklyComparableMonthlyMaturityDate;
    @XmlElementRef(name = "LoanMaturityDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanMaturityDate;
    @XmlElementRef(name = "LoanMaturityPeriodCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanMaturityPeriodCount;
    @XmlElementRef(name = "LoanMaturityPeriodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanMaturityPeriodEnum> loanMaturityPeriodType;
    @XmlElementRef(name = "LoanTermMaximumMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanTermMaximumMonthsCount;
    @XmlElementRef(name = "MaximumMaturityTermExtensionCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> maximumMaturityTermExtensionCount;
    @XmlElement(name = "EXTENSION")
    protected MATURITYRULEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the biweeklyComparableMonthlyMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getBiweeklyComparableMonthlyMaturityDate() {
        return biweeklyComparableMonthlyMaturityDate;
    }

    /**
     * Sets the value of the biweeklyComparableMonthlyMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setBiweeklyComparableMonthlyMaturityDate(JAXBElement<MISMODate> value) {
        this.biweeklyComparableMonthlyMaturityDate = value;
    }

    /**
     * Gets the value of the loanMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getLoanMaturityDate() {
        return loanMaturityDate;
    }

    /**
     * Sets the value of the loanMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setLoanMaturityDate(JAXBElement<MISMODate> value) {
        this.loanMaturityDate = value;
    }

    /**
     * Gets the value of the loanMaturityPeriodCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLoanMaturityPeriodCount() {
        return loanMaturityPeriodCount;
    }

    /**
     * Sets the value of the loanMaturityPeriodCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLoanMaturityPeriodCount(JAXBElement<MISMOCount> value) {
        this.loanMaturityPeriodCount = value;
    }

    /**
     * Gets the value of the loanMaturityPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanMaturityPeriodEnum }{@code >}
     *     
     */
    public JAXBElement<LoanMaturityPeriodEnum> getLoanMaturityPeriodType() {
        return loanMaturityPeriodType;
    }

    /**
     * Sets the value of the loanMaturityPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanMaturityPeriodEnum }{@code >}
     *     
     */
    public void setLoanMaturityPeriodType(JAXBElement<LoanMaturityPeriodEnum> value) {
        this.loanMaturityPeriodType = value;
    }

    /**
     * Gets the value of the loanTermMaximumMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLoanTermMaximumMonthsCount() {
        return loanTermMaximumMonthsCount;
    }

    /**
     * Sets the value of the loanTermMaximumMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLoanTermMaximumMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanTermMaximumMonthsCount = value;
    }

    /**
     * Gets the value of the maximumMaturityTermExtensionCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getMaximumMaturityTermExtensionCount() {
        return maximumMaturityTermExtensionCount;
    }

    /**
     * Sets the value of the maximumMaturityTermExtensionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setMaximumMaturityTermExtensionCount(JAXBElement<MISMOCount> value) {
        this.maximumMaturityTermExtensionCount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MATURITYRULEEXTENSION }
     *     
     */
    public MATURITYRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MATURITYRULEEXTENSION }
     *     
     */
    public void setEXTENSION(MATURITYRULEEXTENSION value) {
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
