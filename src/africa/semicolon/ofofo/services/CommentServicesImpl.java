package africa.semicolon.ofofo.services;


import africa.semicolon.ofofo.data.models.Comment;
import africa.semicolon.ofofo.data.repositories.CommentRepository;
import africa.semicolon.ofofo.dtos.requests.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServicesImpl implements CommentServices{
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostServices postServices;
    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setCommentatorName(createCommentRequest.getCommentatorName());
        Comment savedComment = commentRepository.save(comment);
        postServices.addComment(createCommentRequest.getPostId(), savedComment);

    }
    @Override
    public List<Comment> viewAll(){
        return commentRepository.findAll();
    }
}
