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
 * <p>Java class for ValuationIntendedUseBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationIntendedUseBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EstatePlanning"/>
 *     &lt;enumeration value="Litigation"/>
 *     &lt;enumeration value="MIRemoval"/>
 *     &lt;enumeration value="MortgageLossMitigation"/>
 *     &lt;enumeration value="MortgageOrigination"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PrePurchaseConsultationAssistance"/>
 *     &lt;enumeration value="PrivateSale"/>
 *     &lt;enumeration value="PropertyOwnerAssistanceConsultation"/>
 *     &lt;enumeration value="SecondaryMarketDueDiligence"/>
 *     &lt;enumeration value="TaxAppeal"/>
 *     &lt;enumeration value="TaxAssessment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationIntendedUseBase")
@XmlEnum
public enum ValuationIntendedUseBase {


    /**
     * A valuation analysis to provide information to the property owner,  trustee or advisor, which may include an opinion of value and or consultation.
     * 
     */
    @XmlEnumValue("EstatePlanning")
    ESTATE_PLANNING("EstatePlanning"),

    /**
     * Professional consultation for property dispute resolution  including expert witness testimony, eminent domain cases, divorce proceedings and general litigation support.
     * 
     */
    @XmlEnumValue("Litigation")
    LITIGATION("Litigation"),

    /**
     * Valuation for recomputing a loan to value ratio.
     * 
     */
    @XmlEnumValue("MIRemoval")
    MI_REMOVAL("MIRemoval"),
    @XmlEnumValue("MortgageLossMitigation")
    MORTGAGE_LOSS_MITIGATION("MortgageLossMitigation"),
    @XmlEnumValue("MortgageOrigination")
    MORTGAGE_ORIGINATION("MortgageOrigination"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Professional services provided directly to the potential buyer of a property.
     * 
     */
    @XmlEnumValue("PrePurchaseConsultationAssistance")
    PRE_PURCHASE_CONSULTATION_ASSISTANCE("PrePurchaseConsultationAssistance"),
    @XmlEnumValue("PrivateSale")
    PRIVATE_SALE("PrivateSale"),

    /**
     * Professional services provided directly to the property owner.
     * 
     */
    @XmlEnumValue("PropertyOwnerAssistanceConsultation")
    PROPERTY_OWNER_ASSISTANCE_CONSULTATION("PropertyOwnerAssistanceConsultation"),
    @XmlEnumValue("SecondaryMarketDueDiligence")
    SECONDARY_MARKET_DUE_DILIGENCE("SecondaryMarketDueDiligence"),

    /**
     * Valuation for the purpose of establishing an appropriate opinion of value for tax value disputes.
     * 
     */
    @XmlEnumValue("TaxAppeal")
    TAX_APPEAL("TaxAppeal"),

    /**
     * Valuation for the purpose of establishing an appropriate opinion of value for property tax assessment purposes.
     * 
     */
    @XmlEnumValue("TaxAssessment")
    TAX_ASSESSMENT("TaxAssessment");
    private final String value;

    ValuationIntendedUseBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValuationIntendedUseBase fromValue(String v) {
        for (ValuationIntendedUseBase c: ValuationIntendedUseBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
