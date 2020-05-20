package com.xa.repository;

import com.xa.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by anhnx on 20/05/2020.
 */
@Component
public interface ContactJpaRepo extends JpaRepository<Contact, Integer> {

    Contact findFirstByOrderByIdDesc();

}
