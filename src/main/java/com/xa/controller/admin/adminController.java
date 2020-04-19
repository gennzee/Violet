package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 19/04/2020.
 */
@Controller
public class adminController {

    @GetMapping(value = {"/admin", "/dashboard"})
    public String index(){
        return adminPage+"index";
    }

}
