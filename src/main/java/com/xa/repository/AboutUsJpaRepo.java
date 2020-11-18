package com.xa.repository;

import com.xa.model.AboutUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by anhnx on 20/05/2020.
 */
@Repository
public interface AboutUsJpaRepo extends JpaRepository<AboutUs, Integer>{

    AboutUs findFirstByOrderByIdDesc();

}
