package ua.epam.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.epam.rd.repository.PizzaRepository;
import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.List;
@Service("pizzaServiceTest")
public class PizzaServiceTest implements PizzaService {
    private PizzaRepository pizzaRepository;

    @Autowired
    public PizzaServiceTest(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.getAllPizzas();
    }

    @Override
    public List<Pizza> getPizzaByType(PizzaType type) {
        return pizzaRepository.getPizzasByType(type);
    }
}
