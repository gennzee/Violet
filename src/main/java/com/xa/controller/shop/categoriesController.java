package com.xa.controller.shop;

import com.xa.model.*;
import com.xa.repository.ProductColorJpaRepo;
import com.xa.repository.ProductHeightJpaRepo;
import com.xa.repository.ProductSizeJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.repository.Specification.ProductSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.*;

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

    @Autowired
    private ProductColorJpaRepo productColorJpaRepo;

    @Autowired
    private ProductSizeJpaRepo productSizeJpaRepo;

    @Autowired
    private ProductHeightJpaRepo productHeightJpaRepo;

    private int itemPerPage = 12;

    @GetMapping(value = {"/category/{categoryId}/{page}"})
    public String categories(ModelMap modelMap, HttpSession session, @PathVariable int categoryId, @PathVariable int page,
                             @RequestParam(defaultValue = "") String sortBy,
                             @RequestParam(defaultValue = "0-9999999") String price,
                             @RequestParam(defaultValue = "") String height,
                             @RequestParam(defaultValue = "") String color,
                             @RequestParam(defaultValue = "") String size){
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
        String[] prices = price.split("-");
        Specification condition = Specification.where(ProductSpecification.filterConditions(categoryId, sortBy, prices[0], prices[1], height, color, size));
        Page<Products> listProducts = productsJpaRepo.findAll(condition, PageRequest.of((page - 1), itemPerPage));
        modelMap.addAttribute("sortBy", sortBy);
        modelMap.addAttribute("height", height);
        modelMap.addAttribute("price", price);
        modelMap.addAttribute("color", color);
        modelMap.addAttribute("size", size);

        List<ProductColor> productColorList = productColorJpaRepo.findAllByCategoryId(categoryId);
        List<ProductSize> productSizeList = productSizeJpaRepo.findAllByCategoryId(categoryId);
        List<ProductHeight> productHeights = productHeightJpaRepo.findAllByCategoryId(categoryId);
        modelMap.addAttribute("colorList", productColorList);
        modelMap.addAttribute("sizeList", productSizeList);
        modelMap.addAttribute("heightList", productHeights);

        modelMap.addAttribute("listProducts", listProducts.getContent());
        modelMap.addAttribute("pageList", pageList);
        modelMap.addAttribute("currentCategory", categoryId);
        modelMap.addAttribute("currentPage", page);

        loadSizeAndColorList(listProducts.getContent(), modelMap);

        return cozaShopPage + "product";
    }

    public static void loadSizeAndColorList(List<Products> listProducts, ModelMap modelMap){
        //get list of size of product
        Map<Integer, Map<Integer, String>> productSize = new HashMap<>();
        //get list of color of product
        Map<Integer, Map<Integer, String>> productColor = new HashMap<>();
        //get list of height of product
        Map<Integer, Map<Integer, String>> productHeight = new HashMap<>();
        //tmporary map
        Map<Integer,String> temporaryMapSize;
        //tmporary map
        Map<Integer,String> temporaryMapColor;
        //tmporary map
        Map<Integer,String> temporaryMapHeight;
        for (Products p : listProducts){
            temporaryMapSize = new HashMap<>();
            temporaryMapColor = new HashMap<>();
            temporaryMapHeight = new HashMap<>();
            for(ProductStorage pt : p.getProductStorageList()){
                temporaryMapSize.put(pt.getSizeId(), pt.getProductSize().getName());

                temporaryMapColor.put(pt.getColorId(), pt.getProductColor().getName());

                temporaryMapHeight.put(pt.getHeightId(), pt.getProductHeight().getName());
            }
            //put to main Map
            productSize.put(p.getId(), temporaryMapSize);

            productColor.put(p.getId(), temporaryMapColor);

            productHeight.put(p.getId(), temporaryMapHeight);
        }
        modelMap.addAttribute("productSizeList", productSize);

        modelMap.addAttribute("productColorList", productColor);

        modelMap.addAttribute("productHeightList", productHeight);
        //end
    }

}
