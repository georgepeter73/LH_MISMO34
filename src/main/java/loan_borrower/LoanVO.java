package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "loan")
@Entity
public class LoanVO implements Serializable {
    private static final long serialVersionUID = 1L;
    public LoanVO(DealVO dealVO){
        this.dealVO = dealVO;
        this.lastUpdatedBy = dealVO.getLastUpdatedBy();

    }
    public LoanVO(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id", insertable = false, nullable = false)
    private Integer loanId;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "deal_id")
    private DealVO dealVO ;

    /**
     * loan originators loan identifier
     */
    @Column(name = "loan_number")
    private Integer loanNumber;
    @Column(name = "loan_maturity_period_type")
    private Integer loanMaturityPeriodType;
    @Column(name = "loan_maturity_period_count")
    private Integer loanMaturityPeriodCount;
    @Column(name = "interest_only_term_months_count")
    private Integer interestOnlyTermMonthsCount;
    @Column(name = "negative_amortization_type")
    private Integer negativeAmortizationType;
    @Column(name = "prepayment_penalty_expiration_months_count")
    private Integer prepaymentPenaltyExpirationMonthsCount;
    @Column(name = "buydown_initial_effective_interest_rate_percent")
    private Double buydownInitialEffectiveInterestRatePercent;
    @Column(name = "investor_product_plan_identifier")
    private String investorProductPlanIdentifier ;
    @Column(name = "qualifying_rate_percent")
    private Double qualifyingRatePercent;
    @Column(name = "mi_coverage_percent")
    private Double miCoveragePercent;
    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true means the record is soft deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "loan_detail_id", referencedColumnName = "loan_detail_id")
    private LoanDetailVO loanDetailVO ;


    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "construction_id", referencedColumnName = "construction_id")
    private ConstructionVO constructionVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "loan_product_id", referencedColumnName = "loan_product_id")
    private LoanProductVO loanProductVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "refinance_id", referencedColumnName = "refinance_id")
    private RefinanceVO refinanceVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "terms_of_loan_id", referencedColumnName = "terms_of_loan_id")
    private TermsOfLoanVO termsOfLoanVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "subject_property_id", referencedColumnName = "subject_property_id")
    private SubjectPropertyVO subjectProperty;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "government_loan_id", referencedColumnName = "government_loan_id")
    private GovernmentLoanVO governmentLoanVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "hmda_loan_detail_id", referencedColumnName = "hmda_loan_detail_id")
    private HmdaLoanDetailVO hmdaLoanDetail;


    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "loan_product_detail_id", referencedColumnName = "loan_product_detail_id")
    private LoanProductDetailVO loanProductDetail;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "urla_detail_id", referencedColumnName = "urla_detail_id")
    private URLADetailVO urlaDetailVO;

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "loanVO")
    private List<ClosingAdjustmentItemDetailVO> closingAdjustmentItemDetailVOS =new ArrayList<>();

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "closing_information_detail_id", referencedColumnName = "closing_information_detail_id")
    private ClosingInformationDetailVO closingInformationDetailVO;

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "loanVO")
    private List<LoanIdentifierVO> loanIdentifierVOS =new ArrayList<>();

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "automated_underwriting_id", referencedColumnName = "automated_underwriting_id")
    private AutomatedUnderwritingVO automatedUnderwritingVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "underwriting_verification_id", referencedColumnName = "underwriting_verification_id")
    private UnderwritingVerificationVO underwritingVerificationVO;





}
