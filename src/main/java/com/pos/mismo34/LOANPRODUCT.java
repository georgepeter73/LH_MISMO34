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
 * A collection of facts used as descriptors of the characteristics of a financial instrument for sale in the marketplace that an investor is willing to buy.
 * 
 * <p>Java class for LOAN_PRODUCT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOAN_PRODUCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DISQUALIFICATION_REASONS" type="{http://www.mismo.org/residential/2009/schemas}DISQUALIFICATION_REASONS" minOccurs="0"/>
 *         &lt;element name="LOAN_PRICE_QUOTES" type="{http://www.mismo.org/residential/2009/schemas}LOAN_PRICE_QUOTES" minOccurs="0"/>
 *         &lt;element name="LOAN_PRODUCT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}LOAN_PRODUCT_DETAIL" minOccurs="0"/>
 *         &lt;element name="LOCKS" type="{http://www.mismo.org/residential/2009/schemas}LOCKS" minOccurs="0"/>
 *         &lt;element name="PRODUCT_CATEGORY" type="{http://www.mismo.org/residential/2009/schemas}PRODUCT_CATEGORY" minOccurs="0"/>
 *         &lt;element name="PRODUCT_COMPONENTS" type="{http://www.mismo.org/residential/2009/schemas}PRODUCT_COMPONENTS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LOAN_PRODUCT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "LOAN_PRODUCT", propOrder = {
    "disqualificationreasons",
    "loanpricequotes",
    "loanproductdetail",
    "locks",
    "productcategory",
    "productcomponents",
    "extension"
})
public class LOANPRODUCT {

    @XmlElement(name = "DISQUALIFICATION_REASONS")
    protected DISQUALIFICATIONREASONS disqualificationreasons;
    @XmlElement(name = "LOAN_PRICE_QUOTES")
    protected LOANPRICEQUOTES loanpricequotes;
    @XmlElement(name = "LOAN_PRODUCT_DETAIL")
    protected LOANPRODUCTDETAIL loanproductdetail;
    @XmlElement(name = "LOCKS")
    protected LOCKS locks;
    @XmlElement(name = "PRODUCT_CATEGORY")
    protected PRODUCTCATEGORY productcategory;
    @XmlElement(name = "PRODUCT_COMPONENTS")
    protected PRODUCTCOMPONENTS productcomponents;
    @XmlElement(name = "EXTENSION")
    protected LOANPRODUCTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the disqualificationreasons property.
     * 
     * @return
     *     possible object is
     *     {@link DISQUALIFICATIONREASONS }
     *     
     */
    public DISQUALIFICATIONREASONS getDISQUALIFICATIONREASONS() {
        return disqualificationreasons;
    }

    /**
     * Sets the value of the disqualificationreasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISQUALIFICATIONREASONS }
     *     
     */
    public void setDISQUALIFICATIONREASONS(DISQUALIFICATIONREASONS value) {
        this.disqualificationreasons = value;
    }

    /**
     * Gets the value of the loanpricequotes property.
     * 
     * @return
     *     possible object is
     *     {@link LOANPRICEQUOTES }
     *     
     */
    public LOANPRICEQUOTES getLOANPRICEQUOTES() {
        return loanpricequotes;
    }

    /**
     * Sets the value of the loanpricequotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANPRICEQUOTES }
     *     
     */
    public void setLOANPRICEQUOTES(LOANPRICEQUOTES value) {
        this.loanpricequotes = value;
    }

    /**
     * Gets the value of the loanproductdetail property.
     * 
     * @return
     *     possible object is
     *     {@link LOANPRODUCTDETAIL }
     *     
     */
    public LOANPRODUCTDETAIL getLOANPRODUCTDETAIL() {
        return loanproductdetail;
    }

    /**
     * Sets the value of the loanproductdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANPRODUCTDETAIL }
     *     
     */
    public void setLOANPRODUCTDETAIL(LOANPRODUCTDETAIL value) {
        this.loanproductdetail = value;
    }

    /**
     * Gets the value of the locks property.
     * 
     * @return
     *     possible object is
     *     {@link LOCKS }
     *     
     */
    public LOCKS getLOCKS() {
        return locks;
    }

    /**
     * Sets the value of the locks property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCKS }
     *     
     */
    public void setLOCKS(LOCKS value) {
        this.locks = value;
    }

    /**
     * Gets the value of the productcategory property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTCATEGORY }
     *     
     */
    public PRODUCTCATEGORY getPRODUCTCATEGORY() {
        return productcategory;
    }

    /**
     * Sets the value of the productcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTCATEGORY }
     *     
     */
    public void setPRODUCTCATEGORY(PRODUCTCATEGORY value) {
        this.productcategory = value;
    }

    /**
     * Gets the value of the productcomponents property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTCOMPONENTS }
     *     
     */
    public PRODUCTCOMPONENTS getPRODUCTCOMPONENTS() {
        return productcomponents;
    }

    /**
     * Sets the value of the productcomponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTCOMPONENTS }
     *     
     */
    public void setPRODUCTCOMPONENTS(PRODUCTCOMPONENTS value) {
        this.productcomponents = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link LOANPRODUCTEXTENSION }
     *     
     */
    public LOANPRODUCTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANPRODUCTEXTENSION }
     *     
     */
    public void setEXTENSION(LOANPRODUCTEXTENSION value) {
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
