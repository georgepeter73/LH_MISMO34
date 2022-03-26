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
 * <p>Java class for CREDIT_SCORE_MODEL_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_SCORE_MODEL_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditScoreCategoryType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreCategoryEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreCategoryTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreMaximumValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="CreditScoreMinimumValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelNameType" type="{http://www.mismo.org/residential/2009/schemas}CreditScoreModelNameEnum" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelNameTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditScoreModelRangeOfScoresDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_MODEL_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_SCORE_MODEL_DETAIL", propOrder = {
    "creditScoreCategoryType",
    "creditScoreCategoryTypeOtherDescription",
    "creditScoreMaximumValue",
    "creditScoreMinimumValue",
    "creditScoreModelNameType",
    "creditScoreModelNameTypeOtherDescription",
    "creditScoreModelRangeOfScoresDescription",
    "extension"
})
public class CREDITSCOREMODELDETAIL {

    @XmlElementRef(name = "CreditScoreCategoryType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreCategoryEnum> creditScoreCategoryType;
    @XmlElementRef(name = "CreditScoreCategoryTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreCategoryTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreMaximumValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> creditScoreMaximumValue;
    @XmlElementRef(name = "CreditScoreMinimumValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> creditScoreMinimumValue;
    @XmlElementRef(name = "CreditScoreModelNameType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditScoreModelNameEnum> creditScoreModelNameType;
    @XmlElementRef(name = "CreditScoreModelNameTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreModelNameTypeOtherDescription;
    @XmlElementRef(name = "CreditScoreModelRangeOfScoresDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditScoreModelRangeOfScoresDescription;
    @XmlElement(name = "EXTENSION")
    protected CREDITSCOREMODELDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditScoreCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreCategoryEnum> getCreditScoreCategoryType() {
        return creditScoreCategoryType;
    }

    /**
     * Sets the value of the creditScoreCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreCategoryEnum }{@code >}
     *     
     */
    public void setCreditScoreCategoryType(JAXBElement<CreditScoreCategoryEnum> value) {
        this.creditScoreCategoryType = value;
    }

    /**
     * Gets the value of the creditScoreCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreCategoryTypeOtherDescription() {
        return creditScoreCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreCategoryTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreMaximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getCreditScoreMaximumValue() {
        return creditScoreMaximumValue;
    }

    /**
     * Sets the value of the creditScoreMaximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setCreditScoreMaximumValue(JAXBElement<MISMOValue> value) {
        this.creditScoreMaximumValue = value;
    }

    /**
     * Gets the value of the creditScoreMinimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getCreditScoreMinimumValue() {
        return creditScoreMinimumValue;
    }

    /**
     * Sets the value of the creditScoreMinimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setCreditScoreMinimumValue(JAXBElement<MISMOValue> value) {
        this.creditScoreMinimumValue = value;
    }

    /**
     * Gets the value of the creditScoreModelNameType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreModelNameEnum }{@code >}
     *     
     */
    public JAXBElement<CreditScoreModelNameEnum> getCreditScoreModelNameType() {
        return creditScoreModelNameType;
    }

    /**
     * Sets the value of the creditScoreModelNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditScoreModelNameEnum }{@code >}
     *     
     */
    public void setCreditScoreModelNameType(JAXBElement<CreditScoreModelNameEnum> value) {
        this.creditScoreModelNameType = value;
    }

    /**
     * Gets the value of the creditScoreModelNameTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreModelNameTypeOtherDescription() {
        return creditScoreModelNameTypeOtherDescription;
    }

    /**
     * Sets the value of the creditScoreModelNameTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreModelNameTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditScoreModelNameTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditScoreModelRangeOfScoresDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getCreditScoreModelRangeOfScoresDescription() {
        return creditScoreModelRangeOfScoresDescription;
    }

    /**
     * Sets the value of the creditScoreModelRangeOfScoresDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setCreditScoreModelRangeOfScoresDescription(JAXBElement<MISMOString> value) {
        this.creditScoreModelRangeOfScoresDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREMODELDETAILEXTENSION }
     *     
     */
    public CREDITSCOREMODELDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREMODELDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITSCOREMODELDETAILEXTENSION value) {
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
