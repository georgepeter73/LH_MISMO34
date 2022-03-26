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
 * <p>Java class for ClosingAgentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClosingAgentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Attorney"/>
 *     &lt;enumeration value="EscrowCompany"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TitleCompany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClosingAgentBase")
@XmlEnum
public enum ClosingAgentBase {

    @XmlEnumValue("Attorney")
    ATTORNEY("Attorney"),
    @XmlEnumValue("EscrowCompany")
    ESCROW_COMPANY("EscrowCompany"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("TitleCompany")
    TITLE_COMPANY("TitleCompany");
    private final String value;

    ClosingAgentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClosingAgentBase fromValue(String v) {
        for (ClosingAgentBase c: ClosingAgentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
