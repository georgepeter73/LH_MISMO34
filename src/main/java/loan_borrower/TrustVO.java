package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "trust")
@Data
@Entity
public class TrustVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "trust_id", insertable = false, nullable = false)
  private Integer trustId;
  @Column(name = "trust_classification_type")
  private Integer trustClassificationType;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne(mappedBy = "trustVO")
  private PartyVO partyVO;



}
