package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "counseling_event_detail")
@Data
@Entity
public class CounselingEventDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "counseling_event_detail_id", insertable = false, nullable = false)
    private Integer counselingEventDetailId;


    @OneToOne(mappedBy = "counselingEventDetailVO")
    private BorrowerDetailVO borrowerDetailVO;

    @Column(name = "counseling_type")
    private Integer counselingType;

    @Column(name = "counseling_confirmation_indicator")
    private Integer counselingConfirmationIndicator;

    @Column(name = "counseling_completed_date")
    private Date counselingCompletedDate;

    @Column(name = "counseling_format_type")
    private Integer counselingFormatType;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true means the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    
}
