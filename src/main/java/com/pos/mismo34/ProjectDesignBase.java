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
 * <p>Java class for ProjectDesignBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectDesignBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="GardenProject"/>
 *     &lt;enumeration value="HighriseProject"/>
 *     &lt;enumeration value="MidriseProject"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TownhouseRowhouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectDesignBase")
@XmlEnum
public enum ProjectDesignBase {

    @XmlEnumValue("GardenProject")
    GARDEN_PROJECT("GardenProject"),
    @XmlEnumValue("HighriseProject")
    HIGHRISE_PROJECT("HighriseProject"),
    @XmlEnumValue("MidriseProject")
    MIDRISE_PROJECT("MidriseProject"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * One in a row of identical houses or having common wall. Attached to another unit via common wall (e.g., a brownstone.)
     * 
     */
    @XmlEnumValue("TownhouseRowhouse")
    TOWNHOUSE_ROWHOUSE("TownhouseRowhouse");
    private final String value;

    ProjectDesignBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectDesignBase fromValue(String v) {
        for (ProjectDesignBase c: ProjectDesignBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
