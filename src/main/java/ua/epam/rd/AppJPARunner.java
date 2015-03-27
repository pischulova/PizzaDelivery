package ua.epam.rd;

import ua.epam.rd.domain.Pizza;
import ua.epam.rd.domain.PizzaType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppJPARunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = emf.createEntityManager();

        Pizza pizza = new Pizza();
        pizza.setName("Oliva");
        pizza.setPizzaType(PizzaType.VEGETARIAN);
        pizza.setPrice(123);

        em.getTransaction().begin();
        em.persist(pizza);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
