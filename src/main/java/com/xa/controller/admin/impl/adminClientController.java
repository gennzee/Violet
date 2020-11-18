package com.xa.controller.admin.impl;

import com.xa.controller.admin.adminClientApi;
import com.xa.controller.controllerService.ClientService;
import com.xa.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.List;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 19/04/2020.
 */
@Component
public class adminClientController implements adminClientApi {

    @Autowired
    private ClientService adminClientService;

    @Override
    public String listClient(ModelMap modelMap){
        List<Users> listClient = adminClientService.findAllClient();
        modelMap.addAttribute("listClient", listClient);
        return adminPage + "client";
    }

}
