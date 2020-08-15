package com.home.thewalkingdogs.repository;

import com.home.thewalkingdogs.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User findByName(String userName);
}
