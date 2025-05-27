package com.shashank.service;


import java.math.BigDecimal;

import com.shashank.exception.WalletException;
import com.shashank.model.Order;
import com.shashank.model.User;
import com.shashank.model.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
