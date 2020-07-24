package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.AboutUsService;
import com.xa.controller.shop.aboutApi;
import com.xa.service.InitializeSession;
import com.xa.model.AboutUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 08/05/2020.
 */
@Component
public class aboutController implements aboutApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private AboutUsService aboutUsService;

    @Override
    public String about(ModelMap modelMap, HttpSession session){
        initializeSession.initializeSession(session);

        AboutUs ab = aboutUsService.findFirstByOrderByIdDesc();
        modelMap.addAttribute("ab", ab);
        return cozaShopPage+"about";
    }

}
