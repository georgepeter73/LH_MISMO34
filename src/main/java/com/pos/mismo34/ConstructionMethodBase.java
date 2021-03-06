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
 * <p>Java class for ConstructionMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Manufactured"/>
 *     &lt;enumeration value="MobileHome"/>
 *     &lt;enumeration value="Modular"/>
 *     &lt;enumeration value="OnFrameModular"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SiteBuilt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionMethodBase")
@XmlEnum
public enum ConstructionMethodBase {


    /**
     * A factory built dwelling built in compliance with the Federal Manufactured Home Construction and Safety Standards in effect at the time the home was manufactured as evidenced by the HUD label. (HUD Code Home)
     * 
     */
    @XmlEnumValue("Manufactured")
    MANUFACTURED("Manufactured"),

    /**
     * Dwelling unit constructed on a base frame which features wheels and axles to be used in transporting home from place to place, does not meet HUD code.
     * 
     */
    @XmlEnumValue("MobileHome")
    MOBILE_HOME("MobileHome"),

    /**
     * A factory built dwelling not on a permanent chassis.
     * 
     */
    @XmlEnumValue("Modular")
    MODULAR("Modular"),

    /**
     * A factory built dwelling on a permanent chassis which does not have a HUD label.
     * 
     */
    @XmlEnumValue("OnFrameModular")
    ON_FRAME_MODULAR("OnFrameModular"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Describes construction process, indicating that most elements are created at the homes permanent site. May include some prefabricated components.
     * 
     */
    @XmlEnumValue("SiteBuilt")
    SITE_BUILT("SiteBuilt");
    private final String value;

    ConstructionMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionMethodBase fromValue(String v) {
        for (ConstructionMethodBase c: ConstructionMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
