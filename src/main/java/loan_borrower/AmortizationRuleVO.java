package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "amortization_rule")
@Data
@Entity
public class AmortizationRuleVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "amortization_rule_id", nullable = false)
  private Integer amortizationRuleId;
  @Column(name = "loan_amortization_period_type")
  private Integer loanAmortizationPeriodType;
  @Column(name = "loan_amortization_period_count")
  private Integer loanAmortizationPeriodCount;
  @Column(name = "amortization_type")
  private Integer amortizationType;
  @Column(name = "amortization_type_other_description")
  private String amortizationTypeOtherDescription;
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
