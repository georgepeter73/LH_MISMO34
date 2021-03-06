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
 * <p>Java class for RESPAConformingYearBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RESPAConformingYearBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="January2010"/>
 *     &lt;enumeration value="October2015"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Pre2010"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RESPAConformingYearBase")
@XmlEnum
public enum RESPAConformingYearBase {


    /**
     * Loans originated on or after January 1, 2010.
     * 
     */
    @XmlEnumValue("January2010")
    JANUARY_2010("January2010"),
    @XmlEnumValue("October2015")
    OCTOBER_2015("October2015"),

    /**
     * Loans originated on or after October 3, 2015.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Loans originated before January 1, 2010.
     * 
     */
    @XmlEnumValue("Pre2010")
    PRE_2010("Pre2010");
    private final String value;

    RESPAConformingYearBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RESPAConformingYearBase fromValue(String v) {
        for (RESPAConformingYearBase c: RESPAConformingYearBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
