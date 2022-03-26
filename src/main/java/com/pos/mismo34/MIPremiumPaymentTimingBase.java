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
 * <p>Java class for MIPremiumPaymentTimingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIPremiumPaymentTimingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AtClosing"/>
 *     &lt;enumeration value="BeforeClosing"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MIPremiumPaymentTimingBase")
@XmlEnum
public enum MIPremiumPaymentTimingBase {

    @XmlEnumValue("AtClosing")
    AT_CLOSING("AtClosing"),
    @XmlEnumValue("BeforeClosing")
    BEFORE_CLOSING("BeforeClosing"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MIPremiumPaymentTimingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIPremiumPaymentTimingBase fromValue(String v) {
        for (MIPremiumPaymentTimingBase c: MIPremiumPaymentTimingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}