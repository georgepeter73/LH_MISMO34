package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Collection;

public interface QuoteProductDetailQueryRepository extends JpaRepository<QuoteProductDetailQueryVO, Integer>, JpaSpecificationExecutor<QuoteProductDetailQueryVO> {
  Collection<QuoteProductDetailQueryVO> getQuoteProductDetailVOByProductIdAndSearchIdAndQuoteId(Integer productId,String searchId,Integer quoteId);

}
