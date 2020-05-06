package com.xa.controller.shop;

import com.xa.model.Categories;
import com.xa.model.Products;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

import static com.xa.service.ConstVariables.shopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class indexController {

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @GetMapping(value = {"/"})
    public String index(HttpSession session){
        List<Categories> listCategories = categoriesJpaRepo.findAll();
        session.setAttribute("listCategories", listCategories);
        return shopPage+"index";
    }

}
