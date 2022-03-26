package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "party")
@Data
public class PartyVO implements Serializable {
    private static final long serialVersionUID = 1L;
    public PartyVO(DealVO dealVO){
        this.dealVO = dealVO;
        this.lastUpdatedBy = dealVO.getLastUpdatedBy();

    }
    public PartyVO(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "party_id", nullable = false)
    private Integer partyId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "deal_id")
    private DealVO dealVO;

    @Column(name = "sequence_number")
    private Integer sequenceNumber;

    @Column(name = "party_role_type")
    private Integer partyRoleType;


    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    @Column(name = "delete_flag")
    private Integer deleteFlag = 0;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "individual_id", referencedColumnName = "individual_id")
    private IndividualVO individualVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "borrower_detail_id", referencedColumnName = "borrower_detail_id")
    private BorrowerDetailVO borrowerDetailVO;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "partyVO")
    private List<TaxpayerIdentifierVO> taxpayerIdentifierVOS =new ArrayList<>();

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "property_owner_id", referencedColumnName = "property_owner_id")
    private PropertyOwnerVO propertyOwnerVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "trust_id", referencedColumnName = "trust_id")
    private TrustVO trustVO;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "partyVO")
    private List<LicenseDetailVO> licenseDetailVOS =new ArrayList<>();





}
