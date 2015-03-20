package ua.epam.rd.service;

import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> getAllPizzas();
    List<Pizza> getPizzaByType(PizzaType type);

}
