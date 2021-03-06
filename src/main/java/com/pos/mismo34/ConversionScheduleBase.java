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
 * <p>Java class for ConversionScheduleBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionScheduleBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Anytime"/>
 *     &lt;enumeration value="OnFirstAndSecondRateAdjustment"/>
 *     &lt;enumeration value="OnFirstThroughFifthRateAdjustment"/>
 *     &lt;enumeration value="OnFirstThroughThirdRateAdjustment"/>
 *     &lt;enumeration value="OnSecondThroughTenthRateAdjustment"/>
 *     &lt;enumeration value="OnThirdThroughFifthRateAdjustment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionScheduleBase")
@XmlEnum
public enum ConversionScheduleBase {


    /**
     * Convertible Anytime Throughout Life of Loan
     * 
     */
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime"),

    /**
     * Convertible at 1st and 2nd Interest Rate Change Dates
     * 
     */
    @XmlEnumValue("OnFirstAndSecondRateAdjustment")
    ON_FIRST_AND_SECOND_RATE_ADJUSTMENT("OnFirstAndSecondRateAdjustment"),

    /**
     * Convertible from 1st through 5th Interest Rate Change Dates
     * 
     */
    @XmlEnumValue("OnFirstThroughFifthRateAdjustment")
    ON_FIRST_THROUGH_FIFTH_RATE_ADJUSTMENT("OnFirstThroughFifthRateAdjustment"),

    /**
     * Convertible at 1st, 2nd, and 3rd Interest Rate Change Dates
     * 
     */
    @XmlEnumValue("OnFirstThroughThirdRateAdjustment")
    ON_FIRST_THROUGH_THIRD_RATE_ADJUSTMENT("OnFirstThroughThirdRateAdjustment"),

    /**
     * Convertible from 2nd through 10th Interest Rate Change Dates
     * 
     */
    @XmlEnumValue("OnSecondThroughTenthRateAdjustment")
    ON_SECOND_THROUGH_TENTH_RATE_ADJUSTMENT("OnSecondThroughTenthRateAdjustment"),

    /**
     * Convertible at 3rd, 4th, and 5th Interest Rate Change Dates
     * 
     */
    @XmlEnumValue("OnThirdThroughFifthRateAdjustment")
    ON_THIRD_THROUGH_FIFTH_RATE_ADJUSTMENT("OnThirdThroughFifthRateAdjustment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConversionScheduleBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionScheduleBase fromValue(String v) {
        for (ConversionScheduleBase c: ConversionScheduleBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
