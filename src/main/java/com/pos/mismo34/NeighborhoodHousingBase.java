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
 * <p>Java class for NeighborhoodHousingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NeighborhoodHousingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Condominium"/>
 *     &lt;enumeration value="Cooperative"/>
 *     &lt;enumeration value="ManufacturedHome"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SingleFamily"/>
 *     &lt;enumeration value="TwoToFourFamily"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NeighborhoodHousingBase")
@XmlEnum
public enum NeighborhoodHousingBase {


    /**
     * identifies multiunit structure or property in which persons hold fee simple title to individual units and an undivided interest in common interest.
     * 
     */
    @XmlEnumValue("Condominium")
    CONDOMINIUM("Condominium"),
    @XmlEnumValue("Cooperative")
    COOPERATIVE("Cooperative"),
    @XmlEnumValue("ManufacturedHome")
    MANUFACTURED_HOME("ManufacturedHome"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SingleFamily")
    SINGLE_FAMILY("SingleFamily"),
    @XmlEnumValue("TwoToFourFamily")
    TWO_TO_FOUR_FAMILY("TwoToFourFamily");
    private final String value;

    NeighborhoodHousingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NeighborhoodHousingBase fromValue(String v) {
        for (NeighborhoodHousingBase c: NeighborhoodHousingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
