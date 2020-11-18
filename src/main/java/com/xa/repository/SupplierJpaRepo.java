package com.xa.repository;

import com.xa.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

/**
 * Created by genn on 6/28/20.
 */
public interface SupplierJpaRepo extends JpaRepository<Supplier, Integer> {

    @Modifying
    @Query(value = "update Supplier s set s.name = ?1, s.email = ?2, s.phone = ?3, s.address = ?4, s.updatedDate = ?5 where s.id = ?6")
    void updateSupplier(String name, String email, String phone, String address, Date date, int id);

}
