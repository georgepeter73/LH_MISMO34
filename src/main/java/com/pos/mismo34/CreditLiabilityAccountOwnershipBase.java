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
 * <p>Java class for CreditLiabilityAccountOwnershipBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditLiabilityAccountOwnershipBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AuthorizedUser"/>
 *     &lt;enumeration value="Comaker"/>
 *     &lt;enumeration value="Deceased"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="JointContractualLiability"/>
 *     &lt;enumeration value="JointParticipating"/>
 *     &lt;enumeration value="Maker"/>
 *     &lt;enumeration value="OnBehalfOf"/>
 *     &lt;enumeration value="Terminated"/>
 *     &lt;enumeration value="Undesignated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditLiabilityAccountOwnershipBase")
@XmlEnum
public enum CreditLiabilityAccountOwnershipBase {


    /**
     * This individual is an authorized user of this account; another individual has contractual responsibility.
     * 
     */
    @XmlEnumValue("AuthorizedUser")
    AUTHORIZED_USER("AuthorizedUser"),

    /**
     * This individual has guaranteed this account and assumes responsibility should the maker default.
     * 
     */
    @XmlEnumValue("Comaker")
    COMAKER("Comaker"),

    /**
     * The individual associated with the account has been reported as deceased or death benefit claims have been reported as filed under thename of the individual.
     * 
     */
    @XmlEnumValue("Deceased")
    DECEASED("Deceased"),

    /**
     * This individual has contractual responsibility for the account and is primarily responsible for its payment.
     * 
     */
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),

    /**
     * Individuals using this account have contractual responsibility to repay all debts on this account.
     * 
     */
    @XmlEnumValue("JointContractualLiability")
    JOINT_CONTRACTUAL_LIABILITY("JointContractualLiability"),

    /**
     * Individual is an authorized user on an account with another. Others associated with account may or may not have contractual responsibility.
     * 
     */
    @XmlEnumValue("JointParticipating")
    JOINT_PARTICIPATING("JointParticipating"),

    /**
     * This individual is responsible for the account, which may be guaranteed by a co-maker.
     * 
     */
    @XmlEnumValue("Maker")
    MAKER("Maker"),

    /**
     * This individual has signed an application for the purpose of securing credit for another individual, other than spouse.
     * 
     */
    @XmlEnumValue("OnBehalfOf")
    ON_BEHALF_OF("OnBehalfOf"),

    /**
     * No longer associated with account.
     * 
     */
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated"),

    /**
     * Account ownership type has not been designated.
     * 
     */
    @XmlEnumValue("Undesignated")
    UNDESIGNATED("Undesignated");
    private final String value;

    CreditLiabilityAccountOwnershipBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditLiabilityAccountOwnershipBase fromValue(String v) {
        for (CreditLiabilityAccountOwnershipBase c: CreditLiabilityAccountOwnershipBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
