package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.ProductService;
import com.xa.controller.shop.categoriesApi;
import com.xa.service.InitializeSession;
import com.xa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.util.*;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Component
public class categoriesController implements categoriesApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private ProductService productService;

    @Override
    public String categories(ModelMap modelMap, HttpSession session, int categoryId, int page, String sortBy, String price, String height, String color, String size){
        initializeSession.initializeSession(session);

        modelMap.addAttribute("sortBy", sortBy);
        modelMap.addAttribute("height", height);
        modelMap.addAttribute("price", price);
        modelMap.addAttribute("color", color);
        modelMap.addAttribute("size", size);

        List<Integer> pageList = categoriesService.getPageListFromCategory(categoryId);
        Page<Products> listProducts = categoriesService.getPageProduct(categoryId, sortBy, price, height, color, size, page);
        modelMap.addAttribute("listProducts", listProducts.getContent());
        modelMap.addAttribute("pageList", pageList);
        modelMap.addAttribute("currentCategory", categoryId);
        modelMap.addAttribute("currentPage", page);

        List<ProductColor> productColorList = productService.getAllColorByCategoryId(categoryId);
        List<ProductSize> productSizeList = productService.getAllSizeByCategoryId(categoryId);
        List<ProductHeight> productHeights = productService.getAllHeightByCategoryId(categoryId);
        modelMap.addAttribute("colorList", productColorList);
        modelMap.addAttribute("sizeList", productSizeList);
        modelMap.addAttribute("heightList", productHeights);

        categoriesService.loadSizeAndColorList(listProducts.getContent(), modelMap);

        return cozaShopPage + "product";
    }

}
