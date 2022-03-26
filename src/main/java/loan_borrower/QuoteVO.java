package com.pos.common.repository.loan_borrower;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quote")
@Data
public class QuoteVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "quote_id", nullable = false)
  private Integer quoteId;
  @Column(name = "transaction_type")
  private Integer transactionType;
  @Column(name = "occupancy_type")
  private Integer occupancyType;
  @Column(name = "employment_type")
  private Integer employmentType;
  @Column(name = "income_documentation_type")
  private Integer incomeDocumentationType;
  @Column(name = "property_information_type")
  private Integer propertyInformationType;
  @Column(name = "property_value")
  private Double propertyValue;
  @Column(name = "purchase_price")
  private Double purchasePrice;
  @Column(name = "down_payment")
  private Double downPayment;
  @Column(name = "expected_value_of_property")
  private Double expectedValueOfProperty;
  @Column(name = "requested_loan_amount")
  private Double requestedLoanAmount;
  @Column(name = "credit_score")
  private Integer creditScore;
  @Column(name = "credit_score_type")
  private Integer creditScoreType;
  @Column(name = "mortgage_insurance_type")
  private Integer mortgageInsuranceType;
  @Column(name = "taxes_insurance_escrows_type")
  private Integer taxesInsuranceEscrowsType;
  @Column(name = "last_updated_at")
  private java.sql.Timestamp lastUpdatedAt;
  @Column(name = "last_updated_by")
  private String lastUpdatedBy;
  @Column(name = "delete_flag")
  private boolean deleteFlag;
  @Column(name = "loan_to_value")
  private Double loanToValue;
  @Column(name = "govt_loan_indicator")
  private Boolean govtLoan;
  @Column(name = "pre_payment_penalty_type")
  private Integer prePaymentPenaltyType;

  @Column(name = "loan_type")
  private Integer loanType;

  @Column(name = "request_id")
  private String requestId;
  @Column(name = "remote_address")
  private String remoteAddress;
  @Column(name = "cash_out_amount")
  private Double cashOutAmount;
  @Column(name = "first_lien_amount")
  private Double firstLienAmount;

  @Column(name = "lo_uuid")
  private String loUUID;
  @Column(name = "campaign_type")
  private String campaignType;

  @Column(name = "va_loan_type")
  private String vaLoanType;


  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "quote_address_id", referencedColumnName = "quote_address_id")
  private QuoteAddressVO quoteAddressVO;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "quote_product_id", referencedColumnName = "quote_product_id")
  private QuoteProductVO quoteProductVO;
  @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "quoteVO")
  private List<QuoteProductDetailVO> quoteProductDetailVOS =new ArrayList<>();

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "selected_product_quote_id", referencedColumnName = "selected_product_quote_id")
  private SelectedProductQuoteVO selectedProductQuoteVO;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "quote_borrower_info_id", referencedColumnName = "quote_borrower_info_id")
  private QuoteBorrowerInfoVO quoteBorrowerInfoVO;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "floify_transaction_id", referencedColumnName = "floify_transaction_id")
  private FloifyTransactionVO floifyTransactionVO;


}
