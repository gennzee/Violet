package com.xa.controller.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xa.model.*;
import com.xa.repository.*;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 05/05/2020.
 */
@Controller
public class adminProductController {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private ProductImageJpaRepo productImageJpaRepo;

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Autowired
    private ProductStorageJpaRepo productStorageJpaRepo;

    @Autowired
    private ProductColorJpaRepo productColorJpaRepo;

    @Autowired
    private ProductSizeJpaRepo productSizeJpaRepo;

    @Autowired
    private FileUploaderService fileUploaderService;

    @GetMapping(value = {"/productManagement/{id}"})
    public String productManagement(ModelMap model, @PathVariable int id){
        List<Products> listProducts = productsJpaRepo.findAllByCategoryId(id);
        model.addAttribute("listProducts", listProducts);
        Categories categories = categoriesJpaRepo.findById(id);
        model.addAttribute("categories", categories);
        return adminPage + "product";
    }

    @GetMapping(value = {"/productManagement/detail/{id}"})
    public String productManagementDetail(@PathVariable int id, ModelMap modelMap){

        List<ProductStorage> productStorageList = productStorageJpaRepo.findAllByProductId(id);
        modelMap.addAttribute("productStorageList", productStorageList);

        List<ProductColor> productColorList = productColorJpaRepo.findAllByCategoryId(productStorageList.get(0).getProducts().getCategoryId());
        modelMap.addAttribute("productColorList", productColorList);

        List<ProductSize> productSizeList = productSizeJpaRepo.findAllByCategoryId(productStorageList.get(0).getProducts().getCategoryId());
        modelMap.addAttribute("productSizeList", productSizeList);

        return adminPage + "productDetail";
    }

    @PostMapping(value = {"/productManagement/isProductDetailNotExisting"})
    @ResponseBody
    public String isProductDetailExisting(@RequestParam Map<String, String> m) throws Exception{
        ProductStorage ps = productStorageJpaRepo.findByProductIdAndColorIdAndSizeId(Integer.parseInt(m.get("productId")), Integer.parseInt(m.get("color")), Integer.parseInt(m.get("size")));
        if(ps != null){
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(ps);
        }
        return "";
    }

    @PostMapping(value = {"/productManagement/addProductDetail"})
    public String addProductDetail(HttpServletRequest request, @RequestParam Map<String, String> m){
        String referer = request.getHeader("Referer");

        ProductStorage productStorage = new ProductStorage(Integer.parseInt(m.get("productId")), Float.parseFloat(m.get("price")), Float.parseFloat(m.get("discount")), Integer.parseInt(m.get("color")), Integer.parseInt(m.get("size")), Integer.parseInt(m.get("quantity")), 0);
        productStorageJpaRepo.save(productStorage);

        return "redirect:"+referer;
    }

    @Transactional
    @PostMapping(value = {"/productManagement/editProductDetail"})
    public String editProductDetail(HttpServletRequest request, @RequestParam Map<String, String> m){
        String referer = request.getHeader("Referer");

        ProductStorage productStorage = new ProductStorage(Integer.parseInt(m.get("productId")), Float.parseFloat(m.get("price")), Float.parseFloat(m.get("discount")), Integer.parseInt(m.get("color")), Integer.parseInt(m.get("size")), Integer.parseInt(m.get("quantity")), 0);
        productStorageJpaRepo.updateProductDetail(productStorage.getQuantity(), Integer.parseInt(m.get("id")), productStorage.getPrice(), productStorage.getDiscount());

        return "redirect:"+referer;
    }

    @GetMapping(value = {"/productManagement/productDetail/delete/{productId}"})
    public String removeProductDetail(HttpServletRequest request, @PathVariable int productId){
        String referer = request.getHeader("Referer");

        productStorageJpaRepo.deleteById(productId);

        return "redirect:"+referer;
    }

    @PostMapping(value = {"/addProduct"})
    public String addProduct(HttpServletRequest request, @RequestParam Map<String,String> m, @RequestParam("image") MultipartFile[] files, RedirectAttributes ra){
        String referer = request.getHeader("Referer");

        Products p = productsJpaRepo.save(new Products(m.get("name"), m.get("description"), Integer.parseInt(m.get("category")), false, new Date(), new Date()));
        for(MultipartFile file : files) {
            if(!file.isEmpty()){
                fileUploaderService.uploadFile(request, file);
                productImageJpaRepo.save(new ProductImage(p.getId(), fileUploaderService.getImageName(), new Date()));
            }
        }
        return "redirect:"+referer;
    }

    @GetMapping("deleteProduct/{id}")
    public String deleteProduct(HttpServletRequest request, @PathVariable int id, RedirectAttributes ra){
        String referer = request.getHeader("Referer");

        List<ProductImage> productImages = productImageJpaRepo.findAllByProductId(id);
        for(ProductImage img : productImages){
            fileUploaderService.deleteFile(request, img.getName());
        }
        productsJpaRepo.deleteById(id);

        return "redirect:"+referer;
    }

}
