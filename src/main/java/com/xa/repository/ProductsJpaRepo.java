package com.xa.repository;

import com.xa.model.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anhnx on 05/05/2020.
 */
@Component
public interface ProductsJpaRepo extends JpaRepository<Products, Integer>, JpaSpecificationExecutor<Products> {

    Products findById(int id);

    List<Products> findAllByCategoryId(int categoryid, Pageable pageable);

    int countByCategoryId(int id);

}
