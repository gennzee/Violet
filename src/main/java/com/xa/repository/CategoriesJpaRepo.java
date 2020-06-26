package com.xa.repository;

import com.xa.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by anhnx on 06/05/2020.
 */
@Repository
public interface CategoriesJpaRepo extends JpaRepository<Categories, Integer> {

    Categories findById(int id);

    @Query(value = "select c.name, sum(o.quantity), c.color_mark\n" +
            "from categories c\n" +
            "inner join products p on p.category_id = c.id\n" +
            "inner join product_storage ps on ps.product_id = p.id\n" +
            "inner join order_product o on o.product_storage_id = ps.id\n" +
            "inner join orderr orr on orr.id = o.order_id\n" +
            "where month(orr.order_date) = ?1 and year(orr.order_date) = ?2\n" +
            "group by c.id", nativeQuery = true)
    List<String> findSoldProductByCategory(int month, int year);

}
