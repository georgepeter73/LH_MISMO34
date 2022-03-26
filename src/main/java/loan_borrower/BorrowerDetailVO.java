package com.pos.common.repository.loan_borrower;

import com.pos.common.annotation.Encrypted;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Table(name = "borrower_detail")
@Data
@Entity
public class BorrowerDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    public BorrowerDetailVO(PartyVO partyVO){
        this.partyVO = partyVO;
        this.lastUpdatedBy = partyVO.getLastUpdatedBy();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "borrower_detail_id", nullable = false)
    private Integer borrowerDetailId;




    /**
     * Borrowers Age
     */
    @Column(name = "borrower_age_at_application_years_count")
    private Integer borrowerAgeAtApplicationYearsCount;

    @Encrypted
    @Column(name = "borrower_birth_date")
    private Date borrowerBirthDate;

    @Column(name = "domestic_relationship_state_code")
    private Integer domesticRelationshipStateCode;

    @Encrypted
    @Column(name = "marital_status_type")
    private Integer maritalStatusType;

    @Column(name = "self_declared_military_service_indicator")
    private Integer selfDeclaredMilitaryServiceIndicator = 0;

    @Encrypted
    @Column(name = "domestic_relationship_type")
    private Integer domesticRelationshipType;

    @Column(name = "borrower_total_mortgaged_properties_count")
    private Integer borrowerTotalMortgagedPropertiesCount;

    @Encrypted
    @Column(name = "domestic_relationship_indicator")
    private Integer domesticRelationshipIndicator;

    @Encrypted
    @Column(name = "domestic_relationship_type_other_description")
    private String domesticRelationshipTypeOtherDescription;

    @Encrypted
    @Column(name = "community_property_state_resident_indicator")
    private Integer communityPropertyStateResidentIndicator;

    @Column(name = "spouse_va_benefits_eligibility_indicator")
    private Integer spouseVaBenefitsEligibilityIndicator;

    @Column(name = "borrower_qualifying_income_amount")
    private BigDecimal borrowerQualifyingIncomeAmount;

    @Column(name = "borrower_mailtoaddress_same_as_property_indicator")
    private Integer borrowerMailtoaddressSameAsPropertyIndicator;

    @Column(name = "borrower_classification_type")
    private Integer borrowerClassificationType;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    @OneToOne(mappedBy = "borrowerDetailVO")
    private PartyVO partyVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "counseling_confirmation_id", referencedColumnName = "counseling_confirmation_id")
    private CounselingConfirmationVO counselingConfirmationVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "declaration_detail_id", referencedColumnName = "declaration_detail_id")
    private DeclarationDetailVO declarationDetailVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "government_borrower_id", referencedColumnName = "government_borrower_id")
    private GovernmentBorrowerVO governmentBorrowerVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "government_monitoring_detail_id", referencedColumnName = "government_monitoring_detail_id")
    private GovernmentMonitoringDetailVO governmentMonitoringDetailVO;

    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "counseling_event_detail_id", referencedColumnName = "counseling_event_detail_id")
    private CounselingEventDetailVO counselingEventDetailVO;

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<CreditScoreDetailVO> creditScoreDetailVOS =new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<HmdaEthnicityOriginsVO> hmdaEthnicityOriginsVOS =new ArrayList<>();


    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<HmdaRaceDetailVO> hmdaRaceDetailVOS =new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<DependentVO> dependentVOS =new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<EmploymentVO> employmentVOS =new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<ResidenceDetailVO> residenceDetailVOS =new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<PurchaseCreditVO> purchaseCreditVOS =new ArrayList<>();

    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<AssetDetailVO> assetDetailVOS =new ArrayList<>();
    @OneToMany( cascade = {CascadeType.ALL}, mappedBy = "borrowerDetailVO")
    private List<OwnedPropertyDetailVO> ownedPropertyDetails =new ArrayList<>();
    @OneToOne( cascade = {CascadeType.ALL})
    @JoinColumn(name = "military_service_id", referencedColumnName = "military_service_id")
    private MilitaryServiceVO militaryServiceVO;

}
