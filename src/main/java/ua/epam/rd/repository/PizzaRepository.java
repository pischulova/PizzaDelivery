package ua.epam.rd.repository;

import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.List;

public interface PizzaRepository {
    Long savePizza(Pizza pizza);
    boolean deletePizza(Pizza pizza);
    List<Pizza> getAllPizzas();
    List<Pizza> getPizzasByType(PizzaType type);
}
