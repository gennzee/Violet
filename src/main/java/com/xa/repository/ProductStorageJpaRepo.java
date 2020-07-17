package com.xa.repository;

import com.xa.model.ProductStorage;
import com.xa.model.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 12/05/2020.
 */
@Repository
public interface ProductStorageJpaRepo extends JpaRepository<ProductStorage, Integer> {

    @Modifying
    @Query(value = "update ProductStorage ps set ps.quantity = ?1, ps.price = ?3, ps.discount = ?4 where ps.id = ?2")
    int updateProductDetail(int quantity, int productStorageId, float price, float discount);

    List<ProductStorage> findAllByProductId(int productId);

    ProductStorage findByProductIdAndColorIdAndSizeIdAndHeightId(int id, int colorId, int sizeId, int height);

    @Query(value = "select sum(total) total\n" +
            "from orderr\n" +
            "where month(order_date) = ?1 and year(order_date) = ?2", nativeQuery = true)
    List<Integer> findIncomeInMonth(int month, int year);

    @Query(value = "select sum(ps.quantity) totalProduct \n" +
            "from product_storage ps\n" +
            "inner join products p on p.id = ps.product_id", nativeQuery = true)
    String findTotalProduct();
}
