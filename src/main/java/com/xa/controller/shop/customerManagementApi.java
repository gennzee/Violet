package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface customerManagementApi {

    @GetMapping(value = {"/customerManagement"})
    String customerManagement(HttpSession session);

}
