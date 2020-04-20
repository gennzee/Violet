package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.shopPage;

/**
 * Created by anhnx on 21/04/2020.
 */
@Controller
public class customerManagementController {

    @GetMapping(value = {"/customerManagement"})
    public String customerManagement(){
        return shopPage + "customerManagement";
    }

}
