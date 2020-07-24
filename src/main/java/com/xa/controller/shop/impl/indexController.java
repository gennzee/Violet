package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.NewsService;
import com.xa.controller.controllerService.shopService;
import com.xa.controller.shop.indexApi;
import com.xa.service.InitializeSession;
import com.xa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

import static com.xa.service.ConstVariables.FRIEND_EMAIL;
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

    @Autowired
    private ApplicationContext context;

    @Override
    public String index(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<News> newsList = newsService.findAll(PageRequest.of(0, 3));
        modelMap.addAttribute("newsList", newsList);

        List<Products> productsList = shopService.initIndex(session, modelMap, PageRequest.of(0, 8));
        modelMap.addAttribute("listProducts", productsList);
        categoriesService.loadSizeAndColorList(productsList, modelMap);

        File file = new File("/");
        System.out.println("free space left on your vps (disk)" + file.getFreeSpace() / 1000000000.00 + " mb");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(FRIEND_EMAIL);
        message.setSubject("Test Simple Email");
        message.setText("Hello, Im testing Simple Email");

        // Send Message!
        this.context.getBean(JavaMailSender.class).send(message);

        return cozaShopPage+"index";
    }

}
