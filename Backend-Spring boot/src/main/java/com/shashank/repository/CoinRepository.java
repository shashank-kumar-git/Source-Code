package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
