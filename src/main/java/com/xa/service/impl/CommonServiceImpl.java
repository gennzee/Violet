package com.xa.service.impl;

import com.xa.service.CommonService;
import com.xa.model.Categories;
import com.xa.repository.CategoriesJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Override
    public void initCategory(HttpSession session) {
        List<Categories> categoriesList = categoriesJpaRepo.findAll();
        session.setAttribute("categoriesList", categoriesList);
    }

}
