package com.ShoppingWebsiteApplication.repository;

import com.ShoppingWebsiteApplication.model.Order;

import java.util.List;

public interface OrderRepository {

    void createOrder( Order order);

    Order getOrderById( Long orderId);

    void deleteOrderById(Long orderId);

    void updateOrder( Long orderId , Order order);

}
