package ua.epam.rd.repository;

import org.springframework.stereotype.Repository;
import ua.epam.rd.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryTest implements OrderRepository{
    public List<Order> repository;
    public int count;

    public OrderRepositoryTest() {
        repository = new ArrayList<Order>();
        count = 0;
    }

    @Override
    public boolean addOrder(Order order) {
        count++;
        return repository.add(order);
    }

    @Override
    public boolean deleteOrder(Order order) {
        return repository.remove(order);
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> copy = new ArrayList<Order>();
        for (Order order : repository) {
            copy.add(order);
        }
        return copy;
    }

    @Override
    public Order getOrderById(int id) {
        Order result = null;
        for (Order order : repository) {
            if (id == order.getId()) {
                result = order;
            }
        }
        return result;
    }

    @Override
    public int getNewOrderId() {
        return count;
    }
}
