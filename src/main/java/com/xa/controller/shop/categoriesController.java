package com.xa.controller.shop;

import com.xa.model.ProductStorage;
import com.xa.model.Products;
import com.xa.repository.ProductsJpaRepo;
import com.xa.interfaces.impl.InitializeSessionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.cozaShopPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class categoriesController {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private InitializeSessionImpl initializeSession;

    private int itemPerPage = 12;

    @GetMapping(value = {"/category/{categoryId}/{page}"})
    public String categories(@PathVariable int categoryId, @PathVariable int page, ModelMap modelMap, HttpSession session){
        initializeSession.initializeSession(session);

        int totalProducts = productsJpaRepo.countByCategoryId(categoryId);

        int totalPage = totalProducts;

        if (totalPage % itemPerPage != 0) {
            totalPage = (totalProducts / itemPerPage) + 1;
        }else{
            totalPage = totalProducts / itemPerPage;
        }

        List<Integer> pageList = new ArrayList<>();
        for (int i = 1; i <= totalPage; i++) {
            pageList.add(i);
        }
        List<Products> listProducts = productsJpaRepo.findAllByCategoryId(categoryId, PageRequest.of((page - 1), itemPerPage));

        modelMap.addAttribute("listProducts", listProducts);
        modelMap.addAttribute("pageList", pageList);
        modelMap.addAttribute("currentCategory", categoryId);
        modelMap.addAttribute("currentPage", page);

        loadSizeAndColorList(listProducts, modelMap);

        return cozaShopPage + "product";
    }

    public static void loadSizeAndColorList(List<Products> listProducts, ModelMap modelMap){
        //get list of size of product
        Map<Integer, Map<Integer, String>> productSize = new HashMap<>();
        //get list of color of product
        Map<Integer, Map<Integer, String>> productColor = new HashMap<>();
        //tmporary map
        Map<Integer,String> temporaryMapSize;
        //tmporary map
        Map<Integer,String> temporaryMapColor;
        for (Products p : listProducts){
            temporaryMapSize = new HashMap<>();
            temporaryMapColor = new HashMap<>();
            for(ProductStorage pt : p.getProductStorageList()){
                temporaryMapSize.put(pt.getSizeId(), pt.getProductSize().getName());

                temporaryMapColor.put(pt.getColorId(), pt.getProductColor().getName());
            }
            //put to main Map
            productSize.put(p.getId(), temporaryMapSize);

            productColor.put(p.getId(), temporaryMapColor);
        }
        modelMap.addAttribute("productSizeList", productSize);

        modelMap.addAttribute("productColorList", productColor);
        //end
    }

}
