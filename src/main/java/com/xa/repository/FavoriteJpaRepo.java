package com.xa.repository;

import com.xa.model.Favorite;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anhnx on 28/05/2020.
 */
@Component
public interface FavoriteJpaRepo extends JpaRepository<Favorite, Integer> {

    List<Favorite> findAllByUserId(int id, Pageable pageable);

    int countByUserId(int userId);

}
