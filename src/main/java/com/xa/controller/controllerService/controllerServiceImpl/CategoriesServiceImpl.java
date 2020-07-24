package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.model.ProductStorage;
import com.xa.model.Products;
import com.xa.repository.ProductsJpaRepo;
import com.xa.repository.Specification.ProductSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 23/07/2020.
 */
@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    private static final int itemPerPage = 12;

    @Override
    public List<Integer> getPageListFromCategory(int categoryId) {

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

        return pageList;
    }

    @Override
    public Page<Products> getPageProduct(int categoryId, String sortBy, String price, String height, String color, String size, int page) {

        String[] prices = price.split("-");
        Specification condition = Specification.where(ProductSpecification.filterConditions(categoryId, sortBy, prices[0], prices[1], height, color, size));

        return productsJpaRepo.findAll(condition, PageRequest.of((page - 1), itemPerPage));
    }

    @Override
    public void loadSizeAndColorList(List<Products> listProducts, ModelMap modelMap) {
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
