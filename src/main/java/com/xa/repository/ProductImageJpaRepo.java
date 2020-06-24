package com.xa.repository;

import com.xa.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 19/05/2020.
 */
@Repository
public interface ProductImageJpaRepo extends JpaRepository<ProductImage, Integer> {

    List<ProductImage> findAllByProductId(int id);
}
