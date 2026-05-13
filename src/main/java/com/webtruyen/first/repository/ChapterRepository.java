package com.webtruyen.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    
}
