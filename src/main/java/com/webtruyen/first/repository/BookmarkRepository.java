package com.webtruyen.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    
}
