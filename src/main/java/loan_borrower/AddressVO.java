package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "address")
@Data
public class AddressVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "address_id", nullable = false)
  private Integer addressId;
  @Column(name = "address_type")
  private long addressType;
  @Column(name = "address_line_text")
  private String addressLineText;
  @Column(name = "address_unit_identifier")
  private String addressUnitIdentifier;
  @Column(name = "city_name")
  private String cityName;
  @Column(name = "state_code")
  private String stateCode;
  @Column(name = "postal_code")
  private String postalCode;
  @Column(name = "country_code")
  private String countryCode;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @OneToOne(mappedBy = "addressVO")
  private ResidenceDetailVO residenceDetailVO;

  @OneToOne(mappedBy = "addressVO")
  private OwnedPropertyDetailVO ownedPropertyDetail;

  @OneToOne(mappedBy = "addressVO")
  private SubjectPropertyVO subjectProperty;

}
