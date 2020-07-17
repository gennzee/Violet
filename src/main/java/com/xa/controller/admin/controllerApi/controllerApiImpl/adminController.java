package com.xa.controller.admin.controllerApi.controllerApiImpl;

import com.xa.controller.admin.controllerApi.adminApi;
import com.xa.controller.admin.controllerService.adminService;
import com.xa.controller.commonService.commonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by anhnx on 19/04/2020.
 */
@Component
public class adminController implements adminApi {

    @Autowired
    private commonService commonService;

    @Autowired
    private adminService adminService;

    @Override
    public String index(ModelMap modelMap, HttpSession session){
        commonService.initCategory(session);

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        LocalDate localDate2 = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int lastMonth = localDate2.getMonthValue();

        adminService.getTotalUserRegisteredInMonth(modelMap, year, month, lastMonth);

        adminService.compareIncomeInCurrentMonthAndLastMonth(modelMap, year, month, lastMonth);

        adminService.getTotalProduct(modelMap, month, year);

        adminService.getRemainProductInStock(modelMap, month, year);

        adminService.getTotalProductSoldInMonth(modelMap, month, year);

        adminService.getSalaryInYear(modelMap, year);

        adminService.getSoldProductInYear(modelMap, year);

        return adminPage+"index";
    }

}
