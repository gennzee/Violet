package com.xa.repository;

import com.xa.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by genn on 6/20/20.
 */
@Repository
public interface NewsJpaRepo extends JpaRepository<News, Integer> {

    News findById(int id);

    @Modifying
    @Query(value = "update News n set " +
            "n.categoryId = ?1, " +
            "n.name = ?2, " +
            "n.thumbImage = case when (?3 = '' or ?3 is null) then n.thumbImage else ?3 end, " +
            "n.contentImage = case when (?4 = '' or ?4 is null) then n.contentImage else ?4 end, " +
            "n.content = ?5, " +
            "n.userId = ?6, " +
            "n.updatedDate = ?7 " +
            "where n.id = ?8")
    void updateNews(int categoryId, String name, String thumbImage, String contentImage, String content, int userId, Date updatedDate, int newId);
}
