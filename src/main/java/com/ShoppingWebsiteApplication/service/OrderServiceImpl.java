package com.ShoppingWebsiteApplication.service;

import com.ShoppingWebsiteApplication.model.Order;
import com.ShoppingWebsiteApplication.model.User;
import com.ShoppingWebsiteApplication.model.UserOrderRequest;
import com.ShoppingWebsiteApplication.model.UserOrderResponse;
import com.ShoppingWebsiteApplication.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserService userService;

    @Override
    public UserOrderResponse createOrder(UserOrderRequest userOrderRequest) throws Exception {
        User selectedUser = userOrderRequest.getUser();
        if (selectedUser != null) {
            if (selectedUser.getId() != null) {
                User existingUser = userService.getUserById(selectedUser.getId());
                if (existingUser != null) {
                    orderRepository.createOrder(userOrderRequest.toOrder());
                } else {
                    throw new Exception("Can't  create order with non existing user id " + selectedUser.getId());
                }

            } else {
                throw new Exception("Can't create userOrder with user as null");
            }
        }
        return null ;
    }


    @Override
    public Order getOrderById(Long orderId) {return orderRepository.getOrderById(orderId);
    }


    @Override
    public void deleteOrderById(Long orderId) {
         orderRepository.deleteOrderById(orderId);
    }

    @Override
    public void updateOrder( Long orderId , Order order) {orderRepository.updateOrder( orderId , order);
    }

}
