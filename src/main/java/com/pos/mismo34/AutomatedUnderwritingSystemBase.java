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
 * <p>Java class for AutomatedUnderwritingSystemBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutomatedUnderwritingSystemBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Assetwise"/>
 *     &lt;enumeration value="Capstone"/>
 *     &lt;enumeration value="Clues"/>
 *     &lt;enumeration value="DecisionEngine"/>
 *     &lt;enumeration value="DesktopUnderwriter"/>
 *     &lt;enumeration value="ECS"/>
 *     &lt;enumeration value="FHAScorecard"/>
 *     &lt;enumeration value="FirstMortgageCreditScore"/>
 *     &lt;enumeration value="GuaranteedUnderwritingSystem"/>
 *     &lt;enumeration value="LoanProspector"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Strategyware"/>
 *     &lt;enumeration value="Zippy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutomatedUnderwritingSystemBase")
@XmlEnum
public enum AutomatedUnderwritingSystemBase {


    /**
     * An automated underwriting system provided by GMAC / RFC.
     * 
     */
    @XmlEnumValue("Assetwise")
    ASSETWISE("Assetwise"),
    @XmlEnumValue("Capstone")
    CAPSTONE("Capstone"),

    /**
     * An automated underwriting system provided by Bank of America.
     * 
     */
    @XmlEnumValue("Clues")
    CLUES("Clues"),

    /**
     * An automated underwriting system provided by Citibank.
     * 
     */
    @XmlEnumValue("DecisionEngine")
    DECISION_ENGINE("DecisionEngine"),

    /**
     * An automated underwriting system provided by Fannie Mae.
     * 
     */
    @XmlEnumValue("DesktopUnderwriter")
    DESKTOP_UNDERWRITER("DesktopUnderwriter"),

    /**
     * An automated underwriting system provided by Wells Fargo.
     * 
     */
    ECS("ECS"),

    /**
     * The loan scoring tool used by lenders to manage workflow and expedite the endorsement process for FHA loans. The FHA TOTAL Scorecard evaluates the overall creditworthiness of the applicants and determines an associated risk level of a loan's eligibility for insurance by FHA.
     * 
     */
    @XmlEnumValue("FHAScorecard")
    FHA_SCORECARD("FHAScorecard"),

    /**
     * An automated underwriting system provided by Citibank.
     * 
     */
    @XmlEnumValue("FirstMortgageCreditScore")
    FIRST_MORTGAGE_CREDIT_SCORE("FirstMortgageCreditScore"),

    /**
     * An automated underwriting system provided by USDA Rural Development.
     * 
     */
    @XmlEnumValue("GuaranteedUnderwritingSystem")
    GUARANTEED_UNDERWRITING_SYSTEM("GuaranteedUnderwritingSystem"),

    /**
     * An automated underwriting system provided by Freddie Mac.
     * 
     */
    @XmlEnumValue("LoanProspector")
    LOAN_PROSPECTOR("LoanProspector"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Strategyware")
    STRATEGYWARE("Strategyware"),

    /**
     * Chase
     * 
     */
    @XmlEnumValue("Zippy")
    ZIPPY("Zippy");
    private final String value;

    AutomatedUnderwritingSystemBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomatedUnderwritingSystemBase fromValue(String v) {
        for (AutomatedUnderwritingSystemBase c: AutomatedUnderwritingSystemBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
