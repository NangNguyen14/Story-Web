package com.webtruyen.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtruyen.first.entity.Story;
import com.webtruyen.first.enums.StoryStatus;
import com.webtruyen.first.repository.StoryRepository;

@Service
public class StoryService {
    @Autowired
    private StoryRepository storyRepository;

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }
    public Story getStoryById(Long id) {
        return storyRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Story not found"));
    }
    public Story createStory(Story story) {
        story.setStatus(StoryStatus.ONGOING);
        return storyRepository.save(story);
    }
    public Story updateStory(Long id, Story updatedStory) {
        Story story = getStoryById(id);
        story.setTitle(updatedStory.getTitle());
        story.setDescription(updatedStory.getDescription());
        story.setAuthor(updatedStory.getAuthor());
        story.setStatus(updatedStory.getStatus());
        return storyRepository.save(story);
    }
    public void deleteStory(Long id) {
        Story story = getStoryById(id);
         story.setStatus(StoryStatus.DELETED);
        storyRepository.save(story);
    }
    public void hideStory(Long id) {
    Story story = getStoryById(id);
    story.setStatus(StoryStatus.HIDDEN);
    storyRepository.save(story);
    
}
}
