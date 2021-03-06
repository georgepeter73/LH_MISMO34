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
 * <p>Java class for RegulatoryAgencyBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegulatoryAgencyBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CFPB"/>
 *     &lt;enumeration value="FDIC"/>
 *     &lt;enumeration value="FRS"/>
 *     &lt;enumeration value="HUD"/>
 *     &lt;enumeration value="NationalCreditUnionAssociation"/>
 *     &lt;enumeration value="OfficeOfTheComptrollerOfTheCurrency"/>
 *     &lt;enumeration value="OfficeOfThriftSupervision"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryAgencyBase")
@XmlEnum
public enum RegulatoryAgencyBase {


    /**
     * Consumer Financial Protection Bureau
     * 
     */
    CFPB("CFPB"),

    /**
     * Federal Deposit Insurance Corporation
     * 
     */
    FDIC("FDIC"),

    /**
     * Federal Reserve System
     * 
     */
    FRS("FRS"),

    /**
     * Department of Housing and Urban Development
     * 
     */
    HUD("HUD"),
    @XmlEnumValue("NationalCreditUnionAssociation")
    NATIONAL_CREDIT_UNION_ASSOCIATION("NationalCreditUnionAssociation"),
    @XmlEnumValue("OfficeOfTheComptrollerOfTheCurrency")
    OFFICE_OF_THE_COMPTROLLER_OF_THE_CURRENCY("OfficeOfTheComptrollerOfTheCurrency"),
    @XmlEnumValue("OfficeOfThriftSupervision")
    OFFICE_OF_THRIFT_SUPERVISION("OfficeOfThriftSupervision"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RegulatoryAgencyBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegulatoryAgencyBase fromValue(String v) {
        for (RegulatoryAgencyBase c: RegulatoryAgencyBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
