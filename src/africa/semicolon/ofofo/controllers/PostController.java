package africa.semicolon.ofofo.controllers;

import africa.semicolon.ofofo.data.models.Post;
import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;
import africa.semicolon.ofofo.services.PostServices;
import africa.semicolon.ofofo.services.PostServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    private PostServices postServices;

    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postServices.createPost(createPostRequest);
        return "Successful";
    }
    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable String postId){
        return postServices.viewPost(postId);
    }
}
