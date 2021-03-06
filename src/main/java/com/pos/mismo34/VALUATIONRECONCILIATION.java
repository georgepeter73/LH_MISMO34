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
 * <p>Java class for VALUATION_RECONCILIATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALUATION_RECONCILIATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REPAIR" type="{http://www.mismo.org/residential/2009/schemas}REPAIR" minOccurs="0"/>
 *         &lt;element name="VALUATION_RECONCILIATION_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_RECONCILIATION_DETAIL" minOccurs="0"/>
 *         &lt;element name="VALUATION_RECONCILIATION_SUMMARIES" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_RECONCILIATION_SUMMARIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_RECONCILIATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VALUATION_RECONCILIATION", propOrder = {
    "repair",
    "valuationreconciliationdetail",
    "valuationreconciliationsummaries",
    "extension"
})
public class VALUATIONRECONCILIATION {

    @XmlElement(name = "REPAIR")
    protected REPAIR repair;
    @XmlElement(name = "VALUATION_RECONCILIATION_DETAIL")
    protected VALUATIONRECONCILIATIONDETAIL valuationreconciliationdetail;
    @XmlElement(name = "VALUATION_RECONCILIATION_SUMMARIES")
    protected VALUATIONRECONCILIATIONSUMMARIES valuationreconciliationsummaries;
    @XmlElement(name = "EXTENSION")
    protected VALUATIONRECONCILIATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the repair property.
     * 
     * @return
     *     possible object is
     *     {@link REPAIR }
     *     
     */
    public REPAIR getREPAIR() {
        return repair;
    }

    /**
     * Sets the value of the repair property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPAIR }
     *     
     */
    public void setREPAIR(REPAIR value) {
        this.repair = value;
    }

    /**
     * Gets the value of the valuationreconciliationdetail property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONRECONCILIATIONDETAIL }
     *     
     */
    public VALUATIONRECONCILIATIONDETAIL getVALUATIONRECONCILIATIONDETAIL() {
        return valuationreconciliationdetail;
    }

    /**
     * Sets the value of the valuationreconciliationdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONRECONCILIATIONDETAIL }
     *     
     */
    public void setVALUATIONRECONCILIATIONDETAIL(VALUATIONRECONCILIATIONDETAIL value) {
        this.valuationreconciliationdetail = value;
    }

    /**
     * Gets the value of the valuationreconciliationsummaries property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONRECONCILIATIONSUMMARIES }
     *     
     */
    public VALUATIONRECONCILIATIONSUMMARIES getVALUATIONRECONCILIATIONSUMMARIES() {
        return valuationreconciliationsummaries;
    }

    /**
     * Sets the value of the valuationreconciliationsummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONRECONCILIATIONSUMMARIES }
     *     
     */
    public void setVALUATIONRECONCILIATIONSUMMARIES(VALUATIONRECONCILIATIONSUMMARIES value) {
        this.valuationreconciliationsummaries = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VALUATIONRECONCILIATIONEXTENSION }
     *     
     */
    public VALUATIONRECONCILIATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALUATIONRECONCILIATIONEXTENSION }
     *     
     */
    public void setEXTENSION(VALUATIONRECONCILIATIONEXTENSION value) {
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
