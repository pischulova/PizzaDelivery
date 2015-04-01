package ua.epam.rd.repository;

import org.hibernate.annotations.NamedQuery;
import org.springframework.stereotype.Repository;
import ua.epam.rd.domain.*;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
@Repository("pizzaRepository")
public class JPAPizzaRepository implements PizzaRepository {
    static final String FIND_ALL_PIZZAS = "SELECT p FROM Pizza p";
    static final String FIND_PIZZAS_BY_TYPE = "SELECT p FROM Pizza p WHERE p.pizzaType = ?1";

    @PersistenceContext(name = "unit1")
    private EntityManager em;

    @Transactional
    @Override
    public Long savePizza(Pizza pizza) {
        em.persist(pizza);
        return pizza.getId();
    }

    @Override
    public boolean deletePizza(Pizza pizza) {
        em.remove(pizza);
        return false;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        Query query = em.createQuery(FIND_ALL_PIZZAS);
        return query.getResultList();
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType type) {
        Query query = em.createQuery(FIND_PIZZAS_BY_TYPE);
        query.setParameter(1, type);
        return query.getResultList();
    }
}
