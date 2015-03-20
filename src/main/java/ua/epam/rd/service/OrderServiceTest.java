package ua.epam.rd.service;

import ua.epam.rd.repository.OrderRepository;
import ua.epam.rd.domain.Order;

import java.util.*;

public class OrderServiceTest implements OrderService {
    private OrderRepository repository;

    public OrderServiceTest(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.getAllOrders();
    }

    @Override
    public Order getOrderById(int id) {
        return repository.getOrderById(id);
    }

    @Override
    public Order createOrder() {
        int newOrderId = repository.getNewOrderId();
        Date date = new Date();
        return new Order(newOrderId, date);
    }

    @Override
    public boolean placeOrder(Order order) {
        return repository.addOrder(order);
    }
}
