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
 * <p>Java class for MISubPrimeProgramBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MISubPrimeProgramBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AMinus"/>
 *     &lt;enumeration value="BPaper"/>
 *     &lt;enumeration value="CPaper"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MISubPrimeProgramBase")
@XmlEnum
public enum MISubPrimeProgramBase {

    @XmlEnumValue("AMinus")
    A_MINUS("AMinus"),
    @XmlEnumValue("BPaper")
    B_PAPER("BPaper"),
    @XmlEnumValue("CPaper")
    C_PAPER("CPaper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MISubPrimeProgramBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MISubPrimeProgramBase fromValue(String v) {
        for (MISubPrimeProgramBase c: MISubPrimeProgramBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
