package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface categoriesApi {

    @GetMapping(value = {"/category/{categoryId}/{page}"})
    String categories(ModelMap modelMap, HttpSession session, @PathVariable int categoryId, @PathVariable int page,
                             @RequestParam(defaultValue = "") String sortBy,
                             @RequestParam(defaultValue = "0-9999999") String price,
                             @RequestParam(defaultValue = "") String height,
                             @RequestParam(defaultValue = "") String color,
                             @RequestParam(defaultValue = "") String size);



}
