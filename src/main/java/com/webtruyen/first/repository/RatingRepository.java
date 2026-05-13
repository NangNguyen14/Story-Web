package com.webtruyen.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtruyen.first.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    List<Rating> findByStoryId(Long storyId);
    
}
