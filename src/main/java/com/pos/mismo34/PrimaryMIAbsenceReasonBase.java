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
 * <p>Java class for PrimaryMIAbsenceReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimaryMIAbsenceReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CharterParticipation"/>
 *     &lt;enumeration value="DelinquencyDisposition"/>
 *     &lt;enumeration value="InvestorPurchasedMortgageInsurance"/>
 *     &lt;enumeration value="MICanceledBasedOnCurrentLTV"/>
 *     &lt;enumeration value="NoMIBasedOnOriginalLTV"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PledgedAsset"/>
 *     &lt;enumeration value="PoolCoverage"/>
 *     &lt;enumeration value="Repurchase"/>
 *     &lt;enumeration value="SelfInsured"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimaryMIAbsenceReasonBase")
@XmlEnum
public enum PrimaryMIAbsenceReasonBase {

    @XmlEnumValue("CharterParticipation")
    CHARTER_PARTICIPATION("CharterParticipation"),
    @XmlEnumValue("DelinquencyDisposition")
    DELINQUENCY_DISPOSITION("DelinquencyDisposition"),
    @XmlEnumValue("InvestorPurchasedMortgageInsurance")
    INVESTOR_PURCHASED_MORTGAGE_INSURANCE("InvestorPurchasedMortgageInsurance"),
    @XmlEnumValue("MICanceledBasedOnCurrentLTV")
    MI_CANCELED_BASED_ON_CURRENT_LTV("MICanceledBasedOnCurrentLTV"),
    @XmlEnumValue("NoMIBasedOnOriginalLTV")
    NO_MI_BASED_ON_ORIGINAL_LTV("NoMIBasedOnOriginalLTV"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PledgedAsset")
    PLEDGED_ASSET("PledgedAsset"),
    @XmlEnumValue("PoolCoverage")
    POOL_COVERAGE("PoolCoverage"),
    @XmlEnumValue("Repurchase")
    REPURCHASE("Repurchase"),
    @XmlEnumValue("SelfInsured")
    SELF_INSURED("SelfInsured");
    private final String value;

    PrimaryMIAbsenceReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimaryMIAbsenceReasonBase fromValue(String v) {
        for (PrimaryMIAbsenceReasonBase c: PrimaryMIAbsenceReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
