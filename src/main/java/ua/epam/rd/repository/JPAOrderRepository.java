package ua.epam.rd.repository;

import org.springframework.stereotype.Repository;
import ua.epam.rd.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("orderRepository")
public class JPAOrderRepository implements OrderRepository{
    @PersistenceContext(name = "unit1")
    private EntityManager em;

    @Override
    public boolean addOrder(Order order) {
        return false;
    }

    @Override
    public boolean deleteOrder(Order order) {
        return false;
    }

    @Override
    public boolean updateOrder(Order order) {
        return false;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }

    @Override
    public int getNewOrderId() {
        return 0;
    }
}
