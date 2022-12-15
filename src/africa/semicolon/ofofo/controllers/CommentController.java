package africa.semicolon.ofofo.controllers;

import africa.semicolon.ofofo.dtos.requests.CreateCommentRequest;
import africa.semicolon.ofofo.services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Service
@RestController
public class CommentController {
    @Autowired
    private CommentServices commentServices;
    @PostMapping("/comment")
    public String addComment(@RequestBody CreateCommentRequest createCommentRequest){
        commentServices.createComment(createCommentRequest);
        return "comment added";
    }
}
