package com.webtruyen.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

    List<Tag> findByStories_Id(Long storyId);
    
}
