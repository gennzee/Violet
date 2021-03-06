package com.xa.controller.admin.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xa.controller.admin.adminProductApi;
import com.xa.controller.controllerService.ProductService;
import com.xa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 05/05/2020.
 */
@Component
public class adminProductController implements adminProductApi {

    @Autowired
    private ProductService adminProductService;

    @Override
    public String productManagement(ModelMap model, int id){
        List<Products> listProducts = adminProductService.findAllProductByCategoryId(id);
        model.addAttribute("listProducts", listProducts);

        Categories categories = adminProductService.findCategoryById(id);
        model.addAttribute("categories", categories);
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
    public String editProduct(HttpServletRequest request, Map<String, String> m, MultipartFile[] files, RedirectAttributes ra) {
        String referer = request.getHeader("Referer");

        adminProductService.editProduct(request, m, files);
        return "redirect:"+referer;
    }

    @Override
    public String deleteProduct(HttpServletRequest request, int id, RedirectAttributes ra){
        String referer = request.getHeader("Referer");

        adminProductService.deleteProduct(request, id);
        return "redirect:"+referer;
    }

    @Override
    public String getColorList(HttpServletRequest request, ModelMap modelMap) {
        return adminProductService.getColorList(request, modelMap);
    }

    @Override
    public String addNewColor(HttpServletRequest request, Map<String, String> m) {
        String referer = request.getHeader("Referer");
        ProductColor productColor = new ObjectMapper().convertValue(m, ProductColor.class);
        adminProductService.addNewColor(productColor);
        return "redirect:"+referer;
    }

    @Override
    public String editColor(HttpServletRequest request, Map<String, String> m) {
        String referer = request.getHeader("Referer");
        adminProductService.editColor(Integer.parseInt(m.get("id")), m.get("name"), m.get("hex"));
        return "redirect:"+referer;
    }

    @Override
    public String getSizeList(HttpServletRequest request, ModelMap modelMap) {
        return adminProductService.getSizeList(request, modelMap);
    }

    @Override
    public String addNewSize(HttpServletRequest request, Map<String, String> m) {
        String referer = request.getHeader("Referer");
        ProductSize productSize = new ObjectMapper().convertValue(m, ProductSize.class);
        adminProductService.addNewSize(productSize);
        return "redirect:"+referer;
    }

    @Override
    public String editSize(HttpServletRequest request, Map<String, String> m) {
        String referer = request.getHeader("Referer");
        adminProductService.editSize(Integer.parseInt(m.get("id")), m.get("name"));
        return "redirect:"+referer;
    }

    @Override
    public String getHeightList(HttpServletRequest request, ModelMap modelMap) {
        return adminProductService.getHeightList(request, modelMap);
    }

    @Override
    public String addNewHeight(HttpServletRequest request, Map<String, String> m) {
        String referer = request.getHeader("Referer");
        ProductHeight productHeight = new ObjectMapper().convertValue(m, ProductHeight.class);
        adminProductService.addNewHight(productHeight);
        return "redirect:"+referer;
    }

    @Override
    public String editHeight(HttpServletRequest request, Map<String, String> m) {
        String referer = request.getHeader("Referer");
        adminProductService.editHeight(Integer.parseInt(m.get("id")), m.get("name"));
        return "redirect:"+referer;
    }

}
