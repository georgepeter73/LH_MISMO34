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
 * <p>Java class for MI_VALIDATION_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_VALIDATION_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LOAN_IDENTIFIERS" type="{http://www.mismo.org/residential/2009/schemas}LOAN_IDENTIFIERS" minOccurs="0"/>
 *         &lt;element name="MI_PRODUCT" type="{http://www.mismo.org/residential/2009/schemas}MI_PRODUCT" minOccurs="0"/>
 *         &lt;element name="MI_VALIDATION_RESPONSE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}MI_VALIDATION_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="PROPERTIES" type="{http://www.mismo.org/residential/2009/schemas}PROPERTIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_VALIDATION_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_VALIDATION_RESPONSE", propOrder = {
    "loanidentifiers",
    "miproduct",
    "mivalidationresponsedetail",
    "parties",
    "properties",
    "extension"
})
public class MIVALIDATIONRESPONSE {

    @XmlElement(name = "LOAN_IDENTIFIERS")
    protected LOANIDENTIFIERS loanidentifiers;
    @XmlElement(name = "MI_PRODUCT")
    protected MIPRODUCT miproduct;
    @XmlElement(name = "MI_VALIDATION_RESPONSE_DETAIL")
    protected MIVALIDATIONRESPONSEDETAIL mivalidationresponsedetail;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "PROPERTIES")
    protected PROPERTIES properties;
    @XmlElement(name = "EXTENSION")
    protected MIVALIDATIONRESPONSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the loanidentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link LOANIDENTIFIERS }
     *     
     */
    public LOANIDENTIFIERS getLOANIDENTIFIERS() {
        return loanidentifiers;
    }

    /**
     * Sets the value of the loanidentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANIDENTIFIERS }
     *     
     */
    public void setLOANIDENTIFIERS(LOANIDENTIFIERS value) {
        this.loanidentifiers = value;
    }

    /**
     * Gets the value of the miproduct property.
     * 
     * @return
     *     possible object is
     *     {@link MIPRODUCT }
     *     
     */
    public MIPRODUCT getMIPRODUCT() {
        return miproduct;
    }

    /**
     * Sets the value of the miproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPRODUCT }
     *     
     */
    public void setMIPRODUCT(MIPRODUCT value) {
        this.miproduct = value;
    }

    /**
     * Gets the value of the mivalidationresponsedetail property.
     * 
     * @return
     *     possible object is
     *     {@link MIVALIDATIONRESPONSEDETAIL }
     *     
     */
    public MIVALIDATIONRESPONSEDETAIL getMIVALIDATIONRESPONSEDETAIL() {
        return mivalidationresponsedetail;
    }

    /**
     * Sets the value of the mivalidationresponsedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIVALIDATIONRESPONSEDETAIL }
     *     
     */
    public void setMIVALIDATIONRESPONSEDETAIL(MIVALIDATIONRESPONSEDETAIL value) {
        this.mivalidationresponsedetail = value;
    }

    /**
     * Gets the value of the parties property.
     * 
     * @return
     *     possible object is
     *     {@link PARTIES }
     *     
     */
    public PARTIES getPARTIES() {
        return parties;
    }

    /**
     * Sets the value of the parties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTIES }
     *     
     */
    public void setPARTIES(PARTIES value) {
        this.parties = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTIES }
     *     
     */
    public PROPERTIES getPROPERTIES() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTIES }
     *     
     */
    public void setPROPERTIES(PROPERTIES value) {
        this.properties = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MIVALIDATIONRESPONSEEXTENSION }
     *     
     */
    public MIVALIDATIONRESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIVALIDATIONRESPONSEEXTENSION }
     *     
     */
    public void setEXTENSION(MIVALIDATIONRESPONSEEXTENSION value) {
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
