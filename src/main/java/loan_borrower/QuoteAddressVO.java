package com.pos.common.repository.loan_borrower;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "quote_address")
@Data
public class QuoteAddressVO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "quote_address_id", nullable = false)
  private Integer quoteAddressId;


  @Column(name = "zip")
  private Integer zip;
  @Column(name = "state")
  private String state;
  @Column(name = "county_code")
  private Integer countyCode;
  @Column(name = "city")
  private String city;
  @Column(name = "last_updated_at")
  private java.sql.Timestamp lastUpdatedAt;
  @Column(name = "last_updated_by")
  private String lastUpdatedBy;
  @Column(name = "delete_flag")
  private boolean deleteFlag;

  @OneToOne(mappedBy = "quoteAddressVO")
  private QuoteVO quoteVO;





}
