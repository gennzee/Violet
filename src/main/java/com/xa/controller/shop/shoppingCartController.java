package com.xa.controller.shop;

/**
 * Created by anhnx on 13/04/2020.
 */

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.ProductStorage;
import com.xa.model.Products;
import com.xa.model.ShoppingCart;
import com.xa.repository.ProductStorageJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static com.xa.service.ConstVariables.cozaShopPage;

@Controller
public class shoppingCartController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private ProductStorageJpaRepo productStorageJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @GetMapping(value = {"/shoping-cart"})
    public String cart(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage + "shoping-cart";
    }

    @PostMapping(value = {"/addProductToCartAjax"})
    @ResponseBody
    public boolean addProductToCartAjax(HttpSession session, @RequestParam Map<String, String> m, HttpServletRequest request){
        int id = Integer.parseInt(m.get("id"));
        int height = Integer.parseInt(m.get("height"));
        int color = Integer.parseInt(m.get("color"));
        int size = Integer.parseInt(m.get("size"));
        int quantity = Integer.parseInt(m.get("num-product"));

        ProductStorage productStorage = productStorageJpaRepo.findByProductIdAndColorIdAndSizeIdAndHeightId(id, color, size, height);
        if(productStorage == null){
            return false;
        }

        Products product = productsJpaRepo.findById(productStorage.getProductId());

        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        shoppingCarts.put(productStorage.getId(), new ShoppingCart(product.getName(), product.getProductImageList().get(0).getName(), productStorage, quantity));

        //calculate cartTotalPrice on server instead of client
        calculateTotalPrice(shoppingCarts, session);
        session.setAttribute("shoppingCarts", shoppingCarts);

        return true;
    }

    @PostMapping(value = {"/deleteProductFromCartAjax/{productStorageId}"})
    @ResponseBody
    public boolean deleteProductFromCartAjax(@PathVariable int productStorageId, HttpSession session){
        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        shoppingCarts.remove(productStorageId);
        calculateTotalPrice(shoppingCarts, session);
        session.setAttribute("shoppingCarts", shoppingCarts);
        return true;
    }

    @PostMapping(value = {"/updateCart"})
    @ResponseBody
    public boolean updateCart(HttpServletRequest request, HttpSession session){
        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        Map<String, String> additionParam = new HashMap<>();
        String[] id = request.getParameterValues("id");
        String[] quantity = request.getParameterValues("num-product1");
        for(int i = 0; i< id.length; i++){
            additionParam.put(id[i], quantity[i]);
        }
        for(String i : additionParam.keySet()){
            int idd = Integer.parseInt(i);
            int quantityy = Integer.parseInt(additionParam.get(i));
            if(shoppingCarts.get(idd) != null){
                shoppingCarts.get(idd).setQuantity(quantityy);
            }
        }
        calculateTotalPrice(shoppingCarts, session);
        return true;
    }

    public void calculateTotalPrice(Map<Integer, ShoppingCart> shoppingCarts, HttpSession session){
        float cartTotalPrice = 0;
        for(Integer i : shoppingCarts.keySet()){
            cartTotalPrice += shoppingCarts.get(i).getQuantity()*shoppingCarts.get(i).getProductStorage().getPrice();
        }
        session.setAttribute("cartTotalPrice", cartTotalPrice);
    }

}
