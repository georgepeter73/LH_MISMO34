package com.pos.common.repository.loan_borrower;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "property_detail")
@Data
public class PropertyDetailVO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "property_detail_id", nullable = false)
  private Integer propertyDetailId;
  @Column(name = "property_current_usage_type")
  private Integer propertyCurrentUsageType;
  @Column(name = "property_estimated_value_amount")

  private Double propertyEstimatedValueAmount;
  @Column(name = "financed_unit_count")

  private Integer financedUnitCount;
  @Column(name = "property_usage_type")

  private Integer propertyUsageType;
  @Column(name = "fha_secondary_residence_indicator")

  private Boolean fhaSecondaryResidenceIndicator;
  @Column(name = "property_mixed_usage_indicator")

  private Boolean propertyMixedUsageIndicator;
  @Column(name = "construction_method_type")

  private Integer constructionMethodType;
  @Column(name = "construction_method_type_other_description")

  private String constructionMethodTypeOtherDescription;
  @Column(name = "rental_estimated_gross_monthly_rent_amount")

  private Double rentalEstimatedGrossMonthlyRentAmount;
  @Column(name = "rental_estimated_net_monthly_rent_amount")

  private Double rentalEstimatedNetMonthlyRentAmount;
  @Column(name = "community_property_state_indicator")

  private Boolean communityPropertyStateIndicator;
  @Column(name = "property_acquired_date")

  private java.sql.Date propertyAcquiredDate;
  @Column(name = "property_existing_clean_energy_lien_indicator")

  private Boolean propertyExistingCleanEnergyLienIndicator;
  @Column(name = "pud_indicator")

  private Boolean pudIndicator;
  @Column(name = "property_in_project_indicator")

  private Boolean propertyInProjectIndicator;
  @Column(name = "attachment_type")

  private Integer attachmentType;
  @Column(name = "property_structure_built_year")

  private Integer propertyStructureBuiltYear;
  @Column(name = "property_estate_type")

  private Integer propertyEstateType;
  @Column(name = "property_ground_lease_expiration_date")

  private java.sql.Date propertyGroundLeaseExpirationDate;
  @Column(name = "native_american_lands_type")

  private Integer nativeAmericanLandsType;
  @Column(name = "native_american_lands_type_other_description")

  private String nativeAmericanLandsTypeOtherDescription;
  @Column(name = "last_updated_at",insertable=false, updatable=false)
  private Timestamp lastUpdatedAt;

  @Column(name = "last_updated_by")
  private String lastUpdatedBy;

  @Column(name = "delete_flag")
  private Integer deleteFlag = 0;

  @OneToOne(mappedBy = "propertyDetailVO")
  private OwnedPropertyDetailVO ownedPropertyDetail;



}
