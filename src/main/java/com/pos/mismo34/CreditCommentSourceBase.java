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
 * <p>Java class for CreditCommentSourceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCommentSourceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Borrower"/>
 *     &lt;enumeration value="CreditBureau"/>
 *     &lt;enumeration value="Equifax"/>
 *     &lt;enumeration value="Experian"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="RepositoryBureau"/>
 *     &lt;enumeration value="TransUnion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCommentSourceBase")
@XmlEnum
public enum CreditCommentSourceBase {


    /**
     * The comment was from the borrower or coborrower.
     * 
     */
    @XmlEnumValue("Borrower")
    BORROWER("Borrower"),

    /**
     * The comment text was from the credit bureau that prepared the credit report.
     * 
     */
    @XmlEnumValue("CreditBureau")
    CREDIT_BUREAU("CreditBureau"),

    /**
     * Equifax - the credit data repository provided the comment and/or code.
     * 
     */
    @XmlEnumValue("Equifax")
    EQUIFAX("Equifax"),

    /**
     * Experian - the credit data repository provided the comment and/or code.
     * 
     */
    @XmlEnumValue("Experian")
    EXPERIAN("Experian"),

    /**
     * The lender provided the comment and/or code.
     * 
     */
    @XmlEnumValue("Lender")
    LENDER("Lender"),

    /**
     * One of the repository bureaus - not specified - provided the comment and/or code.
     * 
     */
    @XmlEnumValue("RepositoryBureau")
    REPOSITORY_BUREAU("RepositoryBureau"),

    /**
     * Trans Union - the credit data repository provided the comment and/or code.
     * 
     */
    @XmlEnumValue("TransUnion")
    TRANS_UNION("TransUnion");
    private final String value;

    CreditCommentSourceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCommentSourceBase fromValue(String v) {
        for (CreditCommentSourceBase c: CreditCommentSourceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
