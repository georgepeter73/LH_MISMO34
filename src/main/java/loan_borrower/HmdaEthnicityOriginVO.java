package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "hmda_ethnicity_origin")
@Data
@Entity
public class HmdaEthnicityOriginVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "hmda_ethnicity_origin_id", nullable = false)
    private Integer hmdaEthnicityOriginId;



    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "hmda_ethnicity_origins_id")
    private HmdaEthnicityOriginsVO hmdaEthnicityOriginsVO;

    @Column(name = "HMDAEthnicityOriginType")
    private Integer HMDAEthnicityOriginType;

    @Column(name = "HMDAEthnicityOriginTypeOtherDescription")
    private String HMDAEthnicityOriginTypeOtherDescription;

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
