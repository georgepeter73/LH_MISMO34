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
 * <p>Java class for MonetaryEventBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonetaryEventBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BalloonPayment"/>
 *     &lt;enumeration value="CurtailmentToFirstYearChargesSetAside"/>
 *     &lt;enumeration value="CurtailmentToLineOfCredit"/>
 *     &lt;enumeration value="CurtailmentToRepairSetAside"/>
 *     &lt;enumeration value="CurtailmentToTaxAndInsuranceSetAside"/>
 *     &lt;enumeration value="Draw"/>
 *     &lt;enumeration value="FinalDraw"/>
 *     &lt;enumeration value="FinalDrawWithEarlyConversion"/>
 *     &lt;enumeration value="FinalDrawWithPaydown"/>
 *     &lt;enumeration value="FinalDrawWithPaydownAndEarlyConversion"/>
 *     &lt;enumeration value="FirstYearPropertyChargesFinal"/>
 *     &lt;enumeration value="FirstYearPropertyChargesNotFinal"/>
 *     &lt;enumeration value="LineOfCreditForAppraisal"/>
 *     &lt;enumeration value="LineOfCreditToPreventLien"/>
 *     &lt;enumeration value="NonBorrowerFundsRemitted"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="PrincipalCurtailment"/>
 *     &lt;enumeration value="RepairSetAsideFinal"/>
 *     &lt;enumeration value="RepairSetAsideNotFinal"/>
 *     &lt;enumeration value="TaxAndInsuranceSetAside"/>
 *     &lt;enumeration value="TrialPayment"/>
 *     &lt;enumeration value="UnscheduledDraw"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonetaryEventBase")
@XmlEnum
public enum MonetaryEventBase {


    /**
     * A scheduled payment on a mortgage that is larger than other periodic payments but where the loan obligation is not fully satisfied.
     * 
     */
    @XmlEnumValue("BalloonPayment")
    BALLOON_PAYMENT("BalloonPayment"),

    /**
     * A payment which reduces the outstanding amount of a reverse mortgage set aside account for first year property charges.
     * 
     */
    @XmlEnumValue("CurtailmentToFirstYearChargesSetAside")
    CURTAILMENT_TO_FIRST_YEAR_CHARGES_SET_ASIDE("CurtailmentToFirstYearChargesSetAside"),

    /**
     * A payment of additional principal not scheduled as part of the line of credit of the borrower.
     * 
     */
    @XmlEnumValue("CurtailmentToLineOfCredit")
    CURTAILMENT_TO_LINE_OF_CREDIT("CurtailmentToLineOfCredit"),

    /**
     * A payment which reduces the outstanding amount of a reverse mortgage set aside account for repairs.
     * 
     */
    @XmlEnumValue("CurtailmentToRepairSetAside")
    CURTAILMENT_TO_REPAIR_SET_ASIDE("CurtailmentToRepairSetAside"),

    /**
     * A payment which reduces the outstanding amount of a reverse mortgage set aside account for tax and insurance payments.
     * 
     */
    @XmlEnumValue("CurtailmentToTaxAndInsuranceSetAside")
    CURTAILMENT_TO_TAX_AND_INSURANCE_SET_ASIDE("CurtailmentToTaxAndInsuranceSetAside"),

    /**
     * A regular draw from the line of credit of the borrower.
     * 
     */
    @XmlEnumValue("Draw")
    DRAW("Draw"),

    /**
     * Last draw during the construction phase of a construction to permanent loan.
     * 
     */
    @XmlEnumValue("FinalDraw")
    FINAL_DRAW("FinalDraw"),

    /**
     * Last draw during the construction phase of a construction to permanent loan converting to a permanent loan earlier than the original scheduled conversion date.
     * 
     */
    @XmlEnumValue("FinalDrawWithEarlyConversion")
    FINAL_DRAW_WITH_EARLY_CONVERSION("FinalDrawWithEarlyConversion"),

    /**
     * Last draw during the construction phase of a construction to permanent loan with a principal paydown to the permanent loan.
     * 
     */
    @XmlEnumValue("FinalDrawWithPaydown")
    FINAL_DRAW_WITH_PAYDOWN("FinalDrawWithPaydown"),

    /**
     * Last draw during the construction phase of a construction to permanent loan converting to a permanent loan earlier than the original scheduled conversion date with a principal paydown to the permanent loan.
     * 
     */
    @XmlEnumValue("FinalDrawWithPaydownAndEarlyConversion")
    FINAL_DRAW_WITH_PAYDOWN_AND_EARLY_CONVERSION("FinalDrawWithPaydownAndEarlyConversion"),

    /**
     * The final advancement of funds from that portion of a reverse mortgage of a borrower set aside account for first year property charges.
     * 
     */
    @XmlEnumValue("FirstYearPropertyChargesFinal")
    FIRST_YEAR_PROPERTY_CHARGES_FINAL("FirstYearPropertyChargesFinal"),

    /**
     * Funds advanced from the portion of the reverse mortgage of a borrower set aside account for first year property charges.
     * 
     */
    @XmlEnumValue("FirstYearPropertyChargesNotFinal")
    FIRST_YEAR_PROPERTY_CHARGES_NOT_FINAL("FirstYearPropertyChargesNotFinal"),

    /**
     * Funds advanced from the line of credit of the borrowers that is associated with a reverse mortgage set aside for appraisal fees.
     * 
     */
    @XmlEnumValue("LineOfCreditForAppraisal")
    LINE_OF_CREDIT_FOR_APPRAISAL("LineOfCreditForAppraisal"),

    /**
     * Funds advanced from the line of credit of the borrowers that is associated with a reverse mortgage assigned to prevent a lien against the property.
     * 
     */
    @XmlEnumValue("LineOfCreditToPreventLien")
    LINE_OF_CREDIT_TO_PREVENT_LIEN("LineOfCreditToPreventLien"),

    /**
     * Funds from a source other than the borrower. Typically this would be associated with a repurchase or a foreclosure liquidation.
     * 
     */
    @XmlEnumValue("NonBorrowerFundsRemitted")
    NON_BORROWER_FUNDS_REMITTED("NonBorrowerFundsRemitted"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Principal and or interest payment.
     * 
     */
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),

    /**
     * A payment of additional principal not scheduled as part of a normal monthly installment.
     * 
     */
    @XmlEnumValue("PrincipalCurtailment")
    PRINCIPAL_CURTAILMENT("PrincipalCurtailment"),

    /**
     * The final advancement of funds to the  borrower from that portion of a reverse mortgage set aside account for repairs.
     * 
     */
    @XmlEnumValue("RepairSetAsideFinal")
    REPAIR_SET_ASIDE_FINAL("RepairSetAsideFinal"),

    /**
     * Funds advanced to a borrower from the portion of a reverse mortgage set aside account for repairs.
     * 
     */
    @XmlEnumValue("RepairSetAsideNotFinal")
    REPAIR_SET_ASIDE_NOT_FINAL("RepairSetAsideNotFinal"),

    /**
     * Funds advanced from the portion of a reverse mortgage of a borrower,set aside account for tax and insurance payments.
     * 
     */
    @XmlEnumValue("TaxAndInsuranceSetAside")
    TAX_AND_INSURANCE_SET_ASIDE("TaxAndInsuranceSetAside"),

    /**
     * A payment assocaited with a workout trail period.
     * 
     */
    @XmlEnumValue("TrialPayment")
    TRIAL_PAYMENT("TrialPayment"),

    /**
     * Unscheduled funds advanced to a borrower from the net line of credit for a reverse mortgage.
     * 
     */
    @XmlEnumValue("UnscheduledDraw")
    UNSCHEDULED_DRAW("UnscheduledDraw");
    private final String value;

    MonetaryEventBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonetaryEventBase fromValue(String v) {
        for (MonetaryEventBase c: MonetaryEventBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
