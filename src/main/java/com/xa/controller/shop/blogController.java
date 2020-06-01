package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 08/05/2020.
 */
@Controller
public class blogController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @GetMapping(value = {"/blog"})
    public String blog(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage+"blog";
    }

    @GetMapping(value = {"/blog-detail"})
    public String blogDetail(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage+"blog-detail";
    }

}
