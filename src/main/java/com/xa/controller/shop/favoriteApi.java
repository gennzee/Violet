package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface favoriteApi {

    @PostMapping(value = {"/addtoFavoriteAjax/{productId}"})
    @ResponseBody
    boolean addtoFavoriteAjax(@PathVariable int productId, @RequestParam Map<String, String> m, HttpSession session);

    @PostMapping(value = {"/removeFavoriteAjax/{productId}"})
    @ResponseBody
    boolean removeFavoriteAjax(@PathVariable int productId, HttpSession session);

}
