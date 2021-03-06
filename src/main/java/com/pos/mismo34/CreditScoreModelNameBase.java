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
 * <p>Java class for CreditScoreModelNameBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditScoreModelNameBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Beacon09MortgageIndustryOption"/>
 *     &lt;enumeration value="EquifaxBankruptcyNavigatorIndex02781"/>
 *     &lt;enumeration value="EquifaxBankruptcyNavigatorIndex02782"/>
 *     &lt;enumeration value="EquifaxBankruptcyNavigatorIndex02783"/>
 *     &lt;enumeration value="EquifaxBankruptcyNavigatorIndex02784"/>
 *     &lt;enumeration value="EquifaxBeacon"/>
 *     &lt;enumeration value="EquifaxBeacon5.0"/>
 *     &lt;enumeration value="EquifaxBeacon5.0Auto"/>
 *     &lt;enumeration value="EquifaxBeacon5.0BankCard"/>
 *     &lt;enumeration value="EquifaxBeacon5.0Installment"/>
 *     &lt;enumeration value="EquifaxBeacon5.0PersonalFinance"/>
 *     &lt;enumeration value="EquifaxBeaconAuto"/>
 *     &lt;enumeration value="EquifaxBeaconBankcard"/>
 *     &lt;enumeration value="EquifaxBeaconInstallment"/>
 *     &lt;enumeration value="EquifaxBeaconPersonalFinance"/>
 *     &lt;enumeration value="EquifaxDAS"/>
 *     &lt;enumeration value="EquifaxEnhancedBeacon"/>
 *     &lt;enumeration value="EquifaxEnhancedDAS"/>
 *     &lt;enumeration value="EquifaxMarketMax"/>
 *     &lt;enumeration value="EquifaxMortgageScore"/>
 *     &lt;enumeration value="EquifaxPinnacle"/>
 *     &lt;enumeration value="EquifaxPinnacle2.0"/>
 *     &lt;enumeration value="EquifaxVantageScore"/>
 *     &lt;enumeration value="EquifaxVantageScore3.0"/>
 *     &lt;enumeration value="ExperianFairIsaac"/>
 *     &lt;enumeration value="ExperianFairIsaacAdvanced"/>
 *     &lt;enumeration value="ExperianFairIsaacAdvanced2.0"/>
 *     &lt;enumeration value="ExperianFairIsaacAuto"/>
 *     &lt;enumeration value="ExperianFairIsaacBankcard"/>
 *     &lt;enumeration value="ExperianFairIsaacInstallment"/>
 *     &lt;enumeration value="ExperianFairIsaacPersonalFinance"/>
 *     &lt;enumeration value="ExperianFICOClassicV3"/>
 *     &lt;enumeration value="ExperianMDSBankruptcyII"/>
 *     &lt;enumeration value="ExperianNewNationalEquivalency"/>
 *     &lt;enumeration value="ExperianNewNationalRisk"/>
 *     &lt;enumeration value="ExperianOldNationalRisk"/>
 *     &lt;enumeration value="ExperianScorexPLUS"/>
 *     &lt;enumeration value="ExperianVantageScore"/>
 *     &lt;enumeration value="ExperianVantageScore3.0"/>
 *     &lt;enumeration value="FICOExpansionScore"/>
 *     &lt;enumeration value="FICORiskScoreClassic04"/>
 *     &lt;enumeration value="FICORiskScoreClassic98"/>
 *     &lt;enumeration value="FICORiskScoreClassicAuto98"/>
 *     &lt;enumeration value="FICORiskScoreClassicBankcard98"/>
 *     &lt;enumeration value="FICORiskScoreClassicInstallmentLoan98"/>
 *     &lt;enumeration value="FICORiskScoreClassicPersonalFinance98"/>
 *     &lt;enumeration value="FICORiskScoreNextGen00"/>
 *     &lt;enumeration value="FICORiskScoreNextGen03"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TransUnionDelphi"/>
 *     &lt;enumeration value="TransUnionEmpirica"/>
 *     &lt;enumeration value="TransUnionEmpiricaAuto"/>
 *     &lt;enumeration value="TransUnionEmpiricaBankcard"/>
 *     &lt;enumeration value="TransUnionEmpiricaInstallment"/>
 *     &lt;enumeration value="TransUnionEmpiricaPersonalFinance"/>
 *     &lt;enumeration value="TransUnionNewDelphi"/>
 *     &lt;enumeration value="TransUnionPrecision"/>
 *     &lt;enumeration value="TransUnionPrecision03"/>
 *     &lt;enumeration value="TransUnionVantageScore"/>
 *     &lt;enumeration value="TransUnionVantageScore3.0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditScoreModelNameBase")
@XmlEnum
public enum CreditScoreModelNameBase {

    @XmlEnumValue("Beacon09MortgageIndustryOption")
    BEACON_09_MORTGAGE_INDUSTRY_OPTION("Beacon09MortgageIndustryOption"),

    /**
     * The Equifax score model, Bankruptcy Navigator Index 3.0, predicts the likelihood of bankruptcy within the next 24 months. Consumer files with bankruptcies are not scored. Score Scale is 1 ??? 600.
     * 
     */
    @XmlEnumValue("EquifaxBankruptcyNavigatorIndex02781")
    EQUIFAX_BANKRUPTCY_NAVIGATOR_INDEX_02781("EquifaxBankruptcyNavigatorIndex02781"),

    /**
     * The Equifax score model, Bankruptcy Navigator Index 3.0, predicts the likelihood of bankruptcy within the next 24 months. Scores files with previous bankruptcies. Score Scale is 1 ??? 600.
     * 
     */
    @XmlEnumValue("EquifaxBankruptcyNavigatorIndex02782")
    EQUIFAX_BANKRUPTCY_NAVIGATOR_INDEX_02782("EquifaxBankruptcyNavigatorIndex02782"),

    /**
     * The Equifax score model, Bankruptcy Navigator Index 3.0, predicts the likelihood of bankruptcy within the next 24 months. Consumer files with bankruptcies are not scored. Score Scale is 1 ??? 200.
     * 
     */
    @XmlEnumValue("EquifaxBankruptcyNavigatorIndex02783")
    EQUIFAX_BANKRUPTCY_NAVIGATOR_INDEX_02783("EquifaxBankruptcyNavigatorIndex02783"),

    /**
     * The Equifax score model, Bankruptcy Navigator Index 3.0, predicts the likelihood of bankruptcy within the next 24 months. Scores files with previous bankruptcies. Score Scale is 1 ??? 300.
     * 
     */
    @XmlEnumValue("EquifaxBankruptcyNavigatorIndex02784")
    EQUIFAX_BANKRUPTCY_NAVIGATOR_INDEX_02784("EquifaxBankruptcyNavigatorIndex02784"),

    /**
     * Fair Isaac risk model forecasting delinquency within 24 months.
     * 
     */
    @XmlEnumValue("EquifaxBeacon")
    EQUIFAX_BEACON("EquifaxBeacon"),

    /**
     * Fair Isaac risk model forecasting delinquency within 24 months. Updated in 2003.
     * 
     */
    @XmlEnumValue("EquifaxBeacon5.0")
    EQUIFAX_BEACON_5_0("EquifaxBeacon5.0"),

    /**
     * Fair Isaac risk model for auto finance loans. Updated in 2003.
     * 
     */
    @XmlEnumValue("EquifaxBeacon5.0Auto")
    EQUIFAX_BEACON_5_0_AUTO("EquifaxBeacon5.0Auto"),

    /**
     * Fair Isaac risk model for bank credit cards. Updated in 2003.
     * 
     */
    @XmlEnumValue("EquifaxBeacon5.0BankCard")
    EQUIFAX_BEACON_5_0_BANK_CARD("EquifaxBeacon5.0BankCard"),

    /**
     * Fair Isaac risk model for installment loans. Updated in 2003.
     * 
     */
    @XmlEnumValue("EquifaxBeacon5.0Installment")
    EQUIFAX_BEACON_5_0_INSTALLMENT("EquifaxBeacon5.0Installment"),

    /**
     * Fair Isaac risk model for personal finance loans.
     * 
     */
    @XmlEnumValue("EquifaxBeacon5.0PersonalFinance")
    EQUIFAX_BEACON_5_0_PERSONAL_FINANCE("EquifaxBeacon5.0PersonalFinance"),

    /**
     * Fair Isaac risk model for auto finance loans.
     * 
     */
    @XmlEnumValue("EquifaxBeaconAuto")
    EQUIFAX_BEACON_AUTO("EquifaxBeaconAuto"),

    /**
     * Fair Isaac risk model for bank credit cards.
     * 
     */
    @XmlEnumValue("EquifaxBeaconBankcard")
    EQUIFAX_BEACON_BANKCARD("EquifaxBeaconBankcard"),

    /**
     * Fair Isaac risk model for installment loans.
     * 
     */
    @XmlEnumValue("EquifaxBeaconInstallment")
    EQUIFAX_BEACON_INSTALLMENT("EquifaxBeaconInstallment"),

    /**
     * Fair Isaac risk model for personal finance loans.
     * 
     */
    @XmlEnumValue("EquifaxBeaconPersonalFinance")
    EQUIFAX_BEACON_PERSONAL_FINANCE("EquifaxBeaconPersonalFinance"),

    /**
     * Delinquency Alert System is a MDS risk model that forecasts risk of consumer filing bankruptcy.
     * 
     */
    @XmlEnumValue("EquifaxDAS")
    EQUIFAX_DAS("EquifaxDAS"),

    /**
     * An updated Fair Isaac risk model forecasting the risk of delinquency within 24 months.
     * 
     */
    @XmlEnumValue("EquifaxEnhancedBeacon")
    EQUIFAX_ENHANCED_BEACON("EquifaxEnhancedBeacon"),

    /**
     * Enhanced Delinquency Alert System is a MDS risk model that forecasts risk of consumer filing bankruptcy.
     * 
     */
    @XmlEnumValue("EquifaxEnhancedDAS")
    EQUIFAX_ENHANCED_DAS("EquifaxEnhancedDAS"),

    /**
     * Equifax predictive score for no-hit or thin files
     * 
     */
    @XmlEnumValue("EquifaxMarketMax")
    EQUIFAX_MARKET_MAX("EquifaxMarketMax"),

    /**
     * A custom risk score model from Equifax specifically for assessing mortgage loan risk.
     * 
     */
    @XmlEnumValue("EquifaxMortgageScore")
    EQUIFAX_MORTGAGE_SCORE("EquifaxMortgageScore"),

    /**
     * The Fair Isaac Next Gen risk model that utilizes expanded segmentation to provide greater predictive capability.
     * 
     */
    @XmlEnumValue("EquifaxPinnacle")
    EQUIFAX_PINNACLE("EquifaxPinnacle"),

    /**
     * The Fair Isaac Next Gen 2 risk model that utilizes expanded segmentation to provide greater predictive capability. Updated in 2003.
     * 
     */
    @XmlEnumValue("EquifaxPinnacle2.0")
    EQUIFAX_PINNACLE_2_0("EquifaxPinnacle2.0"),

    /**
     * A score model developed jointly by the three credit data repositories - Equifax, Experian and Trans Union.
     * 
     */
    @XmlEnumValue("EquifaxVantageScore")
    EQUIFAX_VANTAGE_SCORE("EquifaxVantageScore"),

    /**
     * Version 3.0 of the score model developed jointly by the three credit data repositories - Equifax, Experian and Trans Union.
     * 
     */
    @XmlEnumValue("EquifaxVantageScore3.0")
    EQUIFAX_VANTAGE_SCORE_3_0("EquifaxVantageScore3.0"),

    /**
     * Fair Isaac risk model forecasting risk of delinquency within 24 months.
     * 
     */
    @XmlEnumValue("ExperianFairIsaac")
    EXPERIAN_FAIR_ISAAC("ExperianFairIsaac"),

    /**
     * The Fair Isaac Next Gen risk model that utilizes expanded segmentation to provide greater predictive capability.
     * 
     */
    @XmlEnumValue("ExperianFairIsaacAdvanced")
    EXPERIAN_FAIR_ISAAC_ADVANCED("ExperianFairIsaacAdvanced"),

    /**
     * The Fair Isaac Next Gen 2 risk model that utilizes expanded segmentation to provide greater predictive capability. Updated in 2003.
     * 
     */
    @XmlEnumValue("ExperianFairIsaacAdvanced2.0")
    EXPERIAN_FAIR_ISAAC_ADVANCED_2_0("ExperianFairIsaacAdvanced2.0"),

    /**
     * Fair Isaac risk model for auto finance.
     * 
     */
    @XmlEnumValue("ExperianFairIsaacAuto")
    EXPERIAN_FAIR_ISAAC_AUTO("ExperianFairIsaacAuto"),

    /**
     * Fair Isaac risk model for bank credit cards.
     * 
     */
    @XmlEnumValue("ExperianFairIsaacBankcard")
    EXPERIAN_FAIR_ISAAC_BANKCARD("ExperianFairIsaacBankcard"),

    /**
     * Fair Isaac risk model for installment loans.
     * 
     */
    @XmlEnumValue("ExperianFairIsaacInstallment")
    EXPERIAN_FAIR_ISAAC_INSTALLMENT("ExperianFairIsaacInstallment"),

    /**
     * Fair Isaac risk model for personal finance loans.
     * 
     */
    @XmlEnumValue("ExperianFairIsaacPersonalFinance")
    EXPERIAN_FAIR_ISAAC_PERSONAL_FINANCE("ExperianFairIsaacPersonalFinance"),

    /**
     * Fair Isaac risk model forecasting risk of delinquency within 24 months. Updated in 2004.
     * 
     */
    @XmlEnumValue("ExperianFICOClassicV3")
    EXPERIAN_FICO_CLASSIC_V_3("ExperianFICOClassicV3"),

    /**
     * MDS risk model that forecasts risk of consumer filing bankruptcy.
     * 
     */
    @XmlEnumValue("ExperianMDSBankruptcyII")
    EXPERIAN_MDS_BANKRUPTCY_II("ExperianMDSBankruptcyII"),

    /**
     * Experian option for the National Risk Model that produces score ranges similar to Fair Isaac models.
     * 
     */
    @XmlEnumValue("ExperianNewNationalEquivalency")
    EXPERIAN_NEW_NATIONAL_EQUIVALENCY("ExperianNewNationalEquivalency"),

    /**
     * New version of Experians National Risk Model.
     * 
     */
    @XmlEnumValue("ExperianNewNationalRisk")
    EXPERIAN_NEW_NATIONAL_RISK("ExperianNewNationalRisk"),

    /**
     * Original version of Experians National Risk Model.
     * 
     */
    @XmlEnumValue("ExperianOldNationalRisk")
    EXPERIAN_OLD_NATIONAL_RISK("ExperianOldNationalRisk"),

    /**
     * An Experian risk model based on their own credit data.
     * 
     */
    @XmlEnumValue("ExperianScorexPLUS")
    EXPERIAN_SCOREX_PLUS("ExperianScorexPLUS"),

    /**
     * A score model developed jointly by the three credit data repositories - Equifax, Experian and Trans Union.
     * 
     */
    @XmlEnumValue("ExperianVantageScore")
    EXPERIAN_VANTAGE_SCORE("ExperianVantageScore"),

    /**
     * Version 3.0 of the score model developed jointly by the three credit data repositories - Equifax, Experian and Trans Union.
     * 
     */
    @XmlEnumValue("ExperianVantageScore3.0")
    EXPERIAN_VANTAGE_SCORE_3_0("ExperianVantageScore3.0"),

    /**
     * Fair Isaac risk model based on non-traditional credit data, targeted to predict risk for consumers with non-existent or thin credit histories.
     * 
     */
    @XmlEnumValue("FICOExpansionScore")
    FICO_EXPANSION_SCORE("FICOExpansionScore"),

    /**
     * Fair Isaac risk model forecasting risk of delinquency within 24 months. Updated in 2004.
     * 
     */
    @XmlEnumValue("FICORiskScoreClassic04")
    FICO_RISK_SCORE_CLASSIC_04("FICORiskScoreClassic04"),

    /**
     * Fair Isaac risk model forecasting risk of delinquency within 24 months. New Trans Union product name for Empirica.
     * 
     */
    @XmlEnumValue("FICORiskScoreClassic98")
    FICO_RISK_SCORE_CLASSIC_98("FICORiskScoreClassic98"),

    /**
     * Fair Isaac risk model for auto finance loans. New Trans Union product name for Empirica Auto.
     * 
     */
    @XmlEnumValue("FICORiskScoreClassicAuto98")
    FICO_RISK_SCORE_CLASSIC_AUTO_98("FICORiskScoreClassicAuto98"),

    /**
     * Fair Isaac risk model for bank credit cards. New Trans Union product name for Empirica Bankcard.
     * 
     */
    @XmlEnumValue("FICORiskScoreClassicBankcard98")
    FICO_RISK_SCORE_CLASSIC_BANKCARD_98("FICORiskScoreClassicBankcard98"),

    /**
     * Fair Isaac risk model for installment loans. New Trans Union product name for Empirica Installment.
     * 
     */
    @XmlEnumValue("FICORiskScoreClassicInstallmentLoan98")
    FICO_RISK_SCORE_CLASSIC_INSTALLMENT_LOAN_98("FICORiskScoreClassicInstallmentLoan98"),

    /**
     * Fair Isaac risk model for personal finance loans. New Trans Union product name for Empirica Personal Finance.
     * 
     */
    @XmlEnumValue("FICORiskScoreClassicPersonalFinance98")
    FICO_RISK_SCORE_CLASSIC_PERSONAL_FINANCE_98("FICORiskScoreClassicPersonalFinance98"),

    /**
     * The Fair Isaac Next Gen risk model that utilizes expanded segmentation to provide greater predictive capability. New Trans Union product name for Precision.
     * 
     */
    @XmlEnumValue("FICORiskScoreNextGen00")
    FICO_RISK_SCORE_NEXT_GEN_00("FICORiskScoreNextGen00"),

    /**
     * The Fair Isaac Next Gen 2 risk model that utilizes expanded segmentation to provide greater predictive capability. Updated in 2003. New Trans Union product name for Precision 03.
     * 
     */
    @XmlEnumValue("FICORiskScoreNextGen03")
    FICO_RISK_SCORE_NEXT_GEN_03("FICORiskScoreNextGen03"),

    /**
     * Used when Score Model Name is not in the enumerated list.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * MDS risk model that forecasts risk of consumer filing bankruptcy.
     * 
     */
    @XmlEnumValue("TransUnionDelphi")
    TRANS_UNION_DELPHI("TransUnionDelphi"),

    /**
     * Fair Isaac risk model forecasting risk of delinquency within 24 months. Trans Union has renamed this risk model to FICO Risk Score Classic 98.
     * 
     */
    @XmlEnumValue("TransUnionEmpirica")
    TRANS_UNION_EMPIRICA("TransUnionEmpirica"),

    /**
     * Fair Isaac risk model for auto finance loans. Trans Union has renamed this risk model to FICO Risk Score Classic Auto 98.
     * 
     */
    @XmlEnumValue("TransUnionEmpiricaAuto")
    TRANS_UNION_EMPIRICA_AUTO("TransUnionEmpiricaAuto"),

    /**
     * Fair Isaac risk model for bank credit cards. Trans Union has renamed this risk model to FICO Risk Score Classic Bankcard 98.
     * 
     */
    @XmlEnumValue("TransUnionEmpiricaBankcard")
    TRANS_UNION_EMPIRICA_BANKCARD("TransUnionEmpiricaBankcard"),

    /**
     * Fair Isaac risk model for installment loans. Trans Union has renamed this risk model to FICO Risk Score Classic Installment 98.
     * 
     */
    @XmlEnumValue("TransUnionEmpiricaInstallment")
    TRANS_UNION_EMPIRICA_INSTALLMENT("TransUnionEmpiricaInstallment"),

    /**
     * Fair Isaac risk model for personal finance loans. Trans Union has renamed this risk model to FICO Risk Score Classic Personal Finance 98.
     * 
     */
    @XmlEnumValue("TransUnionEmpiricaPersonalFinance")
    TRANS_UNION_EMPIRICA_PERSONAL_FINANCE("TransUnionEmpiricaPersonalFinance"),

    /**
     * Updated MDS risk model that forecasts risk of consumer filing bankruptcy.
     * 
     */
    @XmlEnumValue("TransUnionNewDelphi")
    TRANS_UNION_NEW_DELPHI("TransUnionNewDelphi"),

    /**
     * The Fair Isaac Next Gen risk model that utilizes expanded segmentation to provide greater predictive capability. Trans Union has renamed this risk model to FICO Risk Score Next Gen 00.
     * 
     */
    @XmlEnumValue("TransUnionPrecision")
    TRANS_UNION_PRECISION("TransUnionPrecision"),

    /**
     * The Fair Isaac Next Gen 2 risk model that utilizes expanded segmentation to provide greater predictive capability. Updated in 2003. Trans Union has renamed this risk model to FICO Risk Score Next Gen 03.
     * 
     */
    @XmlEnumValue("TransUnionPrecision03")
    TRANS_UNION_PRECISION_03("TransUnionPrecision03"),

    /**
     * A score model developed jointly by the three credit data repositories - Equifax, Experian and Trans Union.
     * 
     */
    @XmlEnumValue("TransUnionVantageScore")
    TRANS_UNION_VANTAGE_SCORE("TransUnionVantageScore"),

    /**
     * Version 3.0 of the score model developed jointly by the three credit data repositories - Equifax, Experian and Trans Union.
     * 
     */
    @XmlEnumValue("TransUnionVantageScore3.0")
    TRANS_UNION_VANTAGE_SCORE_3_0("TransUnionVantageScore3.0");
    private final String value;

    CreditScoreModelNameBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditScoreModelNameBase fromValue(String v) {
        for (CreditScoreModelNameBase c: CreditScoreModelNameBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
