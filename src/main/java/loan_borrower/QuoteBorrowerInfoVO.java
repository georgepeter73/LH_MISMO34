package com.pos.common.repository.loan_borrower;

import com.pos.common.annotation.Encrypted;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "quote_borrower_info")
@Data
public class QuoteBorrowerInfoVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "quote_borrower_info_id", nullable = false)
    private Integer quoteBorrowerInfoId;
    @Encrypted
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    @Encrypted
    private String lastName;
    @Column(name = "middle_name")
    @Encrypted
    private String middleName;
    @Column(name = "suffix_name")
    @Encrypted
    private String suffixName;
    @Column(name = "email")
    @Encrypted
    private String email;
    @Column(name = "phone")
    @Encrypted
    private String phone;
    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private java.sql.Timestamp lastUpdatedAt;
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;
    @Column(name = "delete_flag")
    private boolean deleteFlag;
    @OneToOne(mappedBy = "quoteBorrowerInfoVO")
    private QuoteVO quoteVO;



}
