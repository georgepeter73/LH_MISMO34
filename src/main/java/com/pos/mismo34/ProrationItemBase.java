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
 * <p>Java class for ProrationItemBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProrationItemBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BoroughPropertyTax"/>
 *     &lt;enumeration value="CityPropertyTax"/>
 *     &lt;enumeration value="CondominiumAssociationDues"/>
 *     &lt;enumeration value="CondominiumAssociationSpecialAssessment"/>
 *     &lt;enumeration value="CooperativeAssociationDues"/>
 *     &lt;enumeration value="CooperativeAssociationSpecialAssessment"/>
 *     &lt;enumeration value="CountyPropertyTax"/>
 *     &lt;enumeration value="DistrictPropertyTax"/>
 *     &lt;enumeration value="EarthquakeInsurancePremium"/>
 *     &lt;enumeration value="FloodInsurancePremium"/>
 *     &lt;enumeration value="GroundRent"/>
 *     &lt;enumeration value="HailInsurancePremium"/>
 *     &lt;enumeration value="HazardInsurancePremium"/>
 *     &lt;enumeration value="HomeownersAssociationDues"/>
 *     &lt;enumeration value="HomeownersAssociationSpecialAssessment"/>
 *     &lt;enumeration value="HomeownersInsurancePremium"/>
 *     &lt;enumeration value="InterestOnLoanAssumption"/>
 *     &lt;enumeration value="MortgageInsurancePremium"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PastDuePropertyTax"/>
 *     &lt;enumeration value="RentFromSubjectProperty"/>
 *     &lt;enumeration value="SellersReserveAccountAssumption"/>
 *     &lt;enumeration value="StatePropertyTax"/>
 *     &lt;enumeration value="TownPropertyTax"/>
 *     &lt;enumeration value="Utilities"/>
 *     &lt;enumeration value="VolcanoInsurancePremium"/>
 *     &lt;enumeration value="WindAndStormInsurancePremium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProrationItemBase")
@XmlEnum
public enum ProrationItemBase {


    /**
     * Property tax levied by the borough in which the subject property is located.
     * 
     */
    @XmlEnumValue("BoroughPropertyTax")
    BOROUGH_PROPERTY_TAX("BoroughPropertyTax"),

    /**
     * Property tax levied by the city in which the subject property is located.
     * 
     */
    @XmlEnumValue("CityPropertyTax")
    CITY_PROPERTY_TAX("CityPropertyTax"),

    /**
     * Fee payable to condominium association in which the subject property is located, which is intended to pay electricity bills for street lights, landscaping, and maintenance and repairs to community facilities like clubhouses, pools, and exercise rooms and may also cover insurance on community assets, the salaries of condominium association employees and/or third party management fees.
     * 
     */
    @XmlEnumValue("CondominiumAssociationDues")
    CONDOMINIUM_ASSOCIATION_DUES("CondominiumAssociationDues"),

    /**
     * Fee payable to condominium association in which the subject property is located for capital improvements, utility service upgrades, etc. that are assessed in addition to the regularly occurring condominium dues.
     * 
     */
    @XmlEnumValue("CondominiumAssociationSpecialAssessment")
    CONDOMINIUM_ASSOCIATION_SPECIAL_ASSESSMENT("CondominiumAssociationSpecialAssessment"),

    /**
     * Fee payable to cooperative in which the subject property is located, which is intended to pay common utilities, landscaping, and maintenance and repairs to cooperative facilities and may also cover insurance on cooperative assets, the salaries of cooperative employees and/or third party management fees.
     * 
     */
    @XmlEnumValue("CooperativeAssociationDues")
    COOPERATIVE_ASSOCIATION_DUES("CooperativeAssociationDues"),

    /**
     * Fee payable to cooperative association or corporation in which the subject property is located for capital improvements, utility service upgrades, etc. that are assessed in addition to the regularly occurring dues, fees or debt service.
     * 
     */
    @XmlEnumValue("CooperativeAssociationSpecialAssessment")
    COOPERATIVE_ASSOCIATION_SPECIAL_ASSESSMENT("CooperativeAssociationSpecialAssessment"),

    /**
     * Property tax levied by the county in which the subject property is located.
     * 
     */
    @XmlEnumValue("CountyPropertyTax")
    COUNTY_PROPERTY_TAX("CountyPropertyTax"),

    /**
     * Property tax levied by the district in which the subject property is located.
     * 
     */
    @XmlEnumValue("DistrictPropertyTax")
    DISTRICT_PROPERTY_TAX("DistrictPropertyTax"),

    /**
     * Fee payable to insurer to provide property insurance against loss from earthquake, land tremors, landslide, mudflow, or other earth movement whether the damage is caused by an earthquake.
     * 
     */
    @XmlEnumValue("EarthquakeInsurancePremium")
    EARTHQUAKE_INSURANCE_PREMIUM("EarthquakeInsurancePremium"),

    /**
     * Fee paid for flood insurance coverage on the subject property and may include coverage for contents.
     * 
     */
    @XmlEnumValue("FloodInsurancePremium")
    FLOOD_INSURANCE_PREMIUM("FloodInsurancePremium"),

    /**
     * A sum paid for land lease by the owner of a building to the owner of the land on which it is located.
     * 
     */
    @XmlEnumValue("GroundRent")
    GROUND_RENT("GroundRent"),

    /**
     * Cost of coverage for hail damage insurance, which typically covers the cost of rebuilding the subject property if losses are caused by hail storms.
     * 
     */
    @XmlEnumValue("HailInsurancePremium")
    HAIL_INSURANCE_PREMIUM("HailInsurancePremium"),

    /**
     * Fee paid for coverage on the subject property for losses or damage due to fire or other named perils.
     * 
     */
    @XmlEnumValue("HazardInsurancePremium")
    HAZARD_INSURANCE_PREMIUM("HazardInsurancePremium"),

    /**
     * Fee payable to homeowners or neighborhood association within which the subject property is located, which is intended to pay electricity bills for street lights, landscaping, and maintenance and repairs to community facilities like clubhouses, pools, and exercise rooms and may also cover insurance on community assets, the salaries of HOA employees or third party management fees.
     * 
     */
    @XmlEnumValue("HomeownersAssociationDues")
    HOMEOWNERS_ASSOCIATION_DUES("HomeownersAssociationDues"),

    /**
     * Fee payable to homeowners or neighborhood association in which the subject property is located for capital improvements, utility service upgrades, etc., that are assessed in addition to the regularly occurring association dues.
     * 
     */
    @XmlEnumValue("HomeownersAssociationSpecialAssessment")
    HOMEOWNERS_ASSOCIATION_SPECIAL_ASSESSMENT("HomeownersAssociationSpecialAssessment"),

    /**
     * Periodic amount paid for coverage against hazards, theft and other losses on the insured subject property and sometimes insured contents of personal property, and other improvements (fences, porches, patios, driveways, landscaping, accessory buildings, in ground pools, etc.) May or may not include riders to insure against losses caused by windstorms, hurricanes, etc.
     * 
     */
    @XmlEnumValue("HomeownersInsurancePremium")
    HOMEOWNERS_INSURANCE_PREMIUM("HomeownersInsurancePremium"),
    @XmlEnumValue("InterestOnLoanAssumption")
    INTEREST_ON_LOAN_ASSUMPTION("InterestOnLoanAssumption"),

    /**
     * Fee for Insurance or guaranty to protect lender against the non-payment of, or default on, an individual mortgage.
     * 
     */
    @XmlEnumValue("MortgageInsurancePremium")
    MORTGAGE_INSURANCE_PREMIUM("MortgageInsurancePremium"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Amount of real estate taxes on the subject property that are past due as of the closing date.
     * 
     */
    @XmlEnumValue("PastDuePropertyTax")
    PAST_DUE_PROPERTY_TAX("PastDuePropertyTax"),

    /**
     * Periodic amount paid by a tenant for occupancy of a property.
     * 
     */
    @XmlEnumValue("RentFromSubjectProperty")
    RENT_FROM_SUBJECT_PROPERTY("RentFromSubjectProperty"),

    /**
     * A reserve account funded by the property seller that is being assumed by the borrower.
     * 
     */
    @XmlEnumValue("SellersReserveAccountAssumption")
    SELLERS_RESERVE_ACCOUNT_ASSUMPTION("SellersReserveAccountAssumption"),

    /**
     * Property tax levied by the state in which the subject property is located.
     * 
     */
    @XmlEnumValue("StatePropertyTax")
    STATE_PROPERTY_TAX("StatePropertyTax"),

    /**
     * Property tax levied by the town in which the subject property is located.
     * 
     */
    @XmlEnumValue("TownPropertyTax")
    TOWN_PROPERTY_TAX("TownPropertyTax"),

    /**
     * Cost of services to provide power, heat, water, waste removal and/or sewer to the subject property.
     * 
     */
    @XmlEnumValue("Utilities")
    UTILITIES("Utilities"),

    /**
     * Periodic amount paid for coverage against losses on the insured subject property and sometimes insured contents of personal property, and other improvements (fences, porches, patios, driveways, landscaping, accessory buildings, in ground pools, etc.) associated with volcano eruptions near the subject property.
     * 
     */
    @XmlEnumValue("VolcanoInsurancePremium")
    VOLCANO_INSURANCE_PREMIUM("VolcanoInsurancePremium"),

    /**
     * Periodic amount paid for coverage against losses on the insured subject property and sometimes insured contents of personal property, and other improvements (fences, porches, patios, driveways, landscaping, accessory buildings, in ground pools, etc.) associated with windstorms, tornadoes and hurricanes affecting the subject property.
     * 
     */
    @XmlEnumValue("WindAndStormInsurancePremium")
    WIND_AND_STORM_INSURANCE_PREMIUM("WindAndStormInsurancePremium");
    private final String value;

    ProrationItemBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProrationItemBase fromValue(String v) {
        for (ProrationItemBase c: ProrationItemBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
