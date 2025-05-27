package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet,Long> {

    public Wallet findByUserId(Long userId);


}
