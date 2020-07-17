package com.xa.controller.admin.controllerService.controllerServiceImpl;

import com.xa.controller.admin.controllerService.adminSupplierService;
import com.xa.model.Supplier;
import com.xa.repository.SupplierJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminSupplierServiceImpl implements adminSupplierService {

    @Autowired
    private SupplierJpaRepo supplierJpaRepo;

    @Override
    public void addSupplier(Map<String, String> m) {
        Supplier supplier = new Supplier(m.get("name"), m.get("email"), m.get("phone"), m.get("address"), new Date(), null);
        supplierJpaRepo.save(supplier);
    }

    @Override
    public void getAllSupplier(ModelMap modelMap) {
        List<Supplier> supplierList = supplierJpaRepo.findAll();
        modelMap.addAttribute("supplierList", supplierList);
    }

    @Override
    public void updateSupplier(Map<String, String> m) {
        supplierJpaRepo.updateSupplier(m.get("name"), m.get("email"), m.get("phone"), m.get("address"), new Date(), Integer.valueOf(m.get("id")));
    }

    @Override
    public void deleteSupplier(int id) {
        supplierJpaRepo.deleteById(id);
    }
}
