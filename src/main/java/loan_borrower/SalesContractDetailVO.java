package com.pos.common.repository.loan_borrower;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sales_contract_detail")
@Data
public class SalesContractDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "sales_contract_detail_id", nullable = false)
  private Integer salesContractDetailId;
  @Column(name = "sales_contract_amount")
  private Double salesContractAmount;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne( mappedBy = "salesContractDetailVO")
  private SubjectPropertyVO subjectPropertyVO ;

  @OneToOne( mappedBy = "salesContractDetailVO")
  private OwnedPropertyDetailVO ownedPropertyDetailVO ;



}
