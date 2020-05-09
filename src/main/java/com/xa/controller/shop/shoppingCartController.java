package com.xa.controller.shop;

/**
 * Created by anhnx on 13/04/2020.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.cozaShopPage;

@Controller
public class shoppingCartController {

    @GetMapping(value = {"/shoping-cart"})
    public String cart(){
        return cozaShopPage + "shoping-cart";
    }

}
