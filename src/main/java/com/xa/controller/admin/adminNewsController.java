package com.xa.controller.admin;

import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.News;
import com.xa.model.Users;
import com.xa.repository.NewsJpaRepo;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.xa.service.ConstVariables.adminPage;

/**
 * Created by genn on 6/20/20.
 */
@Controller
public class adminNewsController {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private NewsJpaRepo newsJpaRepo;

    @Autowired
    private FileUploaderService fileUploaderService;


    @GetMapping(value = "/newsManagement")
    public String newsManagement(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<News> newsList = newsJpaRepo.findAll();
        modelMap.addAttribute("newsList", newsList);

        return adminPage + "news";
    }

    @PostMapping(value = "/addNews")
    public String addNews(@RequestParam Map<String,String> m, @RequestParam("thumb_image") MultipartFile thumbImage, @RequestParam("content_image") MultipartFile contentImage, HttpServletRequest request, HttpSession session){
        Users user = (Users) session.getAttribute("user");

        News news = new News();
        news.setCategoryId(Integer.valueOf(m.get("category")));
        news.setName(m.get("title"));
        fileUploaderService.uploadFile(request, thumbImage);
        news.setThumbImage(fileUploaderService.getImageName());
        fileUploaderService.uploadFile(request, contentImage);
        news.setContentImage(fileUploaderService.getImageName());
        news.setContent(m.get("content"));
        news.setUserId(user.getId());
        news.setCreatedDate(new Date());
        news.setUpdatedDate(new Date());

        News n = newsJpaRepo.save(news);

        return "redirect:/newsManagement";
    }

}
