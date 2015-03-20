package ua.epam.rd.service;

import ua.epam.rd.domain.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(int id);
    Order createOrder();
    boolean placeOrder(Order order);
}
