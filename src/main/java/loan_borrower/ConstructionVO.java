package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name = "construction")
@Data
@Entity
public class ConstructionVO implements Serializable {
    private static final long serialVersionUID = 1L;

    public ConstructionVO(LoanVO loanVO){
        this.loanVO = loanVO;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "construction_id", insertable = false, nullable = false)
    private Integer constructionId;


    @OneToOne( mappedBy = "constructionVO")
    private LoanVO loanVO ;

    @Column(name = "construction_loan_type")
    private Integer constructionLoanType;

    @Column(name = "land_original_cost_amount")
    private BigDecimal landOriginalCostAmount;

    @Column(name = "land_appraised_value_amount")
    private BigDecimal landAppraisedValueAmount;

    @Column(name = "construction_improvement_costs_amount")
    private BigDecimal constructionImprovementCostsAmount;

    @Column(name = "construction_to_permanent_closing_type")
    private Integer constructionToPermanentClosingType;

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
