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
 * <p>Java class for SERVICE_PRODUCT_FULFILLMENT_DETAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_PRODUCT_FULFILLMENT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceActualCompletionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServiceActualPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServiceCancellationPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServiceEstimatedCompletionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServiceEstimatedOffHoldDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServiceEstimatedPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServiceRangeEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServiceRangeStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServiceRequestedCompletionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="VendorOrderIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="VendorTransactionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVICE_PRODUCT_FULFILLMENT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SERVICE_PRODUCT_FULFILLMENT_DETAIL", propOrder = {
    "serviceActualCompletionDate",
    "serviceActualPriceAmount",
    "serviceCancellationPriceAmount",
    "serviceEstimatedCompletionDate",
    "serviceEstimatedOffHoldDate",
    "serviceEstimatedPriceAmount",
    "serviceRangeEndDate",
    "serviceRangeStartDate",
    "serviceRequestedCompletionDate",
    "vendorOrderIdentifier",
    "vendorTransactionIdentifier",
    "extension"
})
public class SERVICEPRODUCTFULFILLMENTDETAIL {

    @XmlElementRef(name = "ServiceActualCompletionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> serviceActualCompletionDate;
    @XmlElementRef(name = "ServiceActualPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> serviceActualPriceAmount;
    @XmlElementRef(name = "ServiceCancellationPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> serviceCancellationPriceAmount;
    @XmlElementRef(name = "ServiceEstimatedCompletionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> serviceEstimatedCompletionDate;
    @XmlElementRef(name = "ServiceEstimatedOffHoldDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> serviceEstimatedOffHoldDate;
    @XmlElementRef(name = "ServiceEstimatedPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> serviceEstimatedPriceAmount;
    @XmlElementRef(name = "ServiceRangeEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> serviceRangeEndDate;
    @XmlElementRef(name = "ServiceRangeStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> serviceRangeStartDate;
    @XmlElementRef(name = "ServiceRequestedCompletionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> serviceRequestedCompletionDate;
    @XmlElementRef(name = "VendorOrderIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> vendorOrderIdentifier;
    @XmlElementRef(name = "VendorTransactionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> vendorTransactionIdentifier;
    @XmlElement(name = "EXTENSION")
    protected SERVICEPRODUCTFULFILLMENTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the serviceActualCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServiceActualCompletionDate() {
        return serviceActualCompletionDate;
    }

    /**
     * Sets the value of the serviceActualCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServiceActualCompletionDate(JAXBElement<MISMODate> value) {
        this.serviceActualCompletionDate = value;
    }

    /**
     * Gets the value of the serviceActualPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getServiceActualPriceAmount() {
        return serviceActualPriceAmount;
    }

    /**
     * Sets the value of the serviceActualPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setServiceActualPriceAmount(JAXBElement<MISMOAmount> value) {
        this.serviceActualPriceAmount = value;
    }

    /**
     * Gets the value of the serviceCancellationPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getServiceCancellationPriceAmount() {
        return serviceCancellationPriceAmount;
    }

    /**
     * Sets the value of the serviceCancellationPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setServiceCancellationPriceAmount(JAXBElement<MISMOAmount> value) {
        this.serviceCancellationPriceAmount = value;
    }

    /**
     * Gets the value of the serviceEstimatedCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServiceEstimatedCompletionDate() {
        return serviceEstimatedCompletionDate;
    }

    /**
     * Sets the value of the serviceEstimatedCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServiceEstimatedCompletionDate(JAXBElement<MISMODate> value) {
        this.serviceEstimatedCompletionDate = value;
    }

    /**
     * Gets the value of the serviceEstimatedOffHoldDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServiceEstimatedOffHoldDate() {
        return serviceEstimatedOffHoldDate;
    }

    /**
     * Sets the value of the serviceEstimatedOffHoldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServiceEstimatedOffHoldDate(JAXBElement<MISMODate> value) {
        this.serviceEstimatedOffHoldDate = value;
    }

    /**
     * Gets the value of the serviceEstimatedPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getServiceEstimatedPriceAmount() {
        return serviceEstimatedPriceAmount;
    }

    /**
     * Sets the value of the serviceEstimatedPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setServiceEstimatedPriceAmount(JAXBElement<MISMOAmount> value) {
        this.serviceEstimatedPriceAmount = value;
    }

    /**
     * Gets the value of the serviceRangeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServiceRangeEndDate() {
        return serviceRangeEndDate;
    }

    /**
     * Sets the value of the serviceRangeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServiceRangeEndDate(JAXBElement<MISMODate> value) {
        this.serviceRangeEndDate = value;
    }

    /**
     * Gets the value of the serviceRangeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServiceRangeStartDate() {
        return serviceRangeStartDate;
    }

    /**
     * Sets the value of the serviceRangeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServiceRangeStartDate(JAXBElement<MISMODate> value) {
        this.serviceRangeStartDate = value;
    }

    /**
     * Gets the value of the serviceRequestedCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getServiceRequestedCompletionDate() {
        return serviceRequestedCompletionDate;
    }

    /**
     * Sets the value of the serviceRequestedCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setServiceRequestedCompletionDate(JAXBElement<MISMODate> value) {
        this.serviceRequestedCompletionDate = value;
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
     * Gets the value of the vendorTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public JAXBElement<MISMOIdentifier> getVendorTransactionIdentifier() {
        return vendorTransactionIdentifier;
    }

    /**
     * Sets the value of the vendorTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *     
     */
    public void setVendorTransactionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.vendorTransactionIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEPRODUCTFULFILLMENTDETAILEXTENSION }
     *     
     */
    public SERVICEPRODUCTFULFILLMENTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEPRODUCTFULFILLMENTDETAILEXTENSION }
     *     
     */
    public void setEXTENSION(SERVICEPRODUCTFULFILLMENTDETAILEXTENSION value) {
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
