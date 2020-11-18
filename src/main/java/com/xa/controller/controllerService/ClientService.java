package com.xa.controller.controllerService;

import com.xa.model.Users;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface ClientService {

    List<Users> findAllClient();

}
