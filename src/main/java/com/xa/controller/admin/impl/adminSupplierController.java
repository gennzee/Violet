package com.xa.controller.admin.impl;

import com.xa.controller.admin.adminSupplierApi;
import com.xa.controller.controllerService.SupplierService;
import com.xa.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by genn on 6/28/20.
 */
@Component
public class adminSupplierController implements adminSupplierApi {

    @Autowired
    private SupplierService adminSupplierService;

    @Override
    public String supplierManagement(ModelMap modelMap){
        List<Supplier> supplierList = adminSupplierService.getAllSupplier();
        modelMap.addAttribute("supplierList", supplierList);
        return adminPage+"supplier";
    }

    @Override
    @Transactional
    public String updateSupplier(Map<String, String> m){
        adminSupplierService.updateSupplier(m);
        return "redirect:/supplierManagement";
    }

    @Override
    public String addSupplier(Map<String, String> m){
        adminSupplierService.addSupplier(m);
        return "redirect:/supplierManagement";
    }

    @Override
    public String deleteSupplier(int id){
        adminSupplierService.deleteSupplier(id);
        return "redirect:/supplierManagement";
    }

}
