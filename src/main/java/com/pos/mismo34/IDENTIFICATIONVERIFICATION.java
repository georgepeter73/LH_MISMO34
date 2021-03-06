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
 * Information about how the identity of the individual was established.
 * 
 * <p>Java class for IDENTIFICATION_VERIFICATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTIFICATION_VERIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIRTH_INFORMATION" type="{http://www.mismo.org/residential/2009/schemas}BIRTH_INFORMATION" minOccurs="0"/>
 *         &lt;element name="IDENTIFICATION_VERIFICATION_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}IDENTIFICATION_VERIFICATION_DETAIL" minOccurs="0"/>
 *         &lt;element name="IDENTITY_DOCUMENTATIONS" type="{http://www.mismo.org/residential/2009/schemas}IDENTITY_DOCUMENTATIONS" minOccurs="0"/>
 *         &lt;element name="SHARED_SECRETS" type="{http://www.mismo.org/residential/2009/schemas}SHARED_SECRETS" minOccurs="0"/>
 *         &lt;element name="SPOUSE_INFORMATION" type="{http://www.mismo.org/residential/2009/schemas}SPOUSE_INFORMATION" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}IDENTIFICATION_VERIFICATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "IDENTIFICATION_VERIFICATION", propOrder = {
    "birthinformation",
    "identificationverificationdetail",
    "identitydocumentations",
    "sharedsecrets",
    "spouseinformation",
    "extension"
})
public class IDENTIFICATIONVERIFICATION {

    @XmlElement(name = "BIRTH_INFORMATION")
    protected BIRTHINFORMATION birthinformation;
    @XmlElement(name = "IDENTIFICATION_VERIFICATION_DETAIL")
    protected IDENTIFICATIONVERIFICATIONDETAIL identificationverificationdetail;
    @XmlElement(name = "IDENTITY_DOCUMENTATIONS")
    protected IDENTITYDOCUMENTATIONS identitydocumentations;
    @XmlElement(name = "SHARED_SECRETS")
    protected SHAREDSECRETS sharedsecrets;
    @XmlElement(name = "SPOUSE_INFORMATION")
    protected SPOUSEINFORMATION spouseinformation;
    @XmlElement(name = "EXTENSION")
    protected IDENTIFICATIONVERIFICATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the birthinformation property.
     * 
     * @return
     *     possible object is
     *     {@link BIRTHINFORMATION }
     *     
     */
    public BIRTHINFORMATION getBIRTHINFORMATION() {
        return birthinformation;
    }

    /**
     * Sets the value of the birthinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIRTHINFORMATION }
     *     
     */
    public void setBIRTHINFORMATION(BIRTHINFORMATION value) {
        this.birthinformation = value;
    }

    /**
     * Gets the value of the identificationverificationdetail property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFICATIONVERIFICATIONDETAIL }
     *     
     */
    public IDENTIFICATIONVERIFICATIONDETAIL getIDENTIFICATIONVERIFICATIONDETAIL() {
        return identificationverificationdetail;
    }

    /**
     * Sets the value of the identificationverificationdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFICATIONVERIFICATIONDETAIL }
     *     
     */
    public void setIDENTIFICATIONVERIFICATIONDETAIL(IDENTIFICATIONVERIFICATIONDETAIL value) {
        this.identificationverificationdetail = value;
    }

    /**
     * Gets the value of the identitydocumentations property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYDOCUMENTATIONS }
     *     
     */
    public IDENTITYDOCUMENTATIONS getIDENTITYDOCUMENTATIONS() {
        return identitydocumentations;
    }

    /**
     * Sets the value of the identitydocumentations property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYDOCUMENTATIONS }
     *     
     */
    public void setIDENTITYDOCUMENTATIONS(IDENTITYDOCUMENTATIONS value) {
        this.identitydocumentations = value;
    }

    /**
     * Gets the value of the sharedsecrets property.
     * 
     * @return
     *     possible object is
     *     {@link SHAREDSECRETS }
     *     
     */
    public SHAREDSECRETS getSHAREDSECRETS() {
        return sharedsecrets;
    }

    /**
     * Sets the value of the sharedsecrets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHAREDSECRETS }
     *     
     */
    public void setSHAREDSECRETS(SHAREDSECRETS value) {
        this.sharedsecrets = value;
    }

    /**
     * Gets the value of the spouseinformation property.
     * 
     * @return
     *     possible object is
     *     {@link SPOUSEINFORMATION }
     *     
     */
    public SPOUSEINFORMATION getSPOUSEINFORMATION() {
        return spouseinformation;
    }

    /**
     * Sets the value of the spouseinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPOUSEINFORMATION }
     *     
     */
    public void setSPOUSEINFORMATION(SPOUSEINFORMATION value) {
        this.spouseinformation = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFICATIONVERIFICATIONEXTENSION }
     *     
     */
    public IDENTIFICATIONVERIFICATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFICATIONVERIFICATIONEXTENSION }
     *     
     */
    public void setEXTENSION(IDENTIFICATIONVERIFICATIONEXTENSION value) {
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
