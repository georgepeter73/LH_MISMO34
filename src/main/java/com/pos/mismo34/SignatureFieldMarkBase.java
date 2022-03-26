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
 * <p>Java class for SignatureFieldMarkBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureFieldMarkBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FullSignature"/>
 *     &lt;enumeration value="Initials"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureFieldMarkBase")
@XmlEnum
public enum SignatureFieldMarkBase {


    /**
     * Denotes that the signature field is a for a full signature
     * 
     */
    @XmlEnumValue("FullSignature")
    FULL_SIGNATURE("FullSignature"),

    /**
     * Denotes that the signature field is for an initials mark.
     * 
     */
    @XmlEnumValue("Initials")
    INITIALS("Initials");
    private final String value;

    SignatureFieldMarkBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureFieldMarkBase fromValue(String v) {
        for (SignatureFieldMarkBase c: SignatureFieldMarkBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
