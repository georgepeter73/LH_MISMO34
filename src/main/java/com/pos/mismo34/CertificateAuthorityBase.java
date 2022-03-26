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
 * <p>Java class for CertificateAuthorityBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificateAuthorityBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="PublicFederal"/>
 *     &lt;enumeration value="PublicLocalCounty"/>
 *     &lt;enumeration value="PublicLocalMunicipal"/>
 *     &lt;enumeration value="PublicState"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificateAuthorityBase")
@XmlEnum
public enum CertificateAuthorityBase {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("PublicFederal")
    PUBLIC_FEDERAL("PublicFederal"),
    @XmlEnumValue("PublicLocalCounty")
    PUBLIC_LOCAL_COUNTY("PublicLocalCounty"),
    @XmlEnumValue("PublicLocalMunicipal")
    PUBLIC_LOCAL_MUNICIPAL("PublicLocalMunicipal"),
    @XmlEnumValue("PublicState")
    PUBLIC_STATE("PublicState");
    private final String value;

    CertificateAuthorityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificateAuthorityBase fromValue(String v) {
        for (CertificateAuthorityBase c: CertificateAuthorityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
