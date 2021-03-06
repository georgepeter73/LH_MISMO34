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
 * <p>Java class for PropertyValuationServiceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyValuationServiceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="LimitedSummaryReport"/>
 *     &lt;enumeration value="NonUSPAPAutomatedValuationModel"/>
 *     &lt;enumeration value="NonUSPAPPriceOpinion"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="RestrictedUseReport"/>
 *     &lt;enumeration value="SelfContainedReport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyValuationServiceBase")
@XmlEnum
public enum PropertyValuationServiceBase {

    @XmlEnumValue("LimitedSummaryReport")
    LIMITED_SUMMARY_REPORT("LimitedSummaryReport"),
    @XmlEnumValue("NonUSPAPAutomatedValuationModel")
    NON_USPAP_AUTOMATED_VALUATION_MODEL("NonUSPAPAutomatedValuationModel"),
    @XmlEnumValue("NonUSPAPPriceOpinion")
    NON_USPAP_PRICE_OPINION("NonUSPAPPriceOpinion"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("RestrictedUseReport")
    RESTRICTED_USE_REPORT("RestrictedUseReport"),
    @XmlEnumValue("SelfContainedReport")
    SELF_CONTAINED_REPORT("SelfContainedReport");
    private final String value;

    PropertyValuationServiceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyValuationServiceBase fromValue(String v) {
        for (PropertyValuationServiceBase c: PropertyValuationServiceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
