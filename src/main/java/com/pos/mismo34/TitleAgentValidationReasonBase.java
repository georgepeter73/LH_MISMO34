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
 * <p>Java class for TitleAgentValidationReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleAgentValidationReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AgentAddressInvalid"/>
 *     &lt;enumeration value="AgentIdentifierFormatInvalid"/>
 *     &lt;enumeration value="AgentJurisdictionInvalid"/>
 *     &lt;enumeration value="AmountExceedsAuthorizedLimit"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="ClosingDateInvalid"/>
 *     &lt;enumeration value="NotActive"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TitleUnderwriterInvalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TitleAgentValidationReasonBase")
@XmlEnum
public enum TitleAgentValidationReasonBase {


    /**
     * Agent ID specified was found but the address specified was not matching the trading partner's system.
     * 
     */
    @XmlEnumValue("AgentAddressInvalid")
    AGENT_ADDRESS_INVALID("AgentAddressInvalid"),

    /**
     * The format of the agent's ID was incorrectly formatted based on agreed format between trading partners.
     * 
     */
    @XmlEnumValue("AgentIdentifierFormatInvalid")
    AGENT_IDENTIFIER_FORMAT_INVALID("AgentIdentifierFormatInvalid"),

    /**
     * Agent ID specified was found but the agent is not recognized as a valid agent for that jurisdiction.
     * 
     */
    @XmlEnumValue("AgentJurisdictionInvalid")
    AGENT_JURISDICTION_INVALID("AgentJurisdictionInvalid"),

    /**
     * Agent ID specified was found but the loan amount exceeds the maximum amount the agent is authorized to issue policy.
     * 
     */
    @XmlEnumValue("AmountExceedsAuthorizedLimit")
    AMOUNT_EXCEEDS_AUTHORIZED_LIMIT("AmountExceedsAuthorizedLimit"),

    /**
     * Agent ID specified was found but is currently a cancelled agent for the underwriter.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * The closing date specified was not valid for the transaction specified.
     * 
     */
    @XmlEnumValue("ClosingDateInvalid")
    CLOSING_DATE_INVALID("ClosingDateInvalid"),

    /**
     * Agent ID specified was found but is currently not active agent in the trading partner's system.
     * 
     */
    @XmlEnumValue("NotActive")
    NOT_ACTIVE("NotActive"),

    /**
     * Place the validation reason type information in TitleAgentValidationReasonTypeOtherDescription this would be used to pass trading partner specific reason codes.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Agent ID specified was found but the Title Underwriter identified is not recognized as a valid Title Underwriter or is not valid for that agent in the trading partner's system.
     * 
     */
    @XmlEnumValue("TitleUnderwriterInvalid")
    TITLE_UNDERWRITER_INVALID("TitleUnderwriterInvalid");
    private final String value;

    TitleAgentValidationReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TitleAgentValidationReasonBase fromValue(String v) {
        for (TitleAgentValidationReasonBase c: TitleAgentValidationReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}