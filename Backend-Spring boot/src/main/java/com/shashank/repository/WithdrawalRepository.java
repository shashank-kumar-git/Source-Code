package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.domain.WithdrawalStatus;
import com.shashank.model.Withdrawal;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}
