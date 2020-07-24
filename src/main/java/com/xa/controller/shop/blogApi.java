package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface blogApi {

    @GetMapping(value = {"/blog/{page}"})
    String blog(HttpSession session, ModelMap modelMap, @PathVariable int page);

    @GetMapping(value = {"/blog-detail/{id}"})
    String blogDetail(HttpSession session, @PathVariable int id, ModelMap modelMap);

    @PostMapping(value = {"/blog-detail/comment"})
    String blogComment(HttpServletRequest request);

}
