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
 * <p>Java class for ConstructionToPermanentClosingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionToPermanentClosingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="OneClosing"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TwoClosing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionToPermanentClosingBase")
@XmlEnum
public enum ConstructionToPermanentClosingBase {


    /**
     * Includes both construction and permanent portions of the financing in one transaction.
     * 
     */
    @XmlEnumValue("OneClosing")
    ONE_CLOSING("OneClosing"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Construction financing and permanent financing are two separate transactions.
     * 
     */
    @XmlEnumValue("TwoClosing")
    TWO_CLOSING("TwoClosing");
    private final String value;

    ConstructionToPermanentClosingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionToPermanentClosingBase fromValue(String v) {
        for (ConstructionToPermanentClosingBase c: ConstructionToPermanentClosingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
