package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Table(name = "hmda_ethnicity_origins")
@Data
@Entity
public class HmdaEthnicityOriginsVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "hmda_ethnicity_origins_id", nullable = false)
    private Integer hmdaEthnicityOriginsId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_ethnicity_id")
    private BorrowerDetailVO borrowerDetailVO;
    @Column(name = "`hmda_ethnicity_origin_type`")
    private Integer hmdaEthnicityOriginType;
    @Column(name = "`hmda_ethnicity_origin_type_other_description`")
     private String hmdaEthnicityOriginTypeOtherDescription;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "hmdaEthnicityOriginsVO")
    private List<HmdaEthnicityOriginVO> hmdaEthnicityOriginVOS =new ArrayList<>();



}
