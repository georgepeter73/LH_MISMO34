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
 * Describes information about a formal resolution given by a court as part of a litigation.
 * 
 * <p>Java class for JUDGMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JUDGMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JudgmentAppealedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="JudgmentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="JudgmentEnforcementNumberOfDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="JudgmentInFavorOfPlaintiffIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="JudgmentInWholeIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="JudgmentResultType" type="{http://www.mismo.org/residential/2009/schemas}JudgmentResultEnum" minOccurs="0"/>
 *         &lt;element name="JudgmentType" type="{http://www.mismo.org/residential/2009/schemas}JudgmentEnum" minOccurs="0"/>
 *         &lt;element name="JudgmentTypeAdditionalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="JudgmentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}JUDGMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "JUDGMENT", propOrder = {
    "judgmentAppealedIndicator",
    "judgmentDate",
    "judgmentEnforcementNumberOfDaysCount",
    "judgmentInFavorOfPlaintiffIndicator",
    "judgmentInWholeIndicator",
    "judgmentResultType",
    "judgmentType",
    "judgmentTypeAdditionalDescription",
    "judgmentTypeOtherDescription",
    "extension"
})
public class JUDGMENT {

    @XmlElementRef(name = "JudgmentAppealedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> judgmentAppealedIndicator;
    @XmlElementRef(name = "JudgmentDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> judgmentDate;
    @XmlElementRef(name = "JudgmentEnforcementNumberOfDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> judgmentEnforcementNumberOfDaysCount;
    @XmlElementRef(name = "JudgmentInFavorOfPlaintiffIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> judgmentInFavorOfPlaintiffIndicator;
    @XmlElementRef(name = "JudgmentInWholeIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> judgmentInWholeIndicator;
    @XmlElementRef(name = "JudgmentResultType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<JudgmentResultEnum> judgmentResultType;
    @XmlElementRef(name = "JudgmentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<JudgmentEnum> judgmentType;
    @XmlElementRef(name = "JudgmentTypeAdditionalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> judgmentTypeAdditionalDescription;
    @XmlElementRef(name = "JudgmentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> judgmentTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected JUDGMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the judgmentAppealedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getJudgmentAppealedIndicator() {
        return judgmentAppealedIndicator;
    }

    /**
     * Sets the value of the judgmentAppealedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setJudgmentAppealedIndicator(JAXBElement<MISMOIndicator> value) {
        this.judgmentAppealedIndicator = value;
    }

    /**
     * Gets the value of the judgmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getJudgmentDate() {
        return judgmentDate;
    }

    /**
     * Sets the value of the judgmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setJudgmentDate(JAXBElement<MISMODate> value) {
        this.judgmentDate = value;
    }

    /**
     * Gets the value of the judgmentEnforcementNumberOfDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getJudgmentEnforcementNumberOfDaysCount() {
        return judgmentEnforcementNumberOfDaysCount;
    }

    /**
     * Sets the value of the judgmentEnforcementNumberOfDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setJudgmentEnforcementNumberOfDaysCount(JAXBElement<MISMOCount> value) {
        this.judgmentEnforcementNumberOfDaysCount = value;
    }

    /**
     * Gets the value of the judgmentInFavorOfPlaintiffIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getJudgmentInFavorOfPlaintiffIndicator() {
        return judgmentInFavorOfPlaintiffIndicator;
    }

    /**
     * Sets the value of the judgmentInFavorOfPlaintiffIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setJudgmentInFavorOfPlaintiffIndicator(JAXBElement<MISMOIndicator> value) {
        this.judgmentInFavorOfPlaintiffIndicator = value;
    }

    /**
     * Gets the value of the judgmentInWholeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getJudgmentInWholeIndicator() {
        return judgmentInWholeIndicator;
    }

    /**
     * Sets the value of the judgmentInWholeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setJudgmentInWholeIndicator(JAXBElement<MISMOIndicator> value) {
        this.judgmentInWholeIndicator = value;
    }

    /**
     * Gets the value of the judgmentResultType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JudgmentResultEnum }{@code >}
     *     
     */
    public JAXBElement<JudgmentResultEnum> getJudgmentResultType() {
        return judgmentResultType;
    }

    /**
     * Sets the value of the judgmentResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JudgmentResultEnum }{@code >}
     *     
     */
    public void setJudgmentResultType(JAXBElement<JudgmentResultEnum> value) {
        this.judgmentResultType = value;
    }

    /**
     * Gets the value of the judgmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JudgmentEnum }{@code >}
     *     
     */
    public JAXBElement<JudgmentEnum> getJudgmentType() {
        return judgmentType;
    }

    /**
     * Sets the value of the judgmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JudgmentEnum }{@code >}
     *     
     */
    public void setJudgmentType(JAXBElement<JudgmentEnum> value) {
        this.judgmentType = value;
    }

    /**
     * Gets the value of the judgmentTypeAdditionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getJudgmentTypeAdditionalDescription() {
        return judgmentTypeAdditionalDescription;
    }

    /**
     * Sets the value of the judgmentTypeAdditionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setJudgmentTypeAdditionalDescription(JAXBElement<MISMOString> value) {
        this.judgmentTypeAdditionalDescription = value;
    }

    /**
     * Gets the value of the judgmentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getJudgmentTypeOtherDescription() {
        return judgmentTypeOtherDescription;
    }

    /**
     * Sets the value of the judgmentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setJudgmentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.judgmentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link JUDGMENTEXTENSION }
     *     
     */
    public JUDGMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JUDGMENTEXTENSION }
     *     
     */
    public void setEXTENSION(JUDGMENTEXTENSION value) {
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
