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
 * Information specific to funds collected through the loan payment and held to pay expenses such as taxes and insurance or funds held back after closing that are to be used for property improvements or repairs.
 * 
 * <p>Java class for ESCROW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESCROW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESCROW_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_DETAIL" minOccurs="0"/>
 *         &lt;element name="ESCROW_DISCLOSURES" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_DISCLOSURES" minOccurs="0"/>
 *         &lt;element name="ESCROW_ITEMS" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_ITEMS" minOccurs="0"/>
 *         &lt;element name="HOLDBACK_ITEMS" type="{http://www.mismo.org/residential/2009/schemas}HOLDBACK_ITEMS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ESCROW_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ESCROW", propOrder = {
    "escrowdetail",
    "escrowdisclosures",
    "escrowitems",
    "holdbackitems",
    "extension"
})
public class ESCROW {

    @XmlElement(name = "ESCROW_DETAIL")
    protected ESCROWDETAIL escrowdetail;
    @XmlElement(name = "ESCROW_DISCLOSURES")
    protected ESCROWDISCLOSURES escrowdisclosures;
    @XmlElement(name = "ESCROW_ITEMS")
    protected ESCROWITEMS escrowitems;
    @XmlElement(name = "HOLDBACK_ITEMS")
    protected HOLDBACKITEMS holdbackitems;
    @XmlElement(name = "EXTENSION")
    protected ESCROWEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the escrowdetail property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWDETAIL }
     *     
     */
    public ESCROWDETAIL getESCROWDETAIL() {
        return escrowdetail;
    }

    /**
     * Sets the value of the escrowdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWDETAIL }
     *     
     */
    public void setESCROWDETAIL(ESCROWDETAIL value) {
        this.escrowdetail = value;
    }

    /**
     * Gets the value of the escrowdisclosures property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWDISCLOSURES }
     *     
     */
    public ESCROWDISCLOSURES getESCROWDISCLOSURES() {
        return escrowdisclosures;
    }

    /**
     * Sets the value of the escrowdisclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWDISCLOSURES }
     *     
     */
    public void setESCROWDISCLOSURES(ESCROWDISCLOSURES value) {
        this.escrowdisclosures = value;
    }

    /**
     * Gets the value of the escrowitems property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWITEMS }
     *     
     */
    public ESCROWITEMS getESCROWITEMS() {
        return escrowitems;
    }

    /**
     * Sets the value of the escrowitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWITEMS }
     *     
     */
    public void setESCROWITEMS(ESCROWITEMS value) {
        this.escrowitems = value;
    }

    /**
     * Gets the value of the holdbackitems property.
     * 
     * @return
     *     possible object is
     *     {@link HOLDBACKITEMS }
     *     
     */
    public HOLDBACKITEMS getHOLDBACKITEMS() {
        return holdbackitems;
    }

    /**
     * Sets the value of the holdbackitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOLDBACKITEMS }
     *     
     */
    public void setHOLDBACKITEMS(HOLDBACKITEMS value) {
        this.holdbackitems = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ESCROWEXTENSION }
     *     
     */
    public ESCROWEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESCROWEXTENSION }
     *     
     */
    public void setEXTENSION(ESCROWEXTENSION value) {
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
