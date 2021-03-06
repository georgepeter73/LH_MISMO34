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
 * <p>Java class for IndexCalculationMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexCalculationMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AverageTwoIndexRates"/>
 *     &lt;enumeration value="CurrentDaysIndexRate"/>
 *     &lt;enumeration value="HighestOfTwoIndexRates"/>
 *     &lt;enumeration value="LowestOfTwoIndexRates"/>
 *     &lt;enumeration value="SingleIndexRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexCalculationMethodBase")
@XmlEnum
public enum IndexCalculationMethodBase {


    /**
     * Use the average value of two index rates.
     * 
     */
    @XmlEnumValue("AverageTwoIndexRates")
    AVERAGE_TWO_INDEX_RATES("AverageTwoIndexRates"),

    /**
     * Use the index value that is effective on the date the ARM Change is performed.
     * 
     */
    @XmlEnumValue("CurrentDaysIndexRate")
    CURRENT_DAYS_INDEX_RATE("CurrentDaysIndexRate"),

    /**
     * Use the higher value of two index rates.
     * 
     */
    @XmlEnumValue("HighestOfTwoIndexRates")
    HIGHEST_OF_TWO_INDEX_RATES("HighestOfTwoIndexRates"),

    /**
     * Use the lower value of two index rates.
     * 
     */
    @XmlEnumValue("LowestOfTwoIndexRates")
    LOWEST_OF_TWO_INDEX_RATES("LowestOfTwoIndexRates"),

    /**
     * Use the index value rate in the ARM Index History.
     * 
     */
    @XmlEnumValue("SingleIndexRate")
    SINGLE_INDEX_RATE("SingleIndexRate");
    private final String value;

    IndexCalculationMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexCalculationMethodBase fromValue(String v) {
        for (IndexCalculationMethodBase c: IndexCalculationMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
