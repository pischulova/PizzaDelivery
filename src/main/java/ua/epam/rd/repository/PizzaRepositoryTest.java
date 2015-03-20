package ua.epam.rd.repository;

import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.*;

public class PizzaRepositoryTest implements PizzaRepository {
    public List<Pizza> repository;

    public PizzaRepositoryTest() {
        repository = new ArrayList<Pizza>();
//        repository.add(new Pizza("A", 50, PizzaType.VEGETARIAN));
//        repository.add(new Pizza("B", 60, PizzaType.VEGETARIAN));
//        repository.add(new Pizza("C", 70, PizzaType.MEAT));
//        repository.add(new Pizza("D", 80, PizzaType.SEA));
//        repository.add(new Pizza("E", 90, PizzaType.SEA));
    }

    public void setRepository(List<Pizza> repository) {
        this.repository = repository;
    }

    @Override
    public void addPizza(Pizza pizza) {
        repository.add(pizza);
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
