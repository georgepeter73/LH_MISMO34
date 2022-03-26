package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Table(name = "military_service")
@Entity
public class MilitaryServiceVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "military_service_id", insertable = false, nullable = false)
  private Integer militaryServiceId;
  @Column(name = "military_status_type")
  private Integer militaryStatusType;
  @Column(name = "military_service_expected_completion_date")
  private java.sql.Date militaryServiceExpectedCompletionDate;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  /**
   * 0 is false and 1 is true, true means the record is soft deleted.
   */
  @Column(name = "delete_flag")
  private Boolean deleteFlag = Boolean.FALSE;

  @OneToOne(mappedBy = "militaryServiceVO")
  private BorrowerDetailVO borrowerDetailVO;



}
