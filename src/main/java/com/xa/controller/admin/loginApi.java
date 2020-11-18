package com.xa.controller.admin;

import com.xa.model.Users;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface loginApi {

    @GetMapping(value = {"/login"})
    String login(HttpSession session);

    @PostMapping(value = {"/postLogin"})
    String redirectLogin(@Param("uname") String uname, @Param("pwd") String pwd, HttpSession session);

    @PostMapping(value = {"/postLoginAjax"})
    @ResponseBody
    Users loginAjax(@Param("uname") String uname, @Param("pwd") String pwd, HttpSession session);

    @GetMapping(value = {"/register"})
    String register();

    @PostMapping(value = {"/postRegisterAjax"})
    @ResponseBody
    Map<String, String> postRegisterAjax(HttpSession session, @RequestParam Map<String,String> m, ModelMap modelMap);

    @GetMapping(value = {"/logout"})
    String logout(HttpSession session);

    @PostMapping(value = {"/postLogoutAjax"})
    @ResponseBody
    boolean logoutAjax(HttpSession session);

}
