package ua.epam.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.epam.rd.repository.PizzaRepository;
import ua.epam.rd.domain.PizzaType;
import ua.epam.rd.domain.Pizza;

import java.util.List;
@Service
public class PizzaServiceTest implements PizzaService {
    private PizzaRepository repository;

    @Autowired
    public PizzaServiceTest(PizzaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return repository.getAllPizzas();
    }

    @Override
    public List<Pizza> getPizzaByType(PizzaType type) {
        return repository.getPizzasByType(type);
    }
}
