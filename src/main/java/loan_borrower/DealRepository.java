package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/***
 *
 */
public interface DealRepository extends JpaRepository<DealVO, Integer>, JpaSpecificationExecutor<DealVO> {

}
