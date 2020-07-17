package com.xa.repository;

import com.xa.model.ProductHeight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 06/07/2020.
 */
@Repository
public interface ProductHeightJpaRepo extends JpaRepository<ProductHeight, Integer>{

    List<ProductHeight> findAllByCategoryId(int categoryId);

}
