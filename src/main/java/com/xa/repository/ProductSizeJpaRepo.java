package com.xa.repository;

import com.xa.model.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 19/06/2020.
 */
@Repository
public interface ProductSizeJpaRepo extends JpaRepository<ProductSize, Integer> {

    List<ProductSize> findAllByCategoryId(int categoryId);

    @Modifying
    @Query("update ProductSize s set s.name = ?2 where s.id = ?1")
    void updateSize(int id, String name);

}
