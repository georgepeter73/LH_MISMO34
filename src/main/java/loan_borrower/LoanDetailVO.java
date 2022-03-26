package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "loan_detail")
public class LoanDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;
    public LoanDetailVO(LoanVO loanVO){
        this.loanVO = loanVO;
        this.lastUpdatedBy = loanVO.getLastUpdatedBy();
    }
    public LoanDetailVO(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_detail_id", insertable = false, nullable = false)
    private Integer loanDetailId;

    @OneToOne( mappedBy = "loanDetailVO")
    private LoanVO loanVO ;

    @Column(name = "application_received_date")
    private Date applicationReceivedDate;

    @Column(name = "borrower_count")
    private Integer borrowerCount;

    @Column(name = "interest_only_indicator")
    private Integer interestOnlyIndicator;

    @Column(name = "heloc_indicator")
    private Integer helocIndicator;

    @Column(name = "balloon_indicator")
    private Integer balloonIndicator;

    @Column(name = "negative_amortization_indicator")
    private Integer negativeAmortizationIndicator;

    @Column(name = "initial_fixed_period_effective_months_count")
    private Integer initialFixedPeriodEffectiveMonthsCount;

    @Column(name = "buydown_temporary_subsidy_funding_indicator")
    private Integer buydownTemporarySubsidyFundingIndicator;

    @Column(name = "construction_loan_indicator")
    private Integer constructionLoanIndicator;

    @Column(name = "prepayment_penalty_indicator")
    private Integer prepaymentPenaltyIndicator;

    @Column(name = "conversion_of_contract_for_deed_indicator")
    private Integer conversionOfContractForDeedIndicator;

    @Column(name = "renovation_loan_indicator")
    private Integer renovationLoanIndicator;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true means the record is soft deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    
}
