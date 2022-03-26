package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "affordable_lending")
@Data
@Entity
public class AffordableLendingVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "affordable_lending", nullable = false)
  private Integer affordableLendingId;
  @Column(name = "community_seconds_repayment_type")
  private Integer communitySecondsRepaymentType;
  @Column(name = "hud_income_limit_adjustment_percent")
  private Double hudIncomeLimitAdjustmentPercent;
  @Column(name = "community_lending_product_type")
  private Integer communityLendingProductType;
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
