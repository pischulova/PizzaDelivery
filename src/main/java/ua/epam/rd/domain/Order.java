package ua.epam.rd.domain;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@OrderAnnotation
@Scope(value = "prototype")
public class Order {
    private int id;
    private Date date;
    private String name;
    private int price;
    private List<Pizza> pizzas = new ArrayList<Pizza>();
    private OrderStatus orderStatus;

    public Order() {
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

    public OrderStatus getOrderStatus() { return orderStatus; }

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

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
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
