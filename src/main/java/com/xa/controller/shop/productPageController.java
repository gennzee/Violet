package com.xa.controller.shop;

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.Products;
import com.xa.model.Review;
import com.xa.repository.CategoriesJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import com.xa.repository.ReviewJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.xa.controller.shop.categoriesController.loadSizeAndColorList;
import static com.xa.service.ConstVariables.cozaShopPage;
import static com.xa.service.ConstVariables.errorPage;

/**
 * Created by anhnx on 13/04/2020.
 */
@Controller
public class productPageController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private ReviewJpaRepo reviewJpaRepo;

    @GetMapping(value = "/product/{id}")
    public String product(@PathVariable int id, ModelMap modelMap, HttpSession session){
        initializeSession.initializeSession(session);

        Products product = productsJpaRepo.findById(id);
        if(product == null){
            return errorPage + "error-404";
        }

        List<Products> productsList = new ArrayList<>();
        productsList.add(product);
        loadSizeAndColorList(productsList, modelMap);
        modelMap.addAttribute("product", product);

        List<Review> reviewList = reviewJpaRepo.findAllByProductId(product.getId());
        modelMap.addAttribute("reviewList", reviewList);

        return cozaShopPage + "product-detail";
    }

    @PostMapping(value = {"/postReview"})
    public String postReview(HttpServletRequest request){
        String referer = request.getHeader("Referer");
        Review review = new Review();
        review.setProductId(Integer.valueOf(request.getParameter("productId")));
        review.setRating(Integer.valueOf(request.getParameter("rating")));
        review.setDescription(request.getParameter("review"));
        review.setName(request.getParameter("name"));
        review.setEmail(request.getParameter("email"));

        reviewJpaRepo.save(review);

        return "redirect:"+referer;
    }

    @GetMapping(value = {"/product-detail"})
    public String productDetail(HttpSession session){
        initializeSession.initializeSession(session);

        return cozaShopPage + "product-detail";
    }

}
