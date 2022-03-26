package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "license_detail")
public class LicenseDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "license_detail_id", nullable = false)
  private Integer licenseDetailId;
  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "party_id")
  private PartyVO partyVO;
  @Column(name = "license_authority_level_type")
  private Integer licenseAuthorityLevelType;
  @Column(name = "license_identifier")
  private String licenseIdentifier;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

}
