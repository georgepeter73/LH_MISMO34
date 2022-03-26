package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "legal_entity_detail")
public class LegalEntityDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "legal_entity_detail_id", nullable = false)
  private Integer legalEntityDetailId;
  @Column(name = "full_name")
  private String fullName;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;
  @OneToOne(mappedBy = "legalEntityDetailVO")
  private EmploymentVO employmentVO;





}
