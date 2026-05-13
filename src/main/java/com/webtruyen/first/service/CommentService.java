package com.webtruyen.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtruyen.first.entity.Comment;
import com.webtruyen.first.repository.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Comment not found"));
    }
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }
    public Comment updateComment(Long id, Comment updatedComment) {
        Comment comment = getCommentById(id);
        comment.setContent(updatedComment.getContent());
        return commentRepository.save(comment);
    }
    public void deleteComment(Long id) {
    Comment comment = getCommentById(id);
    comment.setDeleted(true);
    commentRepository.save(comment);
}

}
