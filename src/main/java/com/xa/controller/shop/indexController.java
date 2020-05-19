package com.xa.controller.shop;

import com.xa.model.Categories;
import com.xa.model.ShoppingCart;
import com.xa.repository.CategoriesJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.cozaShopPage;

@Controller
public class indexController {

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @GetMapping(value = {"/"})
    public String index(HttpSession session){
        List<Categories> listCategories = categoriesJpaRepo.findAll();
        session.setAttribute("listCategories", listCategories);
        if(session.getAttribute("shoppingCarts") == null){
            Map<Integer, ShoppingCart> shoppingCarts = new HashMap<>();
            session.setAttribute("shoppingCarts", shoppingCarts);
        }
        return cozaShopPage+"index";
    }

}
