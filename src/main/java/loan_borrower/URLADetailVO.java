package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "urla_detail")
@Data
@Entity
public class URLADetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "urla_detail_id", insertable = false, nullable = false)
  private Integer urlaDetailId;
  @Column(name = "application_signed_by_loan_originator_date")
  private java.sql.Date applicationSignedByLoanOriginatorDate;
  @Column(name = "refinance_improvements_type")
  private Integer refinanceImprovementsType;
  @Column(name = "refinance_improvement_costs_amount")
  private Double refinanceImprovementCostsAmount;
  @Column(name = "alterations_improvements_and_repairs_amount")
  private Double alterationsImprovementsAndRepairsAmount;
  @Column(name = "estimated_closing_costs_amount")
  private Double estimatedClosingCostsAmount;
  @Column(name = "borrower_paid_discount_points_total_amount")
  private Double borrowerPaidDiscountPointsTotalAmount;
  @Column(name = "mi_and_funding_fee_financed_amount")
  private Double miAndFundingFeeFinancedAmount;
  @Column(name = "mi_and_funding_fee_total_amount")
  private Double miAndFundingFeeTotalAmount;
  @Column(name = "prepaid_items_estimated_amount")
  private Double prepaidItemsEstimatedAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne( mappedBy = "urlaDetailVO")
  private LoanVO loanVO ;


}
