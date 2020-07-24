package com.xa.controller.controllerService.controllerServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xa.controller.controllerService.loginService;
import com.xa.model.Favorite;
import com.xa.model.Users;
import com.xa.repository.FavoriteJpaRepo;
import com.xa.repository.UsersJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.xa.service.ConstVariables.adminPage;
import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @Autowired
    private FavoriteJpaRepo favoriteJpaRepo;


    @Override
    public String loginPage(HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        if(user != null){
            if(user.getRoles().getName().equals("admin")){
                return "redirect:/admin";
            }else{
                return cozaShopPage + "index";
            }
        }
        return adminPage + "login";
    }

    @Override
    public String redirectLogin(HttpSession session, String uname, String pwd) {
        Users user = usersJpaRepo.findByUsernameAndPassword(uname, pwd);
        if(user != null){
            session.setAttribute("user", user);
            if(user.getRoles().getName().equals("admin")){
                return "redirect:/admin";
            }else{
                return "redirect:/checkout";
            }
        }
        return adminPage + "login";
    }

    @Override
    public Users loginUsingAjax(HttpSession session, String uname, String pwd) {
        Users user = usersJpaRepo.findByUsernameAndPassword(uname, pwd);
        if(user != null){
            session.setAttribute("user", user);

            List<Favorite> favoriteList = favoriteJpaRepo.findAllByUserId(user.getId(), null);

            Map<String, Favorite> favoriteCarts = favoriteList.stream().collect(Collectors.toMap(x -> x.getProducts().getProductImageList().get(0).getName(), x -> x));
            session.setAttribute("favoriteCarts", favoriteCarts);
            return user;
        }
        return null;
    }

    @Override
    public boolean postRegisterAjax(HttpSession session, Map<String, String> m) {
        final Users users = new ObjectMapper().convertValue(m, Users.class);
        users.setRoleId("1");
        users.setCreatedDate(new Date());
        users.setUpdatedDate(new Date());

        Users u = usersJpaRepo.save(users);
        if(u != null){
            return true;
        }
        return false;
    }

    @Override
    public void logout(HttpSession session) {
        session.removeAttribute("user");
    }

    @Override
    public boolean logoutUsingAjax(HttpSession session) {
        session.removeAttribute("favoriteCarts");
        session.removeAttribute("user");
        return true;
    }
}
