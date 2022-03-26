package com.pos.common.repository.loan_borrower;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "declaration_detail")
public class DeclarationDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "declaration_detail_id", insertable = false, nullable = false)
    private Integer declarationDetailId;

    @OneToOne(mappedBy = "declarationDetailVO")
    private BorrowerDetailVO borrowerDetailVO;

    @Column(name = "bankrupcy_indicator")
    private Integer bankrupcyIndicator;

    @Column(name = "borrower_first_time_home_buyer_indicator")
    private Integer borrowerFirstTimeHomeBuyerIndicator;

    @Column(name = "home_owner_past_three_years_type")
    private Integer homeOwnerPastThreeYearsType;

    @Column(name = "prior_property_usage_type")
    private Integer priorPropertyUsageType;

    @Column(name = "FHA_Secondary_Residence_Indicator")
    private Integer fhaSecondaryResidenceIndicator;

    @Column(name = "undisclosed_borrowed_funds_amount")
    private BigDecimal undisclosedBorrowedFundsAmount;

    @Column(name = "undisclosed_credit_application_indicator")
    private Integer undisclosedCreditApplicationIndicator;

    @Column(name = "outstanding_judgments_indicator")
    private Integer outstandingJudgmentsIndicator;

    @Column(name = "party_to_lawsuit_indicator")
    private Integer partyToLawsuitIndicator;

    @Column(name = "undisclosed_mortgage_application_indicator")
    private Integer undisclosedMortgageApplicationIndicator;

    @Column(name = "presently_delinquent_indicator")
    private Integer presentlyDelinquentIndicator;

    @Column(name = "intent_to_occupy_type")
    private Integer intentToOccupyType;

    @Column(name = "undisclosed_comaker_of_note_indicator")
    private Integer undisclosedComakerOfNoteIndicator;

    @Column(name = "prior_property_short_sale_completed_indicator")
    private Integer priorPropertyShortSaleCompletedIndicator;

    @Column(name = "property_proposed_clean_energy_lien_indicator")
    private Integer propertyProposedCleanEnergyLienIndicator;

    @Column(name = "prior_property_foreclosure_completed_indicator")
    private Integer priorPropertyForeclosureCompletedIndicator;

    @Column(name = "prior_property_deed_in_lieu_conveyed_indicator")
    private Integer priorPropertyDeedInLieuConveyedIndicator;

    @Column(name = "bankruptcy_indicator")
    private Integer bankruptcyIndicator;

    @Column(name = "prior_property_title_type")
    private Integer priorPropertyTitleType;

    @Column(name = "undisclosed_borrowed_funds_indicator")
    private Integer undisclosedBorrowedFundsIndicator;

    @Column(name = "loan_foreclosure_judgement_indicator")
    private Integer loanForeclosureJudgementIndicator;

    @Column(name = "citizenship_residency_type")
    private Integer citizenshipResidencyType;

    @Column(name = "last_updated_at",insertable=false, updatable=false)
    private Timestamp lastUpdatedAt;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 0 is false and 1 is true, true mewans the record is deleted.
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag = Boolean.FALSE;

    
}
