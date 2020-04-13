package com.xa.controller.shop;

/**
 * Created by anhnx on 13/04/2020.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.shopPage;

@Controller
public class shoppingCartController {

    @GetMapping(value = {"/cart"})
    public String cart(){
        return shopPage + "shopping-cart";
    }

}
