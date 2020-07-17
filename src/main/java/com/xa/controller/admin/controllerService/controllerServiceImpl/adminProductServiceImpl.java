package com.xa.controller.admin.controllerService.controllerServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xa.controller.admin.controllerService.adminProductService;
import com.xa.model.*;
import com.xa.repository.*;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.BLANK;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminProductServiceImpl implements adminProductService {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Autowired
    private ProductStorageJpaRepo productStorageJpaRepo;

    @Autowired
    private ProductColorJpaRepo productColorJpaRepo;

    @Autowired
    private ProductSizeJpaRepo productSizeJpaRepo;

    @Autowired
    private ProductHeightJpaRepo productHeightJpaRepo;

    @Autowired
    private ProductImageJpaRepo productImageJpaRepo;

    @Autowired
    private FileUploaderService fileUploaderService;

    @Override
    public void findAllProductByCategoryId(ModelMap model, int id) {
        List<Products> listProducts = productsJpaRepo.findAllByCategoryId(id);
        model.addAttribute("listProducts", listProducts);
    }

    @Override
    public void findCategoryById(ModelMap model, int id) {
        Categories categories = categoriesJpaRepo.findById(id);
        model.addAttribute("categories", categories);
    }

    @Override
    public void productManagementDetailView(ModelMap modelMap, int categoryId, int id) {
        List<ProductStorage> productStorageList = productStorageJpaRepo.findAllByProductId(id);
        modelMap.addAttribute("productStorageList", productStorageList);

        List<ProductColor> productColorList = productColorJpaRepo.findAllByCategoryId(categoryId);
        modelMap.addAttribute("productColorList", productColorList);

        List<ProductSize> productSizeList = productSizeJpaRepo.findAllByCategoryId(categoryId);
        modelMap.addAttribute("productSizeList", productSizeList);

        List<ProductHeight> productHeightList = productHeightJpaRepo.findAllByCategoryId(categoryId);
        modelMap.addAttribute("productHeightList", productHeightList);

        modelMap.addAttribute("productId", id);
    }

    @Override
    public String checkProductIfExisting(Map<String, String> m) throws Exception {
        ProductStorage ps = productStorageJpaRepo.findByProductIdAndColorIdAndSizeIdAndHeightId(Integer.parseInt(m.get("productId")), Integer.parseInt(m.get("color")), Integer.parseInt(m.get("size")), Integer.parseInt(m.get("height")));
        if(ps != null){
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(ps);
        }
        return BLANK;
    }

    @Override
    public void addProductDetail(Map<String, String> m) {
        ProductStorage productStorage = new ProductStorage(Integer.parseInt(m.get("productId")), Float.parseFloat(m.get("price")), Float.parseFloat(m.get("discount")), Integer.parseInt(m.get("color")), Integer.parseInt(m.get("size")), Integer.parseInt(m.get("height")), Integer.parseInt(m.get("quantity")), 0);
        productStorageJpaRepo.save(productStorage);
    }

    @Override
    public void editProductDetail(Map<String, String> m) {
        ProductStorage productStorage = new ProductStorage(Integer.parseInt(m.get("productId")), Float.parseFloat(m.get("price")), Float.parseFloat(m.get("discount")), Integer.parseInt(m.get("color")), Integer.parseInt(m.get("size")), Integer.parseInt(m.get("height")), Integer.parseInt(m.get("quantity")), 0);
        productStorageJpaRepo.updateProductDetail(productStorage.getQuantity(), Integer.parseInt(m.get("id")), productStorage.getPrice(), productStorage.getDiscount());
    }

    @Override
    public void deleteProductById(int productId) {
        productStorageJpaRepo.deleteById(productId);
    }

    @Override
    public void addProduct(HttpServletRequest request, Map<String, String> m, MultipartFile[] files) {
        Products p = productsJpaRepo.save(new Products(m.get("name"), m.get("description"), Integer.parseInt(m.get("category")), false, new Date(), new Date()));
        for(MultipartFile file : files) {
            if(!file.isEmpty()){
                fileUploaderService.uploadFile(request, file);
                productImageJpaRepo.save(new ProductImage(p.getId(), fileUploaderService.getImageName(), new Date()));
            }
        }
    }

    @Override
    public void deleteProduct(HttpServletRequest request, int id) {
        List<ProductImage> productImages = productImageJpaRepo.findAllByProductId(id);
        for(ProductImage img : productImages){
            fileUploaderService.deleteFile(request, img.getName());
        }
        productsJpaRepo.deleteById(id);
    }
}
