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
 * <p>Java class for ForeclosureSaleRescindedReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeclosureSaleRescindedReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ExcessivePropertyDamage"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ProceduralError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForeclosureSaleRescindedReasonBase")
@XmlEnum
public enum ForeclosureSaleRescindedReasonBase {


    /**
     * An event has occurred or was discovered about the property that makes the property non-marketable.
     * 
     */
    @XmlEnumValue("ExcessivePropertyDamage")
    EXCESSIVE_PROPERTY_DAMAGE("ExcessivePropertyDamage"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * An error on the part of the servicer, courts or sheriff has stopped the transfer of the property to the purchaser.
     * 
     */
    @XmlEnumValue("ProceduralError")
    PROCEDURAL_ERROR("ProceduralError");
    private final String value;

    ForeclosureSaleRescindedReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeclosureSaleRescindedReasonBase fromValue(String v) {
        for (ForeclosureSaleRescindedReasonBase c: ForeclosureSaleRescindedReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
