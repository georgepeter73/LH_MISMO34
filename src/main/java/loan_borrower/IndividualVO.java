package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "individual")
public class IndividualVO implements Serializable {
    private static final long serialVersionUID = 1L;
    public IndividualVO(PartyVO partyVO){
        this.partyVO = partyVO;
        this.lastUpdatedBy = partyVO.getLastUpdatedBy();

    }
    public IndividualVO(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "individual_id", nullable = false)
    private Integer individualId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @OneToOne(mappedBy = "individualVO")
    private PartyVO partyVO;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    @Column(name = "delete_flag")
    private Integer deleteFlag = 0;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "contactPointDetailVO")
    private List<ContactPointDetailVO> contactPointDetailVOS =new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "individualVO")
    private List<AliasVO> aliasVOS =new ArrayList<>();


}
