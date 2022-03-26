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
 * <p>Java class for REOMarketingPartyBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="REOMarketingPartyBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Investor"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="MortgageInsuranceCompany"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="Servicer"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "REOMarketingPartyBase")
@XmlEnum
public enum REOMarketingPartyBase {

    @XmlEnumValue("Investor")
    INVESTOR("Investor"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("MortgageInsuranceCompany")
    MORTGAGE_INSURANCE_COMPANY("MortgageInsuranceCompany"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The organization that sells the loan to the investor.
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("Servicer")
    SERVICER("Servicer"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    REOMarketingPartyBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REOMarketingPartyBase fromValue(String v) {
        for (REOMarketingPartyBase c: REOMarketingPartyBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
