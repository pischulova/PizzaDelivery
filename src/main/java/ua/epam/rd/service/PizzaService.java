package ua.epam.rd.service;

import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.List;

public interface PizzaService {
    Long savePizza(Pizza pizza);

    List<Pizza> getAllPizzas();
    List<Pizza> getPizzaByType(PizzaType type);
    Pizza getPizzaById(Long id);

    boolean updatePizzaById(Long id, Pizza pizza);

    boolean deletePizza(Pizza pizza);

}
