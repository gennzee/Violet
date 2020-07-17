package com.xa.controller.admin.controllerApi.controllerApiImpl;

import com.xa.controller.admin.controllerApi.adminNewsApi;
import com.xa.controller.admin.controllerService.adminNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by genn on 6/20/20.
 */
@Component
public class adminNewsController implements adminNewsApi {

    @Autowired
    private adminNewsService adminNewsService;

    @Override
    public String newsManagement(HttpSession session, ModelMap modelMap){
        adminNewsService.findAll(session, modelMap);

        return adminPage + "news";
    }

    @Override
    public String addNews(Map<String,String> m, MultipartFile thumbImage, MultipartFile contentImage, HttpServletRequest request, HttpSession session){
        adminNewsService.addNews(m, thumbImage, contentImage, request, session);

        return "redirect:/newsManagement";
    }

    @Override
    public String deleteNews(HttpServletRequest request, int id){
        String referer = request.getHeader("Referer");

        adminNewsService.deleteNews(request, id);
        return "redirect:"+referer;
    }

    @Override
    @Transactional
    public String updateNews(HttpServletRequest request, HttpSession session, Map<String, String> m, MultipartFile thumbImage, MultipartFile contentImage){
        String referer = request.getHeader("Referer");

        adminNewsService.updateNews(request, session, m, thumbImage, contentImage);
        return "redirect:"+referer;
    }

}
