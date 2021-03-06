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
 * <p>Java class for IndexRoundingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexRoundingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Nearest"/>
 *     &lt;enumeration value="NoRounding"/>
 *     &lt;enumeration value="Up"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexRoundingBase")
@XmlEnum
public enum IndexRoundingBase {

    @XmlEnumValue("Nearest")
    NEAREST("Nearest"),
    @XmlEnumValue("NoRounding")
    NO_ROUNDING("NoRounding"),
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    IndexRoundingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexRoundingBase fromValue(String v) {
        for (IndexRoundingBase c: IndexRoundingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
