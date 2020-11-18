package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface contactApi {

    @GetMapping(value = {"/contact"})
    String contact(ModelMap modelMap, HttpSession session);

    @PostMapping(value = {"/sendResponse"})
    @ResponseBody
    boolean sendResponse(@RequestParam Map<String, String> m);

}
