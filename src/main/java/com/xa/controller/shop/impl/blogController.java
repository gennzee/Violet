package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.NewsService;
import com.xa.controller.shop.blogApi;
import com.xa.service.InitializeSession;
import com.xa.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 08/05/2020.
 */
@Component
public class blogController implements blogApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private NewsService newsService;

    public static final int itemPerPage = 3;

    @Override
    public String blog(HttpSession session, ModelMap modelMap, int page){
        initializeSession.initializeSession(session);

        Page<News> newsList = newsService.getNewsWithPagination(PageRequest.of((page - 1), itemPerPage));
        modelMap.addAttribute("newsList", newsList.getContent());

        modelMap.addAttribute("currentPage", page);
        modelMap.addAttribute("totalPage", newsList.getTotalPages());

        return cozaShopPage+"blog";
    }

    @Override
    public String blogDetail(HttpSession session, int id, ModelMap modelMap){
        initializeSession.initializeSession(session);

        News news = newsService.getNewById(id);
        modelMap.addAttribute("n", news);

        return cozaShopPage+"blog-detail";
    }

    @Override
    public String blogComment(HttpServletRequest request){
        String referer = request.getHeader("Referer");

        newsService.addComment(request);
        return "redirect:"+referer;
    }

}
