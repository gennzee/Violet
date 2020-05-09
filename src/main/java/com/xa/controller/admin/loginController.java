package com.xa.controller.admin;

import com.xa.model.Users;
import com.xa.repository.UsersJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.adminPage;
import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class loginController {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @GetMapping(value = {"/login"})
    public String login(HttpSession session){
        Users user = (Users) session.getAttribute("user");
        if(user != null){
            if(user.getRole().equals("admin")){
                return adminPage + "index";
            }else{
                return cozaShopPage + "index";
            }
        }
        return adminPage + "login";
    }

    @PostMapping(value = {"/postLogin"})
    public String redirectLogin(@Param("uname") String uname, @Param("pwd") String pwd, HttpSession session){
        Users user = usersJpaRepo.findByUsernameAndPassword(uname, pwd);
        if(user != null){
            session.setAttribute("user", user);
            if(user.getRole().equals("admin")){
                return adminPage + "index";
            }else{
                return cozaShopPage + "index";
            }
        }
        return adminPage + "login";
    }

    @PostMapping(value = {"/postLoginAjax"})
    @ResponseBody
    public Users loginAjax(@Param("uname") String uname, @Param("pwd") String pwd, HttpSession session){
        Users user = usersJpaRepo.findByUsernameAndPassword(uname, pwd);
        if(user != null){
            session.setAttribute("user", user);
            return user;
        }
        return null;
    }

    @GetMapping(value = {"/register"})
    public String register(){
        return adminPage + "register";
    }

    @GetMapping(value = {"/logout"})
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/";
    }

    @PostMapping(value = {"/postLogoutAjax"})
    @ResponseBody
    public boolean logoutAjax(HttpSession session){
        session.removeAttribute("user");
        return true;
    }
}
