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
 * The information exchanged with services requesting actions performed by property recording jurisdictions.
 * 
 * <p>Java class for PRIA_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRIA_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIGINATING_RECORDING_REQUEST" type="{http://www.mismo.org/residential/2009/schemas}ORIGINATING_RECORDING_REQUEST" minOccurs="0"/>
 *         &lt;element name="PRIA_CONSIDERATIONS" type="{http://www.mismo.org/residential/2009/schemas}PRIA_CONSIDERATIONS" minOccurs="0"/>
 *         &lt;element name="PRIA_REQUEST_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}PRIA_REQUEST_DETAIL" minOccurs="0"/>
 *         &lt;element name="RECORDING_TRANSACTION_IDENTIFIER" type="{http://www.mismo.org/residential/2009/schemas}RECORDING_TRANSACTION_IDENTIFIER" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PRIA_REQUEST_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PRIA_REQUEST", propOrder = {
    "originatingrecordingrequest",
    "priaconsiderations",
    "priarequestdetail",
    "recordingtransactionidentifier",
    "extension"
})
public class PRIAREQUEST {

    @XmlElement(name = "ORIGINATING_RECORDING_REQUEST")
    protected ORIGINATINGRECORDINGREQUEST originatingrecordingrequest;
    @XmlElement(name = "PRIA_CONSIDERATIONS")
    protected PRIACONSIDERATIONS priaconsiderations;
    @XmlElement(name = "PRIA_REQUEST_DETAIL")
    protected PRIAREQUESTDETAIL priarequestdetail;
    @XmlElement(name = "RECORDING_TRANSACTION_IDENTIFIER")
    protected RECORDINGTRANSACTIONIDENTIFIER recordingtransactionidentifier;
    @XmlElement(name = "EXTENSION")
    protected PRIAREQUESTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the originatingrecordingrequest property.
     * 
     * @return
     *     possible object is
     *     {@link ORIGINATINGRECORDINGREQUEST }
     *     
     */
    public ORIGINATINGRECORDINGREQUEST getORIGINATINGRECORDINGREQUEST() {
        return originatingrecordingrequest;
    }

    /**
     * Sets the value of the originatingrecordingrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORIGINATINGRECORDINGREQUEST }
     *     
     */
    public void setORIGINATINGRECORDINGREQUEST(ORIGINATINGRECORDINGREQUEST value) {
        this.originatingrecordingrequest = value;
    }

    /**
     * Gets the value of the priaconsiderations property.
     * 
     * @return
     *     possible object is
     *     {@link PRIACONSIDERATIONS }
     *     
     */
    public PRIACONSIDERATIONS getPRIACONSIDERATIONS() {
        return priaconsiderations;
    }

    /**
     * Sets the value of the priaconsiderations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRIACONSIDERATIONS }
     *     
     */
    public void setPRIACONSIDERATIONS(PRIACONSIDERATIONS value) {
        this.priaconsiderations = value;
    }

    /**
     * Gets the value of the priarequestdetail property.
     * 
     * @return
     *     possible object is
     *     {@link PRIAREQUESTDETAIL }
     *     
     */
    public PRIAREQUESTDETAIL getPRIAREQUESTDETAIL() {
        return priarequestdetail;
    }

    /**
     * Sets the value of the priarequestdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRIAREQUESTDETAIL }
     *     
     */
    public void setPRIAREQUESTDETAIL(PRIAREQUESTDETAIL value) {
        this.priarequestdetail = value;
    }

    /**
     * Gets the value of the recordingtransactionidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link RECORDINGTRANSACTIONIDENTIFIER }
     *     
     */
    public RECORDINGTRANSACTIONIDENTIFIER getRECORDINGTRANSACTIONIDENTIFIER() {
        return recordingtransactionidentifier;
    }

    /**
     * Sets the value of the recordingtransactionidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDINGTRANSACTIONIDENTIFIER }
     *     
     */
    public void setRECORDINGTRANSACTIONIDENTIFIER(RECORDINGTRANSACTIONIDENTIFIER value) {
        this.recordingtransactionidentifier = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PRIAREQUESTEXTENSION }
     *     
     */
    public PRIAREQUESTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRIAREQUESTEXTENSION }
     *     
     */
    public void setEXTENSION(PRIAREQUESTEXTENSION value) {
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
