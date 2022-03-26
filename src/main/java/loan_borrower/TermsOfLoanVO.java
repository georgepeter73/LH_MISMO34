package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "taxpayer_identifier")
@Data
@Entity
public class TermsOfLoanVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "terms_of_loan_id", insertable = false, nullable = false)
  private Integer termsOfLoanId;
  @Column(name = "loan_purpose_type")
  private Integer loanPurposeType;
  @Column(name = "lien_priority_type")
  private Integer lienPriorityType;
  @Column(name = "note_amount")
  private Double noteAmount;
  @Column(name = "mortgage_type")
  private Integer mortgageType;
  @Column(name = "note_rate_percent")
  private Double noteRatePercent;
  @Column(name = "disclosed_index_rate_percent")
  private Double disclosedIndexRatePercent;
  @Column(name = "base_loan_amount")
  private Double baseLoanAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne( mappedBy = "termsOfLoanVO")
  private LoanVO loanVO ;

}
