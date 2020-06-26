package com.xa.repository;

import com.xa.model.ProductStorage;
import com.xa.model.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
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

    ProductStorage findByProductIdAndColorIdAndSizeId(int id, int colorId, int sizeId);

    @Query(value = "select (sum(o.quantity)*ps.price) as total\n" +
            "from product_storage ps\n" +
            "inner join products p on p.id = ps.product_id\n" +
            "inner join order_product o on o.product_storage_id = ps.id\n" +
            "inner join orderr orr on orr.id = o.order_id\n" +
            "where month(orr.order_date) = ?1 and year(orr.order_date) = ?2\n" +
            "GROUP BY ps.id", nativeQuery = true)
    List<Integer> findIncomeInMonth(int month, int year);

    @Query(value = "select sum(ps.quantity) as totalProduct \n" +
            "from product_storage ps\n" +
            "inner join products p on p.id = ps.product_id\n" +
            "where month(p.created_date) = ?1 and year(p.created_date) = ?2", nativeQuery = true)
    int findTotalProduct(int month, int year);
}
