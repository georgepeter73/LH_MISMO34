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
 * Additional information about the integrated disclosure summary.
 * 
 * <p>Java class for INTEGRATED_DISCLOSURE_SECTION_SUMMARY_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTEGRATED_DISCLOSURE_SECTION_SUMMARY_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegratedDisclosureSectionTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionType" type="{http://www.mismo.org/residential/2009/schemas}IntegratedDisclosureSubsectionEnum" minOccurs="0"/>
 *         &lt;element name="IntegratedDisclosureSubsectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LenderCreditToleranceCureAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INTEGRATED_DISCLOSURE_SECTION_SUMMARY_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INTEGRATED_DISCLOSURE_SECTION_SUMMARY_DETAIL", propOrder = {
    "integratedDisclosureSectionTotalAmount",
    "integratedDisclosureSectionType",
    "integratedDisclosureSectionTypeOtherDescription",
    "integratedDisclosureSubsectionTotalAmount",
    "integratedDisclosureSubsectionType",
    "integratedDisclosureSubsectionTypeOtherDescription",
    "lenderCreditToleranceCureAmount",
    "extension"
})
public class INTEGRATEDDISCLOSURESECTIONSUMMARYDETAIL {

    @XmlElementRef(name = "IntegratedDisclosureSectionTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> integratedDisclosureSectionTotalAmount;
    @XmlElementRef(name = "IntegratedDisclosureSectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSectionEnum> integratedDisclosureSectionType;
    @XmlElementRef(name = "IntegratedDisclosureSectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSectionTypeOtherDescription;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> integratedDisclosureSubsectionTotalAmount;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegratedDisclosureSubsectionEnum> integratedDisclosureSubsectionType;
    @XmlElementRef(name = "IntegratedDisclosureSubsectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> integratedDisclosureSubsectionTypeOtherDescription;
    @XmlElementRef(name = "LenderCreditToleranceCureAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> lenderCreditToleranceCureAmount;
    @XmlElement(name = "EXTENSION")
    protected INTEGRATEDDISCLOSURESECTIONSUMMARYDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the integratedDisclosureSectionTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getIntegratedDisclosureSectionTotalAmount() {
        return integratedDisclosureSectionTotalAmount;
    }

    /**
     * Sets the value of the integratedDisclosureSectionTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionTotalAmount(JAXBElement<MISMOAmount> value) {
        this.integratedDisclosureSectionTotalAmount = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSectionEnum> getIntegratedDisclosureSectionType() {
        return integratedDisclosureSectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionType(JAXBElement<IntegratedDisclosureSectionEnum> value) {
        this.integratedDisclosureSectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSectionTypeOtherDescription() {
        return integratedDisclosureSectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getIntegratedDisclosureSubsectionTotalAmount() {
        return integratedDisclosureSubsectionTotalAmount;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionTotalAmount(JAXBElement<MISMOAmount> value) {
        this.integratedDisclosureSubsectionTotalAmount = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSubsectionEnum }{@code >}
     *     
     */
    public JAXBElement<IntegratedDisclosureSubsectionEnum> getIntegratedDisclosureSubsectionType() {
        return integratedDisclosureSubsectionType;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegratedDisclosureSubsectionEnum }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionType(JAXBElement<IntegratedDisclosureSubsectionEnum> value) {
        this.integratedDisclosureSubsectionType = value;
    }

    /**
     * Gets the value of the integratedDisclosureSubsectionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getIntegratedDisclosureSubsectionTypeOtherDescription() {
        return integratedDisclosureSubsectionTypeOtherDescription;
    }

    /**
     * Sets the value of the integratedDisclosureSubsectionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setIntegratedDisclosureSubsectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.integratedDisclosureSubsectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the lenderCreditToleranceCureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLenderCreditToleranceCureAmount() {
        return lenderCreditToleranceCureAmount;
    }

    /**
     * Sets the value of the lenderCreditToleranceCureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLenderCreditToleranceCureAmount(JAXBElement<MISMOAmount> value) {
        this.lenderCreditToleranceCureAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INTEGRATEDDISCLOSURESECTIONSUMMARYDETAILEXTENSION }
     *     
     */
    public INTEGRATEDDISCLOSURESECTIONSUMMARYDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGRATEDDISCLOSURESECTIONSUMMARYDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(INTEGRATEDDISCLOSURESECTIONSUMMARYDETAILEXTENSION value) {
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
