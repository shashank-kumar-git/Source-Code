package com.shashank.service;

import java.util.List;

import com.shashank.domain.OrderType;
import com.shashank.model.Coin;
import com.shashank.model.Order;
import com.shashank.model.OrderItem;
import com.shashank.model.User;
import com.shashank.request.CreateOrderRequest;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
