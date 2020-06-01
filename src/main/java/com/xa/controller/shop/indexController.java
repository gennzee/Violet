package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.Categories;
import com.xa.model.Favorite;
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
    private InitializeSessionImpl initializeSession;

    @GetMapping(value = {"/"})
    public String index(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage+"index";
    }

}
