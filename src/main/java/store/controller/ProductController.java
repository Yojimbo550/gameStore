package store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import store.domain.ProductEntity;
import store.service.interfaces.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/editProductTable",method = RequestMethod.GET)
    public ModelAndView getProducts() {
        List<ProductEntity> productEntity = productService.getProducts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("catalogPage");
        modelAndView.addObject("productEntity", productEntity);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editProductTable");
        return modelAndView;
    }
}


