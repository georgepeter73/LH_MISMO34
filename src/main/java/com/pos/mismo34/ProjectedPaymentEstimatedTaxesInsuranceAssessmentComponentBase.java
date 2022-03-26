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
 * <p>Java class for ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CondominiumAssociationDues"/>
 *     &lt;enumeration value="CondominiumAssociationSpecialAssessment"/>
 *     &lt;enumeration value="CooperativeAssociationDues"/>
 *     &lt;enumeration value="CooperativeAssociationSpecialAssessment"/>
 *     &lt;enumeration value="GroundRent"/>
 *     &lt;enumeration value="HomeownersAssociationDues"/>
 *     &lt;enumeration value="HomeownersAssociationSpecialAssessment"/>
 *     &lt;enumeration value="HomeownersInsurance"/>
 *     &lt;enumeration value="LeaseholdPayment"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PropertyTaxes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase")
@XmlEnum
public enum ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase {


    /**
     * Fee payable to condominium association in which the subject property is located, which is intended to pay electricity bills for street lights, landscaping, and insurance, maintenance and repairs to community facilities like clubhouses, pools, and exercise rooms and may also cover the salaries of condominium association employees and/or third party management fees.
     * 
     */
    @XmlEnumValue("CondominiumAssociationDues")
    CONDOMINIUM_ASSOCIATION_DUES("CondominiumAssociationDues"),

    /**
     * Fee payable to condominium association in which the subject property is located for capital improvements, repairs, utility service upgrades, etc. that are assessed in addition to the regularly occurring condominium dues.
     * 
     */
    @XmlEnumValue("CondominiumAssociationSpecialAssessment")
    CONDOMINIUM_ASSOCIATION_SPECIAL_ASSESSMENT("CondominiumAssociationSpecialAssessment"),

    /**
     * Fee payable to cooperative in which the subject property is located, which is intended to pay common utilities, landscaping, and insurance, maintenance and repairs to cooperative facilities and may also cover the salaries of cooperative employees and/or third party management fees.
     * 
     */
    @XmlEnumValue("CooperativeAssociationDues")
    COOPERATIVE_ASSOCIATION_DUES("CooperativeAssociationDues"),

    /**
     * Fee payable to cooperative association by the unit owners which is in addition to the regularly occurring maintenance fees for a specific project or outstanding debt that was not part of the annual budget/assessment. The special assessment is against all unit owners and requires them to pay their fractional interest of the money being requested. The payment of the special assessment is divided by each unit owner's interest. The amount may be requested immediately from each unit owner or may be broken into installments depending on how they have decided to handle it.
     * 
     */
    @XmlEnumValue("CooperativeAssociationSpecialAssessment")
    COOPERATIVE_ASSOCIATION_SPECIAL_ASSESSMENT("CooperativeAssociationSpecialAssessment"),

    /**
     * A sum paid for land lease by the owner of a building to the owner of the land on which it is located for state, territory, tribal or other land not pursuant to a leasehold.
     * 
     */
    @XmlEnumValue("GroundRent")
    GROUND_RENT("GroundRent"),

    /**
     * Fee payable by homeowners to homeowners or neighborhood association within which the subject property is located, which is intended to pay for the daily operation of the association and may include but is not limited to items such as electricity bills for street lights, landscaping, and maintenance and repairs to community facilities like clubhouses, pools, and exercise rooms and may also cover insurance on community assets, the salaries of HOA employees or third party management fees.
     * 
     */
    @XmlEnumValue("HomeownersAssociationDues")
    HOMEOWNERS_ASSOCIATION_DUES("HomeownersAssociationDues"),

    /**
     * Fee payable by homeowners to homeowners or neighborhood association in which the subject property is located for items such as capital improvements, utility service upgrades, etc., that may be assessed in addition to the regularly occurring association dues.
     * 
     */
    @XmlEnumValue("HomeownersAssociationSpecialAssessment")
    HOMEOWNERS_ASSOCIATION_SPECIAL_ASSESSMENT("HomeownersAssociationSpecialAssessment"),

    /**
     * Periodic amount paid for coverage against losses or damage to the insured subject property from hazards such as fire, theft or other named perils. May also cover personal property and/or include riders providing supplemental coverage, e.g. windstorm, hurricanes, or other named causes.
     * 
     */
    @XmlEnumValue("HomeownersInsurance")
    HOMEOWNERS_INSURANCE("HomeownersInsurance"),

    /**
     * An amount of periodic payment due pursuant to a leasehold agreement.
     * 
     */
    @XmlEnumValue("LeaseholdPayment")
    LEASEHOLD_PAYMENT("LeaseholdPayment"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Property taxes in aggregate levied by all authorities in which the subject property is located.
     * 
     */
    @XmlEnumValue("PropertyTaxes")
    PROPERTY_TAXES("PropertyTaxes");
    private final String value;

    ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase fromValue(String v) {
        for (ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase c: ProjectedPaymentEstimatedTaxesInsuranceAssessmentComponentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
