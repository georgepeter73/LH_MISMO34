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
 * <p>Java class for IntegratedDisclosureSectionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegratedDisclosureSectionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="DueFromBorrowerAtClosing"/>
 *     &lt;enumeration value="DueFromSellerAtClosing"/>
 *     &lt;enumeration value="DueToSellerAtClosing"/>
 *     &lt;enumeration value="InitialEscrowPaymentAtClosing"/>
 *     &lt;enumeration value="OriginationCharges"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherCosts"/>
 *     &lt;enumeration value="PaidAlreadyByOrOnBehalfOfBorrowerAtClosing"/>
 *     &lt;enumeration value="PayoffsAndPayments"/>
 *     &lt;enumeration value="Prepaids"/>
 *     &lt;enumeration value="ServicesBorrowerDidNotShopFor"/>
 *     &lt;enumeration value="ServicesBorrowerDidShopFor"/>
 *     &lt;enumeration value="ServicesYouCannotShopFor"/>
 *     &lt;enumeration value="ServicesYouCanShopFor"/>
 *     &lt;enumeration value="TaxesAndOtherGovernmentFees"/>
 *     &lt;enumeration value="TotalClosingCosts"/>
 *     &lt;enumeration value="TotalLoanCosts"/>
 *     &lt;enumeration value="TotalOtherCosts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntegratedDisclosureSectionBase")
@XmlEnum
public enum IntegratedDisclosureSectionBase {

    @XmlEnumValue("DueFromBorrowerAtClosing")
    DUE_FROM_BORROWER_AT_CLOSING("DueFromBorrowerAtClosing"),
    @XmlEnumValue("DueFromSellerAtClosing")
    DUE_FROM_SELLER_AT_CLOSING("DueFromSellerAtClosing"),
    @XmlEnumValue("DueToSellerAtClosing")
    DUE_TO_SELLER_AT_CLOSING("DueToSellerAtClosing"),
    @XmlEnumValue("InitialEscrowPaymentAtClosing")
    INITIAL_ESCROW_PAYMENT_AT_CLOSING("InitialEscrowPaymentAtClosing"),
    @XmlEnumValue("OriginationCharges")
    ORIGINATION_CHARGES("OriginationCharges"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherCosts")
    OTHER_COSTS("OtherCosts"),
    @XmlEnumValue("PaidAlreadyByOrOnBehalfOfBorrowerAtClosing")
    PAID_ALREADY_BY_OR_ON_BEHALF_OF_BORROWER_AT_CLOSING("PaidAlreadyByOrOnBehalfOfBorrowerAtClosing"),
    @XmlEnumValue("PayoffsAndPayments")
    PAYOFFS_AND_PAYMENTS("PayoffsAndPayments"),
    @XmlEnumValue("Prepaids")
    PREPAIDS("Prepaids"),
    @XmlEnumValue("ServicesBorrowerDidNotShopFor")
    SERVICES_BORROWER_DID_NOT_SHOP_FOR("ServicesBorrowerDidNotShopFor"),
    @XmlEnumValue("ServicesBorrowerDidShopFor")
    SERVICES_BORROWER_DID_SHOP_FOR("ServicesBorrowerDidShopFor"),
    @XmlEnumValue("ServicesYouCannotShopFor")
    SERVICES_YOU_CANNOT_SHOP_FOR("ServicesYouCannotShopFor"),
    @XmlEnumValue("ServicesYouCanShopFor")
    SERVICES_YOU_CAN_SHOP_FOR("ServicesYouCanShopFor"),
    @XmlEnumValue("TaxesAndOtherGovernmentFees")
    TAXES_AND_OTHER_GOVERNMENT_FEES("TaxesAndOtherGovernmentFees"),
    @XmlEnumValue("TotalClosingCosts")
    TOTAL_CLOSING_COSTS("TotalClosingCosts"),
    @XmlEnumValue("TotalLoanCosts")
    TOTAL_LOAN_COSTS("TotalLoanCosts"),
    @XmlEnumValue("TotalOtherCosts")
    TOTAL_OTHER_COSTS("TotalOtherCosts");
    private final String value;

    IntegratedDisclosureSectionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegratedDisclosureSectionBase fromValue(String v) {
        for (IntegratedDisclosureSectionBase c: IntegratedDisclosureSectionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
