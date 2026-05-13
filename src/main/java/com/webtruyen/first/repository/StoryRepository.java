package com.webtruyen.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Story;

public interface StoryRepository extends JpaRepository<Story, Long> {

    
    
}
