package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.shopService;
import com.xa.model.News;
import com.xa.model.Products;
import com.xa.repository.NewsJpaRepo;
import com.xa.repository.ProductsJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by anhnx on 22/07/2020.
 */
@Service
public class shopServiceImpl implements shopService {

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Override
    public List<Products> initIndex(HttpSession session, ModelMap modelMap, PageRequest pageRequest) {
        return productsJpaRepo.findAllNewProductIn3Months(pageRequest);
    }
}
