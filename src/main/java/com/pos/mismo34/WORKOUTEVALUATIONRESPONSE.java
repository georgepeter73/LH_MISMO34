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
 * Information about the response to a request for a workout evaluation.
 * 
 * <p>Java class for WORKOUT_EVALUATION_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WORKOUT_EVALUATION_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEAL_SET" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SET" minOccurs="0"/>
 *         &lt;element name="WORKOUT_EVALUATION_RESPONSE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}WORKOUT_EVALUATION_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}WORKOUT_EVALUATION_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "WORKOUT_EVALUATION_RESPONSE", propOrder = {
    "dealset",
    "workoutevaluationresponsedetail",
    "extension"
})
public class WORKOUTEVALUATIONRESPONSE {

    @XmlElement(name = "DEAL_SET")
    protected DEALSET dealset;
    @XmlElement(name = "WORKOUT_EVALUATION_RESPONSE_DETAIL")
    protected WORKOUTEVALUATIONRESPONSEDETAIL workoutevaluationresponsedetail;
    @XmlElement(name = "EXTENSION")
    protected WORKOUTEVALUATIONRESPONSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dealset property.
     * 
     * @return
     *     possible object is
     *     {@link DEALSET }
     *     
     */
    public DEALSET getDEALSET() {
        return dealset;
    }

    /**
     * Sets the value of the dealset property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALSET }
     *     
     */
    public void setDEALSET(DEALSET value) {
        this.dealset = value;
    }

    /**
     * Gets the value of the workoutevaluationresponsedetail property.
     * 
     * @return
     *     possible object is
     *     {@link WORKOUTEVALUATIONRESPONSEDETAIL }
     *     
     */
    public WORKOUTEVALUATIONRESPONSEDETAIL getWORKOUTEVALUATIONRESPONSEDETAIL() {
        return workoutevaluationresponsedetail;
    }

    /**
     * Sets the value of the workoutevaluationresponsedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WORKOUTEVALUATIONRESPONSEDETAIL }
     *     
     */
    public void setWORKOUTEVALUATIONRESPONSEDETAIL(WORKOUTEVALUATIONRESPONSEDETAIL value) {
        this.workoutevaluationresponsedetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link WORKOUTEVALUATIONRESPONSEEXTENSION }
     *     
     */
    public WORKOUTEVALUATIONRESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link WORKOUTEVALUATIONRESPONSEEXTENSION }
     *     
     */
    public void setEXTENSION(WORKOUTEVALUATIONRESPONSEEXTENSION value) {
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
