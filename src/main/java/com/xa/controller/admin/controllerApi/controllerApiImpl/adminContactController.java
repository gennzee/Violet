package com.xa.controller.admin.controllerApi.controllerApiImpl;

import com.xa.controller.admin.controllerApi.adminContactApi;
import com.xa.controller.admin.controllerService.adminContactService;
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
    private adminContactService adminContactService;

    @Override
    public String contactManagement(ModelMap modelMap){
        adminContactService.findFirstByOrderByIdDesc(modelMap);
        return adminPage + "contact";
    }

    @Override
    public String editContact(Map<String, String> m){
        adminContactService.editContact(new Contact(m.get("address"), m.get("mobileNumber"), m.get("email"), m.get("googleMap")));
        return "redirect:/contactManagement";
    }

}
