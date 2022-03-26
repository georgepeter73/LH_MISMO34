package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "refinance")
@Data
public class RefinanceVO {

  public RefinanceVO(){}
  public RefinanceVO(LoanVO  loanVO){
    this.loanVO =loanVO;
    this.lastUpdatedBy = loanVO.getLastUpdatedBy();
  }
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "refinance_id", nullable = false)
  private Integer refinanceId;
  @Column( name = "CurrentFirstMortgageHolderType")
  private Integer currentFirstMortgageHolderType;
  @Column( name = "RefinanceCashOutDeterminationType")
  private Integer refinanceCashOutDeterminationType;
  @Column( name = "RefinancePrimaryPurposeType")
  private Integer refinancePrimaryPurposeType;
  @Column( name = "last_updated_at")
  private java.sql.Timestamp lastUpdatedAt;
  @Column( name = "last_updated_by")
  private String lastUpdatedBy;
  @Column( name = "delete_flag")
  private Boolean deleteFlag;
  @OneToOne( mappedBy = "refinanceVO")
  private LoanVO loanVO ;


}
