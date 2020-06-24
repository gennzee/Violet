package com.xa.repository;

import com.xa.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by anhnx on 06/05/2020.
 */
@Repository
public interface CategoriesJpaRepo extends JpaRepository<Categories, Integer> {

    Categories findById(int id);

}
