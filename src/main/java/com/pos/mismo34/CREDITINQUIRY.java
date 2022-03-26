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
 * <p>Java class for CREDIT_INQUIRY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_INQUIRY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDRESS" type="{http://www.mismo.org/residential/2009/schemas}ADDRESS" minOccurs="0"/>
 *         &lt;element name="CREDIT_COMMENTS" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_COMMENTS" minOccurs="0"/>
 *         &lt;element name="CREDIT_INQUIRY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_INQUIRY_DETAIL" minOccurs="0"/>
 *         &lt;element name="CREDIT_REPOSITORIES" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_REPOSITORIES" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.mismo.org/residential/2009/schemas}NAME" minOccurs="0"/>
 *         &lt;element name="VERIFICATION" type="{http://www.mismo.org/residential/2009/schemas}VERIFICATION" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_INQUIRY_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
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
@XmlType(name = "CREDIT_INQUIRY", propOrder = {
    "address",
    "creditcomments",
    "creditinquirydetail",
    "creditrepositories",
    "name",
    "verification",
    "extension"
})
public class CREDITINQUIRY {

    @XmlElement(name = "ADDRESS")
    protected ADDRESS address;
    @XmlElement(name = "CREDIT_COMMENTS")
    protected CREDITCOMMENTS creditcomments;
    @XmlElement(name = "CREDIT_INQUIRY_DETAIL")
    protected CREDITINQUIRYDETAIL creditinquirydetail;
    @XmlElement(name = "CREDIT_REPOSITORIES")
    protected CREDITREPOSITORIES creditrepositories;
    @XmlElement(name = "NAME")
    protected NAME name;
    @XmlElement(name = "VERIFICATION")
    protected VERIFICATION verification;
    @XmlElement(name = "EXTENSION")
    protected CREDITINQUIRYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Gets the value of the creditcomments property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITCOMMENTS }
     *     
     */
    public CREDITCOMMENTS getCREDITCOMMENTS() {
        return creditcomments;
    }

    /**
     * Sets the value of the creditcomments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITCOMMENTS }
     *     
     */
    public void setCREDITCOMMENTS(CREDITCOMMENTS value) {
        this.creditcomments = value;
    }

    /**
     * Gets the value of the creditinquirydetail property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITINQUIRYDETAIL }
     *     
     */
    public CREDITINQUIRYDETAIL getCREDITINQUIRYDETAIL() {
        return creditinquirydetail;
    }

    /**
     * Sets the value of the creditinquirydetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITINQUIRYDETAIL }
     *     
     */
    public void setCREDITINQUIRYDETAIL(CREDITINQUIRYDETAIL value) {
        this.creditinquirydetail = value;
    }

    /**
     * Gets the value of the creditrepositories property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITREPOSITORIES }
     *     
     */
    public CREDITREPOSITORIES getCREDITREPOSITORIES() {
        return creditrepositories;
    }

    /**
     * Sets the value of the creditrepositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITREPOSITORIES }
     *     
     */
    public void setCREDITREPOSITORIES(CREDITREPOSITORIES value) {
        this.creditrepositories = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NAME }
     *     
     */
    public NAME getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAME }
     *     
     */
    public void setNAME(NAME value) {
        this.name = value;
    }

    /**
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link VERIFICATION }
     *     
     */
    public VERIFICATION getVERIFICATION() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIFICATION }
     *     
     */
    public void setVERIFICATION(VERIFICATION value) {
        this.verification = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITINQUIRYEXTENSION }
     *     
     */
    public CREDITINQUIRYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITINQUIRYEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITINQUIRYEXTENSION value) {
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
