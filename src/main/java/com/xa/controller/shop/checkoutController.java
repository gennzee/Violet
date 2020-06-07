package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping(value={"/checkout"})
    public String postCheckout(@RequestParam Map<String, String> m, HttpSession session) {
        initializeSession.initializeSession(session);

        System.out.println("test commit with intellij");
        
        return "redirect:/";
    }
    

}
