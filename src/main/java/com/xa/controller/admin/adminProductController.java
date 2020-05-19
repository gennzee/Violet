package com.xa.controller.admin;

import com.xa.model.Categories;
import com.xa.model.ProductStorage;
import com.xa.model.Products;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.ProductStorageJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import java.time.LocalDateTime;
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
    private CategoriesJpaRepo categoriesJpaRepo;

    @Autowired
    private ProductStorageJpaRepo productStorageJpaRepo;

    @Autowired
    private FileUploaderService fileUploaderService;

    @GetMapping(value = {"/productManagement"})
    public String producManagement(ModelMap model){
        List<ProductStorage> listProducts = productStorageJpaRepo.findAll();
        List<Categories> listCategories = categoriesJpaRepo.findAll();
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("listCategories", listCategories);
        return adminPage + "product";
    }

    @PostMapping(value = {"/addProduct"})
    public String addProduct(HttpServletRequest request, @RequestParam Map<String,String> m, @RequestParam("image") MultipartFile file, RedirectAttributes ra){
//        fileUploaderService.uploadFile(request, file);
//        Products p = new Products();
//        p.setName(m.get("name"));
//        p.setImage(fileUploaderService.getImageName());
//        p.setDescription(m.get("description"));
//        p.setPrice(Float.parseFloat(m.get("price")));
//        p.setDiscounts(Float.parseFloat(m.get("discounts")));
//        p.setSold(0);
//        p.setCategoryId(Integer.parseInt(m.get("category")));
//        p.setRemovedFlag(false);
//        p.setCreatedDate(new Date());
//        productsJpaRepo.save(p);
        System.out.println("test");
        return "redirect:/productManagement";
    }

    @GetMapping("deleteProduct/{id}")
    @Transactional
    public String deleteProduct(HttpServletRequest request, @PathVariable int id, RedirectAttributes ra){
//        Products p = productsJpaRepo.findById(id);
//        fileUploaderService.deleteFile(request, p.getImage());
//        productsJpaRepo.deleteById(id);
        return "redirect:/productManagement";
    }

}
