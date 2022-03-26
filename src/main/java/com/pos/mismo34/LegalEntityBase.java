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
 * <p>Java class for LegalEntityBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalEntityBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Corporation"/>
 *     &lt;enumeration value="CorporationSole"/>
 *     &lt;enumeration value="Estate"/>
 *     &lt;enumeration value="GovernmentEntity"/>
 *     &lt;enumeration value="JointVenture"/>
 *     &lt;enumeration value="LimitedLiabilityCompany"/>
 *     &lt;enumeration value="LimitedPartnership"/>
 *     &lt;enumeration value="NonProfitCorporation"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Partnership"/>
 *     &lt;enumeration value="SoleProprietorship"/>
 *     &lt;enumeration value="Trust"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegalEntityBase")
@XmlEnum
public enum LegalEntityBase {

    @XmlEnumValue("Corporation")
    CORPORATION("Corporation"),
    @XmlEnumValue("CorporationSole")
    CORPORATION_SOLE("CorporationSole"),
    @XmlEnumValue("Estate")
    ESTATE("Estate"),
    @XmlEnumValue("GovernmentEntity")
    GOVERNMENT_ENTITY("GovernmentEntity"),
    @XmlEnumValue("JointVenture")
    JOINT_VENTURE("JointVenture"),
    @XmlEnumValue("LimitedLiabilityCompany")
    LIMITED_LIABILITY_COMPANY("LimitedLiabilityCompany"),
    @XmlEnumValue("LimitedPartnership")
    LIMITED_PARTNERSHIP("LimitedPartnership"),
    @XmlEnumValue("NonProfitCorporation")
    NON_PROFIT_CORPORATION("NonProfitCorporation"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),
    @XmlEnumValue("SoleProprietorship")
    SOLE_PROPRIETORSHIP("SoleProprietorship"),
    @XmlEnumValue("Trust")
    TRUST("Trust");
    private final String value;

    LegalEntityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegalEntityBase fromValue(String v) {
        for (LegalEntityBase c: LegalEntityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
