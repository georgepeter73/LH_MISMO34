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
 * <p>Java class for LoanNegativeAmortizationResolutionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanNegativeAmortizationResolutionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="NoMoreNegativeAmortizationAllowed"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PaymentRecastToFullyAmortizingTermRemainsTheSame"/>
 *     &lt;enumeration value="PayoffDifference"/>
 *     &lt;enumeration value="TermExtendedAndPaymentRecastToFullyAmortizing"/>
 *     &lt;enumeration value="TermExtendedPaymentRemainsTheSame"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanNegativeAmortizationResolutionBase")
@XmlEnum
public enum LoanNegativeAmortizationResolutionBase {

    @XmlEnumValue("NoMoreNegativeAmortizationAllowed")
    NO_MORE_NEGATIVE_AMORTIZATION_ALLOWED("NoMoreNegativeAmortizationAllowed"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Recalculate the principal and interest payment to fully amortize the loan over the remaining term.
     * 
     */
    @XmlEnumValue("PaymentRecastToFullyAmortizingTermRemainsTheSame")
    PAYMENT_RECAST_TO_FULLY_AMORTIZING_TERM_REMAINS_THE_SAME("PaymentRecastToFullyAmortizingTermRemainsTheSame"),

    /**
     * Borrower pays the amount by which the loan has negatively amortized.
     * 
     */
    @XmlEnumValue("PayoffDifference")
    PAYOFF_DIFFERENCE("PayoffDifference"),

    /**
     * Modify the term of the mortgage and recalculate the fully amortizing mortgage over the newly extended remaining term.
     * 
     */
    @XmlEnumValue("TermExtendedAndPaymentRecastToFullyAmortizing")
    TERM_EXTENDED_AND_PAYMENT_RECAST_TO_FULLY_AMORTIZING("TermExtendedAndPaymentRecastToFullyAmortizing"),

    /**
     * Extend the term as needed to fully amortize the loan up to the maximum allowed stated term on the note.
     * 
     */
    @XmlEnumValue("TermExtendedPaymentRemainsTheSame")
    TERM_EXTENDED_PAYMENT_REMAINS_THE_SAME("TermExtendedPaymentRemainsTheSame");
    private final String value;

    LoanNegativeAmortizationResolutionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanNegativeAmortizationResolutionBase fromValue(String v) {
        for (LoanNegativeAmortizationResolutionBase c: LoanNegativeAmortizationResolutionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
