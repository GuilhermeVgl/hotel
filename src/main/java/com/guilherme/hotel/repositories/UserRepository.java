package com.guilherme.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.hotel.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByEmail(String email);
}
