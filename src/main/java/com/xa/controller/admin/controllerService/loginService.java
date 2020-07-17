package com.xa.controller.admin.controllerService;

import com.xa.model.Users;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface loginService {

    String loginPage(HttpSession session);

    String redirectLogin(HttpSession session, String uname, String pwd);

    Users loginUsingAjax(HttpSession session, String uname, String pwd);

    boolean postRegisterAjax(HttpSession session, Map<String,String> m);

    void logout(HttpSession session);

    boolean logoutUsingAjax(HttpSession session);

}
