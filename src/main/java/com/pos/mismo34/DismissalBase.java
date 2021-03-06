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
 * <p>Java class for DismissalBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DismissalBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="WithoutPrejudice"/>
 *     &lt;enumeration value="WithPrejudice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DismissalBase")
@XmlEnum
public enum DismissalBase {


    /**
     * A party is not barred from refiling the same claim, usually due to a procedural error.
     * 
     */
    @XmlEnumValue("WithoutPrejudice")
    WITHOUT_PREJUDICE("WithoutPrejudice"),

    /**
     * Forbids a party from refiling the same claim.
     * 
     */
    @XmlEnumValue("WithPrejudice")
    WITH_PREJUDICE("WithPrejudice");
    private final String value;

    DismissalBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DismissalBase fromValue(String v) {
        for (DismissalBase c: DismissalBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
