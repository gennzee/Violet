package com.xa.controller.admin;

import com.xa.model.Supplier;
import com.xa.repository.SupplierJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by genn on 6/28/20.
 */
@Controller
public class adminSupplierController {

    @Autowired
    private SupplierJpaRepo supplierJpaRepo;

    @GetMapping(value = {"/supplierManagement"})
    public String supplierManagement(ModelMap modelMap){

        List<Supplier> supplierList = supplierJpaRepo.findAll();
        modelMap.addAttribute("supplierList", supplierList);

        return adminPage+"supplier";
    }

    @PostMapping(value = {"/updateSupplier"})
    @Transactional
    public String updateSupplier(@RequestParam Map<String, String> m){

        supplierJpaRepo.updateSupplier(m.get("name"), m.get("email"), m.get("phone"), m.get("address"), new Date(), Integer.valueOf(m.get("id")));

        return "redirect:/supplierManagement";
    }

    @PostMapping(value = {"/addSupplier"})
    public String addSupplier(@RequestParam Map<String, String> m){

        Supplier supplier = new Supplier(m.get("name"), m.get("email"), m.get("phone"), m.get("address"), new Date(), null);
        supplierJpaRepo.save(supplier);

        return "redirect:/supplierManagement";
    }

    @GetMapping(value = {"/deleteSupplier/{id}"})
    public String deleteSupplier(@PathVariable int id){

        supplierJpaRepo.deleteById(id);

        return "redirect:/supplierManagement";
    }

}
