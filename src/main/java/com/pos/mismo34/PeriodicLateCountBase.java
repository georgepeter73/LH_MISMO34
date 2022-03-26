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
 * <p>Java class for PeriodicLateCountBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodicLateCountBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CurrentOneToTwelveMonths"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Previous25To36Months"/>
 *     &lt;enumeration value="PreviousThirteenTo24Months"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodicLateCountBase")
@XmlEnum
public enum PeriodicLateCountBase {


    /**
     * The most recent 12 months - months 1 to 12.
     * 
     */
    @XmlEnumValue("CurrentOneToTwelveMonths")
    CURRENT_ONE_TO_TWELVE_MONTHS("CurrentOneToTwelveMonths"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The next previous 12 months - months 25 to 36.
     * 
     */
    @XmlEnumValue("Previous25To36Months")
    PREVIOUS_25_TO_36_MONTHS("Previous25To36Months"),

    /**
     * The next previous 12 months - months 13 to 24.
     * 
     */
    @XmlEnumValue("PreviousThirteenTo24Months")
    PREVIOUS_THIRTEEN_TO_24_MONTHS("PreviousThirteenTo24Months");
    private final String value;

    PeriodicLateCountBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodicLateCountBase fromValue(String v) {
        for (PeriodicLateCountBase c: PeriodicLateCountBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}