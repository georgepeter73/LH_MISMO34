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
 * <p>Java class for PropertyUsageBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyUsageBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Investment"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PrimaryResidence"/>
 *     &lt;enumeration value="SecondHome"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyUsageBase")
@XmlEnum
public enum PropertyUsageBase {


    /**
     * A home owned for the purpose of generating income by renting the property.
     * 
     */
    @XmlEnumValue("Investment")
    INVESTMENT("Investment"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Residence that the owner physically occupies and uses as his or her principal residence.
     * 
     */
    @XmlEnumValue("PrimaryResidence")
    PRIMARY_RESIDENCE("PrimaryResidence"),

    /**
     * A property occupied by the owner for a portion of the year and is not the primary residence.
     * 
     */
    @XmlEnumValue("SecondHome")
    SECOND_HOME("SecondHome");
    private final String value;

    PropertyUsageBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyUsageBase fromValue(String v) {
        for (PropertyUsageBase c: PropertyUsageBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}