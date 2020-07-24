package com.xa.controller.controllerService.controllerServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xa.controller.controllerService.ProductService;
import com.xa.model.*;
import com.xa.repository.*;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.BLANK;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private ReviewJpaRepo reviewJpaRepo;

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
    public List<ProductColor> getAllColorByCategoryId(int categoryId) {
        return productColorJpaRepo.findAllByCategoryId(categoryId);
    }

    @Override
    public List<ProductSize> getAllSizeByCategoryId(int categoryId) {
        return productSizeJpaRepo.findAllByCategoryId(categoryId);
    }

    @Override
    public List<ProductHeight> getAllHeightByCategoryId(int categoryId) {
        return productHeightJpaRepo.findAllByCategoryId(categoryId);
    }

    @Override
    public List<Products> findAllProductByCategoryId(int id) {
        return productsJpaRepo.findAllByCategoryId(id);
    }

    @Override
    public Categories findCategoryById(int id) {
        return categoriesJpaRepo.findById(id);
    }

    @Override
    public Products findProductById(int id) {
        return productsJpaRepo.findById(id);
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
    public void addReviewProduct(HttpServletRequest request) {
        Review review = new Review();
        review.setProductId(Integer.valueOf(request.getParameter("productId")));
        review.setRating(Integer.valueOf(request.getParameter("rating")));
        review.setDescription(request.getParameter("review"));
        review.setName(request.getParameter("name"));
        review.setEmail(request.getParameter("email"));

        reviewJpaRepo.save(review);
    }

    @Override
    public boolean addProductToCartAjax(HttpSession session, Map<String, String> m) {
        int id = Integer.parseInt(m.get("id"));
        int height = Integer.parseInt(m.get("height"));
        int color = Integer.parseInt(m.get("color"));
        int size = Integer.parseInt(m.get("size"));
        int quantity = Integer.parseInt(m.get("num-product"));

        ProductStorage productStorage = productStorageJpaRepo.findByProductIdAndColorIdAndSizeIdAndHeightId(id, color, size, height);
        if(productStorage == null){
            return false;
        }

        Products product = productsJpaRepo.findById(productStorage.getProductId());

        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        shoppingCarts.put(productStorage.getId(), new ShoppingCart(product.getName(), product.getProductImageList().get(0).getName(), productStorage, quantity));

        //calculate cartTotalPrice on server instead of client
        calculateTotalPrice(shoppingCarts, session);
        session.setAttribute("shoppingCarts", shoppingCarts);

        return true;
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
    public boolean updateCart(HttpServletRequest request, HttpSession session) {
        Map<Integer, ShoppingCart> shoppingCarts = (Map<Integer, ShoppingCart>) session.getAttribute("shoppingCarts");
        Map<String, String> additionParam = new HashMap<>();
        String[] id = request.getParameterValues("id");
        String[] quantity = request.getParameterValues("num-product1");
        for(int i = 0; i< id.length; i++){
            additionParam.put(id[i], quantity[i]);
        }
        for(String i : additionParam.keySet()){
            int idd = Integer.parseInt(i);
            int quantityy = Integer.parseInt(additionParam.get(i));
            if(shoppingCarts.get(idd) != null){
                shoppingCarts.get(idd).setQuantity(quantityy);
            }
        }
        calculateTotalPrice(shoppingCarts, session);
        return true;
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

    @Override
    public void calculateTotalPrice(Map<Integer, ShoppingCart> shoppingCarts, HttpSession session){
        float cartTotalPrice = 0;
        for(Integer i : shoppingCarts.keySet()){
            cartTotalPrice += shoppingCarts.get(i).getQuantity()*shoppingCarts.get(i).getProductStorage().getPrice();
        }
        session.setAttribute("cartTotalPrice", cartTotalPrice);
    }

}
