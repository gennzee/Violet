package com.xa.controller.controllerService;

import com.xa.model.Users;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface loginService {

    String loginPage(HttpSession session);

    String redirectLogin(HttpSession session, String uname, String pwd);

    Users loginUsingAjax(HttpSession session, String uname, String pwd);

    Map<String, String> postRegisterAjax(HttpSession session, Map<String,String> m, ModelMap modelMap);

    void logout(HttpSession session);

    boolean logoutUsingAjax(HttpSession session);

}
