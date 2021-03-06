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
 * <p>Java class for EscrowAccountLenderRequirementBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EscrowAccountLenderRequirementBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EscrowsRequiredByLender"/>
 *     &lt;enumeration value="EscrowsWaivedByLender"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EscrowAccountLenderRequirementBase")
@XmlEnum
public enum EscrowAccountLenderRequirementBase {


    /**
     * Indicates an escrow account is required by the lender.
     * 
     */
    @XmlEnumValue("EscrowsRequiredByLender")
    ESCROWS_REQUIRED_BY_LENDER("EscrowsRequiredByLender"),

    /**
     * Indicates the escrow account requirement has been waived by the lender.
     * 
     */
    @XmlEnumValue("EscrowsWaivedByLender")
    ESCROWS_WAIVED_BY_LENDER("EscrowsWaivedByLender");
    private final String value;

    EscrowAccountLenderRequirementBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EscrowAccountLenderRequirementBase fromValue(String v) {
        for (EscrowAccountLenderRequirementBase c: EscrowAccountLenderRequirementBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
