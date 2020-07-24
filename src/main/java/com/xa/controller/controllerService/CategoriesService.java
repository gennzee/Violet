package com.xa.controller.controllerService;

import com.xa.model.Products;
import org.springframework.data.domain.Page;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
 * Created by anhnx on 23/07/2020.
 */
public interface CategoriesService {

    List<Integer> getPageListFromCategory(int categoryId);

    Page getPageProduct(int categoryId, String sortBy, String price, String height, String color, String size, int page);

    void loadSizeAndColorList(List<Products> listProducts, ModelMap modelMap);

}
