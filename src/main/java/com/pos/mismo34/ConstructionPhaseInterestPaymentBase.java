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
 * <p>Java class for ConstructionPhaseInterestPaymentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionPhaseInterestPaymentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="InterestPaidAtEndOfConstruction"/>
 *     &lt;enumeration value="InterestPaidPeriodically"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionPhaseInterestPaymentBase")
@XmlEnum
public enum ConstructionPhaseInterestPaymentBase {

    @XmlEnumValue("InterestPaidAtEndOfConstruction")
    INTEREST_PAID_AT_END_OF_CONSTRUCTION("InterestPaidAtEndOfConstruction"),
    @XmlEnumValue("InterestPaidPeriodically")
    INTEREST_PAID_PERIODICALLY("InterestPaidPeriodically"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConstructionPhaseInterestPaymentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionPhaseInterestPaymentBase fromValue(String v) {
        for (ConstructionPhaseInterestPaymentBase c: ConstructionPhaseInterestPaymentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
