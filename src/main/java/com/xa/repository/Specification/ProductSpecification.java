package com.xa.repository.Specification;

import com.xa.model.ProductStorage;
import com.xa.model.Products;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.ui.ModelMap;

import javax.persistence.criteria.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 * Created by anhnx on 19/06/2020.
 */
public class ProductSpecification {

    public static Specification<Products> filterConditions(int categoryId, String sortBy, String price1, String price2, String height, String color, String size){
        return new Specification<Products>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<Products> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Join<Products, ProductStorage> prodDetail = root.join("productStorageList");

                final Collection<Predicate> predicates = new ArrayList<>();
                Predicate categoryPredicate = criteriaBuilder.equal(root.get("categoryId"), categoryId);
                predicates.add(categoryPredicate);
                if(sortBy.equalsIgnoreCase("newest")){
                    Date date = new Date();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    calendar.add(Calendar.MONTH, -3);
                    Predicate sortByNewestPredicate = criteriaBuilder.greaterThanOrEqualTo(root.get("createdDate"), calendar.getTime());
                    predicates.add(sortByNewestPredicate);
                }
                if(!(price1.equals("") && price2.equals(""))){
                    Predicate firstPrice = criteriaBuilder.greaterThanOrEqualTo(prodDetail.get("price"), Float.valueOf(price1));
                    Predicate secondPrice = criteriaBuilder.lessThanOrEqualTo(prodDetail.get("price"), Float.valueOf(price2));
                    predicates.add(firstPrice);
                    predicates.add(secondPrice);
                }
                if(!height.equals("")){
                    Predicate colorPredicate = criteriaBuilder.equal(prodDetail.get("heightId"), Integer.valueOf(height));
                    predicates.add(colorPredicate);
                }
                if(!color.equals("")){
                    Predicate colorPredicate = criteriaBuilder.equal(prodDetail.get("colorId"), Integer.valueOf(color));
                    predicates.add(colorPredicate);
                }
                if(!size.equals("")){
                    Predicate sizePredicate = criteriaBuilder.equal(prodDetail.get("sizeId"), Integer.valueOf(size));
                    predicates.add(sizePredicate);
                }
                criteriaQuery.groupBy(prodDetail.get("productId"));
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }

}
