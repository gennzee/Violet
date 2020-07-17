package com.xa.controller.admin.controllerApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminApi {

    @GetMapping(value = {"/admin", "/dashboard"})
    String index(ModelMap modelMap, HttpSession session);

}
