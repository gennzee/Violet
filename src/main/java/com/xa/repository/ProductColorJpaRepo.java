package com.xa.repository;

import com.xa.model.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 19/06/2020.
 */
@Repository
public interface ProductColorJpaRepo extends JpaRepository<ProductColor, Integer> {

    List<ProductColor> findAllByCategoryId(int categoryId);

    @Modifying
    @Query(value = "update ProductColor c set c.hex = ?3, c.name = ?2 where c.id = ?1")
    void updateColor(int id, String name, String hex);

}
