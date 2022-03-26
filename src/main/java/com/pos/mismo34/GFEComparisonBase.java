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
 * <p>Java class for GFEComparisonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GFEComparisonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SameLoanWithLowerInterestRate"/>
 *     &lt;enumeration value="SameLoanWithLowerSettlementCharges"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GFEComparisonBase")
@XmlEnum
public enum GFEComparisonBase {

    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SameLoanWithLowerInterestRate")
    SAME_LOAN_WITH_LOWER_INTEREST_RATE("SameLoanWithLowerInterestRate"),
    @XmlEnumValue("SameLoanWithLowerSettlementCharges")
    SAME_LOAN_WITH_LOWER_SETTLEMENT_CHARGES("SameLoanWithLowerSettlementCharges");
    private final String value;

    GFEComparisonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GFEComparisonBase fromValue(String v) {
        for (GFEComparisonBase c: GFEComparisonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}