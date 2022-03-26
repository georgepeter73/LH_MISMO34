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
 * <p>Java class for ROLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="APPRAISER" type="{http://www.mismo.org/residential/2009/schemas}APPRAISER" minOccurs="0"/>
 *           &lt;element name="APPRAISER_SUPERVISOR" type="{http://www.mismo.org/residential/2009/schemas}APPRAISER_SUPERVISOR" minOccurs="0"/>
 *           &lt;element name="ATTORNEY" type="{http://www.mismo.org/residential/2009/schemas}ATTORNEY" minOccurs="0"/>
 *           &lt;element name="ATTORNEY_IN_FACT" type="{http://www.mismo.org/residential/2009/schemas}ATTORNEY_IN_FACT" minOccurs="0"/>
 *           &lt;element name="BORROWER" type="{http://www.mismo.org/residential/2009/schemas}BORROWER" minOccurs="0"/>
 *           &lt;element name="CLOSING_AGENT" type="{http://www.mismo.org/residential/2009/schemas}CLOSING_AGENT" minOccurs="0"/>
 *           &lt;element name="DEFENDANT" type="{http://www.mismo.org/residential/2009/schemas}DEFENDANT" minOccurs="0"/>
 *           &lt;element name="FULFILLMENT_PARTY" type="{http://www.mismo.org/residential/2009/schemas}FULFILLMENT_PARTY" minOccurs="0"/>
 *           &lt;element name="HOUSING_COUNSELING_AGENCY" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_COUNSELING_AGENCY" minOccurs="0"/>
 *           &lt;element name="LENDER" type="{http://www.mismo.org/residential/2009/schemas}LENDER" minOccurs="0"/>
 *           &lt;element name="LIEN_HOLDER" type="{http://www.mismo.org/residential/2009/schemas}LIEN_HOLDER" minOccurs="0"/>
 *           &lt;element name="LOAN_ORIGINATOR" type="{http://www.mismo.org/residential/2009/schemas}LOAN_ORIGINATOR" minOccurs="0"/>
 *           &lt;element name="LOSS_PAYEE" type="{http://www.mismo.org/residential/2009/schemas}LOSS_PAYEE" minOccurs="0"/>
 *           &lt;element name="NOTARY" type="{http://www.mismo.org/residential/2009/schemas}NOTARY" minOccurs="0"/>
 *           &lt;element name="PAYEE" type="{http://www.mismo.org/residential/2009/schemas}PAYEE" minOccurs="0"/>
 *           &lt;element name="PLAINTIFF" type="{http://www.mismo.org/residential/2009/schemas}PLAINTIFF" minOccurs="0"/>
 *           &lt;element name="PROPERTY_OWNER" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_OWNER" minOccurs="0"/>
 *           &lt;element name="PROPERTY_SELLER" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_SELLER" minOccurs="0"/>
 *           &lt;element name="REAL_ESTATE_AGENT" type="{http://www.mismo.org/residential/2009/schemas}REAL_ESTATE_AGENT" minOccurs="0"/>
 *           &lt;element name="REGULATORY_AGENCY" type="{http://www.mismo.org/residential/2009/schemas}REGULATORY_AGENCY" minOccurs="0"/>
 *           &lt;element name="REQUESTING_PARTY" type="{http://www.mismo.org/residential/2009/schemas}REQUESTING_PARTY" minOccurs="0"/>
 *           &lt;element name="RESPONDING_PARTY" type="{http://www.mismo.org/residential/2009/schemas}RESPONDING_PARTY" minOccurs="0"/>
 *           &lt;element name="RETURN_TO" type="{http://www.mismo.org/residential/2009/schemas}RETURN_TO" minOccurs="0"/>
 *           &lt;element name="REVIEW_APPRAISER" type="{http://www.mismo.org/residential/2009/schemas}REVIEW_APPRAISER" minOccurs="0"/>
 *           &lt;element name="SERVICE_PROVIDER" type="{http://www.mismo.org/residential/2009/schemas}SERVICE_PROVIDER" minOccurs="0"/>
 *           &lt;element name="SERVICER" type="{http://www.mismo.org/residential/2009/schemas}SERVICER" minOccurs="0"/>
 *           &lt;element name="SERVICING_TRANSFEROR" type="{http://www.mismo.org/residential/2009/schemas}SERVICING_TRANSFEROR" minOccurs="0"/>
 *           &lt;element name="SUBMITTING_PARTY" type="{http://www.mismo.org/residential/2009/schemas}SUBMITTING_PARTY" minOccurs="0"/>
 *           &lt;element name="TRUST" type="{http://www.mismo.org/residential/2009/schemas}TRUST" minOccurs="0"/>
 *           &lt;element name="TRUSTEE" type="{http://www.mismo.org/residential/2009/schemas}TRUSTEE" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="LICENSES" type="{http://www.mismo.org/residential/2009/schemas}LICENSES" minOccurs="0"/>
 *         &lt;element name="PARTY_ROLE_IDENTIFIERS" type="{http://www.mismo.org/residential/2009/schemas}PARTY_ROLE_IDENTIFIERS" minOccurs="0"/>
 *         &lt;element name="ROLE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}ROLE_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ROLE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ROLE", propOrder = {
    "appraiser",
    "appraisersupervisor",
    "attorney",
    "attorneyinfact",
    "borrower",
    "closingagent",
    "defendant",
    "fulfillmentparty",
    "housingcounselingagency",
    "lender",
    "lienholder",
    "loanoriginator",
    "losspayee",
    "notary",
    "payee",
    "plaintiff",
    "propertyowner",
    "propertyseller",
    "realestateagent",
    "regulatoryagency",
    "requestingparty",
    "respondingparty",
    "returnto",
    "reviewappraiser",
    "serviceprovider",
    "servicer",
    "servicingtransferor",
    "submittingparty",
    "trust",
    "trustee",
    "licenses",
    "partyroleidentifiers",
    "roledetail",
    "extension"
})
public class ROLE {

    @XmlElement(name = "APPRAISER")
    protected APPRAISER appraiser;
    @XmlElement(name = "APPRAISER_SUPERVISOR")
    protected APPRAISERSUPERVISOR appraisersupervisor;
    @XmlElement(name = "ATTORNEY")
    protected ATTORNEY attorney;
    @XmlElement(name = "ATTORNEY_IN_FACT")
    protected ATTORNEYINFACT attorneyinfact;
    @XmlElement(name = "BORROWER")
    protected BORROWER borrower;
    @XmlElement(name = "CLOSING_AGENT")
    protected CLOSINGAGENT closingagent;
    @XmlElement(name = "DEFENDANT")
    protected DEFENDANT defendant;
    @XmlElement(name = "FULFILLMENT_PARTY")
    protected FULFILLMENTPARTY fulfillmentparty;
    @XmlElement(name = "HOUSING_COUNSELING_AGENCY")
    protected HOUSINGCOUNSELINGAGENCY housingcounselingagency;
    @XmlElement(name = "LENDER")
    protected LENDER lender;
    @XmlElement(name = "LIEN_HOLDER")
    protected LIENHOLDER lienholder;
    @XmlElement(name = "LOAN_ORIGINATOR")
    protected LOANORIGINATOR loanoriginator;
    @XmlElement(name = "LOSS_PAYEE")
    protected LOSSPAYEE losspayee;
    @XmlElement(name = "NOTARY")
    protected NOTARY notary;
    @XmlElement(name = "PAYEE")
    protected PAYEE payee;
    @XmlElement(name = "PLAINTIFF")
    protected PLAINTIFF plaintiff;
    @XmlElement(name = "PROPERTY_OWNER")
    protected PROPERTYOWNER propertyowner;
    @XmlElement(name = "PROPERTY_SELLER")
    protected PROPERTYSELLER propertyseller;
    @XmlElement(name = "REAL_ESTATE_AGENT")
    protected REALESTATEAGENT realestateagent;
    @XmlElement(name = "REGULATORY_AGENCY")
    protected REGULATORYAGENCY regulatoryagency;
    @XmlElement(name = "REQUESTING_PARTY")
    protected REQUESTINGPARTY requestingparty;
    @XmlElement(name = "RESPONDING_PARTY")
    protected RESPONDINGPARTY respondingparty;
    @XmlElement(name = "RETURN_TO")
    protected RETURNTO returnto;
    @XmlElement(name = "REVIEW_APPRAISER")
    protected REVIEWAPPRAISER reviewappraiser;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected SERVICEPROVIDER serviceprovider;
    @XmlElement(name = "SERVICER")
    protected SERVICER servicer;
    @XmlElement(name = "SERVICING_TRANSFEROR")
    protected SERVICINGTRANSFEROR servicingtransferor;
    @XmlElement(name = "SUBMITTING_PARTY")
    protected SUBMITTINGPARTY submittingparty;
    @XmlElement(name = "TRUST")
    protected TRUST trust;
    @XmlElement(name = "TRUSTEE")
    protected TRUSTEE trustee;
    @XmlElement(name = "LICENSES")
    protected LICENSES licenses;
    @XmlElement(name = "PARTY_ROLE_IDENTIFIERS")
    protected PARTYROLEIDENTIFIERS partyroleidentifiers;
    @XmlElement(name = "ROLE_DETAIL")
    protected ROLEDETAIL roledetail;
    @XmlElement(name = "EXTENSION")
    protected ROLEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraiser property.
     * 
     * @return
     *     possible object is
     *     {@link APPRAISER }
     *     
     */
    public APPRAISER getAPPRAISER() {
        return appraiser;
    }

    /**
     * Sets the value of the appraiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPRAISER }
     *     
     */
    public void setAPPRAISER(APPRAISER value) {
        this.appraiser = value;
    }

    /**
     * Gets the value of the appraisersupervisor property.
     * 
     * @return
     *     possible object is
     *     {@link APPRAISERSUPERVISOR }
     *     
     */
    public APPRAISERSUPERVISOR getAPPRAISERSUPERVISOR() {
        return appraisersupervisor;
    }

    /**
     * Sets the value of the appraisersupervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPRAISERSUPERVISOR }
     *     
     */
    public void setAPPRAISERSUPERVISOR(APPRAISERSUPERVISOR value) {
        this.appraisersupervisor = value;
    }

    /**
     * Gets the value of the attorney property.
     * 
     * @return
     *     possible object is
     *     {@link ATTORNEY }
     *     
     */
    public ATTORNEY getATTORNEY() {
        return attorney;
    }

    /**
     * Sets the value of the attorney property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATTORNEY }
     *     
     */
    public void setATTORNEY(ATTORNEY value) {
        this.attorney = value;
    }

    /**
     * Gets the value of the attorneyinfact property.
     * 
     * @return
     *     possible object is
     *     {@link ATTORNEYINFACT }
     *     
     */
    public ATTORNEYINFACT getATTORNEYINFACT() {
        return attorneyinfact;
    }

    /**
     * Sets the value of the attorneyinfact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATTORNEYINFACT }
     *     
     */
    public void setATTORNEYINFACT(ATTORNEYINFACT value) {
        this.attorneyinfact = value;
    }

    /**
     * Gets the value of the borrower property.
     * 
     * @return
     *     possible object is
     *     {@link BORROWER }
     *     
     */
    public BORROWER getBORROWER() {
        return borrower;
    }

    /**
     * Sets the value of the borrower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BORROWER }
     *     
     */
    public void setBORROWER(BORROWER value) {
        this.borrower = value;
    }

    /**
     * Gets the value of the closingagent property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSINGAGENT }
     *     
     */
    public CLOSINGAGENT getCLOSINGAGENT() {
        return closingagent;
    }

    /**
     * Sets the value of the closingagent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSINGAGENT }
     *     
     */
    public void setCLOSINGAGENT(CLOSINGAGENT value) {
        this.closingagent = value;
    }

    /**
     * Gets the value of the defendant property.
     * 
     * @return
     *     possible object is
     *     {@link DEFENDANT }
     *     
     */
    public DEFENDANT getDEFENDANT() {
        return defendant;
    }

    /**
     * Sets the value of the defendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFENDANT }
     *     
     */
    public void setDEFENDANT(DEFENDANT value) {
        this.defendant = value;
    }

    /**
     * Gets the value of the fulfillmentparty property.
     * 
     * @return
     *     possible object is
     *     {@link FULFILLMENTPARTY }
     *     
     */
    public FULFILLMENTPARTY getFULFILLMENTPARTY() {
        return fulfillmentparty;
    }

    /**
     * Sets the value of the fulfillmentparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FULFILLMENTPARTY }
     *     
     */
    public void setFULFILLMENTPARTY(FULFILLMENTPARTY value) {
        this.fulfillmentparty = value;
    }

    /**
     * Gets the value of the housingcounselingagency property.
     * 
     * @return
     *     possible object is
     *     {@link HOUSINGCOUNSELINGAGENCY }
     *     
     */
    public HOUSINGCOUNSELINGAGENCY getHOUSINGCOUNSELINGAGENCY() {
        return housingcounselingagency;
    }

    /**
     * Sets the value of the housingcounselingagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOUSINGCOUNSELINGAGENCY }
     *     
     */
    public void setHOUSINGCOUNSELINGAGENCY(HOUSINGCOUNSELINGAGENCY value) {
        this.housingcounselingagency = value;
    }

    /**
     * Gets the value of the lender property.
     * 
     * @return
     *     possible object is
     *     {@link LENDER }
     *     
     */
    public LENDER getLENDER() {
        return lender;
    }

    /**
     * Sets the value of the lender property.
     * 
     * @param value
     *     allowed object is
     *     {@link LENDER }
     *     
     */
    public void setLENDER(LENDER value) {
        this.lender = value;
    }

    /**
     * Gets the value of the lienholder property.
     * 
     * @return
     *     possible object is
     *     {@link LIENHOLDER }
     *     
     */
    public LIENHOLDER getLIENHOLDER() {
        return lienholder;
    }

    /**
     * Sets the value of the lienholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIENHOLDER }
     *     
     */
    public void setLIENHOLDER(LIENHOLDER value) {
        this.lienholder = value;
    }

    /**
     * Gets the value of the loanoriginator property.
     * 
     * @return
     *     possible object is
     *     {@link LOANORIGINATOR }
     *     
     */
    public LOANORIGINATOR getLOANORIGINATOR() {
        return loanoriginator;
    }

    /**
     * Sets the value of the loanoriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANORIGINATOR }
     *     
     */
    public void setLOANORIGINATOR(LOANORIGINATOR value) {
        this.loanoriginator = value;
    }

    /**
     * Gets the value of the losspayee property.
     * 
     * @return
     *     possible object is
     *     {@link LOSSPAYEE }
     *     
     */
    public LOSSPAYEE getLOSSPAYEE() {
        return losspayee;
    }

    /**
     * Sets the value of the losspayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOSSPAYEE }
     *     
     */
    public void setLOSSPAYEE(LOSSPAYEE value) {
        this.losspayee = value;
    }

    /**
     * Gets the value of the notary property.
     * 
     * @return
     *     possible object is
     *     {@link NOTARY }
     *     
     */
    public NOTARY getNOTARY() {
        return notary;
    }

    /**
     * Sets the value of the notary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTARY }
     *     
     */
    public void setNOTARY(NOTARY value) {
        this.notary = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link PAYEE }
     *     
     */
    public PAYEE getPAYEE() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYEE }
     *     
     */
    public void setPAYEE(PAYEE value) {
        this.payee = value;
    }

    /**
     * Gets the value of the plaintiff property.
     * 
     * @return
     *     possible object is
     *     {@link PLAINTIFF }
     *     
     */
    public PLAINTIFF getPLAINTIFF() {
        return plaintiff;
    }

    /**
     * Sets the value of the plaintiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLAINTIFF }
     *     
     */
    public void setPLAINTIFF(PLAINTIFF value) {
        this.plaintiff = value;
    }

    /**
     * Gets the value of the propertyowner property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYOWNER }
     *     
     */
    public PROPERTYOWNER getPROPERTYOWNER() {
        return propertyowner;
    }

    /**
     * Sets the value of the propertyowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYOWNER }
     *     
     */
    public void setPROPERTYOWNER(PROPERTYOWNER value) {
        this.propertyowner = value;
    }

    /**
     * Gets the value of the propertyseller property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYSELLER }
     *     
     */
    public PROPERTYSELLER getPROPERTYSELLER() {
        return propertyseller;
    }

    /**
     * Sets the value of the propertyseller property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYSELLER }
     *     
     */
    public void setPROPERTYSELLER(PROPERTYSELLER value) {
        this.propertyseller = value;
    }

    /**
     * Gets the value of the realestateagent property.
     * 
     * @return
     *     possible object is
     *     {@link REALESTATEAGENT }
     *     
     */
    public REALESTATEAGENT getREALESTATEAGENT() {
        return realestateagent;
    }

    /**
     * Sets the value of the realestateagent property.
     * 
     * @param value
     *     allowed object is
     *     {@link REALESTATEAGENT }
     *     
     */
    public void setREALESTATEAGENT(REALESTATEAGENT value) {
        this.realestateagent = value;
    }

    /**
     * Gets the value of the regulatoryagency property.
     * 
     * @return
     *     possible object is
     *     {@link REGULATORYAGENCY }
     *     
     */
    public REGULATORYAGENCY getREGULATORYAGENCY() {
        return regulatoryagency;
    }

    /**
     * Sets the value of the regulatoryagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link REGULATORYAGENCY }
     *     
     */
    public void setREGULATORYAGENCY(REGULATORYAGENCY value) {
        this.regulatoryagency = value;
    }

    /**
     * Gets the value of the requestingparty property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTINGPARTY }
     *     
     */
    public REQUESTINGPARTY getREQUESTINGPARTY() {
        return requestingparty;
    }

    /**
     * Sets the value of the requestingparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTINGPARTY }
     *     
     */
    public void setREQUESTINGPARTY(REQUESTINGPARTY value) {
        this.requestingparty = value;
    }

    /**
     * Gets the value of the respondingparty property.
     * 
     * @return
     *     possible object is
     *     {@link RESPONDINGPARTY }
     *     
     */
    public RESPONDINGPARTY getRESPONDINGPARTY() {
        return respondingparty;
    }

    /**
     * Sets the value of the respondingparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPONDINGPARTY }
     *     
     */
    public void setRESPONDINGPARTY(RESPONDINGPARTY value) {
        this.respondingparty = value;
    }

    /**
     * Gets the value of the returnto property.
     * 
     * @return
     *     possible object is
     *     {@link RETURNTO }
     *     
     */
    public RETURNTO getRETURNTO() {
        return returnto;
    }

    /**
     * Sets the value of the returnto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RETURNTO }
     *     
     */
    public void setRETURNTO(RETURNTO value) {
        this.returnto = value;
    }

    /**
     * Gets the value of the reviewappraiser property.
     * 
     * @return
     *     possible object is
     *     {@link REVIEWAPPRAISER }
     *     
     */
    public REVIEWAPPRAISER getREVIEWAPPRAISER() {
        return reviewappraiser;
    }

    /**
     * Sets the value of the reviewappraiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link REVIEWAPPRAISER }
     *     
     */
    public void setREVIEWAPPRAISER(REVIEWAPPRAISER value) {
        this.reviewappraiser = value;
    }

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICEPROVIDER }
     *     
     */
    public SERVICEPROVIDER getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICEPROVIDER }
     *     
     */
    public void setSERVICEPROVIDER(SERVICEPROVIDER value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the servicer property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICER }
     *     
     */
    public SERVICER getSERVICER() {
        return servicer;
    }

    /**
     * Sets the value of the servicer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICER }
     *     
     */
    public void setSERVICER(SERVICER value) {
        this.servicer = value;
    }

    /**
     * Gets the value of the servicingtransferor property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICINGTRANSFEROR }
     *     
     */
    public SERVICINGTRANSFEROR getSERVICINGTRANSFEROR() {
        return servicingtransferor;
    }

    /**
     * Sets the value of the servicingtransferor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICINGTRANSFEROR }
     *     
     */
    public void setSERVICINGTRANSFEROR(SERVICINGTRANSFEROR value) {
        this.servicingtransferor = value;
    }

    /**
     * Gets the value of the submittingparty property.
     * 
     * @return
     *     possible object is
     *     {@link SUBMITTINGPARTY }
     *     
     */
    public SUBMITTINGPARTY getSUBMITTINGPARTY() {
        return submittingparty;
    }

    /**
     * Sets the value of the submittingparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBMITTINGPARTY }
     *     
     */
    public void setSUBMITTINGPARTY(SUBMITTINGPARTY value) {
        this.submittingparty = value;
    }

    /**
     * Gets the value of the trust property.
     * 
     * @return
     *     possible object is
     *     {@link TRUST }
     *     
     */
    public TRUST getTRUST() {
        return trust;
    }

    /**
     * Sets the value of the trust property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRUST }
     *     
     */
    public void setTRUST(TRUST value) {
        this.trust = value;
    }

    /**
     * Gets the value of the trustee property.
     * 
     * @return
     *     possible object is
     *     {@link TRUSTEE }
     *     
     */
    public TRUSTEE getTRUSTEE() {
        return trustee;
    }

    /**
     * Sets the value of the trustee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRUSTEE }
     *     
     */
    public void setTRUSTEE(TRUSTEE value) {
        this.trustee = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link LICENSES }
     *     
     */
    public LICENSES getLICENSES() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LICENSES }
     *     
     */
    public void setLICENSES(LICENSES value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the partyroleidentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link PARTYROLEIDENTIFIERS }
     *     
     */
    public PARTYROLEIDENTIFIERS getPARTYROLEIDENTIFIERS() {
        return partyroleidentifiers;
    }

    /**
     * Sets the value of the partyroleidentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTYROLEIDENTIFIERS }
     *     
     */
    public void setPARTYROLEIDENTIFIERS(PARTYROLEIDENTIFIERS value) {
        this.partyroleidentifiers = value;
    }

    /**
     * Gets the value of the roledetail property.
     * 
     * @return
     *     possible object is
     *     {@link ROLEDETAIL }
     *     
     */
    public ROLEDETAIL getROLEDETAIL() {
        return roledetail;
    }

    /**
     * Sets the value of the roledetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROLEDETAIL }
     *     
     */
    public void setROLEDETAIL(ROLEDETAIL value) {
        this.roledetail = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ROLEEXTENSION }
     *     
     */
    public ROLEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROLEEXTENSION }
     *     
     */
    public void setEXTENSION(ROLEEXTENSION value) {
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
