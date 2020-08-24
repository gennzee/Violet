package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.NewsService;
import com.xa.controller.controllerService.shopService;
import com.xa.controller.shop.indexApi;
import com.xa.service.InitializeSession;
import com.xa.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

import static com.xa.service.ConstVariables.*;

@Component
public class indexController implements indexApi {

    private static Logger logger = LoggerFactory.getLogger(indexController.class);

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

        File file = new File("/");
        logger.info("Free space left on your VPS (disk) {} MB", (file.getFreeSpace() / 1000000000.00));



        return cozaShopPage+"index";
    }

}
