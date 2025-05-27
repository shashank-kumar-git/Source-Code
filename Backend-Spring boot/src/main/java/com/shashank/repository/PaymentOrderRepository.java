package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}
