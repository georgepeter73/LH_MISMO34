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
 * <p>Java class for ConversionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ToBiweeklyPaymentFrequency"/>
 *     &lt;enumeration value="ToFixedRate"/>
 *     &lt;enumeration value="ToFullyAmortizingTerm"/>
 *     &lt;enumeration value="ToLevelPayment"/>
 *     &lt;enumeration value="ToLowerInterestRate"/>
 *     &lt;enumeration value="ToMonthlyPaymentFrequency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionBase")
@XmlEnum
public enum ConversionBase {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ToBiweeklyPaymentFrequency")
    TO_BIWEEKLY_PAYMENT_FREQUENCY("ToBiweeklyPaymentFrequency"),
    @XmlEnumValue("ToFixedRate")
    TO_FIXED_RATE("ToFixedRate"),
    @XmlEnumValue("ToFullyAmortizingTerm")
    TO_FULLY_AMORTIZING_TERM("ToFullyAmortizingTerm"),
    @XmlEnumValue("ToLevelPayment")
    TO_LEVEL_PAYMENT("ToLevelPayment"),
    @XmlEnumValue("ToLowerInterestRate")
    TO_LOWER_INTEREST_RATE("ToLowerInterestRate"),
    @XmlEnumValue("ToMonthlyPaymentFrequency")
    TO_MONTHLY_PAYMENT_FREQUENCY("ToMonthlyPaymentFrequency");
    private final String value;

    ConversionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionBase fromValue(String v) {
        for (ConversionBase c: ConversionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
