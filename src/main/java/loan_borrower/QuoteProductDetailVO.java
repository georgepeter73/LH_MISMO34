package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "quote_product_detail")
@Data
public class QuoteProductDetailVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "quote_product_detail_id", nullable = false)
    private long quoteProductDetailId;
     @Column(name = "product_detail")
    private String productDetail;
    @Column(name = "product_detail_bad_response")
    private String productDetailBadResponse;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "search_id")
    private String searchId;
    @Column(name = "last_updated_at")
    private java.sql.Timestamp lastUpdatedAt;
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;
    @Column(name = "delete_flag")
    private boolean deleteFlag;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "quote_id")
    private QuoteVO  quoteVO;


}
