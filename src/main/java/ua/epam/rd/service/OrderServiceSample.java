package ua.epam.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ua.epam.rd.domain.Order;
import ua.epam.rd.domain.OrderStatus;
import ua.epam.rd.repository.OrderRepository;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

@Service("orderServiceTest")
public class OrderServiceSample implements OrderService {
    private OrderRepository repository;

    @Autowired
    public OrderServiceSample(OrderRepository orderRepository) {
        this.repository = repository;
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.getAllOrders();
    }

    @Override
    public Order getOrderById(Long id) {
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
    public boolean updateOrder(Order order) {
        return repository.updateOrder(order);
    }

    @Override
    public boolean placeOrder(Order order) {
        if (!isWorkingDay())
            throw new IllegalStateException();
        if (order.getOrderStatus() != OrderStatus.NEW || order.getOrderItems().isEmpty())
            throw new IllegalArgumentException();

        return repository.addOrder(order);
    }

    @Override
    public boolean isWorkingDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        if (dayOfWeek != DayOfWeek.SATURDAY || dayOfWeek != DayOfWeek.SUNDAY) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean cancelOrder(Long orderId, String email) {
        Order order = repository.getOrderById(orderId);
        if (order == null) {
            throw new IllegalStateException();
        }
        if (order.getOrderStatus() == OrderStatus.DONE || order.getOrderStatus() == OrderStatus.CANCELLED) {
            throw new IllegalStateException();
        }
        order.setOrderStatus(OrderStatus.CANCELLED);
        repository.updateOrder(order);

        return false;
    }

    @Lookup("order")
    protected Order createOrder(){
        return null;
    }
}
