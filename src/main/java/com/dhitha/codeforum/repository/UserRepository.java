package com.dhitha.codeforum.repository;

import com.dhitha.codeforum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

  /**
   * Find user by login id
   * @param loginId login id of the user
   * @return User
   */
  User findByLoginId(String loginId);

}
