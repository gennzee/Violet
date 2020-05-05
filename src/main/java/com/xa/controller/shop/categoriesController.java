package com.xa.controller.shop;

import com.xa.model.Products;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.xa.service.ConstVariables.shopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class categoriesController {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @GetMapping(value = {"/categories"})
    public String categories(ModelMap modelMap){
        List<Products> listProducts = productsJpaRepo.findAll();
        modelMap.addAttribute("listProducts", listProducts);
        return shopPage + "categories";
    }

}
