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
 * <p>Java class for AdvanceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvanceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Appraisal"/>
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="HomeownersAssociationDues"/>
 *     &lt;enumeration value="Interest"/>
 *     &lt;enumeration value="LegalFees"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Principal"/>
 *     &lt;enumeration value="PropertyInspection"/>
 *     &lt;enumeration value="PropertyInsurance"/>
 *     &lt;enumeration value="PropertyPreservation"/>
 *     &lt;enumeration value="PropertyTaxes"/>
 *     &lt;enumeration value="ReliefOverpaymentReimbursement"/>
 *     &lt;enumeration value="ReverseMortgagePaymentPlanChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvanceBase")
@XmlEnum
public enum AdvanceBase {

    @XmlEnumValue("Appraisal")
    APPRAISAL("Appraisal"),

    /**
     * All escrowed amounts that were advanced.
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),
    @XmlEnumValue("HomeownersAssociationDues")
    HOMEOWNERS_ASSOCIATION_DUES("HomeownersAssociationDues"),
    @XmlEnumValue("Interest")
    INTEREST("Interest"),
    @XmlEnumValue("LegalFees")
    LEGAL_FEES("LegalFees"),
    MI("MI"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Principal")
    PRINCIPAL("Principal"),
    @XmlEnumValue("PropertyInspection")
    PROPERTY_INSPECTION("PropertyInspection"),

    /**
     * Insurance on the dwelling associated with the property. Includes hazard, flood and others.
     * 
     */
    @XmlEnumValue("PropertyInsurance")
    PROPERTY_INSURANCE("PropertyInsurance"),
    @XmlEnumValue("PropertyPreservation")
    PROPERTY_PRESERVATION("PropertyPreservation"),
    @XmlEnumValue("PropertyTaxes")
    PROPERTY_TAXES("PropertyTaxes"),

    /**
     * Funds returned to the borrower based on back dated relief payment amount.
     * 
     */
    @XmlEnumValue("ReliefOverpaymentReimbursement")
    RELIEF_OVERPAYMENT_REIMBURSEMENT("ReliefOverpaymentReimbursement"),
    @XmlEnumValue("ReverseMortgagePaymentPlanChange")
    REVERSE_MORTGAGE_PAYMENT_PLAN_CHANGE("ReverseMortgagePaymentPlanChange");
    private final String value;

    AdvanceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdvanceBase fromValue(String v) {
        for (AdvanceBase c: AdvanceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
