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
 * Information including the signature date, identification, and other facts about the valuation report.
 * 
 * <p>Java class for VALUATION_REPORT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_REPORT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppraiserAdditionalFileIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AppraiserFileAdditionalIdentifierDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraiserFileIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="AppraiserFileIdentifierDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AppraiserReportSignedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanOriginationSystemLoanIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="SupervisorReportSignedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ValuationAddendumText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ValuationReportContentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ValuationReportContentIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ValuationReportContentName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ValuationReportContentType" type="{http://www.mismo.org/residential/2009/schemas}ValuationReportContentEnum" minOccurs="0"/>
 *         &lt;element name="ValuationReportContentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REPORT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VALUATION_REPORT_DETAIL", propOrder = {
    "appraiserAdditionalFileIdentifier",
    "appraiserFileAdditionalIdentifierDescription",
    "appraiserFileIdentifier",
    "appraiserFileIdentifierDescription",
    "appraiserReportSignedDate",
    "loanOriginationSystemLoanIdentifier",
    "supervisorReportSignedDate",
    "valuationAddendumText",
    "valuationReportContentDescription",
    "valuationReportContentIdentifier",
    "valuationReportContentName",
    "valuationReportContentType",
    "valuationReportContentTypeOtherDescription",
    "extension"
})
public class VALUATIONREPORTDETAIL {

    @XmlElementRef(name = "AppraiserAdditionalFileIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> appraiserAdditionalFileIdentifier;
    @XmlElementRef(name = "AppraiserFileAdditionalIdentifierDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraiserFileAdditionalIdentifierDescription;
    @XmlElementRef(name = "AppraiserFileIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> appraiserFileIdentifier;
    @XmlElementRef(name = "AppraiserFileIdentifierDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> appraiserFileIdentifierDescription;
    @XmlElementRef(name = "AppraiserReportSignedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> appraiserReportSignedDate;
    @XmlElementRef(name = "LoanOriginationSystemLoanIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> loanOriginationSystemLoanIdentifier;
    @XmlElementRef(name = "SupervisorReportSignedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> supervisorReportSignedDate;
    @XmlElementRef(name = "ValuationAddendumText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationAddendumText;
    @XmlElementRef(name = "ValuationReportContentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationReportContentDescription;
    @XmlElementRef(name = "ValuationReportContentIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> valuationReportContentIdentifier;
    @XmlElementRef(name = "ValuationReportContentName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationReportContentName;
    @XmlElementRef(name = "ValuationReportContentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuationReportContentEnum> valuationReportContentType;
    @XmlElementRef(name = "ValuationReportContentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationReportContentTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected VALUATIONREPORTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraiserAdditionalFileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAppraiserAdditionalFileIdentifier() {
        return appraiserAdditionalFileIdentifier;
    }

    /**
     * Sets the value of the appraiserAdditionalFileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAppraiserAdditionalFileIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.appraiserAdditionalFileIdentifier = value;
    }

    /**
     * Gets the value of the appraiserFileAdditionalIdentifierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraiserFileAdditionalIdentifierDescription() {
        return appraiserFileAdditionalIdentifierDescription;
    }

    /**
     * Sets the value of the appraiserFileAdditionalIdentifierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraiserFileAdditionalIdentifierDescription(JAXBElement<MISMOString> value) {
        this.appraiserFileAdditionalIdentifierDescription = value;
    }

    /**
     * Gets the value of the appraiserFileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getAppraiserFileIdentifier() {
        return appraiserFileIdentifier;
    }

    /**
     * Sets the value of the appraiserFileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setAppraiserFileIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.appraiserFileIdentifier = value;
    }

    /**
     * Gets the value of the appraiserFileIdentifierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAppraiserFileIdentifierDescription() {
        return appraiserFileIdentifierDescription;
    }

    /**
     * Sets the value of the appraiserFileIdentifierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAppraiserFileIdentifierDescription(JAXBElement<MISMOString> value) {
        this.appraiserFileIdentifierDescription = value;
    }

    /**
     * Gets the value of the appraiserReportSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getAppraiserReportSignedDate() {
        return appraiserReportSignedDate;
    }

    /**
     * Sets the value of the appraiserReportSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setAppraiserReportSignedDate(JAXBElement<MISMODate> value) {
        this.appraiserReportSignedDate = value;
    }

    /**
     * Gets the value of the loanOriginationSystemLoanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getLoanOriginationSystemLoanIdentifier() {
        return loanOriginationSystemLoanIdentifier;
    }

    /**
     * Sets the value of the loanOriginationSystemLoanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setLoanOriginationSystemLoanIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.loanOriginationSystemLoanIdentifier = value;
    }

    /**
     * Gets the value of the supervisorReportSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getSupervisorReportSignedDate() {
        return supervisorReportSignedDate;
    }

    /**
     * Sets the value of the supervisorReportSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setSupervisorReportSignedDate(JAXBElement<MISMODate> value) {
        this.supervisorReportSignedDate = value;
    }

    /**
     * Gets the value of the valuationAddendumText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationAddendumText() {
        return valuationAddendumText;
    }

    /**
     * Sets the value of the valuationAddendumText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationAddendumText(JAXBElement<MISMOString> value) {
        this.valuationAddendumText = value;
    }

    /**
     * Gets the value of the valuationReportContentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationReportContentDescription() {
        return valuationReportContentDescription;
    }

    /**
     * Sets the value of the valuationReportContentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationReportContentDescription(JAXBElement<MISMOString> value) {
        this.valuationReportContentDescription = value;
    }

    /**
     * Gets the value of the valuationReportContentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getValuationReportContentIdentifier() {
        return valuationReportContentIdentifier;
    }

    /**
     * Sets the value of the valuationReportContentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setValuationReportContentIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.valuationReportContentIdentifier = value;
    }

    /**
     * Gets the value of the valuationReportContentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationReportContentName() {
        return valuationReportContentName;
    }

    /**
     * Sets the value of the valuationReportContentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationReportContentName(JAXBElement<MISMOString> value) {
        this.valuationReportContentName = value;
    }

    /**
     * Gets the value of the valuationReportContentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuationReportContentEnum }{@code >}
     *     
     */
    public JAXBElement<ValuationReportContentEnum> getValuationReportContentType() {
        return valuationReportContentType;
    }

    /**
     * Sets the value of the valuationReportContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuationReportContentEnum }{@code >}
     *     
     */
    public void setValuationReportContentType(JAXBElement<ValuationReportContentEnum> value) {
        this.valuationReportContentType = value;
    }

    /**
     * Gets the value of the valuationReportContentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationReportContentTypeOtherDescription() {
        return valuationReportContentTypeOtherDescription;
    }

    /**
     * Sets the value of the valuationReportContentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationReportContentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.valuationReportContentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREPORTDETAILEXTENSION }
     *     
     */
    public VALUATIONREPORTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREPORTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(VALUATIONREPORTDETAILEXTENSION value) {
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
