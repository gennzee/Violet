package com.xa.controller.admin.controllerService;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface adminNewsService {

    void findAll(HttpSession session, ModelMap modelMap);

    void addNews(Map<String,String> m, MultipartFile thumbImage, MultipartFile contentImage, HttpServletRequest request, HttpSession session);

    void deleteNews(HttpServletRequest request, int id);

    void updateNews(HttpServletRequest request, HttpSession session, Map<String, String> m, MultipartFile thumbImage, MultipartFile contentImage);

}
