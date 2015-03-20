package ua.epam.rd.domain;

public class Pizza {
    private String name;
    private int price;
    private PizzaType pizzaType;

    public Pizza(String name, int price, PizzaType pizzaType) {
        this.name = name;
        this.price = price;
        this.pizzaType = pizzaType;
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

    @Override
    public String toString() {
        return "Pizza { " + name + ", price=" + price + ", " + pizzaType + '}';
    }
}
