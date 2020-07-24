package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.CheckoutService;
import com.xa.model.Order;
import com.xa.model.OrderProduct;
import com.xa.model.ShoppingCart;
import com.xa.model.Users;
import com.xa.repository.OrderJpaRepo;
import com.xa.repository.OrderProductJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by anhnx on 23/07/2020.
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private OrderJpaRepo orderJpaRepo;

    @Autowired
    private OrderProductJpaRepo orderProductJpaRepo;

    public List<SseEmitter> emitters = new CopyOnWriteArrayList<>();

    @Override
    public SseEmitter initSseEmitter() {
        SseEmitter sseEmitter = new SseEmitter(30000L);
        try {
            sseEmitter.send(SseEmitter.event().name("INIT"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        emitters.add(sseEmitter);
        sseEmitter.onCompletion(() -> emitters.remove(sseEmitter));
        sseEmitter.onTimeout(() -> emitters.remove(sseEmitter));
        return sseEmitter;
    }

    @Override
    public void registNewOrderProduct(Map<String, String> m, ModelMap modelMap, HttpSession session) {
        String name = m.get("first_name").trim().concat(" ").concat(m.get("last_name").trim());
        String email = m.get("email").trim();
        String phone = m.get("phone").trim();
        String comment = m.get("msg").trim();
        float total = (Float) session.getAttribute("cartTotalPrice");

        Users u = (Users) session.getAttribute("user");

        Order order = orderJpaRepo.save(new Order(name, u.getId(), new Date(), m.get("address").trim(), m.get("city").trim(), email, phone, comment, total));

        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        List<OrderProduct> orderProductList = new ArrayList<>();
        for(ShoppingCart sc : shoppingCarts.values()){
            OrderProduct orderProduct = new OrderProduct(order.getId(), sc.getProductStorage().getId(), sc.getQuantity(), sc.getProductStorage().getPrice());
            orderProduct.setProductStorage(sc.getProductStorage());
            orderProductList.add(orderProduct);
        }
        orderProductJpaRepo.saveAll(orderProductList);

        setOrderDataInfo(order, modelMap, orderProductList);

        //remove cart session
        session.removeAttribute("cartTotalPrice");
        session.removeAttribute("shoppingCarts");

        for (SseEmitter sseEmitter : emitters){
            try {
                sseEmitter.send(SseEmitter.event().name("checkoutPage").data("New Order : "+ order.getId()));
            } catch (Exception e) {
                emitters.remove(sseEmitter);
            }
        }
    }

    @Override
    public void setOrderDataInfo(Order order, ModelMap modelMap, List<OrderProduct> orderProductList){
        Map<String, String> orderInformation = new HashMap<>();
        orderInformation.put("orderId", "ESD"+String.valueOf(order.getId()));
        orderInformation.put("orderDate", dateFormat(order.getOrderDate()));
        orderInformation.put("orderAddress", order.getAddress());
        orderInformation.put("orderCity", order.getCity());
        modelMap.addAttribute("orderInfo", orderInformation);
        if(orderProductList != null){
            modelMap.addAttribute("orderProducts", orderProductList);
            modelMap.addAttribute("orderTotalPrice", calculateTotalPrice(orderProductList));
        }else{
            modelMap.addAttribute("orderProducts", order.getOrderProducts());
            modelMap.addAttribute("orderTotalPrice", calculateTotalPrice(order.getOrderProducts()));
        }

    }

    @Override
    public List<Order> findAllByUserIdOrderByIdDesc(HttpSession session) {
        Users u = (Users) session.getAttribute("user");
        return orderJpaRepo.findAllByUserIdOrderByIdDesc(u.getId());
    }

    @Override
    public Order getOrderById(int id, ModelMap modelMap) {
        Order order = orderJpaRepo.findById(id);
        setOrderDataInfo(order, modelMap, null);
        return order;
    }

    public String dateFormat(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

    public float calculateTotalPrice(List<OrderProduct> orderProductList){
        float cartTotalPrice = 0;
        for(OrderProduct o : orderProductList){
            cartTotalPrice += o.getPrice() * o.getQuantity();
        }
        return cartTotalPrice;
    }

}
