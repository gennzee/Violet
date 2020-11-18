package com.xa.controller.controllerService;

import com.xa.model.AboutUs;
import com.xa.repository.AboutUsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface AboutUsService {

    AboutUs findFirstByOrderByIdDesc();

    AboutUs addAboutUs(AboutUs aboutUs);

}
