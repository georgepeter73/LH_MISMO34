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
 * <p>Java class for IdentityDocumentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentityDocumentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BankStatement"/>
 *     &lt;enumeration value="DriversLicense"/>
 *     &lt;enumeration value="EmployeeIdentification"/>
 *     &lt;enumeration value="MilitaryIdentification"/>
 *     &lt;enumeration value="NationalIdentification"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="PrivateIdentification"/>
 *     &lt;enumeration value="StateIdentification"/>
 *     &lt;enumeration value="TaxpayerIdentification"/>
 *     &lt;enumeration value="Visa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentityDocumentBase")
@XmlEnum
public enum IdentityDocumentBase {


    /**
     * Evidences transactions recorded and account balances for a depository account of an individual or business during a specified period.
     * 
     */
    @XmlEnumValue("BankStatement")
    BANK_STATEMENT("BankStatement"),

    /**
     * A document which authorizes a person to operate a motor vehicle on a public roadway. Evidences a person's identity and driver's license identifier.
     * 
     */
    @XmlEnumValue("DriversLicense")
    DRIVERS_LICENSE("DriversLicense"),

    /**
     * A document issued by an employer which evidences a person's identity and employee identifier.
     * 
     */
    @XmlEnumValue("EmployeeIdentification")
    EMPLOYEE_IDENTIFICATION("EmployeeIdentification"),

    /**
     * A document issued by the US Department of Defense which evidences a person's identity and military identifier.
     * 
     */
    @XmlEnumValue("MilitaryIdentification")
    MILITARY_IDENTIFICATION("MilitaryIdentification"),

    /**
     * A document which assigns a national identifier to a party for a government purpose like taxation or benefits. In the US this is an IRS or Social Security Administration document such as a Social Security Card. Evidences a party's identity and National Identifier Value.
     * 
     */
    @XmlEnumValue("NationalIdentification")
    NATIONAL_IDENTIFICATION("NationalIdentification"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A document issued by a national government which certifies a person's identity, nationality, and passport identifier.
     * 
     */
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),

    /**
     * A document issued by a private organization other than an employer which associates a person with the organization, such as a credit union membership. Evidences a person's identity and private identifier.
     * 
     */
    @XmlEnumValue("PrivateIdentification")
    PRIVATE_IDENTIFICATION("PrivateIdentification"),

    /**
     * A unique number assigned by a state to identify a resident. Often used in lieu of a driver's license number.
     * 
     */
    @XmlEnumValue("StateIdentification")
    STATE_IDENTIFICATION("StateIdentification"),

    /**
     * A document which assigns a taxpayer identifier to a party. Evidences a party's identity and taxpayer identifier value.
     * 
     */
    @XmlEnumValue("TaxpayerIdentification")
    TAXPAYER_IDENTIFICATION("TaxpayerIdentification"),

    /**
     *  A stamp in the passport issued by an American Embassy or Consulate abroad, allowing the holder to request entry to the United States in a certain visa status within the time period specified on the visa. A visa may allow one, two or multiple entries before the expiration date of the visa.
     * 
     */
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    IdentityDocumentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentityDocumentBase fromValue(String v) {
        for (IdentityDocumentBase c: IdentityDocumentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
