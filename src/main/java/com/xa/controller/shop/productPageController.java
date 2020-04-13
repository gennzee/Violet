package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.shopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class productPageController {

    @GetMapping(value = "/product")
    public String product(){
        return shopPage + "product-page";
    }

}
