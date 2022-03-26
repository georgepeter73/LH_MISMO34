package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "underwriting_verification")
@Data
@Entity
public class UnderwritingVerificationVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "underwriting_verification_id", insertable = false, nullable = false)
  private long underwritingVerificationId;
  @Column(name = "verification_report_supplier_type")
  private long verificationReportSupplierType;
  @Column(name = "verification_report_identifier")
  private String verificationReportIdentifier;
  @Column(name = "verification_report_type")
  private long verificationReportType;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne( mappedBy = "underwritingVerificationVO")
  private LoanVO loanVO ;

}
