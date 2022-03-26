package com.pos.common.repository.loan_borrower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SequenceNumberRepository extends JpaRepository<SequenceNumberVO,Integer> , JpaSpecificationExecutor<SequenceNumberVO> {
 SequenceNumberVO getByFieldName(String fieldName);

}
