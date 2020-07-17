package com.xa.controller.admin.controllerApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminSupplierApi {

    @GetMapping(value = {"/supplierManagement"})
    String supplierManagement(ModelMap modelMap);

    @PostMapping(value = {"/updateSupplier"})
    String updateSupplier(@RequestParam Map<String, String> m);

    @PostMapping(value = {"/addSupplier"})
    String addSupplier(@RequestParam Map<String, String> m);

    @GetMapping(value = {"/deleteSupplier/{id}"})
    String deleteSupplier(@PathVariable int id);

}
