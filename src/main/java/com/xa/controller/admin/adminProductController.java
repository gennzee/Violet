package com.xa.controller.admin;

import com.xa.model.Categories;
import com.xa.model.ProductImage;
import com.xa.model.ProductStorage;
import com.xa.model.Products;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.ProductImageJpaRepo;
import com.xa.repository.ProductStorageJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    private FileUploaderService fileUploaderService;

    @GetMapping(value = {"/productManagement/{id}"})
    public String productManagement(ModelMap model, @PathVariable int id){
        List<Products> listProducts = productsJpaRepo.findAllByCategoryId(id);
        model.addAttribute("listProducts", listProducts);
        Categories categories = categoriesJpaRepo.findById(id);
        model.addAttribute("categories", categories);
        return adminPage + "product";
    }

    @PostMapping(value = {"/addProduct"})
    public String addProduct(HttpServletRequest request, @RequestParam Map<String,String> m, @RequestParam("image") MultipartFile[] files, RedirectAttributes ra){
        String referer = request.getHeader("Referer");

        Products p = productsJpaRepo.save(new Products(m.get("name"), m.get("description"), Integer.parseInt(m.get("category")), false, new Date(), new Date()));
        for(MultipartFile file : files) {
            fileUploaderService.uploadFile(request, file);
            productImageJpaRepo.save(new ProductImage(p.getId(), fileUploaderService.getImageName(), new Date()));
        }
        return "redirect:"+referer;
    }

    @GetMapping(value = {"/productManagementDetail/{id}"})
    public String productManagementDetail(){
        return "";
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
