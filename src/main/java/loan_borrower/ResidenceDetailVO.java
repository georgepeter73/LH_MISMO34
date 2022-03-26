package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "residence_detail")
@Data
public class ResidenceDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "residence_detail_id", nullable = false)
  private Integer residenceDetailId;


  @Column( name = "borrower_residency_type")
  private Integer borrowerResidencyType;
  @Column( name = "borrower_residency_duration_months_count")
  private Integer borrowerResidencyDurationMonthsCount;
  @Column( name = "borrower_residency_basis_type")
  private Integer borrowerResidencyBasisType;
  @Column( name = "monthly_rent_amount")
  private Double monthlyRentAmount;

  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;
  @OneToOne( cascade = {CascadeType.ALL})
  @JoinColumn(name = "address_id", referencedColumnName = "address_id")
  private AddressVO addressVO;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "borrower_detail_id")
  private BorrowerDetailVO borrowerDetailVO;



}
