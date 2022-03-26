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
 * <p>Java class for WindowBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WindowBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Aluminum"/>
 *     &lt;enumeration value="Awning"/>
 *     &lt;enumeration value="BayWindow"/>
 *     &lt;enumeration value="BeveledGlass"/>
 *     &lt;enumeration value="BowWindow"/>
 *     &lt;enumeration value="Casement"/>
 *     &lt;enumeration value="CenterPivot"/>
 *     &lt;enumeration value="CircleHead"/>
 *     &lt;enumeration value="Clerestory"/>
 *     &lt;enumeration value="Combination"/>
 *     &lt;enumeration value="CrankOut"/>
 *     &lt;enumeration value="Decorative"/>
 *     &lt;enumeration value="Dormer"/>
 *     &lt;enumeration value="DoubleHung"/>
 *     &lt;enumeration value="DoublePane"/>
 *     &lt;enumeration value="EtchedGlass"/>
 *     &lt;enumeration value="FixedPane"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Hopper"/>
 *     &lt;enumeration value="HorizontalSliding"/>
 *     &lt;enumeration value="Insulated"/>
 *     &lt;enumeration value="Jalousie"/>
 *     &lt;enumeration value="LeadedGlass"/>
 *     &lt;enumeration value="LowE"/>
 *     &lt;enumeration value="Oriel"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Palladian"/>
 *     &lt;enumeration value="Picture"/>
 *     &lt;enumeration value="SingleHung"/>
 *     &lt;enumeration value="Sliding"/>
 *     &lt;enumeration value="StainedGlass"/>
 *     &lt;enumeration value="Steel"/>
 *     &lt;enumeration value="ThermalPane"/>
 *     &lt;enumeration value="Thermopane"/>
 *     &lt;enumeration value="Transom"/>
 *     &lt;enumeration value="Transverse"/>
 *     &lt;enumeration value="Vinyl"/>
 *     &lt;enumeration value="Wood"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WindowBase")
@XmlEnum
public enum WindowBase {

    @XmlEnumValue("Aluminum")
    ALUMINUM("Aluminum"),
    @XmlEnumValue("Awning")
    AWNING("Awning"),
    @XmlEnumValue("BayWindow")
    BAY_WINDOW("BayWindow"),
    @XmlEnumValue("BeveledGlass")
    BEVELED_GLASS("BeveledGlass"),
    @XmlEnumValue("BowWindow")
    BOW_WINDOW("BowWindow"),
    @XmlEnumValue("Casement")
    CASEMENT("Casement"),
    @XmlEnumValue("CenterPivot")
    CENTER_PIVOT("CenterPivot"),
    @XmlEnumValue("CircleHead")
    CIRCLE_HEAD("CircleHead"),
    @XmlEnumValue("Clerestory")
    CLERESTORY("Clerestory"),
    @XmlEnumValue("Combination")
    COMBINATION("Combination"),
    @XmlEnumValue("CrankOut")
    CRANK_OUT("CrankOut"),
    @XmlEnumValue("Decorative")
    DECORATIVE("Decorative"),
    @XmlEnumValue("Dormer")
    DORMER("Dormer"),
    @XmlEnumValue("DoubleHung")
    DOUBLE_HUNG("DoubleHung"),
    @XmlEnumValue("DoublePane")
    DOUBLE_PANE("DoublePane"),
    @XmlEnumValue("EtchedGlass")
    ETCHED_GLASS("EtchedGlass"),
    @XmlEnumValue("FixedPane")
    FIXED_PANE("FixedPane"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Hopper")
    HOPPER("Hopper"),
    @XmlEnumValue("HorizontalSliding")
    HORIZONTAL_SLIDING("HorizontalSliding"),
    @XmlEnumValue("Insulated")
    INSULATED("Insulated"),
    @XmlEnumValue("Jalousie")
    JALOUSIE("Jalousie"),
    @XmlEnumValue("LeadedGlass")
    LEADED_GLASS("LeadedGlass"),
    @XmlEnumValue("LowE")
    LOW_E("LowE"),
    @XmlEnumValue("Oriel")
    ORIEL("Oriel"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Palladian")
    PALLADIAN("Palladian"),
    @XmlEnumValue("Picture")
    PICTURE("Picture"),
    @XmlEnumValue("SingleHung")
    SINGLE_HUNG("SingleHung"),
    @XmlEnumValue("Sliding")
    SLIDING("Sliding"),
    @XmlEnumValue("StainedGlass")
    STAINED_GLASS("StainedGlass"),
    @XmlEnumValue("Steel")
    STEEL("Steel"),
    @XmlEnumValue("ThermalPane")
    THERMAL_PANE("ThermalPane"),
    @XmlEnumValue("Thermopane")
    THERMOPANE("Thermopane"),
    @XmlEnumValue("Transom")
    TRANSOM("Transom"),
    @XmlEnumValue("Transverse")
    TRANSVERSE("Transverse"),
    @XmlEnumValue("Vinyl")
    VINYL("Vinyl"),
    @XmlEnumValue("Wood")
    WOOD("Wood");
    private final String value;

    WindowBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WindowBase fromValue(String v) {
        for (WindowBase c: WindowBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
