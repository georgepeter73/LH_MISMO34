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
 * <p>Java class for PurchaseCreditSourceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseCreditSourceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BorrowerPaidOutsideClosing"/>
 *     &lt;enumeration value="BuilderDeveloper"/>
 *     &lt;enumeration value="Employer"/>
 *     &lt;enumeration value="FederalAgency"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="LocalAgency"/>
 *     &lt;enumeration value="NonParentRelative"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="PropertySeller"/>
 *     &lt;enumeration value="RealEstateAgent"/>
 *     &lt;enumeration value="StateAgency"/>
 *     &lt;enumeration value="UnrelatedFriend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseCreditSourceBase")
@XmlEnum
public enum PurchaseCreditSourceBase {

    @XmlEnumValue("BorrowerPaidOutsideClosing")
    BORROWER_PAID_OUTSIDE_CLOSING("BorrowerPaidOutsideClosing"),
    @XmlEnumValue("BuilderDeveloper")
    BUILDER_DEVELOPER("BuilderDeveloper"),
    @XmlEnumValue("Employer")
    EMPLOYER("Employer"),
    @XmlEnumValue("FederalAgency")
    FEDERAL_AGENCY("FederalAgency"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("LocalAgency")
    LOCAL_AGENCY("LocalAgency"),

    /**
     * A relative other than a parent.
     * 
     */
    @XmlEnumValue("NonParentRelative")
    NON_PARENT_RELATIVE("NonParentRelative"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("PropertySeller")
    PROPERTY_SELLER("PropertySeller"),
    @XmlEnumValue("RealEstateAgent")
    REAL_ESTATE_AGENT("RealEstateAgent"),
    @XmlEnumValue("StateAgency")
    STATE_AGENCY("StateAgency"),
    @XmlEnumValue("UnrelatedFriend")
    UNRELATED_FRIEND("UnrelatedFriend");
    private final String value;

    PurchaseCreditSourceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseCreditSourceBase fromValue(String v) {
        for (PurchaseCreditSourceBase c: PurchaseCreditSourceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
