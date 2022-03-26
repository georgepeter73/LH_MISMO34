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
 * <p>Java class for NeighborhoodBuiltUpRangeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NeighborhoodBuiltUpRangeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Over75Percent"/>
 *     &lt;enumeration value="TwentyFiveToSeventyFivePercent"/>
 *     &lt;enumeration value="Under25Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NeighborhoodBuiltUpRangeBase")
@XmlEnum
public enum NeighborhoodBuiltUpRangeBase {

    @XmlEnumValue("Over75Percent")
    OVER_75_PERCENT("Over75Percent"),
    @XmlEnumValue("TwentyFiveToSeventyFivePercent")
    TWENTY_FIVE_TO_SEVENTY_FIVE_PERCENT("TwentyFiveToSeventyFivePercent"),
    @XmlEnumValue("Under25Percent")
    UNDER_25_PERCENT("Under25Percent");
    private final String value;

    NeighborhoodBuiltUpRangeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NeighborhoodBuiltUpRangeBase fromValue(String v) {
        for (NeighborhoodBuiltUpRangeBase c: NeighborhoodBuiltUpRangeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
