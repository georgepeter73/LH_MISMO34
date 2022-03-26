package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LoanRepository extends JpaRepository<LoanVO, Integer>, JpaSpecificationExecutor<LoanVO> {
    LoanVO getLoanVOByLoanNumber(Integer loanNumber);
}
