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
 * <p>Java class for CharacterEncodingSetBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharacterEncodingSetBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ISO88591"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="USASCII"/>
 *     &lt;enumeration value="UTF16"/>
 *     &lt;enumeration value="UTF8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CharacterEncodingSetBase")
@XmlEnum
public enum CharacterEncodingSetBase {

    @XmlEnumValue("ISO88591")
    ISO_88591("ISO88591"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    USASCII("USASCII"),
    @XmlEnumValue("UTF16")
    UTF_16("UTF16"),
    @XmlEnumValue("UTF8")
    UTF_8("UTF8");
    private final String value;

    CharacterEncodingSetBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharacterEncodingSetBase fromValue(String v) {
        for (CharacterEncodingSetBase c: CharacterEncodingSetBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
