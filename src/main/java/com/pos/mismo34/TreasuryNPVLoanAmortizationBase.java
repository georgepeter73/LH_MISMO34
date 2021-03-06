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
 * <p>Java class for TreasuryNPVLoanAmortizationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TreasuryNPVLoanAmortizationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AdjustableRate"/>
 *     &lt;enumeration value="FixedRate"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Step"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TreasuryNPVLoanAmortizationBase")
@XmlEnum
public enum TreasuryNPVLoanAmortizationBase {


    /**
     * A mortgage that allows the lender to adjust the interest rate in accordance with a specified index periodically.
     * 
     */
    @XmlEnumValue("AdjustableRate")
    ADJUSTABLE_RATE("AdjustableRate"),

    /**
     * A mortgage in which the interest rate and payments remain the same for the life of the loan.
     * 
     */
    @XmlEnumValue("FixedRate")
    FIXED_RATE("FixedRate"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Fixed periodic payment/rate changes without subsidy or negative amortization.
     * 
     */
    @XmlEnumValue("Step")
    STEP("Step");
    private final String value;

    TreasuryNPVLoanAmortizationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TreasuryNPVLoanAmortizationBase fromValue(String v) {
        for (TreasuryNPVLoanAmortizationBase c: TreasuryNPVLoanAmortizationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
