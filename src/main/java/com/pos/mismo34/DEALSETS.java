//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * <p>Java class for DEAL_SETS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEAL_SETS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEAL_SET" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SET" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DEAL_SET_SERVICES" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SET_SERVICES" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="RELATIONSHIPS" type="{http://www.mismo.org/residential/2009/schemas}RELATIONSHIPS" minOccurs="0"/>
 *         &lt;element name="VERIFICATION_DATA" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION_DATA" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SETS_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DEAL_SETS", propOrder = {
    "dealset",
    "dealsetservices",
    "parties",
    "relationships",
    "verificationdata",
    "extension"
})
public class DEALSETS {

    @XmlElement(name = "DEAL_SET")
    protected List<DEALSET> dealset;
    @XmlElement(name = "DEAL_SET_SERVICES")
    protected DEALSETSERVICES dealsetservices;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "RELATIONSHIPS")
    protected RELATIONSHIPS relationships;
    @XmlElement(name = "VERIFICATION_DATA")
    protected VERIFICATIONDATA verificationdata;
    @XmlElement(name = "EXTENSION")
    protected DEALSETSEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dealset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEALSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEALSET }
     * 
     * 
     */
    public List<DEALSET> getDEALSET() {
        if (dealset == null) {
            dealset = new ArrayList<DEALSET>();
        }
        return this.dealset;
    }

    /**
     * Gets the value of the dealsetservices property.
     * 
     * @return
     *     possible object is
     *     {@link DEALSETSERVICES }
     *     
     */
    public DEALSETSERVICES getDEALSETSERVICES() {
        return dealsetservices;
    }

    /**
     * Sets the value of the dealsetservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALSETSERVICES }
     *     
     */
    public void setDEALSETSERVICES(DEALSETSERVICES value) {
        this.dealsetservices = value;
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
     * Gets the value of the relationships property.
     * 
     * @return
     *     possible object is
     *     {@link RELATIONSHIPS }
     *     
     */
    public RELATIONSHIPS getRELATIONSHIPS() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link RELATIONSHIPS }
     *     
     */
    public void setRELATIONSHIPS(RELATIONSHIPS value) {
        this.relationships = value;
    }

    /**
     * Gets the value of the verificationdata property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATIONDATA }
     *     
     */
    public VERIFICATIONDATA getVERIFICATIONDATA() {
        return verificationdata;
    }

    /**
     * Sets the value of the verificationdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATIONDATA }
     *     
     */
    public void setVERIFICATIONDATA(VERIFICATIONDATA value) {
        this.verificationdata = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DEALSETSEXTENSION }
     *     
     */
    public DEALSETSEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALSETSEXTENSION }
     *     
     */
    public void setEXTENSION(DEALSETSEXTENSION value) {
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
