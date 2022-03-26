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
 * <p>Java class for GenderBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Female"/>
 *     &lt;enumeration value="InformationNotProvidedUnknown"/>
 *     &lt;enumeration value="Male"/>
 *     &lt;enumeration value="NotApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenderBase")
@XmlEnum
public enum GenderBase {

    @XmlEnumValue("Female")
    FEMALE("Female"),

    /**
     * Information was not provided by borrower in a mail, telephone, or internet application. Category as defined by the Home Mortgage Disclosure Act.
     * 
     */
    @XmlEnumValue("InformationNotProvidedUnknown")
    INFORMATION_NOT_PROVIDED_UNKNOWN("InformationNotProvidedUnknown"),
    @XmlEnumValue("Male")
    MALE("Male"),

    /**
     * Used for loans where the borrower is an institution, corporation, or partnership.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    GenderBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderBase fromValue(String v) {
        for (GenderBase c: GenderBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
