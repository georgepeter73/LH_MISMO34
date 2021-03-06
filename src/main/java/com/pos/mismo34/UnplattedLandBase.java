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
 * <p>Java class for UnplattedLandBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnplattedLandBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="GovernmentSurvey"/>
 *     &lt;enumeration value="LandGrant"/>
 *     &lt;enumeration value="MetesAndBounds"/>
 *     &lt;enumeration value="NativeAmericanLand"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Ranchero"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnplattedLandBase")
@XmlEnum
public enum UnplattedLandBase {

    @XmlEnumValue("GovernmentSurvey")
    GOVERNMENT_SURVEY("GovernmentSurvey"),
    @XmlEnumValue("LandGrant")
    LAND_GRANT("LandGrant"),
    @XmlEnumValue("MetesAndBounds")
    METES_AND_BOUNDS("MetesAndBounds"),
    @XmlEnumValue("NativeAmericanLand")
    NATIVE_AMERICAN_LAND("NativeAmericanLand"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Ranchero")
    RANCHERO("Ranchero");
    private final String value;

    UnplattedLandBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnplattedLandBase fromValue(String v) {
        for (UnplattedLandBase c: UnplattedLandBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
