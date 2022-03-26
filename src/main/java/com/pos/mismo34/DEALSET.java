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
 * <p>Java class for DEAL_SET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEAL_SET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACH" type="{http://www.mismo.org/residential/2009/schemas}ACH" minOccurs="0"/>
 *         &lt;element name="CASH_REMITTANCE_SUMMARY_NOTIFICATION" type="{http://www.mismo.org/residential/2009/schemas}CASH_REMITTANCE_SUMMARY_NOTIFICATION" minOccurs="0"/>
 *         &lt;element name="DEAL_SET_EXPENSES" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SET_EXPENSES" minOccurs="0"/>
 *         &lt;element name="DEAL_SET_INCOMES" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SET_INCOMES" minOccurs="0"/>
 *         &lt;element name="DEALS" type="{http://www.mismo.org/residential/2009/schemas}DEALS" minOccurs="0"/>
 *         &lt;element name="INVESTOR_FEATURES" type="{http://www.mismo.org/residential/2009/schemas}INVESTOR_FEATURES" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="POOL" type="{http://www.mismo.org/residential/2009/schemas}POOL" minOccurs="0"/>
 *         &lt;element name="RELATIONSHIPS" type="{http://www.mismo.org/residential/2009/schemas}RELATIONSHIPS" minOccurs="0"/>
 *         &lt;element name="SERVICER_REPORTING" type="{http://www.mismo.org/residential/2009/schemas}SERVICER_REPORTING" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DEAL_SET_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "DEAL_SET", propOrder = {
    "ach",
    "cashremittancesummarynotification",
    "dealsetexpenses",
    "dealsetincomes",
    "deals",
    "investorfeatures",
    "parties",
    "pool",
    "relationships",
    "servicerreporting",
    "extension"
})
public class DEALSET {

    @XmlElement(name = "ACH")
    protected ACH ach;
    @XmlElement(name = "CASH_REMITTANCE_SUMMARY_NOTIFICATION")
    protected CASHREMITTANCESUMMARYNOTIFICATION cashremittancesummarynotification;
    @XmlElement(name = "DEAL_SET_EXPENSES")
    protected DEALSETEXPENSES dealsetexpenses;
    @XmlElement(name = "DEAL_SET_INCOMES")
    protected DEALSETINCOMES dealsetincomes;
    @XmlElement(name = "DEALS")
    protected DEALS deals;
    @XmlElement(name = "INVESTOR_FEATURES")
    protected INVESTORFEATURES investorfeatures;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "POOL")
    protected POOL pool;
    @XmlElement(name = "RELATIONSHIPS")
    protected RELATIONSHIPS relationships;
    @XmlElement(name = "SERVICER_REPORTING")
    protected SERVICERREPORTING servicerreporting;
    @XmlElement(name = "EXTENSION")
    protected DEALSETEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ach property.
     * 
     * @return
     *     possible object is
     *     {@link ACH }
     *     
     */
    public ACH getACH() {
        return ach;
    }

    /**
     * Sets the value of the ach property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACH }
     *     
     */
    public void setACH(ACH value) {
        this.ach = value;
    }

    /**
     * Gets the value of the cashremittancesummarynotification property.
     * 
     * @return
     *     possible object is
     *     {@link CASHREMITTANCESUMMARYNOTIFICATION }
     *     
     */
    public CASHREMITTANCESUMMARYNOTIFICATION getCASHREMITTANCESUMMARYNOTIFICATION() {
        return cashremittancesummarynotification;
    }

    /**
     * Sets the value of the cashremittancesummarynotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASHREMITTANCESUMMARYNOTIFICATION }
     *     
     */
    public void setCASHREMITTANCESUMMARYNOTIFICATION(CASHREMITTANCESUMMARYNOTIFICATION value) {
        this.cashremittancesummarynotification = value;
    }

    /**
     * Gets the value of the dealsetexpenses property.
     * 
     * @return
     *     possible object is
     *     {@link DEALSETEXPENSES }
     *     
     */
    public DEALSETEXPENSES getDEALSETEXPENSES() {
        return dealsetexpenses;
    }

    /**
     * Sets the value of the dealsetexpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALSETEXPENSES }
     *     
     */
    public void setDEALSETEXPENSES(DEALSETEXPENSES value) {
        this.dealsetexpenses = value;
    }

    /**
     * Gets the value of the dealsetincomes property.
     * 
     * @return
     *     possible object is
     *     {@link DEALSETINCOMES }
     *     
     */
    public DEALSETINCOMES getDEALSETINCOMES() {
        return dealsetincomes;
    }

    /**
     * Sets the value of the dealsetincomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALSETINCOMES }
     *     
     */
    public void setDEALSETINCOMES(DEALSETINCOMES value) {
        this.dealsetincomes = value;
    }

    /**
     * Gets the value of the deals property.
     * 
     * @return
     *     possible object is
     *     {@link DEALS }
     *     
     */
    public DEALS getDEALS() {
        return deals;
    }

    /**
     * Sets the value of the deals property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALS }
     *     
     */
    public void setDEALS(DEALS value) {
        this.deals = value;
    }

    /**
     * Gets the value of the investorfeatures property.
     * 
     * @return
     *     possible object is
     *     {@link INVESTORFEATURES }
     *     
     */
    public INVESTORFEATURES getINVESTORFEATURES() {
        return investorfeatures;
    }

    /**
     * Sets the value of the investorfeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVESTORFEATURES }
     *     
     */
    public void setINVESTORFEATURES(INVESTORFEATURES value) {
        this.investorfeatures = value;
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
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link POOL }
     *     
     */
    public POOL getPOOL() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link POOL }
     *     
     */
    public void setPOOL(POOL value) {
        this.pool = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * @return
     *     possible object is
     *     {@link RELATIONSHIPS }
     *     
     */
    public RELATIONSHIPS getRELATIONSHIPS() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link RELATIONSHIPS }
     *     
     */
    public void setRELATIONSHIPS(RELATIONSHIPS value) {
        this.relationships = value;
    }

    /**
     * Gets the value of the servicerreporting property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICERREPORTING }
     *     
     */
    public SERVICERREPORTING getSERVICERREPORTING() {
        return servicerreporting;
    }

    /**
     * Sets the value of the servicerreporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICERREPORTING }
     *     
     */
    public void setSERVICERREPORTING(SERVICERREPORTING value) {
        this.servicerreporting = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DEALSETEXTENSION }
     *     
     */
    public DEALSETEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEALSETEXTENSION }
     *     
     */
    public void setEXTENSION(DEALSETEXTENSION value) {
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