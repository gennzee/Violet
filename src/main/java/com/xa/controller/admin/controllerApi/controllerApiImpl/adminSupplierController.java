package com.xa.controller.admin.controllerApi.controllerApiImpl;

import com.xa.controller.admin.controllerApi.adminSupplierApi;
import com.xa.controller.admin.controllerService.adminSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.transaction.Transactional;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by genn on 6/28/20.
 */
@Component
public class adminSupplierController implements adminSupplierApi {

    @Autowired
    private adminSupplierService adminSupplierService;

    @Override
    public String supplierManagement(ModelMap modelMap){
        adminSupplierService.getAllSupplier(modelMap);
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
