package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "floify_transaction")
public class FloifyTransactionVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "floify_transaction_id", insertable = false, nullable = false)
  private Integer floifyTransactionId;
  @Column(name = "loan_id")
  private Integer loanId;
  @Column(name = "prospects_id")
  private String prospectsId;
  @Column(name = "request_data")
  private String requestDate;
  @Column(name = "response_data")
  private String responseData;
  @Column(name = "transaction_type")
  private Integer transactionType;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;
  @Column(name = "last_updated_by")
  private String lastUpdatedBy;
  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne(mappedBy = "floifyTransactionVO")
  private QuoteVO quoteVO;


}
