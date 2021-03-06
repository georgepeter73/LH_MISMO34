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
 * <p>Java class for RentalFeatureBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RentalFeatureBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="Lease"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="UtilitiesIncluded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RentalFeatureBase")
@XmlEnum
public enum RentalFeatureBase {

    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("Condition")
    CONDITION("Condition"),
    @XmlEnumValue("Lease")
    LEASE("Lease"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("UtilitiesIncluded")
    UTILITIES_INCLUDED("UtilitiesIncluded");
    private final String value;

    RentalFeatureBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RentalFeatureBase fromValue(String v) {
        for (RentalFeatureBase c: RentalFeatureBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
