package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "liability_detail")
public class LiabilityDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "liability_detail_id", nullable = false)
  private Integer liabilityDetailId;
  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "borrower_detail_id")
  private BorrowerDetailVO borrowerDetailVO;
  @Column(name = "liability_type_other_description")
  private String liabilityTypeOtherDescription;
  @Column(name = "liability_account_identifier")
  private String liabilityAccountIdentifier;
  @Column(name = "liability_unpaid_balance_amount")
  private Double liabilityUnpaidBalanceAmount;
  @Column(name = "liability_payoff_status_indicator")
  private Boolean liabilityPayoffStatusIndicator;
  @Column(name = "liability_monthly_payment_amount")
  private Double liabilityMonthlyPaymentAmount;
  @Column(name = "liability_remaining_term_months_count")
  private Integer liabilityRemainingTermMonthsCount;
  @Column(name = "liability_exclusion_indicator")
  private Boolean liabilityExclusionIndicator;
  @Column(name = "liability_payment_includes_taxes_insurance_indicator")
  private Boolean liabilityPaymentIncludesTaxesInsuranceIndicator;
  @Column(name = "liability_type")
  private Integer liabilityType;
  @Column(name = "heloc_maximum_balance_amount")
  private Double helocMaximumBalanceAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne(mappedBy = "liabilityDetailVO")
  private OwnedPropertyDetailVO ownedPropertyDetail;

}
