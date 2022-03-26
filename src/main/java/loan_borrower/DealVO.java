package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "deal" )
@Data
public class DealVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deal_id", insertable = false, nullable = false)
    private Integer dealId;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true means the record is soft deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "dealVO")
    private List<LoanVO> loanVOs=new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "dealVO")
    private List<PartyVO> partyVOS =new ArrayList<>();

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "liability_summary_id", referencedColumnName = "liability_summary_id")
    private LiabilitySummaryVO liabilitySummaryVO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "about_version_id", referencedColumnName = "about_version_id")
    private AboutVersionVO aboutVersionVO;





}
