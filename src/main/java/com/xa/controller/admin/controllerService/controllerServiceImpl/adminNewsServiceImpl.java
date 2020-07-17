package com.xa.controller.admin.controllerService.controllerServiceImpl;

import com.xa.controller.admin.controllerService.adminNewsService;
import com.xa.interfaces.impl.InitializeSessionImpl;
import com.xa.model.News;
import com.xa.model.Users;
import com.xa.repository.NewsJpaRepo;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
@Service
public class adminNewsServiceImpl implements adminNewsService {

    @Autowired
    private InitializeSessionImpl initializeSession;

    @Autowired
    private NewsJpaRepo newsJpaRepo;

    @Autowired
    private FileUploaderService fileUploaderService;

    @Override
    public void findAll(HttpSession session, ModelMap modelMap) {
        initializeSession.initializeSession(session);

        List<News> newsList = newsJpaRepo.findAll();
        modelMap.addAttribute("newsList", newsList);
    }

    @Override
    public void addNews(Map<String, String> m, MultipartFile thumbImage, MultipartFile contentImage, HttpServletRequest request, HttpSession session) {
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

        newsJpaRepo.save(news);
    }

    @Override
    public void deleteNews(HttpServletRequest request, int id) {
        News news = newsJpaRepo.findById(id);
        fileUploaderService.deleteFile(request, news.getThumbImage());
        fileUploaderService.deleteFile(request, news.getContentImage());
        newsJpaRepo.delete(news);
    }

    @Override
    public void updateNews(HttpServletRequest request, HttpSession session, Map<String, String> m, MultipartFile thumbImage, MultipartFile contentImage) {
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
    }
}
