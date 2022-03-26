package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "hmda_loan_detail")
@Data
public class HmdaLoanDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "hmda_loan_detail_id", insertable = false, nullable = false)
  private Integer hmdaLoanDetailId;
  @Column(name = "hmda_rate_spread_percent")
  private Double hmdaRateSpreadPercent;
  @Column(name = "hmda_hoepa_loan_status_indicator")
  private Boolean hmdaHoepaLoanStatusIndicator;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;
  @OneToOne( mappedBy = "hmdaLoanDetail")
  private LoanVO loanVO ;

}
