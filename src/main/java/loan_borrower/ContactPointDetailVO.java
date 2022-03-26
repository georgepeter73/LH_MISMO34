package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "contact_point_detail")
@Data
@Entity
public class ContactPointDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_point_detail_id", insertable = false, nullable = false)
    private Integer contactPointDetailId;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "individual_id")
    private ContactPointDetailVO  contactPointDetailVO;

    @Column(name = "contact_point_telephone_value")
    private String contactPointTelephoneValue;

    @Column(name = "contact_point_telephone_ext_value")
    private String contactPointTelephoneExtValue;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    @Column(name = "delete_flag")
    private Integer deleteFlag = 0;

    
}
