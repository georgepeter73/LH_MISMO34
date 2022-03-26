package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IndividualRepository extends JpaRepository<IndividualVO, Integer>, JpaSpecificationExecutor<IndividualVO> {

}
