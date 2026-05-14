package com.webtruyen.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webtruyen.first.entity.Bookmark;
import com.webtruyen.first.service.BookmarkService;


@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {
    @Autowired
    private BookmarkService bookmarkService;
    
    @PostMapping
    public ResponseEntity<Bookmark> addBookmark(@RequestBody Bookmark bookmark) {
        return ResponseEntity.ok(bookmarkService.addBookmark(bookmark));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeBookmark(@PathVariable Long id) {
        bookmarkService.removeBookmark(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Bookmark>> getBookmarksByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(bookmarkService.getBookmarksByUserId(userId));
    }
}
