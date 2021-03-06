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
 * <p>Java class for MaritalStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Divorced"/>
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="NotProvided"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Separated"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Unmarried"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatusBase")
@XmlEnum
public enum MaritalStatusBase {

    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),

    /**
     * State of being united to a person in a consensual or contractual relationship recognized by law.
     * 
     */
    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("NotProvided")
    NOT_PROVIDED("NotProvided"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * State of formal or informal separation of a married couple.
     * 
     */
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Single, divorced, widowed, or domestic relationship.
     * 
     */
    @XmlEnumValue("Unmarried")
    UNMARRIED("Unmarried");
    private final String value;

    MaritalStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatusBase fromValue(String v) {
        for (MaritalStatusBase c: MaritalStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
