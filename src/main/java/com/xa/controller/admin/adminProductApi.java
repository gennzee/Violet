package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
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

    @PostMapping(value = {"/editProduct"})
    String editProduct(HttpServletRequest request, @RequestParam Map<String,String> m, @RequestParam("image") MultipartFile[] files, RedirectAttributes ra);

    @GetMapping("deleteProduct/{id}")
    String deleteProduct(HttpServletRequest request, @PathVariable int id, RedirectAttributes ra);

    @GetMapping("/getColorList")
    String getColorList(HttpServletRequest request, ModelMap modelMap);

    @PostMapping("/addNewColor")
    String addNewColor(HttpServletRequest request, @RequestParam Map<String, String> m);

    @PostMapping("/editColor")
    String editColor(HttpServletRequest request, @RequestParam Map<String, String> m);

    @GetMapping("/getSizeList")
    String getSizeList(HttpServletRequest request, ModelMap modelMap);

    @PostMapping("/addNewSize")
    String addNewSize(HttpServletRequest request, @RequestParam Map<String, String> m);

    @PostMapping("/editSize")
    String editSize(HttpServletRequest request, @RequestParam Map<String, String> m);

    @GetMapping("/getHeightList")
    String getHeightList(HttpServletRequest request, ModelMap modelMap);

    @PostMapping("/addNewHeight")
    String addNewHeight(HttpServletRequest request, @RequestParam Map<String, String> m);

    @PostMapping("/editHeight")
    String editHeight(HttpServletRequest request, @RequestParam Map<String, String> m);

}
