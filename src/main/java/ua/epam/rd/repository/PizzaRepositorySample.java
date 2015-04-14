package ua.epam.rd.repository;

import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.*;

public class PizzaRepositorySample implements PizzaRepository {
    public List<Pizza> repository;

    public PizzaRepositorySample() {
        repository = new ArrayList<Pizza>();
    }

    public void setRepository(List<Pizza> repository) {
        this.repository = repository;
    }

    @Override
    public Long savePizza(Pizza pizza) {
        repository.add(pizza);
        return 0L;
    }

    @Override
    public boolean deletePizza(Pizza pizza) {
        return repository.remove(pizza);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        List<Pizza> copy = new ArrayList<Pizza>();
        for (Pizza pizza : repository) {
            copy.add(pizza);
        }
        return copy;
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType type) {
        List<Pizza> sortedList = new ArrayList<Pizza>();
        for (Pizza pizza : repository) {
            if (pizza.getPizzaType() == type) {
                sortedList.add(pizza);
            }
        }
        return sortedList;
    }
}
