package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class checkoutController {

    @GetMapping(value = {"/checkout"})
    public String checkout(){
        return cozaShopPage + "checkout";
    }

}
