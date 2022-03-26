package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "hmda_race_detail")
@Data
public class HmdaRaceDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hmda_race_detail_id", insertable = false, nullable = false)
    private Integer hmdaRaceDetailId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_detail_id")
    private BorrowerDetailVO  borrowerDetailVO;

    @Column(name = "hmda_race_type")
    private Integer hmdaRaceType;

    @Column(name = "hmda_race_refusal_indicator")
    private Integer hmdaRaceRefusalIndicator;

    @Column(name = "hmda_race_Type_additional_description")
    private String hmdaRaceTypeAdditionalDescription;

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
