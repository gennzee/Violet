package com.xa.controller.controllerService;

import com.xa.model.Products;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by anhnx on 22/07/2020.
 */
public interface shopService {

    List<Products> initIndex(HttpSession session, ModelMap modelMap);

}
