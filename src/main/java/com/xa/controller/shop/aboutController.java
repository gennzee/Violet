package com.xa.controller.shop;

import com.xa.model.AboutUs;
import com.xa.repository.AboutUsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 08/05/2020.
 */
@Controller
public class aboutController {

    @Autowired
    private AboutUsJpaRepo aboutUsJpaRepo;

    @GetMapping(value = {"/about"})
    public String about(ModelMap modelMap){
        AboutUs ab = aboutUsJpaRepo.findFirstByOrderByIdDesc();
        modelMap.addAttribute("ab", ab);
        return cozaShopPage+"about";
    }

}
