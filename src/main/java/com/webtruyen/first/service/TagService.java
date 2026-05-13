package com.webtruyen.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtruyen.first.entity.Tag;
import com.webtruyen.first.repository.TagRepository;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public Tag getTagById(Long id) {
        return tagRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Tag not found"));
    }
    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }
    public Tag updateTag(Long id, Tag updatedTag) {
        Tag tag = getTagById(id);
        tag.setName(updatedTag.getName());
        return tagRepository.save(tag);
    }
    public void deleteTag(Long id) {
        Tag tag = getTagById(id);
        tagRepository.delete(tag);
    }
    public List<Tag> getAllTags() {
    return tagRepository.findAll();
}
}
