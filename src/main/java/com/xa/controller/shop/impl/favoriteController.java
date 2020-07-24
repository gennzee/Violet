package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.FavoriteService;
import com.xa.controller.shop.favoriteApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 29/05/2020.
 */
@Component
public class favoriteController implements favoriteApi {

    @Autowired
    private FavoriteService favoriteService;

    @Override
    public boolean addtoFavoriteAjax(int productId, Map<String, String> m, HttpSession session){
        return favoriteService.addToFavoriteUsingAjax(productId, m, session);
    }

    @Override
    public boolean removeFavoriteAjax(int productId, HttpSession session){
        return favoriteService.removeFavoriteUsingAjax(productId, session);
    }

}
