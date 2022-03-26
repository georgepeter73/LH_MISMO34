package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "quote_product")
@Data
public class QuoteProductVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "quote_product_id", nullable = false)
  private long quoteProductId;
  @Column(name = "products")
  private String products;
  @Column(name = "products_bad_response")
  private String productsBadResponse;
  @Column(name = "quote_request")
  private String quoteRequest;
  @Column(name = "ineligible_products")
  private String ineligibleProducts;
  @Column(name = "last_updated_at")
  private java.sql.Timestamp lastUpdatedAt;
  @Column(name = "last_updated_by")
  private String lastUpdatedBy;
  @Column(name = "delete_flag")
  private boolean deleteFlag;
  @OneToOne(mappedBy = "quoteProductVO")
  private QuoteVO quoteVO;



}
