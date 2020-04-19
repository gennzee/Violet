package com.xa.controller.admin;

import com.xa.model.Users;
import com.xa.repository.UsersJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 19/04/2020.
 */
@Controller
public class adminClientController {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @GetMapping(value = {"listClient"})
    public String listClient(ModelMap modelMap){
        List<Users> listClient = usersJpaRepo.findAll();
        modelMap.addAttribute("listClient", listClient);
        return adminPage + "client";
    }

}
