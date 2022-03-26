package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "credit_score_detail")
public class CreditScoreDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_score_detail_id", insertable = false, nullable = false)
    private Integer creditScoreDetailId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_detail_id")
    private BorrowerDetailVO  borrowerDetailVO;

    @Column(name = "credit_report_identifier")
    private String creditReportIdentifier;

    @Column(name = "credit_score_value")
    private Integer creditScoreValue;

    @Column(name = "credit_repository_source_indicator")
    private Integer creditRepositorySourceIndicator;

    @Column(name = "credit_repository_source_type")
    private Integer creditRepositorySourceType;

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
