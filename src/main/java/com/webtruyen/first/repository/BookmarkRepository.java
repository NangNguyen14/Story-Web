package com.webtruyen.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    List<Bookmark> findByUserId(Long userId);

}
