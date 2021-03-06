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
 * <p>Java class for DelinquencyReportingPropertyOverallConditionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DelinquencyReportingPropertyOverallConditionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Condemned"/>
 *     &lt;enumeration value="Excellent"/>
 *     &lt;enumeration value="Fair"/>
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="NoPropertyInspection"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Poor"/>
 *     &lt;enumeration value="PropertyInaccessible"/>
 *     &lt;enumeration value="RemovedOrDestroyed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelinquencyReportingPropertyOverallConditionBase")
@XmlEnum
public enum DelinquencyReportingPropertyOverallConditionBase {


    /**
     * The property has been condemned by the local housing authority.
     * 
     */
    @XmlEnumValue("Condemned")
    CONDEMNED("Condemned"),
    @XmlEnumValue("Excellent")
    EXCELLENT("Excellent"),
    @XmlEnumValue("Fair")
    FAIR("Fair"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("NoPropertyInspection")
    NO_PROPERTY_INSPECTION("NoPropertyInspection"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Poor")
    POOR("Poor"),
    @XmlEnumValue("PropertyInaccessible")
    PROPERTY_INACCESSIBLE("PropertyInaccessible"),
    @XmlEnumValue("RemovedOrDestroyed")
    REMOVED_OR_DESTROYED("RemovedOrDestroyed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DelinquencyReportingPropertyOverallConditionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelinquencyReportingPropertyOverallConditionBase fromValue(String v) {
        for (DelinquencyReportingPropertyOverallConditionBase c: DelinquencyReportingPropertyOverallConditionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
