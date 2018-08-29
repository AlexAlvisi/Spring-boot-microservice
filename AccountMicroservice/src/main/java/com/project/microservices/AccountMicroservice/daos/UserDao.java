package com.project.microservices.AccountMicroservice.daos;

import com.project.microservices.AccountMicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, String>{
    //custom
    Optional<User> findById(String id);
}
