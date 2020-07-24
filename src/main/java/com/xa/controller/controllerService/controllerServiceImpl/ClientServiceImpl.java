package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.ClientService;
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
public class ClientServiceImpl implements ClientService {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @Override
    public List<Users> findAllClient() {
        return usersJpaRepo.findAll();
    }

}
