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
 * <p>Java class for PoolStructureBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoolStructureBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="InvestorDefinedMultipleLender"/>
 *     &lt;enumeration value="LenderInitiatedMultipleLender"/>
 *     &lt;enumeration value="MultipleIssuer"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SingleIssuer"/>
 *     &lt;enumeration value="SingleLender"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PoolStructureBase")
@XmlEnum
public enum PoolStructureBase {

    @XmlEnumValue("InvestorDefinedMultipleLender")
    INVESTOR_DEFINED_MULTIPLE_LENDER("InvestorDefinedMultipleLender"),
    @XmlEnumValue("LenderInitiatedMultipleLender")
    LENDER_INITIATED_MULTIPLE_LENDER("LenderInitiatedMultipleLender"),

    /**
     * Indicates a pool originated by multiple parties to back a single issuance of securities.
     * 
     */
    @XmlEnumValue("MultipleIssuer")
    MULTIPLE_ISSUER("MultipleIssuer"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Indicates a pool originated by a single party to back a single issuance of securities.
     * 
     */
    @XmlEnumValue("SingleIssuer")
    SINGLE_ISSUER("SingleIssuer"),
    @XmlEnumValue("SingleLender")
    SINGLE_LENDER("SingleLender");
    private final String value;

    PoolStructureBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoolStructureBase fromValue(String v) {
        for (PoolStructureBase c: PoolStructureBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
