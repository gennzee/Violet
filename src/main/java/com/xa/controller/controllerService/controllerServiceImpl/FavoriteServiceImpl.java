package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.FavoriteService;
import com.xa.model.Favorite;
import com.xa.model.Products;
import com.xa.model.Users;
import com.xa.repository.FavoriteJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 23/07/2020.
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteJpaRepo favoriteJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Override
    public boolean addToFavoriteUsingAjax(int productId, Map<String, String> m, HttpSession session) {
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

    @Override
    public boolean removeFavoriteUsingAjax(int productId, HttpSession session) {
        Map<String, Favorite> favoriteCarts = (Map<String, Favorite>) session.getAttribute("favoriteCarts");

        for(Favorite favorite : favoriteCarts.values()){
            if(favorite.getProductId() == productId){
                favoriteCarts.remove(favorite.getProducts().getProductImageList().get(0).getName());
                favoriteJpaRepo.delete(favorite);
                break;
            }
        }

        return true;
    }
}
