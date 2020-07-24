package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CheckoutService;
import com.xa.controller.shop.checkoutApi;
import com.xa.service.InitializeSession;
import com.xa.model.Order;
import com.xa.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

import java.util.*;

@Component
public class checkoutController implements checkoutApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private CheckoutService checkoutService;

    @Override
    public SseEmitter getNewOrder(){
        return checkoutService.initSseEmitter();
    }

    @Override
    public String checkout(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        Users u = (Users) session.getAttribute("user");
        if(u == null){
            modelMap.addAttribute("disabled", "disabled");
        }
        return cozaShopPage + "checkout";
    }

    @Override
    public String postCheckout(Map<String, String> m, ModelMap modelMap, HttpSession session) {
        checkoutService.registNewOrderProduct(m, modelMap, session);
        return cozaShopPage + "confirmation";
    }

    @Override
    public String order_history(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<Order> orderList = checkoutService.findAllByUserIdOrderByIdDesc(session);
        modelMap.addAttribute("ESD", "ESD");
        modelMap.addAttribute("orderList", orderList);

        return cozaShopPage + "order-history";
    }

    @Override
    public String order_history_id(int id, ModelMap modelMap){
        checkoutService.getOrderById(id, modelMap);
        return cozaShopPage + "confirmation";
    }

}
