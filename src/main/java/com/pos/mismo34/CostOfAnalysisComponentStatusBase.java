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
 * <p>Java class for CostOfAnalysisComponentStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostOfAnalysisComponentStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Proposed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostOfAnalysisComponentStatusBase")
@XmlEnum
public enum CostOfAnalysisComponentStatusBase {


    /**
     * Cost refers to items complete at time of analysis.
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * Cost refers to plans to improve or work in progress at time of analysis.
     * 
     */
    @XmlEnumValue("Proposed")
    PROPOSED("Proposed");
    private final String value;

    CostOfAnalysisComponentStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostOfAnalysisComponentStatusBase fromValue(String v) {
        for (CostOfAnalysisComponentStatusBase c: CostOfAnalysisComponentStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
