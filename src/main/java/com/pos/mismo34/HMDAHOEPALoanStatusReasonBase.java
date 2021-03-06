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
 * <p>Java class for HMDA_HOEPALoanStatusReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HMDA_HOEPALoanStatusReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="HOEPALoanBecauseOfAPR"/>
 *     &lt;enumeration value="HOEPALoanBecauseOfBothAPRAndPointsAndFees"/>
 *     &lt;enumeration value="HOEPALoanBecauseOfPointsAndFees"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HMDA_HOEPALoanStatusReasonBase")
@XmlEnum
public enum HMDAHOEPALoanStatusReasonBase {


    /**
     * The annual percentage rate for the transaction exceeds the high-cost mortgage thresholds.
     * 
     */
    @XmlEnumValue("HOEPALoanBecauseOfAPR")
    HOEPA_LOAN_BECAUSE_OF_APR("HOEPALoanBecauseOfAPR"),

    /**
     * Both the annual percentage rate and the points and fees for the transaction exceed the high-cost mortgage thresholds.
     * 
     */
    @XmlEnumValue("HOEPALoanBecauseOfBothAPRAndPointsAndFees")
    HOEPA_LOAN_BECAUSE_OF_BOTH_APR_AND_POINTS_AND_FEES("HOEPALoanBecauseOfBothAPRAndPointsAndFees"),

    /**
     * The points and fees for the transaction exceed the high-cost mortgage thresholds.
     * 
     */
    @XmlEnumValue("HOEPALoanBecauseOfPointsAndFees")
    HOEPA_LOAN_BECAUSE_OF_POINTS_AND_FEES("HOEPALoanBecauseOfPointsAndFees"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HMDAHOEPALoanStatusReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HMDAHOEPALoanStatusReasonBase fromValue(String v) {
        for (HMDAHOEPALoanStatusReasonBase c: HMDAHOEPALoanStatusReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
