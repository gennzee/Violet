package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface shoppingCartApi {

    @GetMapping(value = {"/shoping-cart"})
    String cart(HttpSession session);

    @PostMapping(value = {"/addProductToCartAjax"})
    @ResponseBody
    boolean addProductToCartAjax(HttpSession session, @RequestParam Map<String, String> m);

    @PostMapping(value = {"/deleteProductFromCartAjax/{productStorageId}"})
    @ResponseBody
    boolean deleteProductFromCartAjax(@PathVariable int productStorageId, HttpSession session);

    @PostMapping(value = {"/updateCart"})
    @ResponseBody
    boolean updateCart(HttpServletRequest request, HttpSession session);

}
