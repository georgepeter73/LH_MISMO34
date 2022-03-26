package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "asset_detail")
@Data
@Entity
public class AssetDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "asset_detail_id", nullable = false)
  private Integer assetDetailId;
  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "borrower_detail_id")
  private BorrowerDetailVO borrowerDetailVO;
  @Column(name = "asset_account_identifier")
  private String assetAccountIdentifier;
  @Column(name = "asset_cash_or_market_value_amount")
  private Double assetCashOrMarketValueAmount;
  @Column(name = "asset_type")
  private Integer assetType;
  @Column(name = "asset_type_other_description")
  private String assetTypeOtherDescription;
  @Column(name = "funds_source_type")
  private Integer fundsSourceType;
  @Column(name = "funds_source_type_other_description")
  private String fundsSourceTypeOtherDescription;
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
