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

    @Query(value = "select sum(o.quantity) as soldProduct \n" +
            "from order_product o\n" +
            "inner join orderr orr on orr.id = o.order_id\n" +
            "where month(orr.order_date) = ?1 and year(orr.order_date) = ?2", nativeQuery = true)
    int findSoldProduct(int month, int year);

    @Query(value = "select month(orr.order_date), sum(o.quantity)\n" +
            "from orderr orr\n" +
            "inner join order_product o on o.order_id = orr.id\n" +
            "where year(orr.order_date) = ?1\n" +
            "group by month(orr.order_date)", nativeQuery = true)
    List<String> getSoldProductInYear(int year);

}
