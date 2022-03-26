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
 * <p>Java class for ForeclosureProcedureTerminatedReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeclosureProcedureTerminatedReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ActiveMilitaryIndulgence"/>
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="ChargedOff"/>
 *     &lt;enumeration value="CourtOrdered"/>
 *     &lt;enumeration value="FundsApplied"/>
 *     &lt;enumeration value="HazardClaimOrPropertyDamage"/>
 *     &lt;enumeration value="LossMitigation"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PaidInFull"/>
 *     &lt;enumeration value="Redeemed"/>
 *     &lt;enumeration value="Reinstated"/>
 *     &lt;enumeration value="ServicingTransfer"/>
 *     &lt;enumeration value="StartedInError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForeclosureProcedureTerminatedReasonBase")
@XmlEnum
public enum ForeclosureProcedureTerminatedReasonBase {


    /**
     * SCRA rules dictate cessation of foreclosure activity.
     * 
     */
    @XmlEnumValue("ActiveMilitaryIndulgence")
    ACTIVE_MILITARY_INDULGENCE("ActiveMilitaryIndulgence"),

    /**
     * The borrower has filed for bankruptcy under Chapter 7, 11, 12 or 13 of the Federal Bankruptcy Act.
     * 
     */
    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),

    /**
     * It is not in the best interest of the investor to pursue collection efforts or legal actions against the borrower because of a reduced value for the property, a low outstanding mortgage balance, or the presence of certain environmental hazards on the property.
     * 
     */
    @XmlEnumValue("ChargedOff")
    CHARGED_OFF("ChargedOff"),

    /**
     * A court of law has ordered  that the servicer cease all foreclosure actions.
     * 
     */
    @XmlEnumValue("CourtOrdered")
    COURT_ORDERED("CourtOrdered"),

    /**
     * The servicer accepted funds and applied it as a full or partial payment to the account.
     * 
     */
    @XmlEnumValue("FundsApplied")
    FUNDS_APPLIED("FundsApplied"),

    /**
     * Hazard Claim outstanding or Property Damage results in distressed value of property.
     * 
     */
    @XmlEnumValue("HazardClaimOrPropertyDamage")
    HAZARD_CLAIM_OR_PROPERTY_DAMAGE("HazardClaimOrPropertyDamage"),

    /**
     * It is in the best interest of the investor to pursue a loss mitigation effort, such as a short sale, deed-in-lieu, modification, or repayment plan.
     * 
     */
    @XmlEnumValue("LossMitigation")
    LOSS_MITIGATION("LossMitigation"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The loan has been paid in full.
     * 
     */
    @XmlEnumValue("PaidInFull")
    PAID_IN_FULL("PaidInFull"),

    /**
     * The borrower has paid the outstanding mortgage balance and paid the costs incurred in the foreclosure process during the redemption period.
     * 
     */
    @XmlEnumValue("Redeemed")
    REDEEMED("Redeemed"),

    /**
     * The borrower has brought the loan payments current and paid all fees, expenses and late charges.
     * 
     */
    @XmlEnumValue("Reinstated")
    REINSTATED("Reinstated"),

    /**
     * Loan transferred to another servicer therefore the reporting servicer is no longer the plaintiff.
     * 
     */
    @XmlEnumValue("ServicingTransfer")
    SERVICING_TRANSFER("ServicingTransfer"),

    /**
     * The foreclosure procedure was started in error.
     * 
     */
    @XmlEnumValue("StartedInError")
    STARTED_IN_ERROR("StartedInError");
    private final String value;

    ForeclosureProcedureTerminatedReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeclosureProcedureTerminatedReasonBase fromValue(String v) {
        for (ForeclosureProcedureTerminatedReasonBase c: ForeclosureProcedureTerminatedReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
