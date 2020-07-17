package com.xa.controller.admin.controllerService;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface adminProductService {

    void findAllProductByCategoryId(ModelMap model, int id);

    void findCategoryById(ModelMap model, int id);

    void productManagementDetailView(ModelMap modelMap, int categoryId, int id);

    String checkProductIfExisting(Map<String, String> m) throws Exception;

    void addProductDetail(Map<String, String> m);

    void editProductDetail(Map<String, String> m);

    void deleteProductById(int productId);

    void addProduct(HttpServletRequest request, Map<String,String> m, MultipartFile[] files);

    void deleteProduct(HttpServletRequest request, int id);

}
