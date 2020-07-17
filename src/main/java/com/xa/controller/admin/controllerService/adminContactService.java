package com.xa.controller.admin.controllerService;

import com.xa.model.Contact;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface adminContactService {

    void findFirstByOrderByIdDesc(ModelMap modelMap);

    void editContact(Contact contact);

}
