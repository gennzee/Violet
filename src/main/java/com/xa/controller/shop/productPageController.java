package com.xa.controller.shop;

import com.xa.model.Products;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import static com.xa.controller.shop.categoriesController.loadSizeAndColorList;
import static com.xa.service.ConstVariables.cozaShopPage;
import static com.xa.service.ConstVariables.errorPage;

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
        if(product == null){
            return errorPage + "error-404";
        }

        List<Products> productsList = new ArrayList<>();
        productsList.add(product);
        loadSizeAndColorList(productsList, modelMap);

        modelMap.addAttribute("product", product);
        return cozaShopPage + "product-detail";
    }

    @GetMapping(value = {"/product-detail"})
    public String productDetail(){
        return cozaShopPage + "product-detail";
    }

}
