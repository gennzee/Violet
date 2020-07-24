package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.AboutUsService;
import com.xa.model.AboutUs;
import com.xa.repository.AboutUsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class AboutUsServiceImpl implements AboutUsService {

    @Autowired
    private AboutUsJpaRepo aboutUsJpaRepo;

    @Override
    public AboutUs findFirstByOrderByIdDesc() {
        return aboutUsJpaRepo.findFirstByOrderByIdDesc();
    }

    @Override
    public AboutUs addAboutUs(AboutUs aboutUs) {
        return aboutUsJpaRepo.save(aboutUs);
    }
}
