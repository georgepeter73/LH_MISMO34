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
 * <p>Java class for ExpenseClaimItemInsurancePlacedBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpenseClaimItemInsurancePlacedBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Homeowner"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpenseClaimItemInsurancePlacedBase")
@XmlEnum
public enum ExpenseClaimItemInsurancePlacedBase {


    /**
     * Homeowner has secured the insurance.
     * 
     */
    @XmlEnumValue("Homeowner")
    HOMEOWNER("Homeowner"),

    /**
     * Lender-placed insurance, also known as force-placed insurance; is an insurance policy placed by a bank or mortgage servicer on a home when the homeowners’ own property insurance may have lapsed or where the bank deems the homeowners’ insurance insufficient.
     * 
     */
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ExpenseClaimItemInsurancePlacedBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpenseClaimItemInsurancePlacedBase fromValue(String v) {
        for (ExpenseClaimItemInsurancePlacedBase c: ExpenseClaimItemInsurancePlacedBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
