package com.xa.controller.admin.impl;

import com.xa.controller.admin.adminOrderApi;
import com.xa.model.Order;
import com.xa.model.OrderProduct;
import com.xa.repository.OrderJpaRepo;
import com.xa.repository.OrderProductJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by tanks on 11/7/2020.
 */
@Component
public class adminOrderController implements adminOrderApi {

    @Autowired
    private OrderJpaRepo orderJpaRepo;

    @Autowired
    private OrderProductJpaRepo orderProductJpaRepo;

    @Override
    public String orderUnprocess(ModelMap modelMap, HttpSession session) {
        List<Order> orderList = orderJpaRepo.findAllByStatus("Đang chờ xử lý");
        modelMap.addAttribute("orderList", orderList);
        session.setAttribute("remindMessage", "Đã gọi điện bàn bạc về đơn hàng cũng như phí vận chuyển ?");
        session.setAttribute("suggestMessage", "Bắt đầu vận chuyển sản phẩm nếu đã hoàn thành.");
        session.setAttribute("updateStatusButton", "Bắt đầu vận chuyển sản phẩm");
        session.setAttribute("previousOrderPage", "/orderUnprocess");
        return adminPage+"order";
    }

    @Override
    public String orderProcessing(ModelMap modelMap, HttpSession session) {
        List<Order> orderList = orderJpaRepo.findAllByStatus("Đang vận truyển");
        modelMap.addAttribute("orderList", orderList);
        session.setAttribute("remindMessage", "Đã nhận được tiền từ khách hàng mua sản phẩm ?");
        session.setAttribute("suggestMessage", "Hoàn thành đơn hàng nếu đã nhận được tiền, khách hàng nhận được sản phẩm.");
        session.setAttribute("updateStatusButton", "Xác nhận hoàn thành đơn hàng");
        session.setAttribute("previousOrderPage", "/orderProcessing");
        return adminPage+"order";
    }

    @Override
    public String orderProcessed(ModelMap modelMap, HttpSession session) {
        List<Order> orderList = orderJpaRepo.findAllByStatus("Đã hoàn thành");
        modelMap.addAttribute("orderList", orderList);
        if(session.getAttribute("remindMessage") != null) session.removeAttribute("remindMessage");
        if(session.getAttribute("suggestMessage") != null) session.removeAttribute("suggestMessage");
        if(session.getAttribute("updateStatusButton") != null) session.removeAttribute("updateStatusButton");
        if(session.getAttribute("previousOrderPage") != null) session.removeAttribute("updateStatusButton");
        return adminPage+"order";
    }

    @Override
    public String orderCancelled(ModelMap modelMap, HttpSession session) {
        List<Order> orderList = orderJpaRepo.findAllByStatus("Đã bị hủy");
        modelMap.addAttribute("orderList", orderList);
        if(session.getAttribute("remindMessage") != null) session.removeAttribute("remindMessage");
        if(session.getAttribute("suggestMessage") != null) session.removeAttribute("suggestMessage");
        if(session.getAttribute("updateStatusButton") != null) session.removeAttribute("updateStatusButton");
        if(session.getAttribute("previousOrderPage") != null) session.removeAttribute("updateStatusButton");
        return adminPage+"order";
    }

    @Override
    public String orderDetail(int orderId, ModelMap modelMap) {
        List<OrderProduct> orderProductList = orderProductJpaRepo.findAllByOrderId(orderId);
        modelMap.addAttribute("orderProductList", orderProductList);
        modelMap.addAttribute("orderId", orderId);
        return adminPage+"orderDetail";
    }

    @Override
    @Transactional
    public String updateOrderStatus(HttpServletRequest request, int orderId, ModelMap modelMap) {
        String referer = request.getHeader("Referer");

        Order order = orderJpaRepo.findById(orderId);
        switch (order.getStatus()){
            case "Đang chờ xử lý":
                orderJpaRepo.updateOrderStatus(orderId, "Đang vận truyển");
                return "redirect:/orderUnprocess";
            case "Đang vận truyển":
                orderJpaRepo.updateOrderStatus(orderId, "Đã hoàn thành");
                return "redirect:/orderProcessing";
            default:
                return "redirect:"+referer;
        }
    }

    @Override
    @Transactional
    public String cancelOrder(HttpServletRequest request, int orderId, ModelMap modelMap, HttpSession session) {
        String referer = request.getHeader("Referer");
        orderJpaRepo.updateOrderStatus(orderId, "Đã bị hủy");
        return "redirect:"+session.getAttribute("previousOrderPage");
    }
}
