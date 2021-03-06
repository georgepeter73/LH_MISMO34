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
 * The STAKEHOLDER_SIGNATURE_FIELD element describes a group of areas in the view that collectively represent a signature of a stakeholder. A stakeholder is any signer of a document who is not a notary or a witness on that document; for example a borrower, a lender or seller. Points to the area of the view that contains the visual representation of a party's signature.
 * 
 * <p>Java class for STAKEHOLDER_SIGNATURE_FIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STAKEHOLDER_SIGNATURE_FIELD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIGNATURE_ABOVE_LINE_FIELD_REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE" minOccurs="0"/>
 *         &lt;element name="SIGNATURE_AREA_FIELD_REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE" minOccurs="0"/>
 *         &lt;element name="SIGNATURE_BELOW_LINE_FIELD_REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE" minOccurs="0"/>
 *         &lt;element name="SIGNATURE_PRESENTATION_FIELD_REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}FIELD_REFERENCE" minOccurs="0"/>
 *         &lt;element name="STAKEHOLDER_SIGNATURE_FIELD_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}STAKEHOLDER_SIGNATURE_FIELD_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}STAKEHOLDER_SIGNATURE_FIELD_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "STAKEHOLDER_SIGNATURE_FIELD", propOrder = {
    "signatureabovelinefieldreference",
    "signatureareafieldreference",
    "signaturebelowlinefieldreference",
    "signaturepresentationfieldreference",
    "stakeholdersignaturefielddetail",
    "extension"
})
public class STAKEHOLDERSIGNATUREFIELD {

    @XmlElement(name = "SIGNATURE_ABOVE_LINE_FIELD_REFERENCE")
    protected FIELDREFERENCE signatureabovelinefieldreference;
    @XmlElement(name = "SIGNATURE_AREA_FIELD_REFERENCE")
    protected FIELDREFERENCE signatureareafieldreference;
    @XmlElement(name = "SIGNATURE_BELOW_LINE_FIELD_REFERENCE")
    protected FIELDREFERENCE signaturebelowlinefieldreference;
    @XmlElement(name = "SIGNATURE_PRESENTATION_FIELD_REFERENCE")
    protected FIELDREFERENCE signaturepresentationfieldreference;
    @XmlElement(name = "STAKEHOLDER_SIGNATURE_FIELD_DETAIL")
    protected STAKEHOLDERSIGNATUREFIELDDETAIL stakeholdersignaturefielddetail;
    @XmlElement(name = "EXTENSION")
    protected STAKEHOLDERSIGNATUREFIELDEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the signatureabovelinefieldreference property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public FIELDREFERENCE getSIGNATUREABOVELINEFIELDREFERENCE() {
        return signatureabovelinefieldreference;
    }

    /**
     * Sets the value of the signatureabovelinefieldreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public void setSIGNATUREABOVELINEFIELDREFERENCE(FIELDREFERENCE value) {
        this.signatureabovelinefieldreference = value;
    }

    /**
     * Gets the value of the signatureareafieldreference property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public FIELDREFERENCE getSIGNATUREAREAFIELDREFERENCE() {
        return signatureareafieldreference;
    }

    /**
     * Sets the value of the signatureareafieldreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public void setSIGNATUREAREAFIELDREFERENCE(FIELDREFERENCE value) {
        this.signatureareafieldreference = value;
    }

    /**
     * Gets the value of the signaturebelowlinefieldreference property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public FIELDREFERENCE getSIGNATUREBELOWLINEFIELDREFERENCE() {
        return signaturebelowlinefieldreference;
    }

    /**
     * Sets the value of the signaturebelowlinefieldreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public void setSIGNATUREBELOWLINEFIELDREFERENCE(FIELDREFERENCE value) {
        this.signaturebelowlinefieldreference = value;
    }

    /**
     * Gets the value of the signaturepresentationfieldreference property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public FIELDREFERENCE getSIGNATUREPRESENTATIONFIELDREFERENCE() {
        return signaturepresentationfieldreference;
    }

    /**
     * Sets the value of the signaturepresentationfieldreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDREFERENCE }
     *     
     */
    public void setSIGNATUREPRESENTATIONFIELDREFERENCE(FIELDREFERENCE value) {
        this.signaturepresentationfieldreference = value;
    }

    /**
     * Gets the value of the stakeholdersignaturefielddetail property.
     * 
     * @return
     *     possible object is
     *     {@link STAKEHOLDERSIGNATUREFIELDDETAIL }
     *     
     */
    public STAKEHOLDERSIGNATUREFIELDDETAIL getSTAKEHOLDERSIGNATUREFIELDDETAIL() {
        return stakeholdersignaturefielddetail;
    }

    /**
     * Sets the value of the stakeholdersignaturefielddetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAKEHOLDERSIGNATUREFIELDDETAIL }
     *     
     */
    public void setSTAKEHOLDERSIGNATUREFIELDDETAIL(STAKEHOLDERSIGNATUREFIELDDETAIL value) {
        this.stakeholdersignaturefielddetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link STAKEHOLDERSIGNATUREFIELDEXTENSION }
     *     
     */
    public STAKEHOLDERSIGNATUREFIELDEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAKEHOLDERSIGNATUREFIELDEXTENSION }
     *     
     */
    public void setEXTENSION(STAKEHOLDERSIGNATUREFIELDEXTENSION value) {
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
