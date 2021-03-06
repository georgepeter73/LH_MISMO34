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
 * <p>Java class for MIDurationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIDurationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Annual"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PeriodicMonthly"/>
 *     &lt;enumeration value="SingleLifeOfLoan"/>
 *     &lt;enumeration value="SingleSpecific"/>
 *     &lt;enumeration value="SplitPremium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MIDurationBase")
@XmlEnum
public enum MIDurationBase {

    @XmlEnumValue("Annual")
    ANNUAL("Annual"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PeriodicMonthly")
    PERIODIC_MONTHLY("PeriodicMonthly"),
    @XmlEnumValue("SingleLifeOfLoan")
    SINGLE_LIFE_OF_LOAN("SingleLifeOfLoan"),
    @XmlEnumValue("SingleSpecific")
    SINGLE_SPECIFIC("SingleSpecific"),
    @XmlEnumValue("SplitPremium")
    SPLIT_PREMIUM("SplitPremium");
    private final String value;

    MIDurationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIDurationBase fromValue(String v) {
        for (MIDurationBase c: MIDurationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
