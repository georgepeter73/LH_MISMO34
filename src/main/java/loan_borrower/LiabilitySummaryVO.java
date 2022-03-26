package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "liability_summary")
public class LiabilitySummaryVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "liability_summary_id", nullable = false)
  private Integer liabilitySummaryId;
  @Column(name = "total_subjectproperty_payoffs_and_paymentsamount")
  private Double totalSubjectpropertyPayoffsAndPaymentsamount;
  @Column(name = "total_non_subjectproperty_debtstobe_paidoffamount")
  private Double totalNonSubjectpropertyDebtstobePaidoffamount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne( mappedBy = "liabilitySummaryVO")
  private DealVO dealVO ;


}
