package com.pos.common.repository.loan_borrower;

import com.pos.common.annotation.Encrypted;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "taxpayer_identifier")
@Data
@Entity
public class TaxpayerIdentifierVO implements Serializable {
    private static final long serialVersionUID = 1L;
    public TaxpayerIdentifierVO(PartyVO partyVO){
        this.partyVO = partyVO;
        this.lastUpdatedBy = partyVO.getLastUpdatedBy();

    }
    public TaxpayerIdentifierVO(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taxpayer_identifier_id", insertable = false, nullable = false)
    private Integer taxpayerIdentifierId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "party_id")
    private PartyVO partyVO;

    @Column(name = "taxpayer_identifier_type")
    private Integer taxpayerIdentifierType;

    @Encrypted
    @Column(name = "taxpayer_identifier_value")
    private String taxpayerIdentifierValue;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    @Column(name = "delete_flag")
    private Integer deleteFlag = 0;

    
}
