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
 * <p>Java class for ExpenseClaimSubmissionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpenseClaimSubmissionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Supplemental"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpenseClaimSubmissionBase")
@XmlEnum
public enum ExpenseClaimSubmissionBase {

    @XmlEnumValue("Final")
    FINAL("Final"),
    @XmlEnumValue("Initial")
    INITIAL("Initial"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Supplemental")
    SUPPLEMENTAL("Supplemental");
    private final String value;

    ExpenseClaimSubmissionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpenseClaimSubmissionBase fromValue(String v) {
        for (ExpenseClaimSubmissionBase c: ExpenseClaimSubmissionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
