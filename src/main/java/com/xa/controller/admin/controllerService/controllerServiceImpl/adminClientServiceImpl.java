package com.xa.controller.admin.controllerService.controllerServiceImpl;

import com.xa.controller.admin.controllerService.adminClientService;
import com.xa.model.Users;
import com.xa.repository.UsersJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminClientServiceImpl implements adminClientService {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @Override
    public void findAllClient(ModelMap modelMap) {
        List<Users> listClient = usersJpaRepo.findAll();
        modelMap.addAttribute("listClient", listClient);
    }

}
