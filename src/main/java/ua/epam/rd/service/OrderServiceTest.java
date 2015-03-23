package ua.epam.rd.service;

import ua.epam.rd.repository.OrderRepository;
import ua.epam.rd.domain.Order;

import java.util.*;

public abstract class OrderServiceTest implements OrderService {
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
    public Order createNewOrder() {
        int newOrderId = repository.getNewOrderId();
        Date date = new Date();
        Order order = createOrder();
        order.setDate(date);
        order.setId(newOrderId);
        return order;
    }

    @Override
    public boolean placeOrder(Order order) {
        return repository.addOrder(order);
    }

    protected abstract Order createOrder();
}
