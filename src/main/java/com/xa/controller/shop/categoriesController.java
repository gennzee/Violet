package com.xa.controller.shop;

import com.xa.model.Products;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class categoriesController {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    private int itemPerPage = 3;

    @GetMapping(value = {"/category/{categoryId}/{page}"})
    public String categories(@PathVariable int categoryId, @PathVariable int page, ModelMap modelMap){

        List<Products> listProducts = productsJpaRepo.findAllByCategoryId(categoryId, null);

        int totalPage = listProducts.size();

        if (totalPage % itemPerPage != 0) {
            totalPage = (listProducts.size() / itemPerPage) + 1;
        }else{
            totalPage = listProducts.size() / itemPerPage;
        }

        List<Integer> pageList = new ArrayList<>();
        for (int i = 1; i <= totalPage; i++) {
            pageList.add(i);
        }
        listProducts = productsJpaRepo.findAllByCategoryId(categoryId, PageRequest.of((page - 1), itemPerPage));

        modelMap.addAttribute("listProducts", listProducts);
        modelMap.addAttribute("pageList", pageList);
        modelMap.addAttribute("currentCategory", categoryId);
        modelMap.addAttribute("currentPage", page);
        return cozaShopPage + "product";
    }

}
