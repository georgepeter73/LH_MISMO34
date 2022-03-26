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
 * <p>Java class for SubservicerRightsBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubservicerRightsBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AllLoans"/>
 *     &lt;enumeration value="OneLoan"/>
 *     &lt;enumeration value="OneRemittance"/>
 *     &lt;enumeration value="OneSecurity"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubservicerRightsBase")
@XmlEnum
public enum SubservicerRightsBase {

    @XmlEnumValue("AllLoans")
    ALL_LOANS("AllLoans"),
    @XmlEnumValue("OneLoan")
    ONE_LOAN("OneLoan"),

    /**
     * Servicing a loan or group of loans for one remittance cycle.
     * 
     */
    @XmlEnumValue("OneRemittance")
    ONE_REMITTANCE("OneRemittance"),
    @XmlEnumValue("OneSecurity")
    ONE_SECURITY("OneSecurity"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SubservicerRightsBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubservicerRightsBase fromValue(String v) {
        for (SubservicerRightsBase c: SubservicerRightsBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}