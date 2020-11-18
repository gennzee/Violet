package com.xa.controller.controllerService;

import com.xa.model.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface ProductService {

    List<ProductColor> getAllColorByCategoryId(int categoryId);

    List<ProductSize> getAllSizeByCategoryId(int categoryId);

    List<ProductHeight> getAllHeightByCategoryId(int categoryId);

    List<Products> findAllProductByCategoryId(int id);

    Categories findCategoryById(int id);

    Products findProductById(int id);

    void productManagementDetailView(ModelMap modelMap, int categoryId, int id);

    String checkProductIfExisting(Map<String, String> m) throws Exception;

    void addProductDetail(Map<String, String> m);

    void addReviewProduct(HttpServletRequest request);

    boolean addProductToCartAjax(HttpSession session, Map<String, String> m);

    void editProductDetail(Map<String, String> m);

    void deleteProductById(int productId);

    boolean updateCart(HttpServletRequest request, HttpSession session);

    void addProduct(HttpServletRequest request, Map<String,String> m, MultipartFile[] files);

    void deleteProduct(HttpServletRequest request, int id);

    void calculateTotalPrice(Map<Integer, ShoppingCart> shoppingCarts, HttpSession session);

    String getColorList(HttpServletRequest request, ModelMap modelMap);

    void addNewColor(ProductColor productColor);

    void editColor(int colorId, String name, String hex);

    String getSizeList(HttpServletRequest request, ModelMap modelMap);

    void addNewSize(ProductSize productSize);

    void editSize(int sizeId, String name);

    String getHeightList(HttpServletRequest request, ModelMap modelMap);

    void addNewHight(ProductHeight productHeight);

    void editHeight(int heightId, String name);
}
