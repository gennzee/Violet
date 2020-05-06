package com.xa.repository;

import com.xa.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by anhnx on 06/05/2020.
 */
@Component
public interface CategoriesJpaRepo extends JpaRepository<Categories, Integer> {

    Categories findById(int id);

}
