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
 * <p>Java class for ProjectBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OtherPhase"/>
 *     &lt;enumeration value="SubjectPhase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectBase")
@XmlEnum
public enum ProjectBase {

    @XmlEnumValue("OtherPhase")
    OTHER_PHASE("OtherPhase"),
    @XmlEnumValue("SubjectPhase")
    SUBJECT_PHASE("SubjectPhase");
    private final String value;

    ProjectBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectBase fromValue(String v) {
        for (ProjectBase c: ProjectBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
