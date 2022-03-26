package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContactPointDetailRepository extends JpaRepository<ContactPointDetailVO, Integer>, JpaSpecificationExecutor<ContactPointDetailVO> {

}
