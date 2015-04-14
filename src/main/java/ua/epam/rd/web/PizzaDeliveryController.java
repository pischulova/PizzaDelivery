package ua.epam.rd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PizzaDeliveryController {

    @RequestMapping(value = "/", method = RequestMethod.GET) // always set method
    @ResponseBody  //просто в поток вывода выводит (response), а не во вью
    public String enterToPizzaService() {
//        StringBuilder sb = new StringBuilder();
//        for (String s : context.getBeanDefinitionNames()) {
//            sb.append(s).append(" ");
//        }
//        return sb.toString();

        return "Hello Spring";
    }
}
