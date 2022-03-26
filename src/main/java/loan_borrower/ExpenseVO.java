package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Data
@Table(name = "expense")
public class ExpenseVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "expense_id", insertable = false, nullable = false)
  private Integer expenseId;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "borrower_detail_id")
  private BorrowerDetailVO borrowerDetailVO;
  @Column(name = "expense_type")
  private Integer expenseType;
  @Column(name = "expense_type_other_description")
  private String expenseTypeOtherDescription;
  @Column(name = "expense_monthly_payment_amount")
  private Double expenseMonthlyPaymentAmount;
  @Column(name = "expense_remaining_term_months_count")
  private Integer expenseRemainingTermMonthsCount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;
  @Column(name = "last_updated_by")
  private String lastUpdatedBy;
  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;


}
