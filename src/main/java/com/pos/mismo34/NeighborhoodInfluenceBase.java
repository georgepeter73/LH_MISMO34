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
 * <p>Java class for NeighborhoodInfluenceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NeighborhoodInfluenceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AdequacyOfShopping"/>
 *     &lt;enumeration value="AdequacyOfUtilities"/>
 *     &lt;enumeration value="AppealToMarket"/>
 *     &lt;enumeration value="Broadband"/>
 *     &lt;enumeration value="ConvenienceToEmployment"/>
 *     &lt;enumeration value="ConvenienceToFreewayAccess"/>
 *     &lt;enumeration value="ConvenienceToGrammarSchool"/>
 *     &lt;enumeration value="ConvenienceToPublicTransportation"/>
 *     &lt;enumeration value="ConvenienceToShopping"/>
 *     &lt;enumeration value="EmploymentConditions"/>
 *     &lt;enumeration value="EmploymentOpportunities"/>
 *     &lt;enumeration value="EmploymentStability"/>
 *     &lt;enumeration value="GeneralAppearanceOfProperties"/>
 *     &lt;enumeration value="HousingSupply"/>
 *     &lt;enumeration value="MarketConditions"/>
 *     &lt;enumeration value="MarketingTime"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PoliceAndFireProtection"/>
 *     &lt;enumeration value="PropertyCompatibility"/>
 *     &lt;enumeration value="PropertyValues"/>
 *     &lt;enumeration value="ProtectionFromDetrimentalConditions"/>
 *     &lt;enumeration value="RecreationalFacilities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NeighborhoodInfluenceBase")
@XmlEnum
public enum NeighborhoodInfluenceBase {

    @XmlEnumValue("AdequacyOfShopping")
    ADEQUACY_OF_SHOPPING("AdequacyOfShopping"),
    @XmlEnumValue("AdequacyOfUtilities")
    ADEQUACY_OF_UTILITIES("AdequacyOfUtilities"),
    @XmlEnumValue("AppealToMarket")
    APPEAL_TO_MARKET("AppealToMarket"),
    @XmlEnumValue("Broadband")
    BROADBAND("Broadband"),
    @XmlEnumValue("ConvenienceToEmployment")
    CONVENIENCE_TO_EMPLOYMENT("ConvenienceToEmployment"),
    @XmlEnumValue("ConvenienceToFreewayAccess")
    CONVENIENCE_TO_FREEWAY_ACCESS("ConvenienceToFreewayAccess"),
    @XmlEnumValue("ConvenienceToGrammarSchool")
    CONVENIENCE_TO_GRAMMAR_SCHOOL("ConvenienceToGrammarSchool"),
    @XmlEnumValue("ConvenienceToPublicTransportation")
    CONVENIENCE_TO_PUBLIC_TRANSPORTATION("ConvenienceToPublicTransportation"),
    @XmlEnumValue("ConvenienceToShopping")
    CONVENIENCE_TO_SHOPPING("ConvenienceToShopping"),
    @XmlEnumValue("EmploymentConditions")
    EMPLOYMENT_CONDITIONS("EmploymentConditions"),
    @XmlEnumValue("EmploymentOpportunities")
    EMPLOYMENT_OPPORTUNITIES("EmploymentOpportunities"),
    @XmlEnumValue("EmploymentStability")
    EMPLOYMENT_STABILITY("EmploymentStability"),
    @XmlEnumValue("GeneralAppearanceOfProperties")
    GENERAL_APPEARANCE_OF_PROPERTIES("GeneralAppearanceOfProperties"),
    @XmlEnumValue("HousingSupply")
    HOUSING_SUPPLY("HousingSupply"),
    @XmlEnumValue("MarketConditions")
    MARKET_CONDITIONS("MarketConditions"),
    @XmlEnumValue("MarketingTime")
    MARKETING_TIME("MarketingTime"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PoliceAndFireProtection")
    POLICE_AND_FIRE_PROTECTION("PoliceAndFireProtection"),
    @XmlEnumValue("PropertyCompatibility")
    PROPERTY_COMPATIBILITY("PropertyCompatibility"),
    @XmlEnumValue("PropertyValues")
    PROPERTY_VALUES("PropertyValues"),
    @XmlEnumValue("ProtectionFromDetrimentalConditions")
    PROTECTION_FROM_DETRIMENTAL_CONDITIONS("ProtectionFromDetrimentalConditions"),
    @XmlEnumValue("RecreationalFacilities")
    RECREATIONAL_FACILITIES("RecreationalFacilities");
    private final String value;

    NeighborhoodInfluenceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NeighborhoodInfluenceBase fromValue(String v) {
        for (NeighborhoodInfluenceBase c: NeighborhoodInfluenceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
