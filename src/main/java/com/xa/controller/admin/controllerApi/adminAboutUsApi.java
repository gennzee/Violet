package com.xa.controller.admin.controllerApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminAboutUsApi {

    @GetMapping(value = {"/aboutus"})
    String aboutUs(ModelMap modelMap);

    @PostMapping(value = {"/addAboutUs"})
    String addAboutUs(@RequestParam Map<String, String> m);

}
