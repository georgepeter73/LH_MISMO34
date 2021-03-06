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
 * <p>Java class for WorkoutBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkoutBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="DeedInLieu"/>
 *     &lt;enumeration value="Modification"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PaymentForbearance"/>
 *     &lt;enumeration value="PreclaimedAdvance"/>
 *     &lt;enumeration value="PrincipalForbearance"/>
 *     &lt;enumeration value="Refinance"/>
 *     &lt;enumeration value="RepaymentPlan"/>
 *     &lt;enumeration value="ShortSale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkoutBase")
@XmlEnum
public enum WorkoutBase {


    /**
     * The investor has authorized the Servicer to accept a voluntary conveyance of the property instead of initiating foreclosure proceedings. The Servicer has received the executed Deed from the borrower.
     * 
     */
    @XmlEnumValue("DeedInLieu")
    DEED_IN_LIEU("DeedInLieu"),
    @XmlEnumValue("Modification")
    MODIFICATION("Modification"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The servicer has authorized a temporary suspension of payments or a repayment plan that calls for periodic payments of less than the normal monthly payment, or periodic payments at different intervals, to give the borrower additional time to bring the mortgage current.
     * 
     */
    @XmlEnumValue("PaymentForbearance")
    PAYMENT_FORBEARANCE("PaymentForbearance"),

    /**
     * Borrower pays back MI company
     * 
     */
    @XmlEnumValue("PreclaimedAdvance")
    PRECLAIMED_ADVANCE("PreclaimedAdvance"),

    /**
     * The servicer has authorized a agreement that calls for a certain amount of principal to become non-interest bearing UPB and due in the form of a balloon payment at the end of the loan.
     * 
     */
    @XmlEnumValue("PrincipalForbearance")
    PRINCIPAL_FORBEARANCE("PrincipalForbearance"),

    /**
     * The servicer is pursuing a new loan in which the existing mortgage is paid off with the proceeds of the new mortgage.
     * 
     */
    @XmlEnumValue("Refinance")
    REFINANCE("Refinance"),

    /**
     * The servicer is pursuing a written or verbal agreement between the servicer and the borrower that gives the borrower a defined period of time to reinstate the mortgage by making payments in excess of the regularly scheduled payment.
     * 
     */
    @XmlEnumValue("RepaymentPlan")
    REPAYMENT_PLAN("RepaymentPlan"),

    /**
     * A sale of property in which the lien holder accepts less than the debt or obligation against the property.
     * 
     */
    @XmlEnumValue("ShortSale")
    SHORT_SALE("ShortSale");
    private final String value;

    WorkoutBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkoutBase fromValue(String v) {
        for (WorkoutBase c: WorkoutBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
