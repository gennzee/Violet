package com.xa.service.impl;

import com.xa.service.InitializeSession;
import com.xa.model.Categories;
import com.xa.model.Favorite;
import com.xa.model.ShoppingCart;
import com.xa.repository.CategoriesJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 01/06/2020.
 */
@Service
public class InitializeSessionImpl implements InitializeSession, Serializable {

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Override
    public void initializeSession(HttpSession session) {
        if(session.getAttribute("listCategories") == null){
            List<Categories> listCategories = categoriesJpaRepo.findAll();
            session.setAttribute("listCategories", listCategories);
        }
        if(session.getAttribute("shoppingCarts") == null){
            Map<Integer, ShoppingCart> shoppingCarts = new HashMap<>();
            session.setAttribute("shoppingCarts", shoppingCarts);
        }
        if(session.getAttribute("favoriteCarts") == null){
            Map<String, Favorite> favoriteCarts = new HashMap<>();
            session.setAttribute("favoriteCarts", favoriteCarts);
        }
    }

}
