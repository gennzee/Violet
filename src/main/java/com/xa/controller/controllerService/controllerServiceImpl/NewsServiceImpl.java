package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.NewsService;
import com.xa.model.Comments;
import com.xa.model.News;
import com.xa.model.Users;
import com.xa.repository.CommentJpaRepo;
import com.xa.repository.NewsJpaRepo;
import com.xa.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
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
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsJpaRepo newsJpaRepo;

    @Autowired
    private CommentJpaRepo commentJpaRepo;

    @Autowired
    private FileUploaderService fileUploaderService;

    @Override
    public List<News> findAll() {
        return newsJpaRepo.findAll();
    }

    @Override
    public Page<News> getNewsWithPagination(PageRequest pageRequest) {
        return newsJpaRepo.findAll(pageRequest);
    }

    @Override
    public News getNewById(int id) {
        return newsJpaRepo.findById(id);
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

    @Override
    public void addComment(HttpServletRequest request) {

        Comments comments = new Comments();
        comments.setNewId(Integer.valueOf(request.getParameter("blogId")));
        comments.setName(request.getParameter("name"));
        comments.setEmail(request.getParameter("email"));
        comments.setMobileNumber(request.getParameter("mobileNumber"));
        comments.setComment(request.getParameter("comment"));
        comments.setCreatedDate(new Date());

        commentJpaRepo.save(comments);
    }
}
