package com.xa.controller.controllerService;

import com.xa.model.Order;
import com.xa.model.OrderProduct;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 23/07/2020.
 */
public interface CheckoutService {

    SseEmitter initSseEmitter();

    void registNewOrderProduct(Map<String, String> m, ModelMap modelMap, HttpSession session);

    void setOrderDataInfo(Order order, ModelMap modelMap, List<OrderProduct> orderProductList);

    List<Order> findAllByUserIdOrderByIdDesc(HttpSession session);

    Order getOrderById(int id, ModelMap modelMap);

}
