package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.NewsService;
import com.xa.controller.controllerService.shopService;
import com.xa.controller.shop.indexApi;
import com.xa.service.InitializeSession;
import com.xa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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

    @Autowired
    private NewsService newsService;

    @Override
    public String index(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<News> newsList = newsService.findAll(PageRequest.of(0, 3));
        modelMap.addAttribute("newsList", newsList);

        List<Products> productsList = shopService.initIndex(session, modelMap, PageRequest.of(0, 8));
        modelMap.addAttribute("listProducts", productsList);
        categoriesService.loadSizeAndColorList(productsList, modelMap);
        return cozaShopPage+"index";
    }

}
