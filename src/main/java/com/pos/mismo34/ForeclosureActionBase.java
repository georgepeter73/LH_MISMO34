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
 * <p>Java class for ForeclosureActionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeclosureActionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BreachNoticeSent"/>
 *     &lt;enumeration value="EvictionApproved"/>
 *     &lt;enumeration value="EvictionCompleted"/>
 *     &lt;enumeration value="EvictionStarted"/>
 *     &lt;enumeration value="FirstLegalAction"/>
 *     &lt;enumeration value="ForeclosureCompleted"/>
 *     &lt;enumeration value="ForeclosureSaleCancelled"/>
 *     &lt;enumeration value="ForeclosureSaleConfirmed"/>
 *     &lt;enumeration value="ForeclosureSaleHeld"/>
 *     &lt;enumeration value="ForeclosureSalePostponed"/>
 *     &lt;enumeration value="ForeclosureSalePublicationCommenced"/>
 *     &lt;enumeration value="ForeclosureSaleRescinded"/>
 *     &lt;enumeration value="ForeclosureSaleScheduled"/>
 *     &lt;enumeration value="ForeclosureTerminated"/>
 *     &lt;enumeration value="FormalNoticeFiled"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="RedemptionPeriodEnded"/>
 *     &lt;enumeration value="RedemptionPeriodStarted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForeclosureActionBase")
@XmlEnum
public enum ForeclosureActionBase {


    /**
     * Breach letter has been sent to the borrower.
     * 
     */
    @XmlEnumValue("BreachNoticeSent")
    BREACH_NOTICE_SENT("BreachNoticeSent"),

    /**
     * Court revokes legal possession of the property from the borrower.
     * 
     */
    @XmlEnumValue("EvictionApproved")
    EVICTION_APPROVED("EvictionApproved"),

    /**
     * Eviction proceedings have been completed.
     * 
     */
    @XmlEnumValue("EvictionCompleted")
    EVICTION_COMPLETED("EvictionCompleted"),

    /**
     * Foreclosure sale has occurred and borrower's redemption period (if applicable) has expired and eviction proceedings are underway.
     * 
     */
    @XmlEnumValue("EvictionStarted")
    EVICTION_STARTED("EvictionStarted"),

    /**
     *  The first legal step in processing a foreclosure was taken (i.e. complaint/petition filing, recording notice of default, posting publication of notice of sale, etc).
     * 
     */
    @XmlEnumValue("FirstLegalAction")
    FIRST_LEGAL_ACTION("FirstLegalAction"),

    /**
     * The foreclosure process completed.
     * 
     */
    @XmlEnumValue("ForeclosureCompleted")
    FORECLOSURE_COMPLETED("ForeclosureCompleted"),

    /**
     * A foreclosure sale has been cancelled and not yet rescheduled.
     * 
     */
    @XmlEnumValue("ForeclosureSaleCancelled")
    FORECLOSURE_SALE_CANCELLED("ForeclosureSaleCancelled"),

    /**
     * The servicer received court confirmation of the public foreclosure sale.
     * 
     */
    @XmlEnumValue("ForeclosureSaleConfirmed")
    FORECLOSURE_SALE_CONFIRMED("ForeclosureSaleConfirmed"),

    /**
     * The property has been sold at a public auction or through court order.
     * 
     */
    @XmlEnumValue("ForeclosureSaleHeld")
    FORECLOSURE_SALE_HELD("ForeclosureSaleHeld"),

    /**
     * The foreclosure sale has been extended at the request of the servicer or public trustee.
     * 
     */
    @XmlEnumValue("ForeclosureSalePostponed")
    FORECLOSURE_SALE_POSTPONED("ForeclosureSalePostponed"),

    /**
     * The start of publication of the public notice of foreclosure sale as required by state law.
     * 
     */
    @XmlEnumValue("ForeclosureSalePublicationCommenced")
    FORECLOSURE_SALE_PUBLICATION_COMMENCED("ForeclosureSalePublicationCommenced"),

    /**
     * The servicer requested that the foreclosure sale be overturned.
     * 
     */
    @XmlEnumValue("ForeclosureSaleRescinded")
    FORECLOSURE_SALE_RESCINDED("ForeclosureSaleRescinded"),

    /**
     * A date has been set for the foreclosure sale.
     * 
     */
    @XmlEnumValue("ForeclosureSaleScheduled")
    FORECLOSURE_SALE_SCHEDULED("ForeclosureSaleScheduled"),

    /**
     * The foreclosure process terminated prior to completion.
     * 
     */
    @XmlEnumValue("ForeclosureTerminated")
    FORECLOSURE_TERMINATED("ForeclosureTerminated"),

    /**
     * Foreclosure legal action has been initiated by the servicer.
     * 
     */
    @XmlEnumValue("FormalNoticeFiled")
    FORMAL_NOTICE_FILED("FormalNoticeFiled"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The borrower no longer has the legal right to exercise the right to annul the sale of the property per state statutes.
     * 
     */
    @XmlEnumValue("RedemptionPeriodEnded")
    REDEMPTION_PERIOD_ENDED("RedemptionPeriodEnded"),

    /**
     * The first opportunity that the borrower has the legal right to exercise the right to annul the sale of the property per state statutes.
     * 
     */
    @XmlEnumValue("RedemptionPeriodStarted")
    REDEMPTION_PERIOD_STARTED("RedemptionPeriodStarted");
    private final String value;

    ForeclosureActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeclosureActionBase fromValue(String v) {
        for (ForeclosureActionBase c: ForeclosureActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
