package com.xa.controller.admin;

import com.xa.model.Products;
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
    private FileUploaderService fileUploaderService;

    @GetMapping(value = {"/productManagement"})
    public String producManagement(ModelMap model){

        List<Products> listProducts = productsJpaRepo.findAll();
        model.addAttribute("listProducts", listProducts);
        return adminPage + "product";
    }

    @PostMapping(value = {"/addProduct"})
    public String addProduct(HttpServletRequest request, @RequestParam Map<String,String> m, @RequestParam("image") MultipartFile file, RedirectAttributes ra){
        fileUploaderService.uploadFile(request, file);
        Products p = new Products();
        p.setName(m.get("name"));
        p.setImage(fileUploaderService.getImageName());
        p.setDescription(m.get("description"));
        p.setPrice(Float.parseFloat(m.get("price")));
        p.setDiscounts(Float.parseFloat(m.get("discounts")));
        p.setSold(0);
        p.setRemoved_flag(false);
        p.setCreated_date(new Date());
        productsJpaRepo.save(p);
        return "redirect:/productManagement";
    }

    @GetMapping("deleteProduct/{id}")
    @Transactional
    public String deleteProduct(HttpServletRequest request, @PathVariable int id, RedirectAttributes ra){
        Products p = productsJpaRepo.findById(id);
        fileUploaderService.deleteFile(request, p.getImage());
        productsJpaRepo.deleteById(id);
        return "redirect:/productManagement";
    }

}
