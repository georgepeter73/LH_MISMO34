package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "subject_property")
@Data
@Entity
public class SubjectPropertyVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "subject_property_id", insertable = false, nullable = false)
  private Integer subjectPropertyId;
  @OneToOne( cascade = {CascadeType.ALL})
  @JoinColumn(name = "address_id", referencedColumnName = "address_id")
  private AddressVO addressVO;
  @Column(name = "property_valuation_amount")
  private Double propertyValuationAmount;
  @Column(name = "sales_concession_amount")
  private Double salesConcessionAmount;

  @Column(name = "appraisal_identifier")
  private String appraisalIdentifier;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne( mappedBy = "subjectProperty")
  private LoanVO loanVO ;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "sales_contract_detail_id", referencedColumnName = "sales_contract_detail_id")
  private SalesContractDetailVO salesContractDetailVO;



}
