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
 * <p>Java class for ClosingEventLocationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClosingEventLocationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ClosingAgentBranch"/>
 *     &lt;enumeration value="LenderBranch"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SignerBusiness"/>
 *     &lt;enumeration value="SignerCurrentResidence"/>
 *     &lt;enumeration value="SubjectProperty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClosingEventLocationBase")
@XmlEnum
public enum ClosingEventLocationBase {


    /**
     * The signer is in person at a location controlled by the closing agent.
     * 
     */
    @XmlEnumValue("ClosingAgentBranch")
    CLOSING_AGENT_BRANCH("ClosingAgentBranch"),

    /**
     * The signer is in person at a location controlled by the lender.
     * 
     */
    @XmlEnumValue("LenderBranch")
    LENDER_BRANCH("LenderBranch"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Mobile closing will occur at the signer's business.
     * 
     */
    @XmlEnumValue("SignerBusiness")
    SIGNER_BUSINESS("SignerBusiness"),

    /**
     * Mobile closing will occur at the signer's current residence.
     * 
     */
    @XmlEnumValue("SignerCurrentResidence")
    SIGNER_CURRENT_RESIDENCE("SignerCurrentResidence"),

    /**
     * Mobile closing will occur at the subject property.
     * 
     */
    @XmlEnumValue("SubjectProperty")
    SUBJECT_PROPERTY("SubjectProperty");
    private final String value;

    ClosingEventLocationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClosingEventLocationBase fromValue(String v) {
        for (ClosingEventLocationBase c: ClosingEventLocationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
