package br.com.ecommerce.bff.root.ecommerceroot.home;

import br.com.ecommerce.bff.root.ecommerceroot.client.ProductClient;
import br.com.ecommerce.bff.root.ecommerceroot.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Lourran on 15/07/2017.
 */
@Controller
public class HomePage {
    private static final String INDEX_PAGE = "index";

    @Autowired
    private ProductClient productClient;

    @GetMapping
    public ModelAndView index(){
        List<ProductDTO> products = productClient.findAll();
        return new ModelAndView(INDEX_PAGE).addObject("products", products);
    }


}
