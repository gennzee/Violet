package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.*;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.NewsJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.*;

import static com.xa.controller.shop.categoriesController.loadSizeAndColorList;
import static com.xa.service.ConstVariables.cozaShopPage;

@Controller
public class indexController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private NewsJpaRepo newsJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @GetMapping(value = {"/"})
    public String index(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<News> newsList = newsJpaRepo.findAll(PageRequest.of(0, 3)).getContent();
        modelMap.addAttribute("newsList", newsList);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -3);
        List<Products> productsList = productsJpaRepo.findAllByUpdatedDateAfter(calendar.getTime(), PageRequest.of(0,8));
        loadSizeAndColorList(productsList, modelMap);

        return cozaShopPage+"index";
    }

}
