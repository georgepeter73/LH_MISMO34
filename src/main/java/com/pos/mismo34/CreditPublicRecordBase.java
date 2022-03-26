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
 * <p>Java class for CreditPublicRecordBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditPublicRecordBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Annulment"/>
 *     &lt;enumeration value="Attachment"/>
 *     &lt;enumeration value="BankruptcyChapter11"/>
 *     &lt;enumeration value="BankruptcyChapter12"/>
 *     &lt;enumeration value="BankruptcyChapter13"/>
 *     &lt;enumeration value="BankruptcyChapter7"/>
 *     &lt;enumeration value="BankruptcyChapter7Involuntary"/>
 *     &lt;enumeration value="BankruptcyChapter7Voluntary"/>
 *     &lt;enumeration value="BankruptcyTypeUnknown"/>
 *     &lt;enumeration value="ChildSupport"/>
 *     &lt;enumeration value="Collection"/>
 *     &lt;enumeration value="CustodyAgreement"/>
 *     &lt;enumeration value="DivorceDecree"/>
 *     &lt;enumeration value="FamilySupport"/>
 *     &lt;enumeration value="FictitiousName"/>
 *     &lt;enumeration value="FinancialCounseling"/>
 *     &lt;enumeration value="FinancingStatement"/>
 *     &lt;enumeration value="ForcibleDetainer"/>
 *     &lt;enumeration value="Foreclosure"/>
 *     &lt;enumeration value="Garnishment"/>
 *     &lt;enumeration value="Judgment"/>
 *     &lt;enumeration value="LawSuit"/>
 *     &lt;enumeration value="Lien"/>
 *     &lt;enumeration value="MechanicsLien"/>
 *     &lt;enumeration value="MedicalLien"/>
 *     &lt;enumeration value="NonResponsibility"/>
 *     &lt;enumeration value="NoticeOfDefault"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PublicSale"/>
 *     &lt;enumeration value="RealEstateRecording"/>
 *     &lt;enumeration value="Repossession"/>
 *     &lt;enumeration value="SpouseSupport"/>
 *     &lt;enumeration value="SupportDebt"/>
 *     &lt;enumeration value="TaxLienCity"/>
 *     &lt;enumeration value="TaxLienCounty"/>
 *     &lt;enumeration value="TaxLienFederal"/>
 *     &lt;enumeration value="TaxLienOther"/>
 *     &lt;enumeration value="TaxLienState"/>
 *     &lt;enumeration value="Trusteeship"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="UnlawfulDetainer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditPublicRecordBase")
@XmlEnum
public enum CreditPublicRecordBase {


    /**
     * A legal decree that states that a marriage was never valid.
     * 
     */
    @XmlEnumValue("Annulment")
    ANNULMENT("Annulment"),

    /**
     * The preliminary legal seizure of property to force compliance with a decision which may be obtained in a pending suit.
     * 
     */
    @XmlEnumValue("Attachment")
    ATTACHMENT("Attachment"),

    /**
     * Bankruptcy where business assets are kept and creditors are paid according to an approved plan.
     * 
     */
    @XmlEnumValue("BankruptcyChapter11")
    BANKRUPTCY_CHAPTER_11("BankruptcyChapter11"),

    /**
     * Bankruptcy where a family with regular income keeps their assets and pays creditors according to an approved plan. Usually applies to family farms.
     * 
     */
    @XmlEnumValue("BankruptcyChapter12")
    BANKRUPTCY_CHAPTER_12("BankruptcyChapter12"),

    /**
     * Bankruptcy where an individual with regular income keeps assets and pays creditors according to an approved plan.
     * 
     */
    @XmlEnumValue("BankruptcyChapter13")
    BANKRUPTCY_CHAPTER_13("BankruptcyChapter13"),

    /**
     * Bankruptcy where assets are liquidated and the proceeds are distributed to the creditors.
     * 
     */
    @XmlEnumValue("BankruptcyChapter7")
    BANKRUPTCY_CHAPTER_7("BankruptcyChapter7"),

    /**
     * Bankruptcy petitioned by the creditors, where assets are liquidated and the proceeds are distributed to the creditors.
     * 
     */
    @XmlEnumValue("BankruptcyChapter7Involuntary")
    BANKRUPTCY_CHAPTER_7_INVOLUNTARY("BankruptcyChapter7Involuntary"),

    /**
     * Bankruptcy petitioned by the debtor, where assets are liquidated and the proceeds are distributed to the creditors.
     * 
     */
    @XmlEnumValue("BankruptcyChapter7Voluntary")
    BANKRUPTCY_CHAPTER_7_VOLUNTARY("BankruptcyChapter7Voluntary"),

    /**
     * A bankruptcy case but the type is not known.
     * 
     */
    @XmlEnumValue("BankruptcyTypeUnknown")
    BANKRUPTCY_TYPE_UNKNOWN("BankruptcyTypeUnknown"),

    /**
     * A legal notice specifying payment schedule for support of children  involved in a marital separation or divorce.
     * 
     */
    @XmlEnumValue("ChildSupport")
    CHILD_SUPPORT("ChildSupport"),

    /**
     * A debt has not been paid according to terms and has been turned over to an agency or attorney to collect the debt from the borrower.
     * 
     */
    @XmlEnumValue("Collection")
    COLLECTION("Collection"),

    /**
     * An agreement has been made or approved by a court regarding custody of children of a separating or divorcing couple.
     * 
     */
    @XmlEnumValue("CustodyAgreement")
    CUSTODY_AGREEMENT("CustodyAgreement"),

    /**
     * A legal decree that specifies the terms related to the dissolution of a marriage.
     * 
     */
    @XmlEnumValue("DivorceDecree")
    DIVORCE_DECREE("DivorceDecree"),

    /**
     * A legal notice specifying payment schedule for support of a family  involved in a marital separation or divorce.
     * 
     */
    @XmlEnumValue("FamilySupport")
    FAMILY_SUPPORT("FamilySupport"),

    /**
     * A legal notice announcing the namge change of a business or entity.
     * 
     */
    @XmlEnumValue("FictitiousName")
    FICTITIOUS_NAME("FictitiousName"),

    /**
     * Process here debtors make payments to creditors according to a plan arranged by a financial counseling agency.
     * 
     */
    @XmlEnumValue("FinancialCounseling")
    FINANCIAL_COUNSELING("FinancialCounseling"),

    /**
     * Also called a UCC-1 from its form number, a statement that contains information about a security interest in collateral used to secure a debt and that is filed to provide notice to other creditors of the security interest.
     * 
     */
    @XmlEnumValue("FinancingStatement")
    FINANCING_STATEMENT("FinancingStatement"),

    /**
     * Act of keeping goods or property by force. For example, when a tenant remains in a property after an eviction notice.
     * 
     */
    @XmlEnumValue("ForcibleDetainer")
    FORCIBLE_DETAINER("ForcibleDetainer"),

    /**
     * Process where a lender forces the sale of property to pay off a mortgage.
     * 
     */
    @XmlEnumValue("Foreclosure")
    FORECLOSURE("Foreclosure"),

    /**
     * Court ordered method of debt collection in which a portion of a persons salary is deducted and paid to a collector.
     * 
     */
    @XmlEnumValue("Garnishment")
    GARNISHMENT("Garnishment"),

    /**
     * A final court ruling resolving the key questions in a lawsuit and determining the rights and obligations of the opposing parties.
     * 
     */
    @XmlEnumValue("Judgment")
    JUDGMENT("Judgment"),

    /**
     * A legal action based on a complaint that the defendant failed to perform a legal duty, resulting in harm to the plaintiff.
     * 
     */
    @XmlEnumValue("LawSuit")
    LAW_SUIT("LawSuit"),

    /**
     * A legal document filed with a court that can force the sale of property if a debt is not paid.
     * 
     */
    @XmlEnumValue("Lien")
    LIEN("Lien"),

    /**
     * A legal claim placed on real estate by someone who is owed money for labor, services or supplies contributed to the property for purposes of improving it.
     * 
     */
    @XmlEnumValue("MechanicsLien")
    MECHANICS_LIEN("MechanicsLien"),

    /**
     * A legal claim placed on a specific item of property if a medical related debt is not paid.
     * 
     */
    @XmlEnumValue("MedicalLien")
    MEDICAL_LIEN("MedicalLien"),

    /**
     * A legal notice file by a land owner to claim they are not responsible for construction, alteration or repair of buildings or other improvements located on their land.
     * 
     */
    @XmlEnumValue("NonResponsibility")
    NON_RESPONSIBILITY("NonResponsibility"),

    /**
     * A legal document filed by a lender that a property owner has missed several payments on their loan.
     * 
     */
    @XmlEnumValue("NoticeOfDefault")
    NOTICE_OF_DEFAULT("NoticeOfDefault"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Public sale is the term used for the sale of lien property after public notice stating the date, time and location of the sale.
     * 
     */
    @XmlEnumValue("PublicSale")
    PUBLIC_SALE("PublicSale"),

    /**
     * A notice of the sale or transfer of real estate property.
     * 
     */
    @XmlEnumValue("RealEstateRecording")
    REAL_ESTATE_RECORDING("RealEstateRecording"),

    /**
     * The act of recovery of goods or chattels for non-payment or property that has been wrongfully detained.
     * 
     */
    @XmlEnumValue("Repossession")
    REPOSSESSION("Repossession"),

    /**
     * A legal notice specifying payment schedule for support of a spouse  involved in a marital separation or divorce.
     * 
     */
    @XmlEnumValue("SpouseSupport")
    SPOUSE_SUPPORT("SpouseSupport"),

    /**
     * A legal notice specifying payment schedule for support of children or family involved in a marital separation or divorce.
     * 
     */
    @XmlEnumValue("SupportDebt")
    SUPPORT_DEBT("SupportDebt"),

    /**
     * A notice filed by a city government for the collection of taxes.
     * 
     */
    @XmlEnumValue("TaxLienCity")
    TAX_LIEN_CITY("TaxLienCity"),

    /**
     * A notice filed by a count government for the collection of taxes.
     * 
     */
    @XmlEnumValue("TaxLienCounty")
    TAX_LIEN_COUNTY("TaxLienCounty"),

    /**
     * A notice filed by the federal government for the collection of taxes.
     * 
     */
    @XmlEnumValue("TaxLienFederal")
    TAX_LIEN_FEDERAL("TaxLienFederal"),

    /**
     * A notice filed by an unspecified agency for the collection of taxes.
     * 
     */
    @XmlEnumValue("TaxLienOther")
    TAX_LIEN_OTHER("TaxLienOther"),

    /**
     * A notice filed by a state government for the collection of taxes.
     * 
     */
    @XmlEnumValue("TaxLienState")
    TAX_LIEN_STATE("TaxLienState"),

    /**
     * A trusteeship is the appointment of a person who holds title to property for benefit of another.
     * 
     */
    @XmlEnumValue("Trusteeship")
    TRUSTEESHIP("Trusteeship"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The act of unlawfully keeping goods or property. For example, a tenant wrongfully remaining in a residence after a valid eviction notice is guilty of an unlawful detainer.
     * 
     */
    @XmlEnumValue("UnlawfulDetainer")
    UNLAWFUL_DETAINER("UnlawfulDetainer");
    private final String value;

    CreditPublicRecordBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditPublicRecordBase fromValue(String v) {
        for (CreditPublicRecordBase c: CreditPublicRecordBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
