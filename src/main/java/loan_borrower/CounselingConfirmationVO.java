package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "counseling_confirmation")
@Entity
@Data
public class CounselingConfirmationVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "counseling_confirmation_id", insertable = false, nullable = false)
    private Integer counselingConfirmationId;


    @OneToOne(mappedBy = "counselingConfirmationVO")
    private BorrowerDetailVO borrowerDetailVO;

    @Column(name = "counseling_confirmation_type")
    private Integer counselingConfirmationType;

    @Column(name = "counseling_format_type")
    private Integer counselingFormatType;

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
