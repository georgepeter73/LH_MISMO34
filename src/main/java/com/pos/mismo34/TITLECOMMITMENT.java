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
 * Container for the detailed data points that make up the contents of a title commitment.
 * 
 * <p>Java class for TITLE_COMMITMENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TITLE_COMMITMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LEGAL_AND_VESTINGS" type="{http://www.mismo.org/residential/2009/schemas}LEGAL_AND_VESTINGS" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="TITLE_ADDITIONAL_EXCEPTIONS" type="{http://www.mismo.org/residential/2009/schemas}TITLE_ADDITIONAL_EXCEPTIONS" minOccurs="0"/>
 *         &lt;element name="TITLE_ADDITIONAL_REQUIREMENTS" type="{http://www.mismo.org/residential/2009/schemas}TITLE_ADDITIONAL_REQUIREMENTS" minOccurs="0"/>
 *         &lt;element name="TITLE_COMMITMENT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}TITLE_COMMITMENT_DETAIL" minOccurs="0"/>
 *         &lt;element name="TITLE_COMMITMENT_PROPOSED_POLICIES" type="{http://www.mismo.org/residential/2009/schemas}TITLE_COMMITMENT_PROPOSED_POLICIES" minOccurs="0"/>
 *         &lt;element name="TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_COMMITMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TITLE_COMMITMENT", propOrder = {
    "legalandvestings",
    "parties",
    "titleadditionalexceptions",
    "titleadditionalrequirements",
    "titlecommitmentdetail",
    "titlecommitmentproposedpolicies",
    "titleexistingloansandliabilitiesinformation",
    "extension"
})
public class TITLECOMMITMENT {

    @XmlElement(name = "LEGAL_AND_VESTINGS")
    protected LEGALANDVESTINGS legalandvestings;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "TITLE_ADDITIONAL_EXCEPTIONS")
    protected TITLEADDITIONALEXCEPTIONS titleadditionalexceptions;
    @XmlElement(name = "TITLE_ADDITIONAL_REQUIREMENTS")
    protected TITLEADDITIONALREQUIREMENTS titleadditionalrequirements;
    @XmlElement(name = "TITLE_COMMITMENT_DETAIL")
    protected TITLECOMMITMENTDETAIL titlecommitmentdetail;
    @XmlElement(name = "TITLE_COMMITMENT_PROPOSED_POLICIES")
    protected TITLECOMMITMENTPROPOSEDPOLICIES titlecommitmentproposedpolicies;
    @XmlElement(name = "TITLE_EXISTING_LOANS_AND_LIABILITIES_INFORMATION")
    protected TITLEEXISTINGLOANSANDLIABILITIESINFORMATION titleexistingloansandliabilitiesinformation;
    @XmlElement(name = "EXTENSION")
    protected TITLECOMMITMENTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the legalandvestings property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALANDVESTINGS }
     *     
     */
    public LEGALANDVESTINGS getLEGALANDVESTINGS() {
        return legalandvestings;
    }

    /**
     * Sets the value of the legalandvestings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALANDVESTINGS }
     *     
     */
    public void setLEGALANDVESTINGS(LEGALANDVESTINGS value) {
        this.legalandvestings = value;
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
     * Gets the value of the titleadditionalexceptions property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEADDITIONALEXCEPTIONS }
     *     
     */
    public TITLEADDITIONALEXCEPTIONS getTITLEADDITIONALEXCEPTIONS() {
        return titleadditionalexceptions;
    }

    /**
     * Sets the value of the titleadditionalexceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEADDITIONALEXCEPTIONS }
     *     
     */
    public void setTITLEADDITIONALEXCEPTIONS(TITLEADDITIONALEXCEPTIONS value) {
        this.titleadditionalexceptions = value;
    }

    /**
     * Gets the value of the titleadditionalrequirements property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEADDITIONALREQUIREMENTS }
     *     
     */
    public TITLEADDITIONALREQUIREMENTS getTITLEADDITIONALREQUIREMENTS() {
        return titleadditionalrequirements;
    }

    /**
     * Sets the value of the titleadditionalrequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEADDITIONALREQUIREMENTS }
     *     
     */
    public void setTITLEADDITIONALREQUIREMENTS(TITLEADDITIONALREQUIREMENTS value) {
        this.titleadditionalrequirements = value;
    }

    /**
     * Gets the value of the titlecommitmentdetail property.
     * 
     * @return
     *     possible object is
     *     {@link TITLECOMMITMENTDETAIL }
     *     
     */
    public TITLECOMMITMENTDETAIL getTITLECOMMITMENTDETAIL() {
        return titlecommitmentdetail;
    }

    /**
     * Sets the value of the titlecommitmentdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLECOMMITMENTDETAIL }
     *     
     */
    public void setTITLECOMMITMENTDETAIL(TITLECOMMITMENTDETAIL value) {
        this.titlecommitmentdetail = value;
    }

    /**
     * Gets the value of the titlecommitmentproposedpolicies property.
     * 
     * @return
     *     possible object is
     *     {@link TITLECOMMITMENTPROPOSEDPOLICIES }
     *     
     */
    public TITLECOMMITMENTPROPOSEDPOLICIES getTITLECOMMITMENTPROPOSEDPOLICIES() {
        return titlecommitmentproposedpolicies;
    }

    /**
     * Sets the value of the titlecommitmentproposedpolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLECOMMITMENTPROPOSEDPOLICIES }
     *     
     */
    public void setTITLECOMMITMENTPROPOSEDPOLICIES(TITLECOMMITMENTPROPOSEDPOLICIES value) {
        this.titlecommitmentproposedpolicies = value;
    }

    /**
     * Gets the value of the titleexistingloansandliabilitiesinformation property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEEXISTINGLOANSANDLIABILITIESINFORMATION }
     *     
     */
    public TITLEEXISTINGLOANSANDLIABILITIESINFORMATION getTITLEEXISTINGLOANSANDLIABILITIESINFORMATION() {
        return titleexistingloansandliabilitiesinformation;
    }

    /**
     * Sets the value of the titleexistingloansandliabilitiesinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEEXISTINGLOANSANDLIABILITIESINFORMATION }
     *     
     */
    public void setTITLEEXISTINGLOANSANDLIABILITIESINFORMATION(TITLEEXISTINGLOANSANDLIABILITIESINFORMATION value) {
        this.titleexistingloansandliabilitiesinformation = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TITLECOMMITMENTEXTENSION }
     *     
     */
    public TITLECOMMITMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLECOMMITMENTEXTENSION }
     *     
     */
    public void setEXTENSION(TITLECOMMITMENTEXTENSION value) {
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
