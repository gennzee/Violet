package com.xa.repository;

import com.xa.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 08/06/2020.
 */
@Repository
public interface OrderProductJpaRepo extends JpaRepository<OrderProduct, Integer> {

    List<OrderProduct> findAllByOrderId(int id);

    @Query(value = "select sum(quantity) as soldProduct from order_product;", nativeQuery = true)
    int findSoldProduct(int month, int year);

}
