package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.shopService;
import com.xa.controller.shop.indexApi;
import com.xa.service.InitializeSession;
import com.xa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.util.*;

import static com.xa.service.ConstVariables.cozaShopPage;

@Component
public class indexController implements indexApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private shopService shopService;

    @Override
    public String index(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<Products> productsList = shopService.initIndex(session, modelMap);
        categoriesService.loadSizeAndColorList(productsList, modelMap);
        return cozaShopPage+"index";
    }

}
