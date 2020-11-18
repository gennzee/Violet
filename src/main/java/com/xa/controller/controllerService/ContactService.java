package com.xa.controller.controllerService;

import com.xa.model.Contact;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface ContactService {

    Contact findFirstByOrderByIdDesc();

    void editContact(Contact contact);

}
