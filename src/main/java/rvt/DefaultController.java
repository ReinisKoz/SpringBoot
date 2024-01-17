package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/test")
    ModelAndView testAction()
    {
        ModelAndView modelAndView = new ModelAndView("test");

        String name = "john";
        int age = 20;
        Money macins1 = new Money(10, 20);
        Money macins2 = new Money(5, 10);

        modelAndView.addObject("macins1", macins1);
        modelAndView.addObject("macins2", macins2);
        modelAndView.addObject("summa", macins1.plus(macins2));
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);

        return modelAndView;
    }
}
