package com.shashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.Watchlist;

public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {

    Watchlist findByUserId(Long userId);

}
