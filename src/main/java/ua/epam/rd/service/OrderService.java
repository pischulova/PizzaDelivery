package ua.epam.rd.service;

import ua.epam.rd.domain.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createNewOrder();
    boolean updateOrder(Order order);
    boolean placeOrder(Order order);
    boolean isWorkingDay();
    boolean cancelOrder(Long orderId, String email);
}
