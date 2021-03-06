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
 * <p>Java class for CondominiumProjectStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CondominiumProjectStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Established"/>
 *     &lt;enumeration value="New"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CondominiumProjectStatusBase")
@XmlEnum
public enum CondominiumProjectStatusBase {


    /**
     * A condominium project that is 100% complete, and not subject to additional phasing, and at least 90% of the total number of units have been conveyed to unit owners, and the unit owners control the home owners association.
     * 
     */
    @XmlEnumValue("Established")
    ESTABLISHED("Established"),

    /**
     * A condominium project that is not 100% complete, or subject to additional phasing, or  less than 90% of the total number of units have conveyed to unit owners, or the unit owners do not control the home owners association.
     * 
     */
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    CondominiumProjectStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CondominiumProjectStatusBase fromValue(String v) {
        for (CondominiumProjectStatusBase c: CondominiumProjectStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
