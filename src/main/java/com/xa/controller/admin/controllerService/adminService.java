package com.xa.controller.admin.controllerService;

import org.springframework.ui.ModelMap;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface adminService {

    void getTotalUserRegisteredInMonth(ModelMap modalMap, int year, int month, int lastMonth);

    void compareIncomeInCurrentMonthAndLastMonth(ModelMap modalMap, int year, int month, int lastMonth);

    void getTotalProduct(ModelMap modalMap, int month, int year);

    void getTotalProductSoldInMonth(ModelMap modalMap, int month, int year);

    void getSalaryInYear(ModelMap modelMap, int year);

    void getSoldProductInYear(ModelMap modelMap, int year);

    void getRemainProductInStock(ModelMap modalMap, int month, int year);
}
