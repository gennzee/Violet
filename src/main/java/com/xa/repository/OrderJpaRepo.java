package com.xa.repository;

import com.xa.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
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

}
