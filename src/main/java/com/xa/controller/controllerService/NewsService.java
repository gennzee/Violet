package com.xa.controller.controllerService;

import com.xa.model.Comments;
import com.xa.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 17/07/2020.
 */
public interface NewsService {

    List<News> findAll();

    Page<News> getNewsWithPagination(PageRequest pageRequest);

    News getNewById(int id);

    void addNews(Map<String,String> m, MultipartFile thumbImage, MultipartFile contentImage, HttpServletRequest request, HttpSession session);

    void deleteNews(HttpServletRequest request, int id);

    void updateNews(HttpServletRequest request, HttpSession session, Map<String, String> m, MultipartFile thumbImage, MultipartFile contentImage);

    void addComment(HttpServletRequest request);

}
