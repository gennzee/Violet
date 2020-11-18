package com.xa.repository;

import com.xa.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by genn on 6/20/20.
 */
@Repository
public interface ReviewJpaRepo extends JpaRepository<Review, Integer> {

    List<Review> findAllByProductId(int productId);

}
