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
 * <p>Java class for JointAssetLiabilityReportingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JointAssetLiabilityReportingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Jointly"/>
 *     &lt;enumeration value="NotJointly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JointAssetLiabilityReportingBase")
@XmlEnum
public enum JointAssetLiabilityReportingBase {


    /**
     * The income or assets of a person other than the borrower (including the spouse of the borrower ) will be used as a basis for loan qualification.
     * 
     */
    @XmlEnumValue("Jointly")
    JOINTLY("Jointly"),

    /**
     * Assets and liabilities are sufficiently separate and are being reported as such for the co-borrowers.
     * 
     */
    @XmlEnumValue("NotJointly")
    NOT_JOINTLY("NotJointly");
    private final String value;

    JointAssetLiabilityReportingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JointAssetLiabilityReportingBase fromValue(String v) {
        for (JointAssetLiabilityReportingBase c: JointAssetLiabilityReportingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
