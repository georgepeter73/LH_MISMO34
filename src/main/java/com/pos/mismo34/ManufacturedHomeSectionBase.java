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
 * <p>Java class for ManufacturedHomeSectionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManufacturedHomeSectionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SectionFour"/>
 *     &lt;enumeration value="SectionOne"/>
 *     &lt;enumeration value="SectionThree"/>
 *     &lt;enumeration value="SectionTwo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManufacturedHomeSectionBase")
@XmlEnum
public enum ManufacturedHomeSectionBase {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SectionFour")
    SECTION_FOUR("SectionFour"),
    @XmlEnumValue("SectionOne")
    SECTION_ONE("SectionOne"),
    @XmlEnumValue("SectionThree")
    SECTION_THREE("SectionThree"),
    @XmlEnumValue("SectionTwo")
    SECTION_TWO("SectionTwo");
    private final String value;

    ManufacturedHomeSectionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturedHomeSectionBase fromValue(String v) {
        for (ManufacturedHomeSectionBase c: ManufacturedHomeSectionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
