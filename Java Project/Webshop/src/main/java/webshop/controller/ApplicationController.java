package webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by patrick_steinhauer on 31.10.2014.
 */
@Controller
public class ApplicationController {
    @RequestMapping(value = "index")
    public ModelAndView indexPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Hallo", "Hallo Statement");
        return modelAndView;
    }
}
