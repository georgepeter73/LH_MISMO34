package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "government_monitoring_detail")
@Data
@Entity
public class GovernmentMonitoringDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "government_monitoring_detail_id", insertable = false, nullable = false)
    private Integer governmentMonitoringDetailId;

    @OneToOne(mappedBy = "governmentMonitoringDetailVO")
    private BorrowerDetailVO borrowerDetailVO;

    @Column(name = "hmda_gender_refusal_indicator")
    private Integer hmdaGenderRefusalIndicator;

    @Column(name = "hmda_race_based_on_visual_observation_or_surname_indicator")
    private Integer hmdaRaceBasedOnVisualObservationOrSurnameIndicator;

    @Column(name = "hmda_gender_based_on_visual_observation_or_name_indicator")
    private Integer hmdaGenderBasedOnVisualObservationOrNameIndicator;

    @Column(name = "hmda_ethnicity_based_on_visual_observation_or_surname_indicator")
    private Integer hmdaEthnicityBasedOnVisualObservationOrSurnameIndicator;

    @Column(name = "hmda_ethnicity_refusal_indicator")
    private Integer hmdaEthnicityRefusalIndicator;
    @Column(name = "application_taken_method_type")
    private Integer applicationTakenMethodType;

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
