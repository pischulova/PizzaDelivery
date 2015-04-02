package ua.epam.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ua.epam.rd.domain.Order;
import ua.epam.rd.repository.OrderRepository;

import java.text.SimpleDateFormat;
import java.util.*;

@Service("orderServiceTest")
public class OrderServiceTest implements OrderService {
    private OrderRepository repository;

    @Autowired
    public OrderServiceTest(OrderRepository orderRepository) {
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
//        order.setId(newOrderId);
        order.setName(newOrderId + "/" + new SimpleDateFormat("dd.MM.yy").format(date));
        return order;
    }

    @Override
    public boolean placeOrder(Order order) {
        return repository.addOrder(order);
    }

    @Lookup("order")
    protected Order createOrder(){
        return null;
    }
}
