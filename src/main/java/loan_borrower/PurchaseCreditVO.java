package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "purchase_credit")
@Data
public class PurchaseCreditVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "purchase_credit_id", nullable = false)
  private Integer purchaseCreditId;
  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "borrower_detail_id")
  private BorrowerDetailVO borrowerDetailVO;
  @Column(name = "purchase_credit_type")
  private Integer purchaseCreditType;
  @Column(name = "purchase_credit_type_other_description")
  private String purchaseCreditTypeOtherDescription;
  @Column(name = "purchase_credit_amount")
  private Double purchaseCreditAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;


}
