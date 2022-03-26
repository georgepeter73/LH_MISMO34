package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "alias")
@Data
@Entity
public class AliasVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "alias_id", nullable = false)
  private Integer aliasId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "middle_name")
  private String middleName;
  @Column(name = "suffix_name")
  private String suffixName;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true mewans the record is deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @ManyToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "individual_id")
  private IndividualVO individualVO;


}
