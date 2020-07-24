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
public interface productPageApi {

    @GetMapping(value = "/product/{id}")
    String product(@PathVariable int id, ModelMap modelMap, HttpSession session);

    @PostMapping(value = {"/postReview"})
    String postReview(HttpServletRequest request);

    @GetMapping(value = {"/product-detail"})
    String productDetail(HttpSession session);

}
