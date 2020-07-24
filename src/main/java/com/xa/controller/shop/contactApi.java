package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface contactApi {

    @GetMapping(value = {"/contact"})
    String contact(ModelMap modelMap, HttpSession session);

}
