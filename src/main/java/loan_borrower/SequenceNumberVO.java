package com.pos.common.repository.loan_borrower;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name = "sequence_number", catalog = "loan_borrower")
public class SequenceNumberVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sequence_number_id", nullable = false)
  private Integer sequenceNumberId;


  @Column(name = "field_name",unique = true)
  private String fieldName;

  @Column(name = "sequence_number")
  private Integer sequenceNumber;
}
