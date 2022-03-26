package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "selected_product_quote")
@Data
public class SelectedProductQuoteVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "selected_product_quote_id", nullable = false)
    private Integer selectedProductQuoteId;
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "searchId")
    private String searchId;
    @Column(name = "rate")
    private Double rate;
    @Column(name = "lockPeriod")
    private Integer lockPeriod;
    @Column(name = "lockExpirationDate")
    private String lockExpirationDate;
    @Column(name = "apr")
    private Double apr;
    @Column(name = "price")
    private Double price;
    @Column(name = "armMargin")
    private Double armMargin;
    @Column(name = "closingCost")
    private Double closingCost;
    @Column(name = "discountDollar")
    private Double discountDollar;
    @Column(name = "discountPercent")
    private Double discountPercent;
    @Column(name = "rebateDollar")
    private Double rebateDollar;
    @Column(name = "rebatePercent")
    private Double rebatePercent;
    @Column(name = "loCompensationDollar")
    private Double loCompensationDollar;
    @Column(name = "loCompensationPercent")
    private Double loCompensationPercent;
    @Column(name = "principalAndInterest")
    private Double principalAndInterest;
    @Column(name = "totalCredit")
    private Double totalCredit;
    @Column(name = "monthlyMi")
    private Double monthlyMi;
    @Column(name = "totalPayment")
    private Double totalPayment;
    @Column(name = "last_updated_at", insertable = false, updatable = false)
    private Timestamp lastUpdatedAt;
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;
    @Column(name = "delete_flag")
    private Integer deleteFlag = 0;
    @OneToOne(mappedBy = "selectedProductQuoteVO")
    private QuoteVO quoteVO;

}
