package com.xa.controller.admin.controllerApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminProductApi {

    @GetMapping(value = {"/productManagement/{id}"})
    String productManagement(ModelMap model, @PathVariable int id);

    @GetMapping(value = {"/productManagement/{categoryId}/{id}"})
    String productManagementDetail(@PathVariable int categoryId, @PathVariable int id, ModelMap modelMap);

    @PostMapping(value = {"/productManagement/isProductDetailNotExisting"})
    @ResponseBody
    String isProductDetailExisting(@RequestParam Map<String, String> m) throws Exception;

    @PostMapping(value = {"/productManagement/addProductDetail"})
    String addProductDetail(HttpServletRequest request, @RequestParam Map<String, String> m);

    @PostMapping(value = {"/productManagement/editProductDetail"})
    String editProductDetail(HttpServletRequest request, @RequestParam Map<String, String> m);

    @GetMapping(value = {"/productManagement/productDetail/delete/{productId}"})
    String removeProductDetail(HttpServletRequest request, @PathVariable int productId);

    @PostMapping(value = {"/addProduct"})
    String addProduct(HttpServletRequest request, @RequestParam Map<String,String> m, @RequestParam("image") MultipartFile[] files, RedirectAttributes ra);

    @GetMapping("deleteProduct/{id}")
    String deleteProduct(HttpServletRequest request, @PathVariable int id, RedirectAttributes ra);

}
