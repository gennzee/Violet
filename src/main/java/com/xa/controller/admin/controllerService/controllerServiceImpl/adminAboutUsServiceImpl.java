package com.xa.controller.admin.controllerService.controllerServiceImpl;

import com.xa.controller.admin.controllerService.adminAboutUsService;
import com.xa.model.AboutUs;
import com.xa.repository.AboutUsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminAboutUsServiceImpl implements adminAboutUsService {

    @Autowired
    private AboutUsJpaRepo aboutUsJpaRepo;

    @Override
    public void findFirstByOrderByIdDesc(ModelMap modelMap) {
        AboutUs ab = aboutUsJpaRepo.findFirstByOrderByIdDesc();
        modelMap.addAttribute("ab",ab);
    }

    @Override
    public AboutUs addAboutUs(AboutUs aboutUs) {
        AboutUs ab = aboutUsJpaRepo.save(aboutUs);
        return ab;
    }
}
