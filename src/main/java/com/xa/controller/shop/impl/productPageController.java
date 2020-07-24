package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.ProductService;
import com.xa.controller.shop.productPageApi;
import com.xa.service.InitializeSession;
import com.xa.model.Products;
import com.xa.model.Review;
import com.xa.repository.ProductsJpaRepo;
import com.xa.repository.ReviewJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static com.xa.service.ConstVariables.cozaShopPage;
import static com.xa.service.ConstVariables.errorPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Component
public class productPageController implements productPageApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private ProductService productService;

    @Override
    public String product(int id, ModelMap modelMap, HttpSession session){
        initializeSession.initializeSession(session);

        Products product = productService.findProductById(id);
        if(product == null){
            return errorPage + "error-404";
        }

        List<Products> productsList = new ArrayList<>();
        productsList.add(product);
        categoriesService.loadSizeAndColorList(productsList, modelMap);
        modelMap.addAttribute("product", product);

        return cozaShopPage + "product-detail";
    }

    @Override
    public String postReview(HttpServletRequest request){
        String referer = request.getHeader("Referer");

        productService.addReviewProduct(request);
        return "redirect:"+referer;
    }

    @Override
    public String productDetail(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage + "product-detail";
    }

}
