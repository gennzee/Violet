package com.xa.repository;

import com.xa.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by anhnx on 24/06/2020.
 */
@Repository
public interface CommentJpaRepo extends JpaRepository<Comments, Integer>{
}
