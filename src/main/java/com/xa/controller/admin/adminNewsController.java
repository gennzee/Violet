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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
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
        if(!thumbImage.isEmpty()){
            fileUploaderService.uploadFile(request, thumbImage);
            news.setThumbImage(fileUploaderService.getImageName());
        }
        if(!contentImage.isEmpty()){
            fileUploaderService.uploadFile(request, contentImage);
            news.setContentImage(fileUploaderService.getImageName());
        }
        news.setContent(m.get("content"));
        news.setUserId(user.getId());
        news.setCreatedDate(new Date());
        news.setUpdatedDate(new Date());

        News n = newsJpaRepo.save(news);

        return "redirect:/newsManagement";
    }


    @GetMapping(value = {"/deleteNews/{id}"})
    public String deleteNews(HttpServletRequest request, @PathVariable int id){
        String referer = request.getHeader("Referer");

        News news = newsJpaRepo.findById(id);
        fileUploaderService.deleteFile(request, news.getThumbImage());
        fileUploaderService.deleteFile(request, news.getContentImage());
        newsJpaRepo.delete(news);

        return "redirect:"+referer;
    }

    @PostMapping(value = {"/updateNews"})
    @Transactional
    public String updateNews(HttpServletRequest request, HttpSession session, @RequestParam Map<String, String> m, @RequestParam("thumb_image") MultipartFile thumbImage, @RequestParam("content_image") MultipartFile contentImage){
        String referer = request.getHeader("Referer");
        Users users = (Users) session.getAttribute("user");

        String thumbImageFileName = "";
        String contentImageFileName = "";
        if(!thumbImage.isEmpty() || !contentImage.isEmpty()){
            News news = newsJpaRepo.findById(Integer.parseInt(m.get("id")));
            if(!thumbImage.isEmpty() && !contentImage.isEmpty()){
                fileUploaderService.deleteFile(request, news.getThumbImage());
                fileUploaderService.uploadFile(request, thumbImage);
                thumbImageFileName = fileUploaderService.getImageName();
                fileUploaderService.deleteFile(request, news.getContentImage());
                fileUploaderService.uploadFile(request, contentImage);
                contentImageFileName = fileUploaderService.getImageName();
            }else if(!thumbImage.isEmpty()){
                fileUploaderService.deleteFile(request, news.getThumbImage());
                fileUploaderService.uploadFile(request, thumbImage);
                thumbImageFileName = fileUploaderService.getImageName();
            }else{
                fileUploaderService.deleteFile(request, news.getContentImage());
                fileUploaderService.uploadFile(request, contentImage);
                contentImageFileName = fileUploaderService.getImageName();
            }
        }
        newsJpaRepo.updateNews(Integer.parseInt(m.get("category")), m.get("title"), thumbImageFileName, contentImageFileName, m.get("content"), users.getId(), new Date(), Integer.parseInt(m.get("id")));

        return "redirect:"+referer;
    }

}
