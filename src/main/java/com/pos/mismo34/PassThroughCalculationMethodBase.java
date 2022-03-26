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
 * <p>Java class for PassThroughCalculationMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassThroughCalculationMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BottomUp"/>
 *     &lt;enumeration value="TopDown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassThroughCalculationMethodBase")
@XmlEnum
public enum PassThroughCalculationMethodBase {


    /**
     * The pass through rate is determined by adding the index to the contract margin (Investor required margin). Investor required margin is defined by investor contract. Other factors may apply.
     * 
     */
    @XmlEnumValue("BottomUp")
    BOTTOM_UP("BottomUp"),

    /**
     * The pass through rate is determined by subtracting the Minimum Service Fee Rate and the Guaranty Fee Rate from the Note Rate after the new interest rate is determined. Service Fee Rate and Guaranty Fee Rate are defined by the investor contract. Other factors may apply.
     * 
     */
    @XmlEnumValue("TopDown")
    TOP_DOWN("TopDown");
    private final String value;

    PassThroughCalculationMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassThroughCalculationMethodBase fromValue(String v) {
        for (PassThroughCalculationMethodBase c: PassThroughCalculationMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
