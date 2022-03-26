package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name = "government_borrower")
@Entity
@Data
public class GovernmentBorrowerVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "government_borrower_id", insertable = false, nullable = false)
    private Integer governmentBorrowerId;

    @OneToOne(mappedBy = "governmentBorrowerVO")
    private BorrowerDetailVO borrowerDetailVO;


    @Column(name = "VA_Federal_Tax_Amount")
    private BigDecimal vaFederalTaxAmount;

    @Column(name = "VACoBorrowerTaxableIncomeAmount")
    private BigDecimal VACoBorrowerTaxableIncomeAmount;

    @Column(name = "VAPrimaryBorrowerTaxableIncomeAmount")
    private BigDecimal VAPrimaryBorrowerTaxableIncomeAmount;

    @Column(name = "VALocalTaxAmount")
    private BigDecimal VALocalTaxAmount;

    @Column(name = "VAPrimaryBorrowerNonTaxableIncomeAmount")
    private BigDecimal VAPrimaryBorrowerNonTaxableIncomeAmount;

    @Column(name = "VACoBorrowerNonTaxableIncomeAmount")
    private BigDecimal VACoBorrowerNonTaxableIncomeAmount;

    @Column(name = "CAIVRSIdentifier")
    private String CAIVRSIdentifier;

    @Column(name = "VASocialSecurityTaxAmount")
    private BigDecimal VASocialSecurityTaxAmount;

    @Column(name = "VAStateTaxAmount")
    private BigDecimal VAStateTaxAmount;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    
}
