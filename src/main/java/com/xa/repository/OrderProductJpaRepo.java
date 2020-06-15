package com.xa.repository;

import com.xa.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anhnx on 08/06/2020.
 */
@Component
public interface OrderProductJpaRepo extends JpaRepository<OrderProduct, Integer> {

    List<OrderProduct> findAllByOrderId(int id);
}
