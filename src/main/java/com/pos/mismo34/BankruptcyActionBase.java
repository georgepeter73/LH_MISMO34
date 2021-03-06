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
 * <p>Java class for BankruptcyActionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankruptcyActionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AmendedPetitionFiled"/>
 *     &lt;enumeration value="ComplaintToDetermineExtentAndValidityOfLien"/>
 *     &lt;enumeration value="ConsentOrderFiled"/>
 *     &lt;enumeration value="DebtDischargeGranted"/>
 *     &lt;enumeration value="DeclarationOfIntentToSurrenderOtherAssets"/>
 *     &lt;enumeration value="DeclarationOfIntentToSurrenderSubjectProperty"/>
 *     &lt;enumeration value="MortgageDebtReaffirmed"/>
 *     &lt;enumeration value="MotionForDischargeFiled"/>
 *     &lt;enumeration value="MotionForDischargeHearingHeld"/>
 *     &lt;enumeration value="MotionForDismissalFiled"/>
 *     &lt;enumeration value="MotionForReliefFiled"/>
 *     &lt;enumeration value="MotionForReliefGranted"/>
 *     &lt;enumeration value="MotionForReliefHearingHeld"/>
 *     &lt;enumeration value="MotionToAvoidLien"/>
 *     &lt;enumeration value="MotionToConvertChapter"/>
 *     &lt;enumeration value="MotionToDetermineLienPriority"/>
 *     &lt;enumeration value="MotionToSell"/>
 *     &lt;enumeration value="MotionToValueCollateral"/>
 *     &lt;enumeration value="NoticeOfMortgagePaymentChange"/>
 *     &lt;enumeration value="ObjectionToConfirmation"/>
 *     &lt;enumeration value="ObjectionToDischarge"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PetitionFiled"/>
 *     &lt;enumeration value="PlanObjection"/>
 *     &lt;enumeration value="PostPetitionPlanFiled"/>
 *     &lt;enumeration value="ProofOfClaimFiled"/>
 *     &lt;enumeration value="ProofOfClaimReferred"/>
 *     &lt;enumeration value="ServicerReferredNoticeToAttorney"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankruptcyActionBase")
@XmlEnum
public enum BankruptcyActionBase {


    /**
     * An amendment to the petition has been filed with the court.
     * 
     */
    @XmlEnumValue("AmendedPetitionFiled")
    AMENDED_PETITION_FILED("AmendedPetitionFiled"),

    /**
     * A litigation, or adversary action filed in the bankruptcy court, and associated to the borrower's bankruptcy case, requesting a judicial review and opinion on the validity of a ??contested claim and/or lien against the subject collateral.
     * 
     */
    @XmlEnumValue("ComplaintToDetermineExtentAndValidityOfLien")
    COMPLAINT_TO_DETERMINE_EXTENT_AND_VALIDITY_OF_LIEN("ComplaintToDetermineExtentAndValidityOfLien"),

    /**
     * Bankruptcy consent order filed with court.
     * 
     */
    @XmlEnumValue("ConsentOrderFiled")
    CONSENT_ORDER_FILED("ConsentOrderFiled"),

    /**
     * Debt discharge granted by the court.
     * 
     */
    @XmlEnumValue("DebtDischargeGranted")
    DEBT_DISCHARGE_GRANTED("DebtDischargeGranted"),

    /**
     * The borrower intends to surrender other assets as part of the bankruptcy proceeding.
     * 
     */
    @XmlEnumValue("DeclarationOfIntentToSurrenderOtherAssets")
    DECLARATION_OF_INTENT_TO_SURRENDER_OTHER_ASSETS("DeclarationOfIntentToSurrenderOtherAssets"),

    /**
     * The borrower intends to surrender the subject property as part of the bankruptcy proceeding.
     * 
     */
    @XmlEnumValue("DeclarationOfIntentToSurrenderSubjectProperty")
    DECLARATION_OF_INTENT_TO_SURRENDER_SUBJECT_PROPERTY("DeclarationOfIntentToSurrenderSubjectProperty"),

    /**
     * Borrower agreed to pay the mortgage debt in accordance with the bankruptcy reaffirmation agreement.
     * 
     */
    @XmlEnumValue("MortgageDebtReaffirmed")
    MORTGAGE_DEBT_REAFFIRMED("MortgageDebtReaffirmed"),

    /**
     * Bankruptcy motion for discharge filed with court.
     * 
     */
    @XmlEnumValue("MotionForDischargeFiled")
    MOTION_FOR_DISCHARGE_FILED("MotionForDischargeFiled"),

    /**
     * The court has held a hearing on the motion for discharge.
     * 
     */
    @XmlEnumValue("MotionForDischargeHearingHeld")
    MOTION_FOR_DISCHARGE_HEARING_HELD("MotionForDischargeHearingHeld"),

    /**
     * Bankruptcy motion for dismissal filed with court.
     * 
     */
    @XmlEnumValue("MotionForDismissalFiled")
    MOTION_FOR_DISMISSAL_FILED("MotionForDismissalFiled"),

    /**
     * Bankruptcy motion for relief filed with court.
     * 
     */
    @XmlEnumValue("MotionForReliefFiled")
    MOTION_FOR_RELIEF_FILED("MotionForReliefFiled"),

    /**
     * The court granted relief from the bankruptcy stay.
     * 
     */
    @XmlEnumValue("MotionForReliefGranted")
    MOTION_FOR_RELIEF_GRANTED("MotionForReliefGranted"),

    /**
     * The court has held a hearing on the motion for relief.
     * 
     */
    @XmlEnumValue("MotionForReliefHearingHeld")
    MOTION_FOR_RELIEF_HEARING_HELD("MotionForReliefHearingHeld"),

    /**
     * An action contesting the validity, and stripping the secured status, of a lienholder's claim in order to divest a lien from the subject collateral.
     * 
     */
    @XmlEnumValue("MotionToAvoidLien")
    MOTION_TO_AVOID_LIEN("MotionToAvoidLien"),

    /**
     * An action seeking to change the bankruptcy from one chapter to another.
     * 
     */
    @XmlEnumValue("MotionToConvertChapter")
    MOTION_TO_CONVERT_CHAPTER("MotionToConvertChapter"),

    /**
     * An action seeking to determine a creditor's position and therefore payment priority based upon predefined classes and positions in the bankruptcy code.
     * 
     */
    @XmlEnumValue("MotionToDetermineLienPriority")
    MOTION_TO_DETERMINE_LIEN_PRIORITY("MotionToDetermineLienPriority"),

    /**
     * An action seeking to sell an asset of the borrower's bankruptcy estate and distribute the sale proceeds, on a pro rata basis, to creditors that are party to the bankruptcy estate.
     * 
     */
    @XmlEnumValue("MotionToSell")
    MOTION_TO_SELL("MotionToSell"),

    /**
     * An action seeking to determine the value of a contested bankruptcy estate asset, usually through an independent appraisal.
     * 
     */
    @XmlEnumValue("MotionToValueCollateral")
    MOTION_TO_VALUE_COLLATERAL("MotionToValueCollateral"),

    /**
     * Notice of a change in the installment payment amount filed with the bankruptcy court.
     * 
     */
    @XmlEnumValue("NoticeOfMortgagePaymentChange")
    NOTICE_OF_MORTGAGE_PAYMENT_CHANGE("NoticeOfMortgagePaymentChange"),

    /**
     * An action by an interested party contesting one or more element(s) of the borrower's bankruptcy plan.
     * 
     */
    @XmlEnumValue("ObjectionToConfirmation")
    OBJECTION_TO_CONFIRMATION("ObjectionToConfirmation"),

    /**
     * An action contesting the borrower's declared intention to discharge all or part of a debt.
     * 
     */
    @XmlEnumValue("ObjectionToDischarge")
    OBJECTION_TO_DISCHARGE("ObjectionToDischarge"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Bankruptcy petition filed with court.
     * 
     */
    @XmlEnumValue("PetitionFiled")
    PETITION_FILED("PetitionFiled"),

    /**
     * An interested party has filed an objection to the bankruptcy plan.
     * 
     */
    @XmlEnumValue("PlanObjection")
    PLAN_OBJECTION("PlanObjection"),

    /**
     * The bankruptcy plan confirmation of attorney or stipulation agreements was filed.
     * 
     */
    @XmlEnumValue("PostPetitionPlanFiled")
    POST_PETITION_PLAN_FILED("PostPetitionPlanFiled"),

    /**
     * Proof of claim was filed with the court by the creditors attorney.
     * 
     */
    @XmlEnumValue("ProofOfClaimFiled")
    PROOF_OF_CLAIM_FILED("ProofOfClaimFiled"),

    /**
     * Proof of claim was referred to the creditor attorney by servicer.
     * 
     */
    @XmlEnumValue("ProofOfClaimReferred")
    PROOF_OF_CLAIM_REFERRED("ProofOfClaimReferred"),

    /**
     * The bankruptcy was referred to the servicer attorney.
     * 
     */
    @XmlEnumValue("ServicerReferredNoticeToAttorney")
    SERVICER_REFERRED_NOTICE_TO_ATTORNEY("ServicerReferredNoticeToAttorney");
    private final String value;

    BankruptcyActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankruptcyActionBase fromValue(String v) {
        for (BankruptcyActionBase c: BankruptcyActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
