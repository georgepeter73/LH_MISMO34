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
 * Container for the detailed data points that make up the contents of a title policy.
 * 
 * <p>Java class for TITLE_POLICY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TITLE_POLICY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXECUTIONS" type="{http://www.mismo.org/residential/2009/schemas}EXECUTIONS" minOccurs="0"/>
 *         &lt;element name="LEGAL_AND_VESTINGS" type="{http://www.mismo.org/residential/2009/schemas}LEGAL_AND_VESTINGS" minOccurs="0"/>
 *         &lt;element name="LOANS" type="{http://www.mismo.org/residential/2009/schemas}LOANS" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="PROPERTY" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY" minOccurs="0"/>
 *         &lt;element name="RECORDING_ENDORSEMENT_INFORMATION" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_ENDORSEMENT_INFORMATION" minOccurs="0"/>
 *         &lt;element name="TITLE_ADDITIONAL_EXCEPTIONS" type="{http://www.mismo.org/residential/2009/schemas}TITLE_ADDITIONAL_EXCEPTIONS" minOccurs="0"/>
 *         &lt;element name="TITLE_ENDORSEMENTS" type="{http://www.mismo.org/residential/2009/schemas}TITLE_ENDORSEMENTS" minOccurs="0"/>
 *         &lt;element name="TITLE_POLICY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}TITLE_POLICY_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_POLICY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TITLE_POLICY", propOrder = {
    "executions",
    "legalandvestings",
    "loans",
    "parties",
    "property",
    "recordingendorsementinformation",
    "titleadditionalexceptions",
    "titleendorsements",
    "titlepolicydetail",
    "extension"
})
public class TITLEPOLICY {

    @XmlElement(name = "EXECUTIONS")
    protected EXECUTIONS executions;
    @XmlElement(name = "LEGAL_AND_VESTINGS")
    protected LEGALANDVESTINGS legalandvestings;
    @XmlElement(name = "LOANS")
    protected LOANS loans;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "PROPERTY")
    protected PROPERTY property;
    @XmlElement(name = "RECORDING_ENDORSEMENT_INFORMATION")
    protected RECORDINGENDORSEMENTINFORMATION recordingendorsementinformation;
    @XmlElement(name = "TITLE_ADDITIONAL_EXCEPTIONS")
    protected TITLEADDITIONALEXCEPTIONS titleadditionalexceptions;
    @XmlElement(name = "TITLE_ENDORSEMENTS")
    protected TITLEENDORSEMENTS titleendorsements;
    @XmlElement(name = "TITLE_POLICY_DETAIL")
    protected TITLEPOLICYDETAIL titlepolicydetail;
    @XmlElement(name = "EXTENSION")
    protected TITLEPOLICYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the executions property.
     * 
     * @return
     *     possible object is
     *     {@link EXECUTIONS }
     *     
     */
    public EXECUTIONS getEXECUTIONS() {
        return executions;
    }

    /**
     * Sets the value of the executions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXECUTIONS }
     *     
     */
    public void setEXECUTIONS(EXECUTIONS value) {
        this.executions = value;
    }

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
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link LOANS }
     *     
     */
    public LOANS getLOANS() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANS }
     *     
     */
    public void setLOANS(LOANS value) {
        this.loans = value;
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
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTY }
     *     
     */
    public PROPERTY getPROPERTY() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTY }
     *     
     */
    public void setPROPERTY(PROPERTY value) {
        this.property = value;
    }

    /**
     * Gets the value of the recordingendorsementinformation property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGENDORSEMENTINFORMATION }
     *     
     */
    public RECORDINGENDORSEMENTINFORMATION getRECORDINGENDORSEMENTINFORMATION() {
        return recordingendorsementinformation;
    }

    /**
     * Sets the value of the recordingendorsementinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGENDORSEMENTINFORMATION }
     *     
     */
    public void setRECORDINGENDORSEMENTINFORMATION(RECORDINGENDORSEMENTINFORMATION value) {
        this.recordingendorsementinformation = value;
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
     * Gets the value of the titleendorsements property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEENDORSEMENTS }
     *     
     */
    public TITLEENDORSEMENTS getTITLEENDORSEMENTS() {
        return titleendorsements;
    }

    /**
     * Sets the value of the titleendorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEENDORSEMENTS }
     *     
     */
    public void setTITLEENDORSEMENTS(TITLEENDORSEMENTS value) {
        this.titleendorsements = value;
    }

    /**
     * Gets the value of the titlepolicydetail property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEPOLICYDETAIL }
     *     
     */
    public TITLEPOLICYDETAIL getTITLEPOLICYDETAIL() {
        return titlepolicydetail;
    }

    /**
     * Sets the value of the titlepolicydetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEPOLICYDETAIL }
     *     
     */
    public void setTITLEPOLICYDETAIL(TITLEPOLICYDETAIL value) {
        this.titlepolicydetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEPOLICYEXTENSION }
     *     
     */
    public TITLEPOLICYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEPOLICYEXTENSION }
     *     
     */
    public void setEXTENSION(TITLEPOLICYEXTENSION value) {
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
