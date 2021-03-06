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
 * <p>Java class for HardshipDurationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HardshipDurationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="LongTerm"/>
 *     &lt;enumeration value="MediumTerm"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="ShortTerm"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardshipDurationBase")
@XmlEnum
public enum HardshipDurationBase {

    @XmlEnumValue("LongTerm")
    LONG_TERM("LongTerm"),
    @XmlEnumValue("MediumTerm")
    MEDIUM_TERM("MediumTerm"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),
    @XmlEnumValue("ShortTerm")
    SHORT_TERM("ShortTerm"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    HardshipDurationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardshipDurationBase fromValue(String v) {
        for (HardshipDurationBase c: HardshipDurationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
