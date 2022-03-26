package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "about_version")
@Data
public class AboutVersionVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "about_version_id", nullable = false)
  private Integer aboutVersionId;
  @Column( name = "mismo_version_number")
  private Double mismoVersionNumber;

  @OneToOne( mappedBy = "aboutVersionVO")
  private DealVO dealVO ;


}
