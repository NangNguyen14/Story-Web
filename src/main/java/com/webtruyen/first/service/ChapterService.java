package com.webtruyen.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtruyen.first.entity.Chapter;
import com.webtruyen.first.enums.ChapterStatus;
import com.webtruyen.first.repository.ChapterRepository;

@Service
public class ChapterService {
    @Autowired
    private ChapterRepository chapterRepository;

    public Chapter getChapterById(Long id) {
        return chapterRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Chapter not found"));
    }
    public Chapter createChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }
    public Chapter updateChapter(Long id, Chapter updatedChapter) {
        Chapter chapter = getChapterById(id);
        chapter.setTitle(updatedChapter.getTitle());
        chapter.setContent(updatedChapter.getContent());
        return chapterRepository.save(chapter);
    }
    public void deleteChapter(Long id) {
        Chapter chapter = getChapterById(id);
        chapter.setStatus(ChapterStatus.DELETED);
        chapterRepository.save(chapter);
    }
    public void hideChapter(Long id) {
        Chapter chapter = getChapterById(id);
        chapter.setStatus(ChapterStatus.HIDDEN);
        chapterRepository.save(chapter);
    }

}
