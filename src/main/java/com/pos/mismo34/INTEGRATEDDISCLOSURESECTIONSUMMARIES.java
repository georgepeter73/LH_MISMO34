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
 * Information about one or more sections of the integrated disclosure document. Holds all occurrences of INTEGRATED_DISCLOSURE_SECTION_SUMMARY.
 * 
 * <p>Java class for INTEGRATED_DISCLOSURE_SECTION_SUMMARIES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTEGRATED_DISCLOSURE_SECTION_SUMMARIES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTEGRATED_DISCLOSURE_SECTION_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}INTEGRATED_DISCLOSURE_SECTION_SUMMARY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INTEGRATED_DISCLOSURE_SECTION_SUMMARIES_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INTEGRATED_DISCLOSURE_SECTION_SUMMARIES", propOrder = {
    "integrateddisclosuresectionsummary",
    "extension"
})
public class INTEGRATEDDISCLOSURESECTIONSUMMARIES {

    @XmlElement(name = "INTEGRATED_DISCLOSURE_SECTION_SUMMARY")
    protected List<INTEGRATEDDISCLOSURESECTIONSUMMARY> integrateddisclosuresectionsummary;
    @XmlElement(name = "EXTENSION")
    protected INTEGRATEDDISCLOSURESECTIONSUMMARIESEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the integrateddisclosuresectionsummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrateddisclosuresectionsummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINTEGRATEDDISCLOSURESECTIONSUMMARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INTEGRATEDDISCLOSURESECTIONSUMMARY }
     * 
     * 
     */
    public List<INTEGRATEDDISCLOSURESECTIONSUMMARY> getINTEGRATEDDISCLOSURESECTIONSUMMARY() {
        if (integrateddisclosuresectionsummary == null) {
            integrateddisclosuresectionsummary = new ArrayList<INTEGRATEDDISCLOSURESECTIONSUMMARY>();
        }
        return this.integrateddisclosuresectionsummary;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link INTEGRATEDDISCLOSURESECTIONSUMMARIESEXTENSION }
     *     
     */
    public INTEGRATEDDISCLOSURESECTIONSUMMARIESEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGRATEDDISCLOSURESECTIONSUMMARIESEXTENSION }
     *     
     */
    public void setEXTENSION(INTEGRATEDDISCLOSURESECTIONSUMMARIESEXTENSION value) {
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
