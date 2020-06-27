package com.xa.repository;

import com.xa.model.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by anhnx on 05/05/2020.
 */
@Repository
public interface ProductsJpaRepo extends JpaRepository<Products, Integer>, JpaSpecificationExecutor<Products> {

    Products findById(int id);

    List<Products> findAllByCategoryId(int categoryid);

    int countByCategoryId(int id);

    List<Products> findAllByUpdatedDateAfter(Date date, Pageable pageable);

    @Query(value = "select count(*) from products where month(created_date) = ?1 and year(created_date) = ?2", nativeQuery = true)
    int findTotalProduct(int month, int year);

}
