package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "government_borrower")
@Entity
@Data
public class GovernmentLoanVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "government_loan_id", insertable = false, nullable = false)
  private Integer governmentLoanId;
  @Column(name = "va_borrower_coborrower_married_indicator")
  private Boolean vaBorrowerCoborrowerMarriedIndicator;
  @Column(name = "fha_loan_lender_identifier")
  private String fhaLoanLenderIdentifier;
  @Column(name = "fha_loan_sponsor_identifier")
  private String fhaLoanSponsorIdentifier;
  @Column(name = "government_refinance_type")
  private Integer governmentRefinanceType;
  @Column(name = "government_refinance_type_other_description")
  private String governmentRefinanceTypeOtherDescription;
  @Column(name = "property_energy_efficient_home_indicator")
  private Boolean propertyEnergyEfficientHomeIndicator;
  @Column(name = "government_mortgage_credit_certificate_amount")
  private Double governmentMortgageCreditCertificateAmount;
  @Column(name = "section_of_act_type")
  private Integer sectionOfActType;
  @Column(name = "va_maintenance_expense_monthly_amount")
  private Double vaMaintenanceExpenseMonthlyAmount;
  @Column(name = "va_utility_expense_monthly_amount")
  private Double vaUtilityExpenseMonthlyAmount;
  @Column(name = "va_entitlement_amount")
  private Double vaEntitlementAmount;
  @Column(name = "fha_mi_premium_refund_amount")
  private Double fhaMiPremiumRefundAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @OneToOne( mappedBy = "governmentLoanVO")
  private LoanVO loanVO ;


}
