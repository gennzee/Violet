package com.xa.controller.controllerService.controllerServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xa.controller.controllerService.loginService;
import com.xa.model.Favorite;
import com.xa.model.Users;
import com.xa.repository.FavoriteJpaRepo;
import com.xa.repository.UsersJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
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
    public Map<String, String> postRegisterAjax(HttpSession session, Map<String, String> m, ModelMap modelMap) {
        Map<String, String> errorMap = new HashMap<>();
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        for(Map.Entry<String, String> entry : m.entrySet()){
            if(!entry.getKey().equals("address") && !entry.getKey().equals("gender") && !entry.getKey().equals("email")){//those fields are not required fields.
                if(entry.getValue().equals("")){
                    errorMap.put(entry.getKey(), "Không được để trống");
                }else if(entry.getKey().equals("username") && entry.getValue().length() < 5){
                    errorMap.put(entry.getKey(), "Tài khoản phải nhiều hơn 4 kí tự");
                }else if(entry.getKey().equals("username") && usersJpaRepo.findByUsername(entry.getValue().toLowerCase()) != null){//check if username is existing in system.
                    errorMap.put(entry.getKey(), "Tên tài khoản đã tồn tại");
                }else if(entry.getKey().equals("password") && entry.getValue().length() < 7){
                    errorMap.put(entry.getKey(), "Mật khẩu phải nhiều hơn 6 kí tự");
                }else if(entry.getKey().equals("phone") && entry.getValue().length() <= 8){
                    errorMap.put(entry.getKey(), "Số điện thoại không đúng");
                }
            }
            if(entry.getKey().equals("email") && !entry.getValue().equals("") && !emailPattern.matcher(entry.getValue()).find()){//check email format if user want to register with email.
                errorMap.put(entry.getKey(), "Email không đúng định dạng");
            }
        }
        if(errorMap.isEmpty()){
            Users users = new ObjectMapper().convertValue(m, Users.class);
            users.setRoleId("1");
            users.setCreatedDate(new Date());
            users.setUpdatedDate(new Date());
            usersJpaRepo.save(users);
            return null;
        }
        return errorMap;
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
