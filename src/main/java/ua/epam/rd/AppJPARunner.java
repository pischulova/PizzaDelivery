package ua.epam.rd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.rd.domain.Pizza;
import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.service.OrderService;
import ua.epam.rd.service.OrderServiceSample;
import ua.epam.rd.service.PizzaService;
import ua.epam.rd.service.PizzaServiceSample;

import java.util.List;

public class AppJPARunner {
    public static void main(String[] args) {

//        ConfigurableApplicationContext repositContext = new ClassPathXmlApplicationContext("RepositConfig.xml");
//        ConfigurableApplicationContext appContext =
//                new ClassPathXmlApplicationContext(new String[]{"SpringConfig.xml"}, repositContext);

        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("SpringConfig.xml");

        PizzaService pizzaService = appContext.getBean("pizzaServiceTest", PizzaServiceSample.class);
        OrderService orderService = appContext.getBean("orderServiceTest", OrderServiceSample.class);

        Pizza pizza = new Pizza();
        pizza.setName("Oliva");
        pizza.setPizzaType(PizzaType.VEGETARIAN);
        pizza.setPrice(92);

        pizzaService.savePizza(pizza);

        List<Pizza> pizzas = pizzaService.getAllPizzas();
        System.out.println(pizzas);


//        pizzaRepository.savePizza(pizza);

        //Pizza newPizza = em.find(Pizza.class, pizza.getId());
        //System.out.println(newPizza);
        appContext.close();
    }
}
