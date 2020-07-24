package com.xa.controller.shop.impl;

/**
 * Created by anhnx on 13/04/2020.
 */

import com.xa.controller.controllerService.ProductService;
import com.xa.controller.shop.shoppingCartApi;
import com.xa.service.InitializeSession;
import com.xa.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

import static com.xa.service.ConstVariables.cozaShopPage;

@Component
public class shoppingCartController implements shoppingCartApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private ProductService productService;

    @Override
    public String cart(HttpSession session){
        initializeSession.initializeSession(session);
        return cozaShopPage + "shoping-cart";
    }

    @Override
    public boolean addProductToCartAjax(HttpSession session, Map<String, String> m){
        return productService.addProductToCartAjax(session, m);
    }

    @Override
    public boolean deleteProductFromCartAjax(int productStorageId, HttpSession session){
        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        shoppingCarts.remove(productStorageId);
        productService.calculateTotalPrice(shoppingCarts, session);
        session.setAttribute("shoppingCarts", shoppingCarts);
        return true;
    }

    @Override
    public boolean updateCart(HttpServletRequest request, HttpSession session){
        return productService.updateCart(request, session);
    }

}
