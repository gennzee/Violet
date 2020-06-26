package com.xa.repository;

import com.xa.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 08/06/2020.
 */
@Repository
public interface OrderJpaRepo extends JpaRepository<Order, Integer> {

    List<Order> findAllByUserIdOrderByIdDesc(int id);

    Order findById(int id);

    @Query(value = "select month(orr.order_date), sum(o.quantity * o.price)\n" +
            "from orderr orr\n" +
            "inner join order_product o on o.order_id = orr.id\n" +
            "where year(orr.order_date) = ?1\n" +
            "group by month(orr.order_date)", nativeQuery = true)
    List<String> getSalaryInYear(int year);

}
