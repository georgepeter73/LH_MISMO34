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
 * <p>Java class for WallMaterialBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WallMaterialBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Aluminum"/>
 *     &lt;enumeration value="Block"/>
 *     &lt;enumeration value="Brick"/>
 *     &lt;enumeration value="CementBoard"/>
 *     &lt;enumeration value="Concrete"/>
 *     &lt;enumeration value="Flagstone"/>
 *     &lt;enumeration value="Frame"/>
 *     &lt;enumeration value="Glass"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Steel"/>
 *     &lt;enumeration value="Stone"/>
 *     &lt;enumeration value="Stucco"/>
 *     &lt;enumeration value="Synthetic"/>
 *     &lt;enumeration value="Veneer"/>
 *     &lt;enumeration value="Vinyl"/>
 *     &lt;enumeration value="Wood"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WallMaterialBase")
@XmlEnum
public enum WallMaterialBase {

    @XmlEnumValue("Aluminum")
    ALUMINUM("Aluminum"),
    @XmlEnumValue("Block")
    BLOCK("Block"),
    @XmlEnumValue("Brick")
    BRICK("Brick"),
    @XmlEnumValue("CementBoard")
    CEMENT_BOARD("CementBoard"),
    @XmlEnumValue("Concrete")
    CONCRETE("Concrete"),
    @XmlEnumValue("Flagstone")
    FLAGSTONE("Flagstone"),
    @XmlEnumValue("Frame")
    FRAME("Frame"),
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Steel")
    STEEL("Steel"),
    @XmlEnumValue("Stone")
    STONE("Stone"),
    @XmlEnumValue("Stucco")
    STUCCO("Stucco"),
    @XmlEnumValue("Synthetic")
    SYNTHETIC("Synthetic"),
    @XmlEnumValue("Veneer")
    VENEER("Veneer"),
    @XmlEnumValue("Vinyl")
    VINYL("Vinyl"),
    @XmlEnumValue("Wood")
    WOOD("Wood");
    private final String value;

    WallMaterialBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WallMaterialBase fromValue(String v) {
        for (WallMaterialBase c: WallMaterialBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
