//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Information about a specific escrow type that funds are collected and disbursed for.
 * 
 * <p>Java class for ESCROW_ITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESCROW_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESCROW_ITEM_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_ITEM_DETAIL" minOccurs="0"/>
 *         &lt;element name="ESCROW_ITEM_DISBURSEMENTS" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_ITEM_DISBURSEMENTS" minOccurs="0"/>
 *         &lt;element name="ESCROW_ITEM_PAYMENTS" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_ITEM_PAYMENTS" minOccurs="0"/>
 *         &lt;element name="ESCROW_PAID_TO" type="{http://www.mismo.org/residential/2009/schemas}PAID_TO" minOccurs="0"/>
 *         &lt;element name="SELECTED_SERVICE_PROVIDER" type="{http://www.mismo.org/residential/2009/schemas}SELECTED_SERVICE_PROVIDER" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_ITEM_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ESCROW_ITEM", propOrder = {
    "escrowitemdetail",
    "escrowitemdisbursements",
    "escrowitempayments",
    "escrowpaidto",
    "selectedserviceprovider",
    "extension"
})
public class ESCROWITEM {

    @XmlElement(name = "ESCROW_ITEM_DETAIL")
    protected ESCROWITEMDETAIL escrowitemdetail;
    @XmlElement(name = "ESCROW_ITEM_DISBURSEMENTS")
    protected ESCROWITEMDISBURSEMENTS escrowitemdisbursements;
    @XmlElement(name = "ESCROW_ITEM_PAYMENTS")
    protected ESCROWITEMPAYMENTS escrowitempayments;
    @XmlElement(name = "ESCROW_PAID_TO")
    protected PAIDTO escrowpaidto;
    @XmlElement(name = "SELECTED_SERVICE_PROVIDER")
    protected SELECTEDSERVICEPROVIDER selectedserviceprovider;
    @XmlElement(name = "EXTENSION")
    protected ESCROWITEMEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the escrowitemdetail property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWITEMDETAIL }
     *     
     */
    public ESCROWITEMDETAIL getESCROWITEMDETAIL() {
        return escrowitemdetail;
    }

    /**
     * Sets the value of the escrowitemdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWITEMDETAIL }
     *     
     */
    public void setESCROWITEMDETAIL(ESCROWITEMDETAIL value) {
        this.escrowitemdetail = value;
    }

    /**
     * Gets the value of the escrowitemdisbursements property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWITEMDISBURSEMENTS }
     *     
     */
    public ESCROWITEMDISBURSEMENTS getESCROWITEMDISBURSEMENTS() {
        return escrowitemdisbursements;
    }

    /**
     * Sets the value of the escrowitemdisbursements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWITEMDISBURSEMENTS }
     *     
     */
    public void setESCROWITEMDISBURSEMENTS(ESCROWITEMDISBURSEMENTS value) {
        this.escrowitemdisbursements = value;
    }

    /**
     * Gets the value of the escrowitempayments property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWITEMPAYMENTS }
     *     
     */
    public ESCROWITEMPAYMENTS getESCROWITEMPAYMENTS() {
        return escrowitempayments;
    }

    /**
     * Sets the value of the escrowitempayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWITEMPAYMENTS }
     *     
     */
    public void setESCROWITEMPAYMENTS(ESCROWITEMPAYMENTS value) {
        this.escrowitempayments = value;
    }

    /**
     * Gets the value of the escrowpaidto property.
     * 
     * @return
     *     possible object is
     *     {@link PAIDTO }
     *     
     */
    public PAIDTO getESCROWPAIDTO() {
        return escrowpaidto;
    }

    /**
     * Sets the value of the escrowpaidto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAIDTO }
     *     
     */
    public void setESCROWPAIDTO(PAIDTO value) {
        this.escrowpaidto = value;
    }

    /**
     * Gets the value of the selectedserviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link SELECTEDSERVICEPROVIDER }
     *     
     */
    public SELECTEDSERVICEPROVIDER getSELECTEDSERVICEPROVIDER() {
        return selectedserviceprovider;
    }

    /**
     * Sets the value of the selectedserviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SELECTEDSERVICEPROVIDER }
     *     
     */
    public void setSELECTEDSERVICEPROVIDER(SELECTEDSERVICEPROVIDER value) {
        this.selectedserviceprovider = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWITEMEXTENSION }
     *     
     */
    public ESCROWITEMEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWITEMEXTENSION }
     *     
     */
    public void setEXTENSION(ESCROWITEMEXTENSION value) {
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
