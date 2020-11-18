package com.xa.controller.controllerService;

import com.xa.model.Supplier;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface SupplierService {

    void addSupplier(Map<String, String> m);

    List<Supplier> getAllSupplier();

    void updateSupplier(Map<String, String> m);

    void deleteSupplier(int id);

}
