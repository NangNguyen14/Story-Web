package com.webtruyen.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
    
}
