package com.xa.controller.shop;

import com.xa.model.Contact;
import com.xa.repository.ContactJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class contactController {

    @Autowired
    private ContactJpaRepo contactJpaRepo;

    @GetMapping(value = {"/contact"})
    public String contact(ModelMap modelMap){
        Contact c = contactJpaRepo.findFirstByOrderByIdDesc();
        modelMap.addAttribute("contact", c);
        return cozaShopPage + "contact";
    }

}
