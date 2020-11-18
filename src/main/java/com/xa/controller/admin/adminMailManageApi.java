package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by anhnx on 25/07/2020.
 */
@Controller
public interface adminMailManageApi {

    @GetMapping(value = {"/mailManagement"})
    String mailManage(ModelMap modelMap);

    @GetMapping(value = {"/deleteMail/{id}"})
    String deleteMail(@PathVariable int id);
}
