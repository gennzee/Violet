package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminContactApi {

    @GetMapping(value = {"/contactManagement"})
    String contactManagement(ModelMap modelMap);

    @PostMapping(value = {"/editContact"})
    String editContact(@RequestParam Map<String, String> m);

}
