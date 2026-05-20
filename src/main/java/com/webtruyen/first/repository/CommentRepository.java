package com.webtruyen.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByChapterIdAndDeletedFalse(Long chapterId);
    
}
