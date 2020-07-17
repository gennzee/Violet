package com.xa.controller.admin.controllerService.controllerServiceImpl;

import com.xa.controller.admin.controllerService.adminContactService;
import com.xa.model.Contact;
import com.xa.repository.ContactJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminContactServiceImpl implements adminContactService {

    @Autowired
    private ContactJpaRepo contactJpaRepo;


    @Override
    public void findFirstByOrderByIdDesc(ModelMap modelMap) {
        Contact c = contactJpaRepo.findFirstByOrderByIdDesc();
        modelMap.addAttribute("contact", c);
    }

    @Override
    public void editContact(Contact contact) {
        contactJpaRepo.save(contact);
    }
}
