package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.VerificationCode;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {
    VerificationCode findByUserId(Long userId);
}
