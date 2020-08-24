package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.ContactService;
import com.xa.controller.controllerService.MailService;
import com.xa.controller.shop.contactApi;
import com.xa.service.InitializeSession;
import com.xa.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import java.util.Map;

import static com.xa.service.ConstVariables.CLIENTS_EMAIL;
import static com.xa.service.ConstVariables.MY_EMAIL;
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

    @Autowired
    private MailService mailService;

    @Override
    public String contact(ModelMap modelMap, HttpSession session){
        initializeSession.initializeSession(session);

        Contact c = contactService.findFirstByOrderByIdDesc();
        modelMap.addAttribute("contact", c);
        return cozaShopPage + "contact";
    }

    @Override
    public boolean sendResponse(Map<String, String> m) {
        mailService.sendSimpleMail(m.get("email"), MY_EMAIL, "Phản hồi của khách hàng "+m.get("email"), m.get("msg"));
        return true;
    }

}
