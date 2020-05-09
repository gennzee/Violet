package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 08/05/2020.
 */
@Controller
public class aboutController {

    @GetMapping(value = {"/about"})
    public String about(){
        return cozaShopPage+"about";
    }

}
