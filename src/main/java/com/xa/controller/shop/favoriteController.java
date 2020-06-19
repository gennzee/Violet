package com.xa.controller.shop;

import com.xa.model.*;
import com.xa.repository.FavoriteJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 29/05/2020.
 */
@Controller
public class favoriteController {

    @Autowired
    private FavoriteJpaRepo favoriteJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @PostMapping(value = {"/addtoFavoriteAjax/{productId}"})
    @ResponseBody
    public boolean addtoFavoriteAjax(@PathVariable int productId, @RequestParam Map<String, String> m, HttpSession session){
        Products p = productsJpaRepo.findById(productId);

        Users u = (Users) session.getAttribute("user");

        Favorite f;
        if(u != null){
            f = new Favorite(u.getId(), p.getId());
            f.setUser(u);
            f.setProducts(p);
            favoriteJpaRepo.save(f);
        }else{
            return false;
        }
        Map<String, Favorite> favoriteCarts = (Map<String, Favorite>) session.getAttribute("favoriteCarts");
        favoriteCarts.put(p.getProductImageList().get(0).getName(), f);
        session.setAttribute("favoriteCarts", favoriteCarts);

        return true;
    }

    @PostMapping(value = {"/removeFavoriteAjax/{productId}"})
    @ResponseBody
    public boolean removeFavoriteAjax(@PathVariable int productId, HttpSession session){
        Map<Integer, Favorite> favoriteCarts = (Map<Integer, Favorite>) session.getAttribute("favoriteCarts");
        favoriteCarts.remove(productId);

        Users u = (Users) session.getAttribute("user");
        if(u != null){

        }
        return true;
    }

}
