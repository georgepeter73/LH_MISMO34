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
 * <p>Java class for CreditScoreExclusionReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditScoreExclusionReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="InvalidScoreRequest"/>
 *     &lt;enumeration value="NotScoredCreditDataNotAvailable"/>
 *     &lt;enumeration value="NotScoredFileCannotBeScored"/>
 *     &lt;enumeration value="NotScoredFileIsUnderReview"/>
 *     &lt;enumeration value="NotScoredFileTooLong"/>
 *     &lt;enumeration value="NotScoredInsufficientCredit"/>
 *     &lt;enumeration value="NotScoredNoQualifyingAccount"/>
 *     &lt;enumeration value="NotScoredNoRecentAccountInformation"/>
 *     &lt;enumeration value="NotScoredRequirementsNotMet"/>
 *     &lt;enumeration value="NotScoredSubjectDeceased"/>
 *     &lt;enumeration value="ScoringNotAvailable"/>
 *     &lt;enumeration value="UnauthorizedScoreRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditScoreExclusionReasonBase")
@XmlEnum
public enum CreditScoreExclusionReasonBase {

    @XmlEnumValue("InvalidScoreRequest")
    INVALID_SCORE_REQUEST("InvalidScoreRequest"),
    @XmlEnumValue("NotScoredCreditDataNotAvailable")
    NOT_SCORED_CREDIT_DATA_NOT_AVAILABLE("NotScoredCreditDataNotAvailable"),
    @XmlEnumValue("NotScoredFileCannotBeScored")
    NOT_SCORED_FILE_CANNOT_BE_SCORED("NotScoredFileCannotBeScored"),
    @XmlEnumValue("NotScoredFileIsUnderReview")
    NOT_SCORED_FILE_IS_UNDER_REVIEW("NotScoredFileIsUnderReview"),
    @XmlEnumValue("NotScoredFileTooLong")
    NOT_SCORED_FILE_TOO_LONG("NotScoredFileTooLong"),
    @XmlEnumValue("NotScoredInsufficientCredit")
    NOT_SCORED_INSUFFICIENT_CREDIT("NotScoredInsufficientCredit"),
    @XmlEnumValue("NotScoredNoQualifyingAccount")
    NOT_SCORED_NO_QUALIFYING_ACCOUNT("NotScoredNoQualifyingAccount"),
    @XmlEnumValue("NotScoredNoRecentAccountInformation")
    NOT_SCORED_NO_RECENT_ACCOUNT_INFORMATION("NotScoredNoRecentAccountInformation"),
    @XmlEnumValue("NotScoredRequirementsNotMet")
    NOT_SCORED_REQUIREMENTS_NOT_MET("NotScoredRequirementsNotMet"),
    @XmlEnumValue("NotScoredSubjectDeceased")
    NOT_SCORED_SUBJECT_DECEASED("NotScoredSubjectDeceased"),
    @XmlEnumValue("ScoringNotAvailable")
    SCORING_NOT_AVAILABLE("ScoringNotAvailable"),
    @XmlEnumValue("UnauthorizedScoreRequest")
    UNAUTHORIZED_SCORE_REQUEST("UnauthorizedScoreRequest");
    private final String value;

    CreditScoreExclusionReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditScoreExclusionReasonBase fromValue(String v) {
        for (CreditScoreExclusionReasonBase c: CreditScoreExclusionReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
