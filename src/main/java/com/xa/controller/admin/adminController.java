package com.xa.controller.admin;

import com.xa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 19/04/2020.
 */
@Controller
public class adminController {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @Autowired
    private ProductStorageJpaRepo productStorageJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private OrderProductJpaRepo orderProductJpaRepo;

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Autowired
    private OrderJpaRepo orderJpaRepo;

    @GetMapping(value = {"/admin", "/dashboard"})
    public String index(ModelMap modelMap){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        LocalDate localDate2 = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int lastMonth = localDate2.getMonthValue();

        int totalUser = usersJpaRepo.findTotalUser(year, month);
        int totalUserLastMonth = usersJpaRepo.findTotalUser(year, lastMonth);
        float userPercent = (totalUserLastMonth == 0) ? 0 : ((totalUser - totalUserLastMonth) * 100) / totalUserLastMonth;
        modelMap.addAttribute("totalUser", totalUser);
        modelMap.addAttribute("userPercent", userPercent);

        List<Integer> incomeList = productStorageJpaRepo.findIncomeInMonth(month, year);
        List<Integer> incomeListLastMonth = productStorageJpaRepo.findIncomeInMonth(lastMonth, year);
        int income = incomeList.stream().reduce(0, Integer::sum);
        int incomeLastMonth = incomeListLastMonth.stream().reduce(0, Integer::sum);
        float incomePercent = (incomeLastMonth == 0) ? 0 : ((income - incomeLastMonth) * 100) / incomeLastMonth;
        modelMap.addAttribute("income", income);
        modelMap.addAttribute("incomePercent", incomePercent);

        int totalProduct = productsJpaRepo.findTotalProduct(month, year);
        modelMap.addAttribute("totalProduct", totalProduct);

        int soldProduct = orderProductJpaRepo.findSoldProduct(month, year);
        int totalGetProduct = productStorageJpaRepo.findTotalProduct(month, year);
        int productInStock = totalGetProduct - soldProduct;
        modelMap.addAttribute("productInStock", productInStock);

        List<String> totalProductSoldInMonth = categoriesJpaRepo.findSoldProductByCategory(month, year);
        modelMap.addAttribute("totalProductSoldInMonth", totalProductSoldInMonth);

        List<String> getSalaryInYear = orderJpaRepo.getSalaryInYear(year);
        modelMap.addAttribute("getSalaryInYear", getSalaryInYear);

        List<String> getSoldProductInYear = orderProductJpaRepo.getSoldProductInYear(year);
        modelMap.addAttribute("getSoldProductInYear", getSoldProductInYear);

        return adminPage+"index";
    }

}
