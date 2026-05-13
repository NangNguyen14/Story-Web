package com.webtruyen.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
