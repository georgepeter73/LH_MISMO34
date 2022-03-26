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
 * <p>Java class for BankruptcyDelayCategoryBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankruptcyDelayCategoryBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ContestedOrLitigatedAction"/>
 *     &lt;enumeration value="ImpactedPartyProcess"/>
 *     &lt;enumeration value="LegalProcess"/>
 *     &lt;enumeration value="LegislativeChange"/>
 *     &lt;enumeration value="Mediation"/>
 *     &lt;enumeration value="MilitaryIndulgence"/>
 *     &lt;enumeration value="MissingDocument"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Probate"/>
 *     &lt;enumeration value="TitleIssue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankruptcyDelayCategoryBase")
@XmlEnum
public enum BankruptcyDelayCategoryBase {


    /**
     * An adversary proceeding has caused a delay.
     * 
     */
    @XmlEnumValue("ContestedOrLitigatedAction")
    CONTESTED_OR_LITIGATED_ACTION("ContestedOrLitigatedAction"),

    /**
     * A change, request or issue by a servicer, lienholder, borrower or other interested party created a delay.
     * 
     */
    @XmlEnumValue("ImpactedPartyProcess")
    IMPACTED_PARTY_PROCESS("ImpactedPartyProcess"),

    /**
     * A delay due to a legal process affecting an element of the bankruptcy estate initiated outside of the bankruptcy process.
     * 
     */
    @XmlEnumValue("LegalProcess")
    LEGAL_PROCESS("LegalProcess"),

    /**
     * Retroactive legislative action created a delay.
     * 
     */
    @XmlEnumValue("LegislativeChange")
    LEGISLATIVE_CHANGE("LegislativeChange"),

    /**
     * Pending mediation created a delay.
     * 
     */
    @XmlEnumValue("Mediation")
    MEDIATION("Mediation"),

    /**
     * The military status of a borrower created a delay.
     * 
     */
    @XmlEnumValue("MilitaryIndulgence")
    MILITARY_INDULGENCE("MilitaryIndulgence"),

    /**
     * A missing document created a delay.
     * 
     */
    @XmlEnumValue("MissingDocument")
    MISSING_DOCUMENT("MissingDocument"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The probate of an estate has created a delay.
     * 
     */
    @XmlEnumValue("Probate")
    PROBATE("Probate"),

    /**
     *  Issues with the title or chain of title to the property created a delay.
     * 
     */
    @XmlEnumValue("TitleIssue")
    TITLE_ISSUE("TitleIssue");
    private final String value;

    BankruptcyDelayCategoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankruptcyDelayCategoryBase fromValue(String v) {
        for (BankruptcyDelayCategoryBase c: BankruptcyDelayCategoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
