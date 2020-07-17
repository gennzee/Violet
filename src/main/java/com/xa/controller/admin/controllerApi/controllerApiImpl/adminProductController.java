package com.xa.controller.admin.controllerApi.controllerApiImpl;

import com.xa.controller.admin.controllerApi.adminProductApi;
import com.xa.controller.admin.controllerService.adminProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 05/05/2020.
 */
@Component
public class adminProductController implements adminProductApi {

    @Autowired
    private adminProductService adminProductService;

    @Override
    public String productManagement(ModelMap model, int id){
        adminProductService.findAllProductByCategoryId(model, id);
        adminProductService.findCategoryById(model, id);
        return adminPage + "product";
    }

    @Override
    public String productManagementDetail(int categoryId, int id, ModelMap modelMap){

        adminProductService.productManagementDetailView(modelMap, categoryId, id);
        return adminPage + "productDetail";
    }

    @Override
    public String isProductDetailExisting(Map<String, String> m) throws Exception{
        return adminProductService.checkProductIfExisting(m);
    }

    @Override
    public String addProductDetail(HttpServletRequest request, Map<String, String> m){
        String referer = request.getHeader("Referer");

        adminProductService.addProductDetail(m);
        return "redirect:"+referer;
    }

    @Override
    @Transactional
    public String editProductDetail(HttpServletRequest request, Map<String, String> m){
        String referer = request.getHeader("Referer");

        adminProductService.editProductDetail(m);
        return "redirect:"+referer;
    }

    @Override
    public String removeProductDetail(HttpServletRequest request, int productId){
        String referer = request.getHeader("Referer");

        adminProductService.deleteProductById(productId);
        return "redirect:"+referer;
    }

    @Override
    public String addProduct(HttpServletRequest request, Map<String,String> m, MultipartFile[] files, RedirectAttributes ra){
        String referer = request.getHeader("Referer");

        adminProductService.addProduct(request, m, files);
        return "redirect:"+referer;
    }

    @Override
    public String deleteProduct(HttpServletRequest request, int id, RedirectAttributes ra){
        String referer = request.getHeader("Referer");

        adminProductService.deleteProduct(request, id);
        return "redirect:"+referer;
    }

}
