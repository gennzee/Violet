package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by tanks on 11/7/2020.
 */
@Controller
public interface adminOrderApi {

    @RequestMapping(value = {"/orderUnprocess"})
    String orderUnprocess(ModelMap modelMap, HttpSession session);

    @RequestMapping(value = {"/orderProcessing"})
    String orderProcessing(ModelMap modelMap, HttpSession session);

    @RequestMapping(value = {"/orderProcessed"})
    String orderProcessed(ModelMap modelMap, HttpSession session);

    @RequestMapping(value = {"/orderCancelled"})
    String orderCancelled(ModelMap modelMap, HttpSession session);

    @RequestMapping(value = {"/orderDetail/{orderId}"})
    String orderDetail(@PathVariable int orderId, ModelMap modelMap);

    @RequestMapping(value = {"/updateOrderStatus/{orderId}"})
    String updateOrderStatus(HttpServletRequest request, @PathVariable int orderId, ModelMap modelMap);

    @RequestMapping(value = {"/cancelOrder/{orderId}"})
    String cancelOrder(HttpServletRequest request, @PathVariable int orderId, ModelMap modelMap, HttpSession session);

}
