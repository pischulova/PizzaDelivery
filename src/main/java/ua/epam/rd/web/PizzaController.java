package ua.epam.rd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.epam.rd.domain.Pizza;
import ua.epam.rd.service.PizzaService;

import java.util.List;

@Controller
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @RequestMapping(value = "pizza/add", method = RequestMethod.POST)
    public String createPizza(@ModelAttribute Pizza pizza) {
        pizzaService.savePizza(pizza);
        System.out.println("add");
        return "redirect:/pizza/show_all";
    }

    @RequestMapping(value = "pizza/show_all", method = RequestMethod.GET)
    @ResponseBody
    public String show() {
        List<Pizza> pizzaList = pizzaService.getAllPizzas();
        StringBuilder sb = new StringBuilder();
        System.out.println("show");
        for (Pizza pizza : pizzaList) {
            sb.append(pizza.toString()).append("\n");
        }
        return sb.toString();
    }
}
