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
 * <p>Java class for HMDAReasonForDenialBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HMDAReasonForDenialBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CreditApplicationIncomplete"/>
 *     &lt;enumeration value="InsufficientCash"/>
 *     &lt;enumeration value="InsufficientCollateralValue"/>
 *     &lt;enumeration value="InsufficientCreditHistory"/>
 *     &lt;enumeration value="InsufficientEmploymentHistory"/>
 *     &lt;enumeration value="InsufficientIncome"/>
 *     &lt;enumeration value="MortgageInsuranceDenied"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="UnverifiableInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HMDAReasonForDenialBase")
@XmlEnum
public enum HMDAReasonForDenialBase {


    /**
     * The application was denied because the credit application was not complete.
     * 
     */
    @XmlEnumValue("CreditApplicationIncomplete")
    CREDIT_APPLICATION_INCOMPLETE("CreditApplicationIncomplete"),

    /**
     * The application was denied due to insufficient downpayment, or cash available to pay closing costs.
     * 
     */
    @XmlEnumValue("InsufficientCash")
    INSUFFICIENT_CASH("InsufficientCash"),

    /**
     * The application was denied because the value or type of collateral was not sufficient.
     * 
     */
    @XmlEnumValue("InsufficientCollateralValue")
    INSUFFICIENT_COLLATERAL_VALUE("InsufficientCollateralValue"),

    /**
     * The application was denied because the credit history was too limited, unacceptable, or not at sufficient standing.
     * 
     */
    @XmlEnumValue("InsufficientCreditHistory")
    INSUFFICIENT_CREDIT_HISTORY("InsufficientCreditHistory"),

    /**
     * The application was denied because the employment is irregular, unknown, or not sufficient.
     * 
     */
    @XmlEnumValue("InsufficientEmploymentHistory")
    INSUFFICIENT_EMPLOYMENT_HISTORY("InsufficientEmploymentHistory"),

    /**
     * The application was denied because the debt to income ratio is too high.
     * 
     */
    @XmlEnumValue("InsufficientIncome")
    INSUFFICIENT_INCOME("InsufficientIncome"),

    /**
     * The application was denied because necessary mortgage insurance was denied.
     * 
     */
    @XmlEnumValue("MortgageInsuranceDenied")
    MORTGAGE_INSURANCE_DENIED("MortgageInsuranceDenied"),

    /**
     * The action taken on the application, pursuant to Section 1003.4(a)(8), is not a denial. For example, if the application was withdrawn before a credit decision was made or the file was closed for incompleteness.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The application was denied because qualififcation information such as income, employment, credit, or residence was not verifiable.
     * 
     */
    @XmlEnumValue("UnverifiableInformation")
    UNVERIFIABLE_INFORMATION("UnverifiableInformation");
    private final String value;

    HMDAReasonForDenialBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HMDAReasonForDenialBase fromValue(String v) {
        for (HMDAReasonForDenialBase c: HMDAReasonForDenialBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
