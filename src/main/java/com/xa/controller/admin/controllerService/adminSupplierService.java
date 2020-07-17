package com.xa.controller.admin.controllerService;

import org.springframework.ui.ModelMap;

import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface adminSupplierService {

    void addSupplier(Map<String, String> m);

    void getAllSupplier(ModelMap modelMap);

    void updateSupplier(Map<String, String> m);

    void deleteSupplier(int id);

}
