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
 * <p>Java class for ChargeOffItemBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeOffItemBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AdditionalLien"/>
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="Fraud"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="UncollectedInterest"/>
 *     &lt;enumeration value="UncollectedPrincipal"/>
 *     &lt;enumeration value="UnrecoverableSpecialHazard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeOffItemBase")
@XmlEnum
public enum ChargeOffItemBase {


    /**
     * A loss related to a second lien.
     * 
     */
    @XmlEnumValue("AdditionalLien")
    ADDITIONAL_LIEN("AdditionalLien"),

    /**
     * A loss resulting from a deficient valuation or a debt service reduction in a bankruptcy.
     * 
     */
    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),

    /**
     * A loss resulting from intentional misstatement, misrepresentation, or omission by an applicant or other interested parties.
     * 
     */
    @XmlEnumValue("Fraud")
    FRAUD("Fraud"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A loss from uncollected interest.
     * 
     */
    @XmlEnumValue("UncollectedInterest")
    UNCOLLECTED_INTEREST("UncollectedInterest"),

    /**
     * A loss from uncollected principal.
     * 
     */
    @XmlEnumValue("UncollectedPrincipal")
    UNCOLLECTED_PRINCIPAL("UncollectedPrincipal"),

    /**
     * A loss suffered by a mortgaged property that is classified as a special hazard in the governing documents.
     * 
     */
    @XmlEnumValue("UnrecoverableSpecialHazard")
    UNRECOVERABLE_SPECIAL_HAZARD("UnrecoverableSpecialHazard");
    private final String value;

    ChargeOffItemBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeOffItemBase fromValue(String v) {
        for (ChargeOffItemBase c: ChargeOffItemBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
