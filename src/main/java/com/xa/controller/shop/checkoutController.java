package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class checkoutController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @GetMapping(value = {"/checkout"})
    public String checkout(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage + "checkout";
    }

}
