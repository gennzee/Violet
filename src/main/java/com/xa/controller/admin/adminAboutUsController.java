package com.xa.controller.admin;

import com.xa.model.AboutUs;
import com.xa.repository.AboutUsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 20/05/2020.
 */
@Controller
public class adminAboutUsController {

    @Autowired
    private AboutUsJpaRepo aboutUsJpaRepo;

    @GetMapping(value = {"/aboutus"})
    public String aboutUs(ModelMap modelMap){
        AboutUs ab = aboutUsJpaRepo.findFirstByOrderByIdDesc();
        modelMap.addAttribute("ab",ab);
        return adminPage + "aboutUs";
    }

    @PostMapping(value = {"/addAboutUs"})
    public String addAboutUs(@RequestParam Map<String, String> m){
        AboutUs ab = aboutUsJpaRepo.save(new AboutUs(m.get("content")));
        return "redirect:/aboutus";
    }

}
