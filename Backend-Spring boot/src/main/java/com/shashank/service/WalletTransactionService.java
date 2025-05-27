package com.shashank.service;

import java.util.List;

import com.shashank.domain.WalletTransactionType;
import com.shashank.model.Wallet;
import com.shashank.model.WalletTransaction;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
