package ua.epam.rd.repository;

import ua.epam.rd.domain.Order;

import java.util.List;

public interface OrderRepository {
    boolean addOrder(Order order);
    boolean deleteOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(int id);
    int getNewOrderId();
}
