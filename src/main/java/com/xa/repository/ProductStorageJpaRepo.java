package com.xa.repository;

import com.xa.model.ProductStorage;
import com.xa.model.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anhnx on 12/05/2020.
 */
@Component
public interface ProductStorageJpaRepo extends JpaRepository<ProductStorage, Integer> {

    ProductStorage findByProductIdAndColorIdAndSizeId(int id, int colorId, int sizeId);

}
