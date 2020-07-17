package com.xa.controller.admin.controllerApi.controllerApiImpl;

import com.xa.controller.admin.controllerApi.adminClientApi;
import com.xa.controller.admin.controllerService.adminClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 19/04/2020.
 */
@Component
public class adminClientController implements adminClientApi {

    @Autowired
    private adminClientService adminClientService;

    @Override
    public String listClient(ModelMap modelMap){
        adminClientService.findAllClient(modelMap);
        return adminPage + "client";
    }

}
