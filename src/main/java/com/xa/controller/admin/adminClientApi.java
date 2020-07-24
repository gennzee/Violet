package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminClientApi {

    @GetMapping(value = {"listClient"})
    String listClient(ModelMap modelMap);

}
