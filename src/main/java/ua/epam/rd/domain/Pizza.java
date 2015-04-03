package ua.epam.rd.domain;

import javax.persistence.*;

@Entity
@Table(name = "pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;

    @Enumerated(EnumType.STRING)
    private PizzaType pizzaType;

    public Pizza(String name, int price, PizzaType pizzaType) {
        this.name = name;
        this.price = price;
        this.pizzaType = pizzaType;
    }

    public Pizza() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza { " + name + ", price=" + price + ", " + pizzaType + '}';
    }
}
