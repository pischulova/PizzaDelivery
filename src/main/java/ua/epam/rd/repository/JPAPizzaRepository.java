package ua.epam.rd.repository;

import org.springframework.stereotype.Repository;
import ua.epam.rd.domain.Pizza;
import ua.epam.rd.domain.PizzaType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;
import java.util.List;

@Repository("pizzaRepository")
public class JPAPizzaRepository implements PizzaRepository {
    EntityManagerFactory emf;

    public JPAPizzaRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Transactional
    @Override
    public Long savePizza(Pizza pizza) {
        EntityManager em = emf.createEntityManager();
        em.persist(pizza);
        em.close();
        return pizza.getId();
    }

    @Override
    public boolean deletePizza(Pizza pizza) {
        return false;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return null;
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType type) {
        return null;
    }
}
