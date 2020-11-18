package com.xa.controller.admin.impl;

import com.xa.controller.admin.adminContactApi;
import com.xa.controller.controllerService.ContactService;
import com.xa.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 20/05/2020.
 */
@Component
public class adminContactController implements adminContactApi {

    @Autowired
    private ContactService adminContactService;

    @Override
    public String contactManagement(ModelMap modelMap){
        Contact c = adminContactService.findFirstByOrderByIdDesc();
        modelMap.addAttribute("contact", c);
        return adminPage + "contact";
    }

    @Override
    public String editContact(Map<String, String> m){
        adminContactService.editContact(new Contact(m.get("address"), m.get("mobileNumber"), m.get("email"), m.get("googleMap")));
        return "redirect:/contactManagement";
    }

}
