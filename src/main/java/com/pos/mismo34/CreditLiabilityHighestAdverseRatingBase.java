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
 * <p>Java class for CreditLiabilityHighestAdverseRatingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditLiabilityHighestAdverseRatingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AsAgreed"/>
 *     &lt;enumeration value="BankruptcyOrWageEarnerPlan"/>
 *     &lt;enumeration value="ChargeOff"/>
 *     &lt;enumeration value="Collection"/>
 *     &lt;enumeration value="CollectionOrChargeOff"/>
 *     &lt;enumeration value="Foreclosure"/>
 *     &lt;enumeration value="ForeclosureOrRepossession"/>
 *     &lt;enumeration value="Late30Days"/>
 *     &lt;enumeration value="Late60Days"/>
 *     &lt;enumeration value="Late90Days"/>
 *     &lt;enumeration value="LateOver120Days"/>
 *     &lt;enumeration value="NoDataAvailable"/>
 *     &lt;enumeration value="Repossession"/>
 *     &lt;enumeration value="TooNew"/>
 *     &lt;enumeration value="WageEarnerPlan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditLiabilityHighestAdverseRatingBase")
@XmlEnum
public enum CreditLiabilityHighestAdverseRatingBase {


    /**
     * Account is being paid on time and according to terms of the credit agreement.
     * 
     */
    @XmlEnumValue("AsAgreed")
    AS_AGREED("AsAgreed"),

    /**
     * The exact type could not be determined.
     * 
     */
    @XmlEnumValue("BankruptcyOrWageEarnerPlan")
    BANKRUPTCY_OR_WAGE_EARNER_PLAN("BankruptcyOrWageEarnerPlan"),

    /**
     * The account was not paid on a timely basis and the debt is being written off as uncollectible by the creditor.
     * 
     */
    @XmlEnumValue("ChargeOff")
    CHARGE_OFF("ChargeOff"),

    /**
     * Account has not been paid on a timely basis and is been turned over to an attorney or agency for collection.
     * 
     */
    @XmlEnumValue("Collection")
    COLLECTION("Collection"),

    /**
     * The exact type could not be determined.
     * 
     */
    @XmlEnumValue("CollectionOrChargeOff")
    COLLECTION_OR_CHARGE_OFF("CollectionOrChargeOff"),

    /**
     * Legal proceedings have been initiated to sell property to settle debt on an unpaid balance.
     * 
     */
    @XmlEnumValue("Foreclosure")
    FORECLOSURE("Foreclosure"),

    /**
     * The exact type could not be determined.
     * 
     */
    @XmlEnumValue("ForeclosureOrRepossession")
    FORECLOSURE_OR_REPOSSESSION("ForeclosureOrRepossession"),

    /**
     * Account is between 30 and 59 days past due.
     * 
     */
    @XmlEnumValue("Late30Days")
    LATE_30_DAYS("Late30Days"),

    /**
     * Account is between 60 and 89 days past due.
     * 
     */
    @XmlEnumValue("Late60Days")
    LATE_60_DAYS("Late60Days"),

    /**
     * Account is betwen 90 and 119 days past due.
     * 
     */
    @XmlEnumValue("Late90Days")
    LATE_90_DAYS("Late90Days"),

    /**
     * Account is 120 days or more past due.
     * 
     */
    @XmlEnumValue("LateOver120Days")
    LATE_OVER_120_DAYS("LateOver120Days"),

    /**
     * Status of the account is not known.
     * 
     */
    @XmlEnumValue("NoDataAvailable")
    NO_DATA_AVAILABLE("NoDataAvailable"),

    /**
     * Account has not been paid on a timely basis and proceedings have been initiated to repossess collateral property to partially of fully satisfy the debt.
     * 
     */
    @XmlEnumValue("Repossession")
    REPOSSESSION("Repossession"),

    /**
     * Account has been recently established and is too new to rate payment history.
     * 
     */
    @XmlEnumValue("TooNew")
    TOO_NEW("TooNew"),

    /**
     * Past due debt on an account is being paid according to terms established by a court or agreement with the creditor.
     * 
     */
    @XmlEnumValue("WageEarnerPlan")
    WAGE_EARNER_PLAN("WageEarnerPlan");
    private final String value;

    CreditLiabilityHighestAdverseRatingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditLiabilityHighestAdverseRatingBase fromValue(String v) {
        for (CreditLiabilityHighestAdverseRatingBase c: CreditLiabilityHighestAdverseRatingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
