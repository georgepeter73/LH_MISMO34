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
 * <p>Java class for SecuritySystemBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritySystemBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="InteractiveAlarmSystem"/>
 *     &lt;enumeration value="LocalAlarmSystem"/>
 *     &lt;enumeration value="MonitoredAlarmSystem"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecuritySystemBase")
@XmlEnum
public enum SecuritySystemBase {


    /**
     * An alarm system that is connected to a central commerical monitoring station and allows two way communication between the property and the monitoring station.
     * 
     */
    @XmlEnumValue("InteractiveAlarmSystem")
    INTERACTIVE_ALARM_SYSTEM("InteractiveAlarmSystem"),

    /**
     * An alarm system that is not connected to a central commerical monitoring station.
     * 
     */
    @XmlEnumValue("LocalAlarmSystem")
    LOCAL_ALARM_SYSTEM("LocalAlarmSystem"),

    /**
     * An alarm system that is connected to a central commerical monitoring station.
     * 
     */
    @XmlEnumValue("MonitoredAlarmSystem")
    MONITORED_ALARM_SYSTEM("MonitoredAlarmSystem"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SecuritySystemBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecuritySystemBase fromValue(String v) {
        for (SecuritySystemBase c: SecuritySystemBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
