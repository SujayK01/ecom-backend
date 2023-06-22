package com.oceans.ecombackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceans.ecombackend.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
