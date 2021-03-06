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
 * <p>Java class for RoomFeatureBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomFeatureBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BathroomFloors"/>
 *     &lt;enumeration value="BathroomWainscot"/>
 *     &lt;enumeration value="Doors"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TrimAndFinish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoomFeatureBase")
@XmlEnum
public enum RoomFeatureBase {

    @XmlEnumValue("BathroomFloors")
    BATHROOM_FLOORS("BathroomFloors"),
    @XmlEnumValue("BathroomWainscot")
    BATHROOM_WAINSCOT("BathroomWainscot"),
    @XmlEnumValue("Doors")
    DOORS("Doors"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("TrimAndFinish")
    TRIM_AND_FINISH("TrimAndFinish");
    private final String value;

    RoomFeatureBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomFeatureBase fromValue(String v) {
        for (RoomFeatureBase c: RoomFeatureBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
