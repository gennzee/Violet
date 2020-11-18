package com.xa.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Controller
public interface adminNewsApi {

    @GetMapping(value = "/newsManagement")
    String newsManagement(HttpSession session, ModelMap modelMap);

    @PostMapping(value = "/addNews")
    String addNews(@RequestParam Map<String,String> m, @RequestParam("thumb_image") MultipartFile thumbImage, @RequestParam("content_image") MultipartFile contentImage, HttpServletRequest request, HttpSession session);

    @GetMapping(value = {"/deleteNews/{id}"})
    String deleteNews(HttpServletRequest request, @PathVariable int id);

    @PostMapping(value = {"/updateNews"})
    String updateNews(HttpServletRequest request, HttpSession session, @RequestParam Map<String, String> m, @RequestParam("thumb_image") MultipartFile thumbImage, @RequestParam("content_image") MultipartFile contentImage);

}
