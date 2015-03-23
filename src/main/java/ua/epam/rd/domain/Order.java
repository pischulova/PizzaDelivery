package ua.epam.rd.domain;

import java.util.*;

public class Order {
    public int id;
    public Date date;
    public String name;
    public int price;
    public List<Pizza> pizzas = new ArrayList<Pizza>();

    public Order() {
    }

    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
        this.name = id + date.toString();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) { this.name = name; }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addItems(Pizza... pizzaList) {
        for (Pizza pizza : pizzaList) {
            pizzas.add(pizza);
            price += pizza.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Order\n {" +
                "id=" + id +
                ",\n date=" + date +
                ",\n name='" + name + '\'' +
                ",\n price=" + price +
                ",\n pizzas=" + pizzas +
                "\n";
    }
}
