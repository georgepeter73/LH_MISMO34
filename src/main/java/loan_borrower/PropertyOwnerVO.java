package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "property_owner")
@Data
public class PropertyOwnerVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "property_owner_id", nullable = false)
  private Integer propertyOwnerId;
  @Column(name = "property_owner_status_type")
  private Integer propertyOwnerStatusType;
  @Column(name = "relationship_vesting_type")
  private Integer relationshipVestingType;
  @Column(name = "relationship_vesting_type_other_description")
  private String relationshipVestingTypeOtherDescription;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne(mappedBy = "propertyOwnerVO")
  private PartyVO partyVO;


}
