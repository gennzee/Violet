package com.xa.repository;

import com.xa.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by anhnx on 19/04/2020.
 */
@Repository
public interface UsersJpaRepo extends JpaRepository<Users, Integer>{

    //for login api
    Users findByUsernameAndPassword(String username, String password);

}
