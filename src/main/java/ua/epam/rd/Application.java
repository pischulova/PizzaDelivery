package ua.epam.rd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.rd.domain.*;
import ua.epam.rd.repository.*;
import ua.epam.rd.service.*;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringConfig.xml");

        PizzaService pizzaService = appContext.getBean("pizzaServiceTest", PizzaServiceTest.class);

        List<Pizza> pizzaList = pizzaService.getAllPizzas();

        OrderService orderService = new OrderServiceTest(new OrderRepositoryTest());

        Order order1 = orderService.createOrder();
        order1.addItems(pizzaList.get(0), pizzaList.get(2));
        orderService.placeOrder(order1);

        Order order2 = orderService.createOrder();
        order2.addItems(pizzaList.get(1), pizzaList.get(3));
        orderService.placeOrder(order2);

        List<Order> orders = orderService.getAllOrders();
        System.out.println(orders);
    }

}
