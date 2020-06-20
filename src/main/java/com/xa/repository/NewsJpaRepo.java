package com.xa.repository;

import com.xa.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by genn on 6/20/20.
 */
@Component
public interface NewsJpaRepo extends JpaRepository<News, Integer> {

    News findById(int id);

}
