package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "closing_adjustment_item_detail ")
@Data
@Entity
public class ClosingAdjustmentItemDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "closing_adjustment_item_detail_id", nullable = false)
  private Integer closingAdjustmentItemDetailId;
  @Column(name = "closing_adjustment_item_type")
  private Integer closingAdjustmentItemType;
  @Column(name = "closing_adjustment_item_amount")
  private Double closingAdjustmentItemAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "loan_id")
  private LoanVO  loanVO;

}
