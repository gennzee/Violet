package com.xa.controller.admin;

import com.xa.model.Contact;
import com.xa.repository.ContactJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 20/05/2020.
 */
@Controller
public class adminContactController {

    @Autowired
    private ContactJpaRepo contactJpaRepo;

    @GetMapping(value = {"/contactManagement"})
    public String contactManagement(ModelMap modelMap){
        Contact c = contactJpaRepo.findFirstByOrderByIdDesc();
        modelMap.addAttribute("contact", c);
        return adminPage + "contact";
    }

}
