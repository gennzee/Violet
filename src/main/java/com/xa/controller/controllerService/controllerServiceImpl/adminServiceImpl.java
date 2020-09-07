package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.adminService;
import com.xa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminServiceImpl implements adminService {

    @Autowired
    private UsersJpaRepo usersJpaRepo;

    @Autowired
    private ProductStorageJpaRepo productStorageJpaRepo;

    @Autowired
    private ProductsJpaRepo productsJpaRepo;

    @Autowired
    private CategoriesJpaRepo categoriesJpaRepo;

    @Autowired
    private OrderJpaRepo orderJpaRepo;

    @Autowired
    private OrderProductJpaRepo orderProductJpaRepo;

    @Override
    public void getTotalUserRegisteredInMonth(ModelMap modalMap, int year, int month, int lastMonth) {
        int totalUser = usersJpaRepo.findTotalUser(year, month);
        int totalUserLastMonth = usersJpaRepo.findTotalUser(year, lastMonth);
        float userPercent = (totalUserLastMonth == 0) ? 0 : ((totalUser - totalUserLastMonth) * 100) / totalUserLastMonth;
        modalMap.addAttribute("totalUser", totalUser);
        modalMap.addAttribute("userPercent", userPercent);
    }

    @Override
    public void compareIncomeInCurrentMonthAndLastMonth(ModelMap modalMap, int year, int month, int lastMonth) {
        List<Integer> incomeList = productStorageJpaRepo.findIncomeInMonth(month, year);
        List<Integer> incomeListLastMonth = productStorageJpaRepo.findIncomeInMonth(lastMonth, year);
        int income = (incomeList != null && incomeList.get(0) != null) ? incomeList.stream().reduce(0, Integer::sum) : 0;
        int incomeLastMonth =(incomeListLastMonth != null && incomeListLastMonth.get(0) != null) ? incomeListLastMonth.stream().reduce(0, Integer::sum) : 0;
        float incomePercent = (incomeLastMonth == 0) ? 0 : ((income - incomeLastMonth) * 100) / incomeLastMonth;
        modalMap.addAttribute("income", income);
        modalMap.addAttribute("incomePercent", incomePercent);
    }

    @Override
    public void getTotalProduct(ModelMap modalMap, int month, int year) {
        int totalProduct = productsJpaRepo.findTotalProduct(month, year);
        modalMap.addAttribute("totalProduct", totalProduct);
    }

    @Override
    public void getTotalProductSoldInMonth(ModelMap modelMap, int month, int year) {
        List<String> totalProductSoldInMonth = categoriesJpaRepo.findSoldProductByCategory(month, year);
        if(totalProductSoldInMonth.isEmpty() || totalProductSoldInMonth.size() == 0){
            totalProductSoldInMonth = categoriesJpaRepo.getSoldProductForNewMonth(month, year);
        }
        modelMap.addAttribute("totalProductSoldInMonth", totalProductSoldInMonth);
    }

    @Override
    public void getSalaryInYear(ModelMap modelMap, int year) {
        List<String> getSalaryInYear = orderJpaRepo.getSalaryInYear(year);
        modelMap.addAttribute("getSalaryInYear", getSalaryInYear);
    }

    @Override
    public void getSoldProductInYear(ModelMap modelMap, int year) {
        List<String> getSoldProductInYear = orderProductJpaRepo.getSoldProductInYear(year);
        modelMap.addAttribute("getSoldProductInYear", getSoldProductInYear);
    }

    @Override
    public void getRemainProductInStock(ModelMap modalMap, int month, int year) {
        String getSoldProductAsStringToAvoidNull = orderProductJpaRepo.findSoldProduct(month, year);
        int soldProduct = (getSoldProductAsStringToAvoidNull != null) ? Integer.parseInt(getSoldProductAsStringToAvoidNull) : 0 ;
        String getTotalGetProductAsStringToAvoidNull = productStorageJpaRepo.findTotalProduct();
        int totalGetProduct = (getTotalGetProductAsStringToAvoidNull != null) ? Integer.parseInt(getTotalGetProductAsStringToAvoidNull) : 0 ;
        int productInStock = totalGetProduct - soldProduct;
        modalMap.addAttribute("productInStock", productInStock);
    }

}
