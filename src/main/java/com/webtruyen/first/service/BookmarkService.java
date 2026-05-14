package com.webtruyen.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtruyen.first.entity.Bookmark;
import com.webtruyen.first.repository.BookmarkRepository;

@Service
public class BookmarkService {
    @Autowired
    private BookmarkRepository bookmarkRepository;

    public Bookmark getBookmarkById(Long id) {
    return bookmarkRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Bookmark not found"));
}
    public List<Bookmark> getBookmarksByUserId(Long userId) {
        return bookmarkRepository.findByUserId(userId);
    }
    public Bookmark addBookmark(Bookmark bookmark) {
        return bookmarkRepository.save(bookmark);
    }
    public void removeBookmark(Long id) {
        bookmarkRepository.deleteById(id);
    }
}
