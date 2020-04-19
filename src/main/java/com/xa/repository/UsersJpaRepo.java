package com.xa.repository;

import com.xa.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

/**
 * Created by anhnx on 19/04/2020.
 */
@Component
public interface UsersJpaRepo extends JpaRepository<Users, Integer>{

    //for login api
    Users findByUsernameAndPassword(String username, String password);

}
