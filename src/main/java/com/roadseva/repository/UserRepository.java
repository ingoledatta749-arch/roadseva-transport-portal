package com.roadseva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roadseva.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    boolean existsByMobile(String mobile);

}