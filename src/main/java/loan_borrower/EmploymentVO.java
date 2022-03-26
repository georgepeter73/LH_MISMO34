package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "employment")
public class EmploymentVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employment_id", insertable = false, nullable = false)
    private Integer employmentId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_detail_id")
    private BorrowerDetailVO borrowerDetailVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "legal_entity_detail_id", referencedColumnName = "legal_entity_detail_id")
    private LegalEntityDetailVO legalEntityDetailVO;



    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "individual_id", referencedColumnName = "individual_id")
    private IndividualVO individualVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private AddressVO addressVO;


    @Column(name = "employment_position_description")
    private String employmentPositionDescription;

    @Column(name = "employment_time_In_line_of_work_months_count")
    private Integer employmentTimeInLineOfWorkMonthsCount;

    @Column(name = "special_borrower_employer_relationship_indicator")
    private Integer specialBorrowerEmployerRelationshipIndicator;

    @Column(name = "ownership_interest_type")
    private Integer ownershipInterestType;

    @Column(name = "employment_monthly_income_amount")
    private BigDecimal employmentMonthlyIncomeAmount;

    @Column(name = "employment_status_type")
    private Integer employmentStatusType;

    @Column(name = "employment_borrower_self_employed_indicator")
    private Integer employmentBorrowerSelfEmployedIndicator;

    @Column(name = "employment_start_date")
    private Date employmentStartDate;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "employmentVO")
    private List<CurrentIncomeItemDetailVO> currentIncomeItemDetailVOS =new ArrayList<>();

    
}
