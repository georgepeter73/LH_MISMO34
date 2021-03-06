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
 * <p>Java class for DealSetExpenseBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DealSetExpenseBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Shipping"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Travel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DealSetExpenseBase")
@XmlEnum
public enum DealSetExpenseBase {

    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Reasonable actual out-of-pocket expenses to ship the servicing records for a group of loans.
     * 
     */
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping"),

    /**
     * A summary of special expenses include tax penalties, Borrower escrow payments, escrow discrepancies, tax penalties, missing borrower escrow payments, escrow discrepancies.
     * 
     */
    @XmlEnumValue("Special")
    SPECIAL("Special"),

    /**
     * Reasonable travel expenses incurred and paid to retrieve the servicing records and related items for a group of loans as comply with the expense policy.
     * 
     */
    @XmlEnumValue("Travel")
    TRAVEL("Travel");
    private final String value;

    DealSetExpenseBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DealSetExpenseBase fromValue(String v) {
        for (DealSetExpenseBase c: DealSetExpenseBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
