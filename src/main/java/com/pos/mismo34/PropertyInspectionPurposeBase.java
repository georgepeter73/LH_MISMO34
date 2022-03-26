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
 * <p>Java class for PropertyInspectionPurposeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyInspectionPurposeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BuildingCodeCompliance"/>
 *     &lt;enumeration value="BuildingComponent"/>
 *     &lt;enumeration value="ComplianceInspection"/>
 *     &lt;enumeration value="EnergyEfficiency"/>
 *     &lt;enumeration value="EnvironmentalHazard"/>
 *     &lt;enumeration value="HomeInspection"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Pest"/>
 *     &lt;enumeration value="PropertyPreservation"/>
 *     &lt;enumeration value="Valuation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyInspectionPurposeBase")
@XmlEnum
public enum PropertyInspectionPurposeBase {


    /**
     * Conducted by a local building official from the municipality or county or other government agency for purposes of enforcing building codes and statutes.
     * 
     */
    @XmlEnumValue("BuildingCodeCompliance")
    BUILDING_CODE_COMPLIANCE("BuildingCodeCompliance"),

    /**
     * An inspection conducted on a single system by a contractor, tradesman or professional inspector, licensed where required.
     * 
     */
    @XmlEnumValue("BuildingComponent")
    BUILDING_COMPONENT("BuildingComponent"),

    /**
     * An inspection conducted to meet specific business requirements of mortgage insurers, hazard insurers, investors or servicers.
     * 
     */
    @XmlEnumValue("ComplianceInspection")
    COMPLIANCE_INSPECTION("ComplianceInspection"),

    /**
     * An inspection conducted to confirm and rate the energy effeciency of a structure.
     * 
     */
    @XmlEnumValue("EnergyEfficiency")
    ENERGY_EFFICIENCY("EnergyEfficiency"),

    /**
     * An inspection conducted for an environmental hazard such as vapor intrusion, asbestos, radon, mold, etc.
     * 
     */
    @XmlEnumValue("EnvironmentalHazard")
    ENVIRONMENTAL_HAZARD("EnvironmentalHazard"),

    /**
     * Conducted by a professional property inspector, licensed where required, and at least three systems are inspected.
     * 
     */
    @XmlEnumValue("HomeInspection")
    HOME_INSPECTION("HomeInspection"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Conducted a professional pest control technician, licensed where required, and includes wood-destroying pests.
     * 
     */
    @XmlEnumValue("Pest")
    PEST("Pest"),

    /**
     * Conducted as a part of securing or managing a property by a property manager or contractor on behalf of a lender, servicer or investor.
     * 
     */
    @XmlEnumValue("PropertyPreservation")
    PROPERTY_PRESERVATION("PropertyPreservation"),

    /**
     * Conducted as a part of the preparation of a property valuation assignment by a licensed or certified real estate appraiser.
     * 
     */
    @XmlEnumValue("Valuation")
    VALUATION("Valuation");
    private final String value;

    PropertyInspectionPurposeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyInspectionPurposeBase fromValue(String v) {
        for (PropertyInspectionPurposeBase c: PropertyInspectionPurposeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
