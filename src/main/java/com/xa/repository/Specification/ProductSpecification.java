package com.xa.repository.Specification;

import com.xa.model.ProductStorage;
import com.xa.model.Products;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.*;

/**
 * Created by anhnx on 19/06/2020.
 */
public class ProductSpecification {

    public static Specification<Products> hasCategoryId(int id){
        return new Specification<Products>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<Products> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("categoryId"), id);
            }
        };
    }

    public static Specification<Products> hasPrice(float price){
        return new Specification<Products>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<Products> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Join<Products, ProductStorage> prodDetail = root.join("productStorageList");
                criteriaQuery.groupBy(root.get("id"));
                return criteriaBuilder.lessThanOrEqualTo(prodDetail.get("price"), price);
            }
        };
    }

}
