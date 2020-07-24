package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.ContactService;
import com.xa.model.Contact;
import com.xa.repository.ContactJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactJpaRepo contactJpaRepo;

    @Override
    public Contact findFirstByOrderByIdDesc() {
        return contactJpaRepo.findFirstByOrderByIdDesc();
    }

    @Override
    public void editContact(Contact contact) {
        contactJpaRepo.save(contact);
    }
}
