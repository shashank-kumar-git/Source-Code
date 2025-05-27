package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
