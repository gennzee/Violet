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
    private NewsJpaRepo newsJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Override
    public List<Products> initIndex(HttpSession session, ModelMap modelMap) {
        List<News> newsList = newsJpaRepo.findAll(PageRequest.of(0, 3)).getContent();
        modelMap.addAttribute("newsList", newsList);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -3);
        return productsJpaRepo.findAllByUpdatedDateAfter(calendar.getTime(), PageRequest.of(0,8));
    }
}
