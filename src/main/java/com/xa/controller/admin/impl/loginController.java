package com.xa.controller.admin.impl;

import com.xa.controller.admin.loginApi;
import com.xa.controller.controllerService.loginService;
import com.xa.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;

import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class loginController implements loginApi {

    @Autowired
    private loginService loginService;

    @Override
    public String login(HttpSession session){
        return loginService.loginPage(session);
    }

    @Override
    public String redirectLogin(String uname, String pwd, HttpSession session){
        return loginService.redirectLogin(session, uname, pwd);
    }

    @Override
    public Users loginAjax(String uname, String pwd, HttpSession session){
        return loginService.loginUsingAjax(session, uname, pwd);
    }

    @Override
    public String register(){
        return adminPage + "register";
    }

    @Override
    public Map<String, String> postRegisterAjax(HttpSession session, Map<String,String> m, ModelMap modelMap){
        return loginService.postRegisterAjax(session, m, modelMap);
    }

    @Override
    public String logout(HttpSession session){
        loginService.logout(session);
        return "redirect:/";
    }

    @Override
    public boolean logoutAjax(HttpSession session){
        return loginService.logoutUsingAjax(session);
    }
}
