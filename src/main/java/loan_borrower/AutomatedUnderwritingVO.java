package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "automated_underwriting")
@Data
public class AutomatedUnderwritingVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "automated_underwriting_id", nullable = false)
  private long automatedUnderwritingId;
  @Column( name = "automated_underwriting_case_identifier")
  private String automatedUnderwritingCaseIdentifier;
  @Column( name = "automated_underwriting_tool_type")
  private long automatedUnderwritingToolType;

  @OneToOne( mappedBy = "automatedUnderwritingVO")
  private LoanVO loanVO ;

}
