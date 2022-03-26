package com.pos.common.repository.loan_borrower;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "loan_product_detail")
public class LoanProductDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "loan_product_detail_id", insertable = false, nullable = false)
  private long loanProductDetailId;
  @Column(name = "discount_points_total_amount")
  private Double discountPointsTotalAmount;
  @Column(name = "product_description")
  private String productDescription;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true means the record is soft deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @OneToOne( mappedBy = "loanProductDetail")
  private LoanVO loanVO ;



}
