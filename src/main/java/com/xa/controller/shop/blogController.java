package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.Comments;
import com.xa.model.News;
import com.xa.repository.CommentJpaRepo;
import com.xa.repository.NewsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 08/05/2020.
 */
@Controller
public class blogController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private NewsJpaRepo newsJpaRepo;

    @Autowired
    private CommentJpaRepo commentJpaRepo;

    public static final int itemPerPage = 3;

    @GetMapping(value = {"/blog/{page}"})
    public String blog(HttpSession session, ModelMap modelMap, @PathVariable int page){
        initializeSession.initializeSession(session);

        Page<News> newsList = newsJpaRepo.findAll(PageRequest.of((page - 1), itemPerPage));
        modelMap.addAttribute("newsList", newsList.getContent());

        int totalProducts = newsList.getContent().size();
        int totalPage = (totalProducts % itemPerPage != 0) ? ((totalProducts / itemPerPage) + 1) : (totalProducts / itemPerPage);
        modelMap.addAttribute("currentPage", page);
        modelMap.addAttribute("totalPage", totalPage);

        return cozaShopPage+"blog";
    }

    @GetMapping(value = {"/blog-detail/{id}"})
    public String blogDetail(HttpSession session, @PathVariable int id, ModelMap modelMap){
        initializeSession.initializeSession(session);

        News news = newsJpaRepo.findById(id);
        modelMap.addAttribute("n", news);

        return cozaShopPage+"blog-detail";
    }

    @PostMapping(value = {"/blog-detail/comment"})
    public String blogComment(HttpServletRequest request){
        String referer = request.getHeader("Referer");

        Comments comments = new Comments();
        comments.setNewId(Integer.valueOf(request.getParameter("blogId")));
        comments.setName(request.getParameter("name"));
        comments.setEmail(request.getParameter("email"));
        comments.setMobileNumber(request.getParameter("mobileNumber"));
        comments.setComment(request.getParameter("comment"));
        comments.setCreatedDate(new Date());

        commentJpaRepo.save(comments);

        return "redirect:"+referer;
    }

}
