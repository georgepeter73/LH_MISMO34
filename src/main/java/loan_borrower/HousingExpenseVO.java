package com.pos.common.repository.loan_borrower;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@Entity
@Table(name = "individual")
public class HousingExpenseVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "housing_expense_id", nullable = false)
  private Integer housingExpenseId;
  @Column(name = "loan_id")
  private Integer loanId;
  @Column(name = "housing_expense_timing_type")
  private Integer housingExpenseTimingType;
  @Column(name = "housing_expense_type")
  private Integer housingExpenseType;
  @Column(name = "housing_expense_payment_amount")
  private Double housingExpensePaymentAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;



}
