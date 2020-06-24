package com.xa.repository;

import com.xa.model.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 19/06/2020.
 */
@Repository
public interface ProductColorJpaRepo extends JpaRepository<ProductColor, Integer> {

    List<ProductColor> findAllByCategoryId(int categoryId);

}
