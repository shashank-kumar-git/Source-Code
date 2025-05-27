package com.shashank.request;

import lombok.Data;

import java.math.BigDecimal;

import com.shashank.domain.OrderType;
import com.shashank.model.Coin;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
