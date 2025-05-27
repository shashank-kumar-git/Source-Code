package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.domain.WalletTransactionType;
import com.shashank.model.Wallet;
import com.shashank.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
