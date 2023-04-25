package com.app.loginpage.repo;

import com.app.loginpage.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    @Query( "select u from Users u where u.userId = :userId")
    Users findByUserId(@Param("userId") String userId);

}
