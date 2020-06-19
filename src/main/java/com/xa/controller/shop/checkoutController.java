package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.Order;
import com.xa.model.OrderProduct;
import com.xa.model.ShoppingCart;
import com.xa.model.Users;
import com.xa.repository.OrderJpaRepo;
import com.xa.repository.OrderProductJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.xa.service.ConstVariables.cozaShopPage;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class checkoutController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private OrderJpaRepo orderJpaRepo;

    @Autowired
    private OrderProductJpaRepo orderProductJpaRepo;

    @GetMapping(value = {"/checkout"})
    public String checkout(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        Users u = (Users) session.getAttribute("user");
        if(u == null){
            modelMap.addAttribute("disabled", "disabled");
        }

        return cozaShopPage + "checkout";
    }

    @PostMapping(value = {"/checkout"})
    public String postCheckout(@RequestParam Map<String, String> m, ModelMap modelMap, HttpSession session) {
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
        
        return cozaShopPage + "confirmation";
    }

    @GetMapping(value = {"/order_history"})
    public String order_history(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);
        Users u = (Users) session.getAttribute("user");

        List<Order> orderList = orderJpaRepo.findAllByUserIdOrderByIdDesc(u.getId());
        modelMap.addAttribute("ESD", "ESD");
        modelMap.addAttribute("orderList", orderList);

        return cozaShopPage + "order-history";
    }

    @GetMapping(value = {"/order_history/{id}"})
    public String order_history_id(@PathVariable int id, ModelMap modelMap){

        Order order = orderJpaRepo.findById(id);
        setOrderDataInfo(order, modelMap, null);

        return cozaShopPage + "confirmation";
    }

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
