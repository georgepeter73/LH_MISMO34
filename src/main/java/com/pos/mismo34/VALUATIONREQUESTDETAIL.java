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
 * <p>Java class for VALUATION_REQUEST_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_REQUEST_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppraiserFileIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="OrderingSystemName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PriorInterestIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertyValuationFormIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PropertyValuationFormType" type="{http://www.mismo.org/residential/2009/schemas}PropertyValuationFormEnum" minOccurs="0"/>
 *         &lt;element name="PropertyValuationFormTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ValuationRequestActionType" type="{http://www.mismo.org/residential/2009/schemas}ValuationRequestActionEnum" minOccurs="0"/>
 *         &lt;element name="ValuationRequestActionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ValuationRequestCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="VendorOrderIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="VendorRelationshipType" type="{http://www.mismo.org/residential/2009/schemas}VendorRelationshipEnum" minOccurs="0"/>
 *         &lt;element name="VendorRelationshipTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REQUEST_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VALUATION_REQUEST_DETAIL", propOrder = {
    "appraiserFileIdentifier",
    "orderingSystemName",
    "priorInterestIndicator",
    "propertyValuationFormIdentifier",
    "propertyValuationFormType",
    "propertyValuationFormTypeOtherDescription",
    "valuationRequestActionType",
    "valuationRequestActionTypeOtherDescription",
    "valuationRequestCommentText",
    "vendorOrderIdentifier",
    "vendorRelationshipType",
    "vendorRelationshipTypeOtherDescription",
    "extension"
})
public class VALUATIONREQUESTDETAIL {

    @XmlElementRef(name = "AppraiserFileIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> appraiserFileIdentifier;
    @XmlElementRef(name = "OrderingSystemName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> orderingSystemName;
    @XmlElementRef(name = "PriorInterestIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> priorInterestIndicator;
    @XmlElementRef(name = "PropertyValuationFormIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> propertyValuationFormIdentifier;
    @XmlElementRef(name = "PropertyValuationFormType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValuationFormEnum> propertyValuationFormType;
    @XmlElementRef(name = "PropertyValuationFormTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyValuationFormTypeOtherDescription;
    @XmlElementRef(name = "ValuationRequestActionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuationRequestActionEnum> valuationRequestActionType;
    @XmlElementRef(name = "ValuationRequestActionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationRequestActionTypeOtherDescription;
    @XmlElementRef(name = "ValuationRequestCommentText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> valuationRequestCommentText;
    @XmlElementRef(name = "VendorOrderIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> vendorOrderIdentifier;
    @XmlElementRef(name = "VendorRelationshipType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<VendorRelationshipEnum> vendorRelationshipType;
    @XmlElementRef(name = "VendorRelationshipTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> vendorRelationshipTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected VALUATIONREQUESTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the orderingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getOrderingSystemName() {
        return orderingSystemName;
    }

    /**
     * Sets the value of the orderingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setOrderingSystemName(JAXBElement<MISMOString> value) {
        this.orderingSystemName = value;
    }

    /**
     * Gets the value of the priorInterestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public JAXBElement<MISMOIndicator> getPriorInterestIndicator() {
        return priorInterestIndicator;
    }

    /**
     * Sets the value of the priorInterestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *     
     */
    public void setPriorInterestIndicator(JAXBElement<MISMOIndicator> value) {
        this.priorInterestIndicator = value;
    }

    /**
     * Gets the value of the propertyValuationFormIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getPropertyValuationFormIdentifier() {
        return propertyValuationFormIdentifier;
    }

    /**
     * Sets the value of the propertyValuationFormIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setPropertyValuationFormIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.propertyValuationFormIdentifier = value;
    }

    /**
     * Gets the value of the propertyValuationFormType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationFormEnum }{@code >}
     *     
     */
    public JAXBElement<PropertyValuationFormEnum> getPropertyValuationFormType() {
        return propertyValuationFormType;
    }

    /**
     * Sets the value of the propertyValuationFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationFormEnum }{@code >}
     *     
     */
    public void setPropertyValuationFormType(JAXBElement<PropertyValuationFormEnum> value) {
        this.propertyValuationFormType = value;
    }

    /**
     * Gets the value of the propertyValuationFormTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getPropertyValuationFormTypeOtherDescription() {
        return propertyValuationFormTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyValuationFormTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setPropertyValuationFormTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyValuationFormTypeOtherDescription = value;
    }

    /**
     * Gets the value of the valuationRequestActionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuationRequestActionEnum }{@code >}
     *     
     */
    public JAXBElement<ValuationRequestActionEnum> getValuationRequestActionType() {
        return valuationRequestActionType;
    }

    /**
     * Sets the value of the valuationRequestActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuationRequestActionEnum }{@code >}
     *     
     */
    public void setValuationRequestActionType(JAXBElement<ValuationRequestActionEnum> value) {
        this.valuationRequestActionType = value;
    }

    /**
     * Gets the value of the valuationRequestActionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationRequestActionTypeOtherDescription() {
        return valuationRequestActionTypeOtherDescription;
    }

    /**
     * Sets the value of the valuationRequestActionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationRequestActionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.valuationRequestActionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the valuationRequestCommentText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getValuationRequestCommentText() {
        return valuationRequestCommentText;
    }

    /**
     * Sets the value of the valuationRequestCommentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setValuationRequestCommentText(JAXBElement<MISMOString> value) {
        this.valuationRequestCommentText = value;
    }

    /**
     * Gets the value of the vendorOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getVendorOrderIdentifier() {
        return vendorOrderIdentifier;
    }

    /**
     * Sets the value of the vendorOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setVendorOrderIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.vendorOrderIdentifier = value;
    }

    /**
     * Gets the value of the vendorRelationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VendorRelationshipEnum }{@code >}
     *     
     */
    public JAXBElement<VendorRelationshipEnum> getVendorRelationshipType() {
        return vendorRelationshipType;
    }

    /**
     * Sets the value of the vendorRelationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VendorRelationshipEnum }{@code >}
     *     
     */
    public void setVendorRelationshipType(JAXBElement<VendorRelationshipEnum> value) {
        this.vendorRelationshipType = value;
    }

    /**
     * Gets the value of the vendorRelationshipTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getVendorRelationshipTypeOtherDescription() {
        return vendorRelationshipTypeOtherDescription;
    }

    /**
     * Sets the value of the vendorRelationshipTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setVendorRelationshipTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.vendorRelationshipTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONREQUESTDETAILEXTENSION }
     *     
     */
    public VALUATIONREQUESTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONREQUESTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(VALUATIONREQUESTDETAILEXTENSION value) {
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
