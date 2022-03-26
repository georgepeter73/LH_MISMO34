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
 * <p>Java class for LoanPriceQuoteBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanPriceQuoteBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BuySide"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SellSide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanPriceQuoteBase")
@XmlEnum
public enum LoanPriceQuoteBase {


    /**
     * At any point in the supply chain of loans, information about the costs of buying the loan collateral asset or the servicing rights to the loan is placed in the container with this attribute.
     * 
     */
    @XmlEnumValue("BuySide")
    BUY_SIDE("BuySide"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * At any point in the supply chain of loans, information about the potential of actual income from the sale of the loan collateral asset or the servicing rights to the loan is placed in the container with this attribute.
     * 
     */
    @XmlEnumValue("SellSide")
    SELL_SIDE("SellSide");
    private final String value;

    LoanPriceQuoteBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanPriceQuoteBase fromValue(String v) {
        for (LoanPriceQuoteBase c: LoanPriceQuoteBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
