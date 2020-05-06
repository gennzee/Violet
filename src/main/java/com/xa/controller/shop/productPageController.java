package com.xa.controller.shop;

import com.xa.model.Categories;
import com.xa.model.Products;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.xa.service.ConstVariables.shopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class productPageController {

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @GetMapping(value = "/product/{id}")
    public String product(@PathVariable int id, ModelMap modelMap){
        Products product = productsJpaRepo.findById(id);
        Categories category = categoriesJpaRepo.findById(product.getCategoryId());
        if(product == null){
            return shopPage + "error-404";
        }
        modelMap.addAttribute("product", product);
        modelMap.addAttribute("category", category);
        return shopPage + "product-page";
    }

}
