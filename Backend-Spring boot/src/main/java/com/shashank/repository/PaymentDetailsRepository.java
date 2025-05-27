package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Long> {

    PaymentDetails getPaymentDetailsByUserId(Long userId);
}
