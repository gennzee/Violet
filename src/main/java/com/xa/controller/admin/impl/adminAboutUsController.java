package com.xa.controller.admin.impl;

import com.xa.controller.admin.adminAboutUsApi;
import com.xa.controller.controllerService.AboutUsService;
import com.xa.model.AboutUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 20/05/2020.
 */
@Component
public class adminAboutUsController implements adminAboutUsApi {

    @Autowired
    private AboutUsService adminAboutUsService;

    @Override
    public String aboutUs(ModelMap modelMap){
        AboutUs ab = adminAboutUsService.findFirstByOrderByIdDesc();
        modelMap.addAttribute("ab",ab);
        return adminPage + "aboutUs";
    }

    @Override
    public String addAboutUs(Map<String, String> m){
        AboutUs ab = adminAboutUsService.addAboutUs(new AboutUs(m.get("content")));
        return "redirect:/aboutus";
    }

}
