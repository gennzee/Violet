package com.xa.repository;

import com.xa.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by anhnx on 19/04/2020.
 */
@Repository
public interface UsersJpaRepo extends JpaRepository<Users, Integer>{

    //for login api
    Users findByUsernameAndPassword(String username, String password);

    //for register api
    Users findByUsername(String username);

    @Query(value = "select count(*) as totalUser from users where year(created_date) = ?1 and month(created_date) = ?2", nativeQuery = true)
    int findTotalUser(int year, int month);

}
