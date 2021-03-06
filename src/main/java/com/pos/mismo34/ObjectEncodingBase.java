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
 * <p>Java class for ObjectEncodingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectEncodingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Base64"/>
 *     &lt;enumeration value="DeflateBase64"/>
 *     &lt;enumeration value="EscapedXML"/>
 *     &lt;enumeration value="GzipBase64"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectEncodingBase")
@XmlEnum
public enum ObjectEncodingBase {


    /**
     * Base64 encoding MUST follow IETF RFC 4648 as documented in sections 3 and 4.
     * 
     */
    @XmlEnumValue("Base64")
    BASE_64("Base64"),
    @XmlEnumValue("DeflateBase64")
    DEFLATE_BASE_64("DeflateBase64"),

    /**
     * EscapedXML encoding MUST follow W3C Canonical XMLVersion 1.0 as documented in section 2.3 for producing a text node.
     * 
     */
    @XmlEnumValue("EscapedXML")
    ESCAPED_XML("EscapedXML"),
    @XmlEnumValue("GzipBase64")
    GZIP_BASE_64("GzipBase64"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ObjectEncodingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectEncodingBase fromValue(String v) {
        for (ObjectEncodingBase c: ObjectEncodingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
