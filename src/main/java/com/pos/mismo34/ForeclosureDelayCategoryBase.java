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
 * <p>Java class for ForeclosureDelayCategoryBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeclosureDelayCategoryBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BankruptcyFiled"/>
 *     &lt;enumeration value="ContestedOrLitigatedForeclosure"/>
 *     &lt;enumeration value="ImpactedPartyProcess"/>
 *     &lt;enumeration value="LegalProcess"/>
 *     &lt;enumeration value="LegislativeChange"/>
 *     &lt;enumeration value="Mediation"/>
 *     &lt;enumeration value="MilitaryIndulgence"/>
 *     &lt;enumeration value="MissingDocuments"/>
 *     &lt;enumeration value="MonetaryTransactionPending"/>
 *     &lt;enumeration value="Moratorium"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Probate"/>
 *     &lt;enumeration value="PropertyCondition"/>
 *     &lt;enumeration value="PropertySeizure"/>
 *     &lt;enumeration value="TitleIssue"/>
 *     &lt;enumeration value="WorkoutInReview"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForeclosureDelayCategoryBase")
@XmlEnum
public enum ForeclosureDelayCategoryBase {


    /**
     * A borrower has filed for bankruptcy and has been given an automatic stay.
     * 
     */
    @XmlEnumValue("BankruptcyFiled")
    BANKRUPTCY_FILED("BankruptcyFiled"),

    /**
     *  A borrower has acquired an attorney and legal proceedings have begun.
     * 
     */
    @XmlEnumValue("ContestedOrLitigatedForeclosure")
    CONTESTED_OR_LITIGATED_FORECLOSURE("ContestedOrLitigatedForeclosure"),

    /**
     * A change, request or issue by an investor, servicer or guarantor created a processing delay.
     * 
     */
    @XmlEnumValue("ImpactedPartyProcess")
    IMPACTED_PARTY_PROCESS("ImpactedPartyProcess"),

    /**
     * A legal action has been initiated that created a processing delay.
     * 
     */
    @XmlEnumValue("LegalProcess")
    LEGAL_PROCESS("LegalProcess"),

    /**
     * Federal or State legislative action created a processing delay.
     * 
     */
    @XmlEnumValue("LegislativeChange")
    LEGISLATIVE_CHANGE("LegislativeChange"),

    /**
     * Pending mediation created a processing delay.
     * 
     */
    @XmlEnumValue("Mediation")
    MEDIATION("Mediation"),

    /**
     * The military status of a borrower created a processing delay.
     * 
     */
    @XmlEnumValue("MilitaryIndulgence")
    MILITARY_INDULGENCE("MilitaryIndulgence"),

    /**
     * A missing document created a processing delay.
     * 
     */
    @XmlEnumValue("MissingDocuments")
    MISSING_DOCUMENTS("MissingDocuments"),

    /**
     * A monetary transaction has been registered but not yet confirmed creating a processing delay.
     * 
     */
    @XmlEnumValue("MonetaryTransactionPending")
    MONETARY_TRANSACTION_PENDING("MonetaryTransactionPending"),

    /**
     * A government, investor or servicer moratorium created a processing delay.
     * 
     */
    @XmlEnumValue("Moratorium")
    MORATORIUM("Moratorium"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A borrower is deceased and the estate probate process created a processing delay.
     * 
     */
    @XmlEnumValue("Probate")
    PROBATE("Probate"),

    /**
     * An issue with the property condition created a processing delay.
     * 
     */
    @XmlEnumValue("PropertyCondition")
    PROPERTY_CONDITION("PropertyCondition"),

    /**
     * The seizure of property by the Federal Government created a processing delay.
     * 
     */
    @XmlEnumValue("PropertySeizure")
    PROPERTY_SEIZURE("PropertySeizure"),

    /**
     * Issues with the title or chain of title to the property created a processing delay.
     * 
     */
    @XmlEnumValue("TitleIssue")
    TITLE_ISSUE("TitleIssue"),

    /**
     * A foreclosure alternative program is under review or in progress which created a processing delay.
     * 
     */
    @XmlEnumValue("WorkoutInReview")
    WORKOUT_IN_REVIEW("WorkoutInReview");
    private final String value;

    ForeclosureDelayCategoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeclosureDelayCategoryBase fromValue(String v) {
        for (ForeclosureDelayCategoryBase c: ForeclosureDelayCategoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
