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
 * <p>Java class for RentAdjustmentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RentAdjustmentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="Appeal"/>
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="Design"/>
 *     &lt;enumeration value="GrossLivingArea"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherConcessions"/>
 *     &lt;enumeration value="RentConcessions"/>
 *     &lt;enumeration value="View"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RentAdjustmentBase")
@XmlEnum
public enum RentAdjustmentBase {

    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("Appeal")
    APPEAL("Appeal"),
    @XmlEnumValue("Condition")
    CONDITION("Condition"),
    @XmlEnumValue("Design")
    DESIGN("Design"),
    @XmlEnumValue("GrossLivingArea")
    GROSS_LIVING_AREA("GrossLivingArea"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherConcessions")
    OTHER_CONCESSIONS("OtherConcessions"),
    @XmlEnumValue("RentConcessions")
    RENT_CONCESSIONS("RentConcessions"),
    @XmlEnumValue("View")
    VIEW("View");
    private final String value;

    RentAdjustmentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RentAdjustmentBase fromValue(String v) {
        for (RentAdjustmentBase c: RentAdjustmentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}