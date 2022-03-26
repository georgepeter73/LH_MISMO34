package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "dependent")
@Entity
public class DependentVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "dependent_id", nullable = false)
    private Integer dependentId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_detail_id")
    private BorrowerDetailVO borrowerDetailVO;

    @Column(name = "dependent_age_years_count")
    private Integer dependentAgeYearsCount;

    @Column(name = "last_updated_at")
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    
}
