package com.xa.controller.shop.impl;

import com.xa.controller.shop.customerManagementApi;
import com.xa.service.InitializeSession;
import com.xa.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 21/04/2020.
 */
@Component
public class customerManagementController implements customerManagementApi {

    @Autowired
    private InitializeSession initializeSession;

    @Override
    public String customerManagement(HttpSession session){
        initializeSession.initializeSession(session);

        Users u = (Users) session.getAttribute("user");
        if(u.getRoles().getName().equalsIgnoreCase("admin")){
            return "redirect:/admin";
        }
        return cozaShopPage + "customerManagement";
    }

}
