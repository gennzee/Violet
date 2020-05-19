package com.xa.controller.shop;

import com.xa.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 21/04/2020.
 */
@Controller
public class customerManagementController {

    @GetMapping(value = {"/customerManagement"})
    public String customerManagement(HttpSession session){
        Users u = (Users) session.getAttribute("user");
        if(u.getRoles().getName().equalsIgnoreCase("admin")){
            return "redirect:/admin";
        }
        return cozaShopPage + "customerManagement";
    }

}
