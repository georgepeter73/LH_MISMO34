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
 * <p>Java class for ConstructionStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Existing"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Planned"/>
 *     &lt;enumeration value="Proposed"/>
 *     &lt;enumeration value="SubjectToAlteration"/>
 *     &lt;enumeration value="SubjectToAlterationImprovementRepairAndRehabilitation"/>
 *     &lt;enumeration value="SubstantiallyRehabilitated"/>
 *     &lt;enumeration value="UnderConstruction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionStatusBase")
@XmlEnum
public enum ConstructionStatusBase {


    /**
     * The improvements are 100%  complete.
     * 
     */
    @XmlEnumValue("Existing")
    EXISTING("Existing"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Indicates that construction is approved but not started.
     * 
     */
    @XmlEnumValue("Planned")
    PLANNED("Planned"),

    /**
     * Construction of the improvements has not started and description is based on plans and specifications and/or substantially similar documentation.
     * 
     */
    @XmlEnumValue("Proposed")
    PROPOSED("Proposed"),
    @XmlEnumValue("SubjectToAlteration")
    SUBJECT_TO_ALTERATION("SubjectToAlteration"),
    @XmlEnumValue("SubjectToAlterationImprovementRepairAndRehabilitation")
    SUBJECT_TO_ALTERATION_IMPROVEMENT_REPAIR_AND_REHABILITATION("SubjectToAlterationImprovementRepairAndRehabilitation"),
    @XmlEnumValue("SubstantiallyRehabilitated")
    SUBSTANTIALLY_REHABILITATED("SubstantiallyRehabilitated"),

    /**
     * Construction of the improvements has begun but is not complete.
     * 
     */
    @XmlEnumValue("UnderConstruction")
    UNDER_CONSTRUCTION("UnderConstruction");
    private final String value;

    ConstructionStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionStatusBase fromValue(String v) {
        for (ConstructionStatusBase c: ConstructionStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}