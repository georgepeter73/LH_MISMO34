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
 * Contains the detail for a specific score interval that can be used for building the histogram that is required by Fair Credit Reporting Risk-Based Pricing Regulations.
 * 
 * <p>Java class for CREDIT_SCORE_HISTOGRAM_INTERVAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_SCORE_HISTOGRAM_INTERVAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditScoreHistogramIntervalHighValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="CreditScoreHistogramIntervalLowValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="CreditScoreHistogramIntervalScoreRangeOccurrencePercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_SCORE_HISTOGRAM_INTERVAL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_SCORE_HISTOGRAM_INTERVAL", propOrder = {
    "creditScoreHistogramIntervalHighValue",
    "creditScoreHistogramIntervalLowValue",
    "creditScoreHistogramIntervalScoreRangeOccurrencePercent",
    "extension"
})
public class CREDITSCOREHISTOGRAMINTERVAL {

    @XmlElementRef(name = "CreditScoreHistogramIntervalHighValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> creditScoreHistogramIntervalHighValue;
    @XmlElementRef(name = "CreditScoreHistogramIntervalLowValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> creditScoreHistogramIntervalLowValue;
    @XmlElementRef(name = "CreditScoreHistogramIntervalScoreRangeOccurrencePercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> creditScoreHistogramIntervalScoreRangeOccurrencePercent;
    @XmlElement(name = "EXTENSION")
    protected CREDITSCOREHISTOGRAMINTERVALEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditScoreHistogramIntervalHighValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getCreditScoreHistogramIntervalHighValue() {
        return creditScoreHistogramIntervalHighValue;
    }

    /**
     * Sets the value of the creditScoreHistogramIntervalHighValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setCreditScoreHistogramIntervalHighValue(JAXBElement<MISMOValue> value) {
        this.creditScoreHistogramIntervalHighValue = value;
    }

    /**
     * Gets the value of the creditScoreHistogramIntervalLowValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public JAXBElement<MISMOValue> getCreditScoreHistogramIntervalLowValue() {
        return creditScoreHistogramIntervalLowValue;
    }

    /**
     * Sets the value of the creditScoreHistogramIntervalLowValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *     
     */
    public void setCreditScoreHistogramIntervalLowValue(JAXBElement<MISMOValue> value) {
        this.creditScoreHistogramIntervalLowValue = value;
    }

    /**
     * Gets the value of the creditScoreHistogramIntervalScoreRangeOccurrencePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public JAXBElement<MISMOPercent> getCreditScoreHistogramIntervalScoreRangeOccurrencePercent() {
        return creditScoreHistogramIntervalScoreRangeOccurrencePercent;
    }

    /**
     * Sets the value of the creditScoreHistogramIntervalScoreRangeOccurrencePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *     
     */
    public void setCreditScoreHistogramIntervalScoreRangeOccurrencePercent(JAXBElement<MISMOPercent> value) {
        this.creditScoreHistogramIntervalScoreRangeOccurrencePercent = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITSCOREHISTOGRAMINTERVALEXTENSION }
     *     
     */
    public CREDITSCOREHISTOGRAMINTERVALEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITSCOREHISTOGRAMINTERVALEXTENSION }
     *     
     */
    public void setEXTENSION(CREDITSCOREHISTOGRAMINTERVALEXTENSION value) {
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
