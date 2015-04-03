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
    public Long savePizza(Pizza pizza) {
        return pizzaRepository.savePizza(pizza);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.getAllPizzas();
    }

    @Override
    public List<Pizza> getPizzaByType(PizzaType type) {
        return pizzaRepository.getPizzasByType(type);
    }

    @Override
    public Pizza getPizzaById(Long id) {
        return null;
    }

    @Override
    public boolean updatePizzaById(Long id, Pizza pizza) {
        return false;
    }

    @Override
    public boolean deletePizza(Pizza pizza) {
        return false;
    }


}
