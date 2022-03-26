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
 * <p>Java class for HousingExpenseTimingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HousingExpenseTimingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Present"/>
 *     &lt;enumeration value="Proposed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HousingExpenseTimingBase")
@XmlEnum
public enum HousingExpenseTimingBase {


    /**
     * Housing expenses that are currently being incurred for the subject property.
     * 
     */
    @XmlEnumValue("Present")
    PRESENT("Present"),

    /**
     * Housing expenses that are expected to be incurred after closing for the subject property.
     * 
     */
    @XmlEnumValue("Proposed")
    PROPOSED("Proposed");
    private final String value;

    HousingExpenseTimingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingExpenseTimingBase fromValue(String v) {
        for (HousingExpenseTimingBase c: HousingExpenseTimingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
