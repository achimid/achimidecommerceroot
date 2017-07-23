package br.com.ecommerce.bff.root.ecommerceroot.controller;

import br.com.ecommerce.bff.root.ecommerceroot.client.ProductClient;
import br.com.ecommerce.bff.root.ecommerceroot.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private static final String INDEX_PAGE = "product/index";

    @Autowired
    private ProductClient productClient;

    @GetMapping("/{id}")
    public ModelAndView get(@PathVariable Long id){
        ProductDTO product = productClient.findOne(id);
        return new ModelAndView(INDEX_PAGE).addObject("product", product);
    }


}
