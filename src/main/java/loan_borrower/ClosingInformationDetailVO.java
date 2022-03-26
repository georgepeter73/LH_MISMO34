package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "closing_information_detail ")
@Data
@Entity
public class ClosingInformationDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "closing_information_detail_id", nullable = false)
  private Integer closingInformationDetailId;
  @Column(name = "cash_to_borrower_at_closing_amount")
  private Double cashToBorrowerAtClosingAmount;
  @Column(name = "cash_from_borrower_at_closing_amount")
  private Double cashFromBorrowerAtClosingAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @OneToOne( mappedBy = "closingInformationDetailVO")
  private LoanVO loanVO ;




}
