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
 * <p>Java class for ClosingAdjustmentItemPaidByBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClosingAdjustmentItemPaidByBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Broker"/>
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Correspondent"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="ThirdParty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClosingAdjustmentItemPaidByBase")
@XmlEnum
public enum ClosingAdjustmentItemPaidByBase {

    @XmlEnumValue("Broker")
    BROKER("Broker"),
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),
    @XmlEnumValue("Correspondent")
    CORRESPONDENT("Correspondent"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("ThirdParty")
    THIRD_PARTY("ThirdParty");
    private final String value;

    ClosingAdjustmentItemPaidByBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClosingAdjustmentItemPaidByBase fromValue(String v) {
        for (ClosingAdjustmentItemPaidByBase c: ClosingAdjustmentItemPaidByBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
