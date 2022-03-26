package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Collection;

public interface QuoteRepository extends JpaRepository<QuoteVO, Integer>, JpaSpecificationExecutor<QuoteVO> {
    Collection<QuoteVO> findQuoteVOByRequestId(String requestId);
}
