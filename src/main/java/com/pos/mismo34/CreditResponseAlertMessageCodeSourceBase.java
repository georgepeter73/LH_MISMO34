//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditResponseAlertMessageCodeSourceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditResponseAlertMessageCodeSourceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EquifaxFraudVictimAlert"/>
 *     &lt;enumeration value="EquifaxHitNoHitDesignator"/>
 *     &lt;enumeration value="EquifaxOFAC"/>
 *     &lt;enumeration value="EquifaxSafescan"/>
 *     &lt;enumeration value="ExperianFraudServicesIndicator"/>
 *     &lt;enumeration value="ExperianMessage"/>
 *     &lt;enumeration value="ExperianStatementType"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TransUnionAuthorizedUser"/>
 *     &lt;enumeration value="TransUnionFileHit"/>
 *     &lt;enumeration value="TransUnionFraudVictimAlert"/>
 *     &lt;enumeration value="TransUnionHighRiskFraudAlert"/>
 *     &lt;enumeration value="TransUnionIdentifierMismatchAlert"/>
 *     &lt;enumeration value="TransUnionOFAC"/>
 *     &lt;enumeration value="TransUnionSuppressionIndicator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditResponseAlertMessageCodeSourceBase")
@XmlEnum
public enum CreditResponseAlertMessageCodeSourceBase {


    /**
     * Code List Found In: Equifax STS V5/V6 Attachment 1 – Fraud Victim/Alert Indicators. Data Source: Header Segment (FULL Record) / Fraud Victim/Alert Indicator Code.
     * 
     */
    @XmlEnumValue("EquifaxFraudVictimAlert")
    EQUIFAX_FRAUD_VICTIM_ALERT("EquifaxFraudVictimAlert"),

    /**
     * Code List Found In: Equifax STS V5/V6 Guide / Attachment 1 – Hit/No-Hit Designator Codes. Data Source: Header Segment (FULL Record) / Hit/No-Hit Designator Code.
     * 
     */
    @XmlEnumValue("EquifaxHitNoHitDesignator")
    EQUIFAX_HIT_NO_HIT_DESIGNATOR("EquifaxHitNoHitDesignator"),

    /**
     * Code List Found In: Equifax STS V5/V6 Guide / OFAC Alert Notes (4). Data Source: Segment 59 (CD Record) / Match Codes.
     * 
     */
    @XmlEnumValue("EquifaxOFAC")
    EQUIFAX_OFAC("EquifaxOFAC"),

    /**
     * Code List Found In: Equifax STS V5/V6 Attachment 7 – SAFESCAN Codes. Data Source: Header Segment (FULL Record) / SAFESCAN Codes.
     * 
     */
    @XmlEnumValue("EquifaxSafescan")
    EQUIFAX_SAFESCAN("EquifaxSafescan"),

    /**
     * Code List Found In: Experian File One Appendix F – Fraud Services Indicators. Data Source: 382 Segment - C4 Sub-segment / Indicator 1, 2, 3, 4.
     * 
     */
    @XmlEnumValue("ExperianFraudServicesIndicator")
    EXPERIAN_FRAUD_SERVICES_INDICATOR("ExperianFraudServicesIndicator"),

    /**
     * Code List Found In: Experian File One Appendix O – Message Codes. Data Source: 361 Segment / Message Code.
     * 
     */
    @XmlEnumValue("ExperianMessage")
    EXPERIAN_MESSAGE("ExperianMessage"),

    /**
     * Code List Found In: Experian File One Appendix P – Statement Type Codes. Data Source: 365 Segment / Type Code.
     * 
     */
    @XmlEnumValue("ExperianStatementType")
    EXPERIAN_STATEMENT_TYPE("ExperianStatementType"),

    /**
     * Code List is from another source that is identified in Alert Message Code Source Type Other Description.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide - Chapter 6 Add-on Services – Authorized User Alert – Code 07014 - Fixed Format Response Note 1 (Authorized User Alert Search Status codes). Data Source: AO01 Add-on Status Segment / Search Status Code.
     * 
     */
    @XmlEnumValue("TransUnionAuthorizedUser")
    TRANS_UNION_AUTHORIZED_USER("TransUnionAuthorizedUser"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide - Chapter 3 SH01 Segment – File Hit Codes. Data Source: SH01 Segment / File Hit Codes.
     * 
     */
    @XmlEnumValue("TransUnionFileHit")
    TRANS_UNION_FILE_HIT("TransUnionFileHit"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide - Chapter 3 CS01 Segment – Content Type Codes. Data Source: CS01 Segment / Content Type Codes.
     * 
     */
    @XmlEnumValue("TransUnionFraudVictimAlert")
    TRANS_UNION_FRAUD_VICTIM_ALERT("TransUnionFraudVictimAlert"),

    /**
     * Code List Found In: Trans Union  4.0 User Guide - Chapter 6 Add-on Services – High Risk Fraud Alert Service – Code 06500. Data Source: QH01, MC01, DC01, YI01 or MT01 Segments – Message Code.
     * 
     */
    @XmlEnumValue("TransUnionHighRiskFraudAlert")
    TRANS_UNION_HIGH_RISK_FRAUD_ALERT("TransUnionHighRiskFraudAlert"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide - Chapter 6 Add-on Services – ID Mismatch Alert Service – Code 06400. Data Source: TA01 segment – Message Type Code.
     * 
     */
    @XmlEnumValue("TransUnionIdentifierMismatchAlert")
    TRANS_UNION_IDENTIFIER_MISMATCH_ALERT("TransUnionIdentifierMismatchAlert"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide - Chapter 6 Add-on Services – OFAC Name Screen – Code 06800 – Fixed Format Response Note 1 (OFAC Name Screen Search Status). Data Source: OFAC Name Screen 06800 – Search Status Codes returned in segment AO01.
     * 
     */
    @XmlEnumValue("TransUnionOFAC")
    TRANS_UNION_OFAC("TransUnionOFAC"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide - Chapter 3 SH01 Segment – Suppression Indicator Codes. Data Source: SH01 Segment / Suppression Indicator Codes.
     * 
     */
    @XmlEnumValue("TransUnionSuppressionIndicator")
    TRANS_UNION_SUPPRESSION_INDICATOR("TransUnionSuppressionIndicator");
    private final String value;

    CreditResponseAlertMessageCodeSourceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditResponseAlertMessageCodeSourceBase fromValue(String v) {
        for (CreditResponseAlertMessageCodeSourceBase c: CreditResponseAlertMessageCodeSourceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
