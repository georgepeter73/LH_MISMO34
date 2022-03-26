package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Table(name = "owned_property_detail")
@Entity
public class OwnedPropertyDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "owned_property_detail_id", insertable = false, nullable = false)
  private long ownedPropertyDetailId;
  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "borrower_detail_id")
  private BorrowerDetailVO borrowerDetailVO;

  @OneToOne( cascade = {CascadeType.ALL})
  @JoinColumn(name = "property_detail_id", referencedColumnName = "property_detail_id")
  private PropertyDetailVO propertyDetailVO;

  @OneToOne( cascade = {CascadeType.ALL})
  @JoinColumn(name = "address_id", referencedColumnName = "address_id")
  private AddressVO addressVO;

  @OneToOne( cascade = {CascadeType.ALL})
  @JoinColumn(name = "sales_contract_detail_id", referencedColumnName = "sales_contract_detail_id")
  private SalesContractDetailVO salesContractDetailVO;


  @OneToOne( cascade = {CascadeType.ALL})
  @JoinColumn(name = "liability_detail_id", referencedColumnName = "liability_detail_id")
  private LiabilityDetailVO liabilityDetailVO;
  @Column(name = "owned_property_subject_indicator")
  private long ownedPropertySubjectIndicator;
  @Column(name = "owned_property_disposition_status_type")
  private long ownedPropertyDispositionStatusType;
  @Column(name = "owned_property_maintenance_expense_amount")
  private double ownedPropertyMaintenanceExpenseAmount;
  @Column(name = "owned_property_rental_income_gross_amount")
  private double ownedPropertyRentalIncomeGrossAmount;
  @Column(name = "owned_property_rental_income_net_amount")
  private double ownedPropertyRentalIncomeNetAmount;
  @Column(name = "owned_property_lien_upb_amount")
  private double ownedPropertyLienUpbAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true means the record is soft deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;



}
