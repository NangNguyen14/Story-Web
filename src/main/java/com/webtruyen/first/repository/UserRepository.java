package com.webtruyen.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
