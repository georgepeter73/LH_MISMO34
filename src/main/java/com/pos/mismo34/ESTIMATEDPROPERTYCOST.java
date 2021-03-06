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
 * Information about the estimated property costs including estimated taxes, insurance and assessments.
 * 
 * <p>Java class for ESTIMATED_PROPERTY_COST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTIMATED_PROPERTY_COST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESTIMATED_PROPERTY_COST_COMPONENTS" type="{http://www.mismo.org/residential/2009/schemas}ESTIMATED_PROPERTY_COST_COMPONENTS" minOccurs="0"/>
 *         &lt;element name="ESTIMATED_PROPERTY_COST_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}ESTIMATED_PROPERTY_COST_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ESTIMATED_PROPERTY_COST_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ESTIMATED_PROPERTY_COST", propOrder = {
    "estimatedpropertycostcomponents",
    "estimatedpropertycostdetail",
    "extension"
})
public class ESTIMATEDPROPERTYCOST {

    @XmlElement(name = "ESTIMATED_PROPERTY_COST_COMPONENTS")
    protected ESTIMATEDPROPERTYCOSTCOMPONENTS estimatedpropertycostcomponents;
    @XmlElement(name = "ESTIMATED_PROPERTY_COST_DETAIL")
    protected ESTIMATEDPROPERTYCOSTDETAIL estimatedpropertycostdetail;
    @XmlElement(name = "EXTENSION")
    protected ESTIMATEDPROPERTYCOSTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the estimatedpropertycostcomponents property.
     * 
     * @return
     *     possible object is
     *     {@link ESTIMATEDPROPERTYCOSTCOMPONENTS }
     *     
     */
    public ESTIMATEDPROPERTYCOSTCOMPONENTS getESTIMATEDPROPERTYCOSTCOMPONENTS() {
        return estimatedpropertycostcomponents;
    }

    /**
     * Sets the value of the estimatedpropertycostcomponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESTIMATEDPROPERTYCOSTCOMPONENTS }
     *     
     */
    public void setESTIMATEDPROPERTYCOSTCOMPONENTS(ESTIMATEDPROPERTYCOSTCOMPONENTS value) {
        this.estimatedpropertycostcomponents = value;
    }

    /**
     * Gets the value of the estimatedpropertycostdetail property.
     * 
     * @return
     *     possible object is
     *     {@link ESTIMATEDPROPERTYCOSTDETAIL }
     *     
     */
    public ESTIMATEDPROPERTYCOSTDETAIL getESTIMATEDPROPERTYCOSTDETAIL() {
        return estimatedpropertycostdetail;
    }

    /**
     * Sets the value of the estimatedpropertycostdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESTIMATEDPROPERTYCOSTDETAIL }
     *     
     */
    public void setESTIMATEDPROPERTYCOSTDETAIL(ESTIMATEDPROPERTYCOSTDETAIL value) {
        this.estimatedpropertycostdetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ESTIMATEDPROPERTYCOSTEXTENSION }
     *     
     */
    public ESTIMATEDPROPERTYCOSTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESTIMATEDPROPERTYCOSTEXTENSION }
     *     
     */
    public void setEXTENSION(ESTIMATEDPROPERTYCOSTEXTENSION value) {
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
