package com.xa.repository;

import com.xa.model.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by anhnx on 19/06/2020.
 */
@Component
public interface ProductSizeJpaRepo extends JpaRepository<ProductSize, Integer> {
}
