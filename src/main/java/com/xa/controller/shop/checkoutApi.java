package com.xa.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 22/07/2020.
 */
@Controller
public interface checkoutApi {

    @GetMapping(value = {"/getNewOrder"})
    SseEmitter getNewOrder();

    @GetMapping(value = {"/checkout"})
    String checkout(HttpSession session, ModelMap modelMap);

    @PostMapping(value = {"/checkout"})
    String postCheckout(@RequestParam Map<String, String> m, ModelMap modelMap, HttpSession session);

    @GetMapping(value = {"/order_history"})
    String order_history(HttpSession session, ModelMap modelMap);

    @GetMapping(value = {"/order_history/{id}"})
    String order_history_id(@PathVariable int id, ModelMap modelMap);

}
