package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "current_income_item_detail")
public class CurrentIncomeItemDetailVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "current_income_item_detail_id", insertable = false, nullable = false)
    private Integer currentIncomeItemDetailId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_detail_id")
    private BorrowerDetailVO  borrowerDetailVO;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "employment_id")
    private EmploymentVO  employmentVO;

    @Column(name = "income_type")
    private Integer incomeType;
    @Column(name = "current_income_monthly_total_amount")
    private Double currentIncomeMonthlyTotalAmount;
    @Column(name = "employment_income_indicator")
    private Boolean employmentIncomeIndicator;
    @Column(name = "income_type_other_description")
    private String incomeTypeOtherDescription;
    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;
}
