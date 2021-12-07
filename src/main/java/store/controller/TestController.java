package store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import store.service.impl.ProductServiceImpl;
import store.service.interfaces.ProductService;

@Controller
public class TestController {




    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showGreetingPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greetingPage");
        return modelAndView;
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ModelAndView showAboutUsPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("aboutUsPage");
        return modelAndView;
    }


}
