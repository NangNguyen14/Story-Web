package com.webtruyen.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtruyen.first.entity.Rating;
import com.webtruyen.first.repository.RatingRepository;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public Rating getRatingById(Long id) {
        return ratingRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Rating not found"));
    }
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }
    public Rating updateRating(Long id, Rating updatedRating) {
        Rating rating = getRatingById(id);
        rating.setScore(updatedRating.getScore());
        return ratingRepository.save(rating);
    }
    public void deleteRating(Long id) {
        Rating rating = getRatingById(id);
        ratingRepository.delete(rating);
    }
    public double getAverageRating(Long storyId) {
    List<Rating> ratings = ratingRepository.findByStoryId(storyId);
    return ratings.stream()
        .mapToInt(Rating::getScore)
        .average()
        .orElse(0.0);
    }

}
