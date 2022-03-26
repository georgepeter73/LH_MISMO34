package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Table(name = "loan_identifier")
@Entity
public class LoanIdentifierVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "loan_identifier_id", insertable = false, nullable = false)
  private Integer loanIdentifierId;
  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "loan_id")
  private LoanVO loanVO;
  @Column(name = "loan_identifier_type")
  private Integer loanIdentifierType;
  @Column(name = "loan_identifier")
  private String loanIdentifier;
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
