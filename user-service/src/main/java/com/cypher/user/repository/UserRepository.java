package com.cypher.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cypher.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
