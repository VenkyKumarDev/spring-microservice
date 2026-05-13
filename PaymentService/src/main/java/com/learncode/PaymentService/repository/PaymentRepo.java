package com.learncode.PaymentService.repository;

import com.learncode.PaymentService.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<TransactionDetails, Long> {

    TransactionDetails findByOrderId(Long orderId);
}
