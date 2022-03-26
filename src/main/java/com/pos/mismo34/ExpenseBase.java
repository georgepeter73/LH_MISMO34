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
 * <p>Java class for ExpenseBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpenseBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Alimony"/>
 *     &lt;enumeration value="CarMaintenance"/>
 *     &lt;enumeration value="CharitableContributions"/>
 *     &lt;enumeration value="ChildCare"/>
 *     &lt;enumeration value="ChildSupport"/>
 *     &lt;enumeration value="Clothing"/>
 *     &lt;enumeration value="DryCleaning"/>
 *     &lt;enumeration value="Entertainment"/>
 *     &lt;enumeration value="GroceryToiletry"/>
 *     &lt;enumeration value="HealthInsurance"/>
 *     &lt;enumeration value="JobRelatedExpenses"/>
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="MiscellaneousLivingExpenses"/>
 *     &lt;enumeration value="NetRentalExpense"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayrollInsuranceDeduction"/>
 *     &lt;enumeration value="PayrollMiscellaneousDeductions"/>
 *     &lt;enumeration value="PayrollProfitSharingDeduction"/>
 *     &lt;enumeration value="PayrollRetirementDeduction"/>
 *     &lt;enumeration value="PayrollTaxDeduction"/>
 *     &lt;enumeration value="SeparateMaintenanceExpense"/>
 *     &lt;enumeration value="UnionDues"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpenseBase")
@XmlEnum
public enum ExpenseBase {


    /**
     * Alimony (also called maintenance or spousal support) is financial support to a spouse from the other spouse after marital separation or from the ex-spouse upon divorce.
     * 
     */
    @XmlEnumValue("Alimony")
    ALIMONY("Alimony"),

    /**
     * Cost of average monthly maintenance for automobiles.
     * 
     */
    @XmlEnumValue("CarMaintenance")
    CAR_MAINTENANCE("CarMaintenance"),

    /**
     * Amounts for contributions made to nonprofit organizations, charities or private foundations.
     * 
     */
    @XmlEnumValue("CharitableContributions")
    CHARITABLE_CONTRIBUTIONS("CharitableContributions"),

    /**
     * Periodic costs of providing care for the borrowers children.
     * 
     */
    @XmlEnumValue("ChildCare")
    CHILD_CARE("ChildCare"),

    /**
     * Child support (or child maintenance) is an ongoing, periodic payment made by a parent for the financial benefit of a child following the end of a marriage or other relationship.
     * 
     */
    @XmlEnumValue("ChildSupport")
    CHILD_SUPPORT("ChildSupport"),

    /**
     * Cost of clothing.
     * 
     */
    @XmlEnumValue("Clothing")
    CLOTHING("Clothing"),
    @XmlEnumValue("DryCleaning")
    DRY_CLEANING("DryCleaning"),

    /**
     * Cost of amusement and leisure activities.
     * 
     */
    @XmlEnumValue("Entertainment")
    ENTERTAINMENT("Entertainment"),

    /**
     * Cost of groceries and personal hygiene products, such as soap and cosmetics.
     * 
     */
    @XmlEnumValue("GroceryToiletry")
    GROCERY_TOILETRY("GroceryToiletry"),

    /**
     * Costs of health insurance that is not provided by employer and is paid by borrower and not deducted from paycheck.
     * 
     */
    @XmlEnumValue("HealthInsurance")
    HEALTH_INSURANCE("HealthInsurance"),

    /**
     * Ongoing obligations incurred by the borrower which are prerequisite to retaining employment (e.g., professional associations, special uniforms or tools, etc.)
     * 
     */
    @XmlEnumValue("JobRelatedExpenses")
    JOB_RELATED_EXPENSES("JobRelatedExpenses"),

    /**
     * Cost of out of pocket medical expenses not covered by insurance.
     * 
     */
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),

    /**
     * Total amount of living expenses not otherwise reported separately.
     * 
     */
    @XmlEnumValue("MiscellaneousLivingExpenses")
    MISCELLANEOUS_LIVING_EXPENSES("MiscellaneousLivingExpenses"),

    /**
     * The amount by which the sum of the mortgage payments, insurance, maintenance, taxes, and miscellaneous expenses exceeds the gross rental income.
     * 
     */
    @XmlEnumValue("NetRentalExpense")
    NET_RENTAL_EXPENSE("NetRentalExpense"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The amount deducted from wages to pay insurance obligations.
     * 
     */
    @XmlEnumValue("PayrollInsuranceDeduction")
    PAYROLL_INSURANCE_DEDUCTION("PayrollInsuranceDeduction"),

    /**
     * The amount deducted from wages to pay all obligations not separately reported.
     * 
     */
    @XmlEnumValue("PayrollMiscellaneousDeductions")
    PAYROLL_MISCELLANEOUS_DEDUCTIONS("PayrollMiscellaneousDeductions"),

    /**
     * The amount deducted from wages to pay profit sharing obligations.
     * 
     */
    @XmlEnumValue("PayrollProfitSharingDeduction")
    PAYROLL_PROFIT_SHARING_DEDUCTION("PayrollProfitSharingDeduction"),

    /**
     * The amount deducted from wages to fund a retirement account.
     * 
     */
    @XmlEnumValue("PayrollRetirementDeduction")
    PAYROLL_RETIREMENT_DEDUCTION("PayrollRetirementDeduction"),

    /**
     * The amount deducted from wages to pay tax obligations.
     * 
     */
    @XmlEnumValue("PayrollTaxDeduction")
    PAYROLL_TAX_DEDUCTION("PayrollTaxDeduction"),

    /**
     * Periodic amount paid under terms of separation agreement.
     * 
     */
    @XmlEnumValue("SeparateMaintenanceExpense")
    SEPARATE_MAINTENANCE_EXPENSE("SeparateMaintenanceExpense"),

    /**
     * Union membership dues borrower incurs as a condition of remaining employment through union (e.g., a closed shop). Collected on the URLA in Section VI (Liabilities - Job Related Expenses.)
     * 
     */
    @XmlEnumValue("UnionDues")
    UNION_DUES("UnionDues");
    private final String value;

    ExpenseBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpenseBase fromValue(String v) {
        for (ExpenseBase c: ExpenseBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
