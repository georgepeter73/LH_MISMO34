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
 * <p>Java class for URLAStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URLAStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="Interim"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "URLAStatusBase")
@XmlEnum
public enum URLAStatusBase {


    /**
     * The version of the loan application that is consistent with the data reported on the Closing Disclosure. The document presented to the borrower for signature at closing.
     * 
     */
    @XmlEnumValue("Final")
    FINAL("Final"),

    /**
     * Any version of the loan application prior to the final version.
     * 
     */
    @XmlEnumValue("Interim")
    INTERIM("Interim");
    private final String value;

    URLAStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URLAStatusBase fromValue(String v) {
        for (URLAStatusBase c: URLAStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
