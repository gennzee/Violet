package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.ContactService;
import com.xa.controller.shop.contactApi;
import com.xa.service.InitializeSession;
import com.xa.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Component
public class contactController implements contactApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private ContactService contactService;

    @Override
    public String contact(ModelMap modelMap, HttpSession session){
        initializeSession.initializeSession(session);

        Contact c = contactService.findFirstByOrderByIdDesc();
        modelMap.addAttribute("contact", c);
        return cozaShopPage + "contact";
    }

}
