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
 * <p>Java class for UndefinedPropertyBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UndefinedPropertyBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="NonDescriptive"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UndefinedPropertyBase")
@XmlEnum
public enum UndefinedPropertyBase {


    /**
     * A property that does not have enough information provided to classify a property type.
     * 
     */
    @XmlEnumValue("NonDescriptive")
    NON_DESCRIPTIVE("NonDescriptive"),

    /**
     * A property for which no information is provided to classify a property type.
     * 
     */
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),

    /**
     * A property whose specific property type characterstics are unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    UndefinedPropertyBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UndefinedPropertyBase fromValue(String v) {
        for (UndefinedPropertyBase c: UndefinedPropertyBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
