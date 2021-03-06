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
 * <p>Java class for WaterTreatmentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WaterTreatmentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Purifier"/>
 *     &lt;enumeration value="Softener"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WaterTreatmentBase")
@XmlEnum
public enum WaterTreatmentBase {

    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A system that removes biological contaminants or chemicals from the water that may exist on faucets or as a whole system purifier.
     * 
     */
    @XmlEnumValue("Purifier")
    PURIFIER("Purifier"),

    /**
     * A system that removes biological contaminants or chemicals from the water that may exist on faucets or as a whole system purifier.
     * 
     */
    @XmlEnumValue("Softener")
    SOFTENER("Softener");
    private final String value;

    WaterTreatmentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterTreatmentBase fromValue(String v) {
        for (WaterTreatmentBase c: WaterTreatmentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
